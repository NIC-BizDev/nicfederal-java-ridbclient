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

public class RIDBClient {

	private final String apiKey;
	private final String baseUrl;
	
	public final RIDBClientModOrg Org;
	public final RIDBClientModActivity Activity;
	public final RIDBClientModCampsite Campsite;
	public final RIDBClientModEvent Event;
	public final RIDBClientModFacility Facility;
	public final RIDBClientModLink Link;
	public final RIDBClientModMedia Media;
	public final RIDBClientModPermitEntrance PermitEntrance;
	public final RIDBClientModRecArea RecArea;
	public final RIDBClientModTour Tour;
	
	public RIDBClient()
	{
		this(System.getProperty("RIDB.BaseUrl"), System.getProperty("RIDB.ApiKey"));
	}
	
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
	
	/*
	public List<RIDBOrganization> getAllOrganizations() {
		String url = RIDBUrl.createRidbUrl("/organizations", API_KEY);
		RIDBOrganizationResponse response = new RestTemplate().getForObject(url, RIDBOrganizationResponse.class);
		return response.getOrganizations();
	}
	
	public List<RIDBOrganization> getAllOrganizations(String query, int limit, int offset) {
		String url = RIDBUrl.createRidbUrl("/organizations", API_KEY,
				new ImmutableMap.Builder<String, Object>().put(QUERY_PARAM, query)
						.put(LIMIT_PARAM, limit).put(OFFSET_PARAM, offset).build());
		RIDBOrganizationResponse response = new RestTemplate().getForObject(url, RIDBOrganizationResponse.class);
		return response.getOrganizations();
	}

	public List<RIDBTour> getAllTours() {
		String url = RIDBUrl.createRidbUrl("/tours", API_KEY);
		RIDBAllToursResponse response = new RestTemplate().getForObject(url, RIDBAllToursResponse.class);
		return response.getTours();
	}
	*/
	
}
