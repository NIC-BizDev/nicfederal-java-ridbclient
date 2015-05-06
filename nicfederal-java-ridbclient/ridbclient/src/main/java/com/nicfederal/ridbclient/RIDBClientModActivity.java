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
 * The client module used to access information about RIDB recreation activities.  To get activity information
 * related to other entities, such as recreation areas and facilities, use the appropriate module for that
 * entity.  This module is for loading and searching the universe of activities in the system.
 * 
 * @author NIC Federal
 */
public class RIDBClientModActivity extends RIDBClientModule {

	/**
	 * Create the module during initialization of the client.
	 *
	 * @param client the client that owns the module
	 */
	public RIDBClientModActivity(RIDBClient client) {
		super(client);
	}

	/**
	 * Retrieve all activities from RIDB.
	 *
	 * @return Array contraining all RIDB activities
	 */
	public RIDBActivity[] getAll()
	{
		RIDBPager<RIDBActivity> pager = new RIDBPager<RIDBActivity>()
				{
					public RIDBList<RIDBActivity> getPage(RIDBSearchParameters searchParams) {
						return search(searchParams);
					}
			
				};
		return (RIDBActivity[]) client.<RIDBActivity>getAll(null, pager, RIDBActivity.class);
	}
	
	/**
	 * Search for a specific set of activities.  Search parameters used by the search are
	 * query, limit, and offset.  Query searches are executed against the activity name.
	 *
	 * @param searchParams the search parameters to use in the search
	 * @return a single page of RIDB search results
	 */
	public RIDBList<RIDBActivity> search(RIDBSearchParameters searchParams)
	{
		String url = client.formatSearchUrl("/activities/", new String[0], searchParams);
        return (RIDBList<RIDBActivity>)client.<RIDBListClasses.RIDBActivityList>makeRequest(url, RIDBListClasses.RIDBActivityList.class);
	}
	
	/**
	 * Get a specific activity.
	 *
	 * @param id the id for the activity
	 * @return the activity object or null if not found
	 */
	public RIDBActivity get(int id)
	{
		String url = client.formatSearchUrl("/activities/%s", new String[] { Integer.toString(id) }, null);
        // RIDB bug:  For some reason this call returns a single element array instead of just the organization object
        RIDBActivity[] workaround = client.<RIDBActivity[]>makeRequest(url, RIDBActivity[].class);
        if (workaround == null || workaround.length < 1) return null;
        return workaround[0];
	}
}
