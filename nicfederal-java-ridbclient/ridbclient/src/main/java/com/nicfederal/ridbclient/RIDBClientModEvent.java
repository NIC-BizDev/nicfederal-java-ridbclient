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
 * The client module used to access information about RIDB events.  To get the campsites associated with other
 * entities, such as recreation areas and facilities, use the appropriate module for that
 * entity and call one of the event access methods on that entity.  This module is for searching and retrieving
 * event information for all events in RIDB.
 * 
 * @author NIC Federal
 */
public class RIDBClientModEvent extends RIDBClientModule {

	/**
	 * Create the module during initialization of the client.
	 *
	 * @param client the client that owns the module
	 */
	public RIDBClientModEvent(RIDBClient client) {
		super(client);
	}
	
	/**
	 * Retrieve all events in RIDB.  Warning: this retrieves all pages of event results and can
	 * take awhile to complete.  This method should be only used when all events need handled.
	 *
	 * @return an array containing all of the events in RIDB
	 */
	public RIDBEvent[] getAll()
	{
		RIDBPager<RIDBEvent> pager = new RIDBPager<RIDBEvent>()
				{
					public RIDBList<RIDBEvent> getPage(RIDBSearchParameters searchParams) {
						return search(searchParams);
					}
			
				};
		return (RIDBEvent[]) client.<RIDBEvent>getAll(null, pager, RIDBEvent.class);
	}
	
	/**
	 * Search all of the events within RIDB and return matches.  The Query, Limit, and Offset search
	 * parameters are supported.  The Query parameter is applied to the event name, start/end date,
	 * description, age group, ADA access, fee description, scope description, and type description fields.
	 *
	 * @param searchParams the search parameters to use in the search
	 * @return a single page of RIDB search results
	 */
	public RIDBList<RIDBEvent> search(RIDBSearchParameters searchParams)
	{
		String url = client.formatSearchUrl("/events/", new String[0], searchParams);
        return (RIDBList<RIDBEvent>)client.<RIDBListClasses.RIDBEventList>makeRequest(url, RIDBListClasses.RIDBEventList.class);
	}
	
	/**
	 * Get a specific event.
	 *
	 * @param id the id for the event
	 * @return the event object or null if not found
	 */
	public RIDBEvent get(int id)
	{
		String url = client.formatSearchUrl("/events/%s", new String[] { Integer.toString(id) }, null);
        // RIDB bug:  For some reason this call returns a single element array instead of just the organization object
        RIDBEvent[] workaround = client.<RIDBEvent[]>makeRequest(url, RIDBEvent[].class);
        if (workaround == null || workaround.length < 1) return null;
        return workaround[0];
	}
	
	

}
