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
 * The client module used to access information about RIDB links.  To get only the links associated with other
 * entities, such as recreation areas and facilities, use the appropriate module for that
 * entity and call one of the link access methods on that entity.  This module is for searching and retrieving
 * links associated with all entities within RIDB.
 * 
 * @author NIC Federal
 */
public class RIDBClientModLink extends RIDBClientModule {

	/**
	 * Create the module during initialization of the client.
	 *
	 * @param client the client that owns the module.
	 */
	public RIDBClientModLink(RIDBClient client) {
		super(client);
	}
	
	/**
	 * Retrieve all links in RIDB.  Warning: this retrieves all pages of link results and will return thousands
	 * of objects.  This method should be only used when all links need handled at the same time.
	 *
	 * @return an array containing all of the links in RIDB
	 */
	public RIDBEntityLink[] getAll()
    {
		RIDBPager<RIDBEntityLink> pager = new RIDBPager<RIDBEntityLink>()
				{
					public RIDBList<RIDBEntityLink> getPage(RIDBSearchParameters searchParams) {
						return search(searchParams);
					}
			
				};
		return client.<RIDBEntityLink>getAll(null, pager, RIDBEntityLink.class);
    }
	
	/**
	 * Search all of the links within RIDB and return matches.  The Query, Limit, and Offset search
	 * parameters are supported.  The Query parameter is applied to the title, description, and link type fields.
	 *
	 * @param searchParams the search parameters to use in the search
	 * @return a single page of RIDB search results
	 */
	public RIDBList<RIDBEntityLink> search(RIDBSearchParameters searchParams)
    {
        String url = client.formatSearchUrl("/links", new String[0], searchParams);
        return (RIDBList<RIDBEntityLink>) client.<RIDBListClasses.RIDBEntityLinkList>makeRequest(url, RIDBListClasses.RIDBEntityLinkList.class);
    }
	
	/**
	 * Get a specific link.
	 *
	 * @param id the id for the link
	 * @return the link object or null if not found
	 */
	public RIDBEntityLink get(int id)
    {
        String url = client.formatUrl("/links/%s", new String[] { Integer.toString(id) }, null);
        //return client.<RIDBEntityLink>makeRequest(url, RIDBEntityLink.class);
        RIDBEntityLink[] singleElementArray = client.<RIDBEntityLink[]>makeRequest(url, RIDBEntityLink[].class);
        if (singleElementArray == null || singleElementArray.length == 0) return null;
        return singleElementArray[0];
    }
	
	
	

}
