package com.nicfederal.ridbclient;

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
 * The client module used to access information about RIDB media.  To get only the media associated with other
 * entities, such as recreation areas and facilities, use the appropriate module for that
 * entity and call one of the media access methods on that entity.  This module is for searching and retrieving
 * media associated with all entities within RIDB.
 * 
 * @author NIC Federal
 */
public class RIDBClientModMedia extends RIDBClientModule {

	/**
	 * Create the module during initialization of the client.
	 *
	 * @param client the client that owns the module.
	 */
	public RIDBClientModMedia(RIDBClient client) {
		super(client);
	}
	
	/**
	 * Retrieve all media references in RIDB.  Warning: this retrieves all pages of media results and will return thousands
	 * of objects.  This method should be only used when all media objects need handled at the same time.
	 *
	 * @return an array containing all of the media references in RIDB
	 */
	public RIDBEntityMedia[] getAll()
    {
		RIDBPager<RIDBEntityMedia> pager = new RIDBPager<RIDBEntityMedia>()
				{
					public RIDBList<RIDBEntityMedia> getPage(RIDBSearchParameters searchParams) {
						return search(searchParams);
					}
			
				};
		return client.<RIDBEntityMedia>getAll(null, pager, RIDBEntityMedia.class);
    }
	
	/**
	 * Search all of the media objects within RIDB and return matches.  The Query, Limit, and Offset search
	 * parameters are supported.  The Query parameter is applied to the title, subtitle, description, credits, and media type fields.
	 *
	 * @param searchParams the search parameters to use in the search
	 * @return a single page of RIDB search results
	 */
	public RIDBList<RIDBEntityMedia> search(RIDBSearchParameters searchParams)
    {
        String url = client.formatSearchUrl("/media", new String[0], searchParams);
        return (RIDBList<RIDBEntityMedia>) client.<RIDBListClasses.RIDBEntityMediaList>makeRequest(url, RIDBListClasses.RIDBEntityMediaList.class);
    }
	
	/**
	 * Get a specific media object.
	 *
	 * @param id the id for the media object
	 * @return the media object or null if not found
	 */
	public RIDBEntityMedia get(int id)
    {
        String url = client.formatUrl("/media/%s", new String[] { Integer.toString(id) }, null);
        //return client.<RIDBEntityMedia>makeRequest(url, RIDBEntityMedia.class);
        RIDBEntityMedia[] singleElementArray = client.<RIDBEntityMedia[]>makeRequest(url, RIDBEntityMedia[].class);
        if (singleElementArray == null || singleElementArray.length == 0) return null;
        return singleElementArray[0];
    }
	
	

}
