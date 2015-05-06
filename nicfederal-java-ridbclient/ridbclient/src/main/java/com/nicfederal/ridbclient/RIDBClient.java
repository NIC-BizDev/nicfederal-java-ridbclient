package com.nicfederal.ridbclient;

import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;
import org.springframework.web.client.RestTemplate;

import java.io.UnsupportedEncodingException;
import java.lang.reflect.Array;
import java.net.URI;
import java.net.URISyntaxException;
import java.net.URLEncoder;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

/*
Copyright 2015 NIC Federal

Licensed under the Apache License, Version 2.0 (the "License");
you may not use this file except in compliance with the License.
You may obtain a copy of the License at

    http://www.apache.org/licenses/LICENSE-2.0

Unless required by applicable law or agreed to in writing, software
distributed under the License is distributed on an "AS IS" BASIS,
WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
See the License for the specific language governing permissions and
limitations under the License.
*/
/**
 * The RIDB client allows Java applications to interact with the RIDB JSON services to get recreation information.  You should not be calling methods
 * from this object.  Instead you should access the appropriate entity module property (e.g. org, recArea, facility, etc.) and use entity specific methods
 * to return data from RIDB.
 */
public class RIDBClient {

	/** The RIDB Developer API key. This can also be set with the "RIDB.ApiKey" system property. */
	private final String apiKey;
	
	/** The base URL to use when constructing RIDB API URLs. This can also be set with the "RIDB.BaseUrl" system property. */
	private final String baseUrl;
	
	/** The client module used to access RIDB information about organizations. */
	public final RIDBClientModOrg Org;
	
	/** The client module used to access RIDB information about recreation activities. */
	public final RIDBClientModActivity Activity;
	
	/** The client module used to access RIDB information about campsites. */
	public final RIDBClientModCampsite Campsite;
	
	/** The client module used to access RIDB information about events. */
	public final RIDBClientModEvent Event;
	
	/** The client module used to access RIDB information about facilities. */
	public final RIDBClientModFacility Facility;
	
	/** The client module used to access RIDB information about recreation links. */
	public final RIDBClientModLink Link;
	
	/** The client module used to access RIDB information about media. */
	public final RIDBClientModMedia Media;
	
	/** The client module used to access RIDB information about permit entrances. */
	public final RIDBClientModPermitEntrance PermitEntrance;
	
	/** The client module used to access RIDB information about recreation areas. */
	public final RIDBClientModRecArea RecArea;
	
	/** The client module used to access RIDB information about tours.*/
	public final RIDBClientModTour Tour;
	
	/**
	 * Constructs a new RIDB client object using RIDB settings stored in the system properties.  The following properties are
	 * used by the client: RIDB.BaseUrl, RIDB.ApiKey.
	 */
	public RIDBClient()
	{
		this(System.getProperty("RIDB.BaseUrl"), System.getProperty("RIDB.ApiKey"));
	}
	
	/**
	 * Constructs a new RIDB client object using the configuration information provided as parameters.
	 *
	 * @param baseUrl the base URL to use when constructing RIDB API URLs.
	 * @param apiKey the RIDB Developer API key
	 */
	public RIDBClient(String baseUrl, String apiKey) {
		if (baseUrl == null || baseUrl.isEmpty() || apiKey == null || apiKey.isEmpty())
			throw new RuntimeException("Missing Base URL or API key");
		
		this.baseUrl = baseUrl;
		this.apiKey = apiKey;
		
		Org = new RIDBClientModOrg(this);
		Activity = new RIDBClientModActivity(this);
		Campsite = new RIDBClientModCampsite(this);
		Event = new RIDBClientModEvent(this);
		Facility = new RIDBClientModFacility(this);
		Link = new RIDBClientModLink(this);
		Media = new RIDBClientModMedia(this);
		PermitEntrance = new RIDBClientModPermitEntrance(this);
		RecArea = new RIDBClientModRecArea(this);
		Tour = new RIDBClientModTour(this);
	}
	
	/**
	 * Sends a request URL to RIDB and parses the response into an object. This should not typically be called directly. Instead call
	 * the methods on each of the client modules which will in turn call this method as needed.
	 *
	 * @param <T> the type of object that corresponds to the response back from RIDB
	 * @param requestUrl the well formed URL of the RIDB API function
	 * @param clazz the reflection class type for the result type
	 * @return an object or array of objects corresponding to the data sent back from the RIDB API
	 */
	public <T> T makeRequest(String requestUrl, Class<T> clazz)
    {
        //if (DebugOn) Debug.WriteLine(requestUrl);
		RestTemplate restTemplate = new RestTemplate();
		HttpHeaders headers = new HttpHeaders();
		headers.set("apikey", this.apiKey);

		HttpEntity<T> entity = new HttpEntity<T>(headers);

		URI uri = null;
		try
		{
			uri = new URI(requestUrl);
		}
		catch (URISyntaxException ex)
		{
			throw new RuntimeException("Invalid url created by client: "+requestUrl);
		}
		ResponseEntity<T> response = restTemplate.exchange(
		    uri, HttpMethod.GET, entity, clazz);
		
		return response.getBody();
		//T ret = new RestTemplate().getForObject(requestUrl, clazz);
        //return ret;
    }
	
	/**
	 * Format a search URL using the configured base URL, a path format template, and the search parameters.  This method should not
	 * typically be called directly.  Instead call the methods on each of the client modules which will in turn use this method to create
	 * the appropriate URL.
	 *
	 * @param pathFormat the format string for the RIDB API function being called
	 * @param pathParams the parameters which should be applied to the format string
	 * @param searchParams the RIDB search parameters object
	 * @return the well formed RIDB API URL
	 */
	public String formatSearchUrl(String pathFormat, String[] pathParams, RIDBSearchParameters searchParams)
    {
        Map<String, String> qp = new HashMap<String, String>();
        if (searchParams != null)
        {
            if (searchParams.getQuery() != null && !searchParams.getQuery().isEmpty()) qp.put("query", searchParams.getQuery());
            if (searchParams.getLimit() != null) qp.put("limit", searchParams.getLimit().toString());
            if (searchParams.getOffset() != null) qp.put("offset", searchParams.getOffset().toString());
            if (searchParams.getLatitude() != null) qp.put("latitude", searchParams.getLatitude().toString());
            if (searchParams.getLongitude() != null) qp.put("longitude", searchParams.getLongitude().toString());
            if (searchParams.getRadius() != null) qp.put("radius", searchParams.getRadius().toString());
            if (searchParams.getStateList() != null && !searchParams.getStateList().isEmpty()) qp.put("state", searchParams.getStateList());
            if (searchParams.getActivityList() != null && !searchParams.getActivityList().isEmpty()) qp.put("activity", searchParams.getActivityList());
            if (searchParams.getLastUpdated() != null) qp.put("lastupdated", new SimpleDateFormat("yyyy-MM-dd").format(searchParams.getLastUpdated()));
        }
        return formatUrl(pathFormat, pathParams, qp);

    }
	
	/**
	 * Format a RIDB URL using a path template, parameters for that template, and a dictionary of keys/values for the query string portion.  This method should not
	 * typically be called directly.  Instead call the methods on each of the client modules which will in turn use this method to create
	 * the appropriate URL.
	 *
	 * @param pathFormat the format string for the RIDB API function being called
	 * @param pathParms the parameters which should be applied to the format string
	 * @param queryParms the dictionary containing key/values that will be included in the query string
	 * @return the well formed RIDB URL
	 */
	public String formatUrl(String pathFormat, String[] pathParms, Map<String,String> queryParms)
    {
        StringBuilder ret = new StringBuilder();
        ret.append(baseUrl);
        ret.append(String.format(pathFormat, (Object[])pathParms));
        if (queryParms != null && queryParms.size() > 0)
        {
            ret.append('?');
            boolean first = true;
            for (Map.Entry<String, String> entry : queryParms.entrySet())
            {
                if (!first)
                    ret.append('&');
                else
                    first = false;
                try {
                	ret.append(URLEncoder.encode(entry.getKey(), "UTF-8"));
                	ret.append('=');
					ret.append(URLEncoder.encode(entry.getValue(), "UTF-8"));
				} catch (UnsupportedEncodingException e) {
					throw new RuntimeException("Could not encode URL query string");
				}
            }
        }
        return ret.toString();
    }
	
	/**
	 * Returns all results from a call.  When searching RIDB, pages of results are generated.  This method
	 * will call a method repeatedly to aggregate all of the results from all pages of results.  This method should not
	 * typically be called directly.  Instead call the methods on each of the client modules which will in turn use this method if
	 * the module function requires retrieval of all results.
	 *
	 * @param <T> the type of RIDB object included in the results
	 * @param searchParams the search parameters
	 * @param pager the delegate that is expected to return a single page of results
	 * @param clazz the reflection class type for the result type
	 * @return an array of all of the results from all result pages
	 */
	public <T> T[] getAll(RIDBSearchParameters searchParams, RIDBPager<T> pager, Class<T> clazz)
    {
        if (searchParams == null) searchParams = new RIDBSearchParameters();
        searchParams.setOffset(0);
        searchParams.setLimit(50);

        ArrayList<T> results = new ArrayList<T>();
        boolean atEnd = false;

        while (!atEnd)
        {
            RIDBList<T> page = pager.getPage(searchParams);
            results.addAll(Arrays.asList(page.getData()));
            atEnd = (results.size() >= page.getMetadata().getResults().getTotalCount()) || (page.getMetadata().getResults().getCurrentCount() == 0);
            searchParams.setOffset(searchParams.getOffset()+page.getMetadata().getResults().getCurrentCount());
        }

        return (T[]) results.toArray((T[])Array.newInstance(clazz, results.size()));
    }
	
	
}
