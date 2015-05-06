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
 * The client module used to access information about RIDB tours.  To get the tours associated with facilities, use the
 * facilities module and call the tour access methods.  This module is for searching and retrieving
 * tour information for tours associated with all entities within RIDB.
 * 
 * @author NIC Federal
 */
public class RIDBClientModTour extends RIDBClientModule {

	/**
	 * Create the module during initialization of the client.
	 *
	 * @param client the client that owns the module.
	 */
	public RIDBClientModTour(RIDBClient client) {
		super(client);
	}
	
	/**
	 * Retrieve all tours in RIDB.  Warning: this retrieves all pages of tour results.  This method
	 * should be only used when all tours need handled at once.
	 *
	 * @return an array containing all of the tours in RIDB
	 */
	public RIDBTour[] getAll()
	{
		RIDBPager<RIDBTour> pager = new RIDBPager<RIDBTour>()
				{
					public RIDBList<RIDBTour> getPage(RIDBSearchParameters searchParams) {
						return search(searchParams);
					}
			
				};
		return (RIDBTour[]) client.<RIDBTour>getAll(null, pager, RIDBTour.class);
	}
	
	/**
	 * Search all of the tours within RIDB and return matches.  The query, limit, and offset search
	 * parameters are supported. The query parameter is applied to the tour name, type, description, and accessible (Yes/No) fields.
	 *
	 * @param searchParams the search parameters to use in the search
	 * @return a single page of RIDB search results
	 */
	public RIDBList<RIDBTour> search(RIDBSearchParameters searchParams)
	{
		String url = client.formatSearchUrl("/tours/", new String[0], searchParams);
        return (RIDBList<RIDBTour>)client.<RIDBListClasses.RIDBTourList>makeRequest(url, RIDBListClasses.RIDBTourList.class);
	}
	
	/**
	 * Get a specific tour.
	 *
	 * @param id the id for the tour
	 * @return the tour object or null if not found
	 */
	public RIDBTour get(int id)
	{
		String url = client.formatSearchUrl("/tours/%s", new String[] { Integer.toString(id) }, null);
        return client.<RIDBTour>makeRequest(url, RIDBTour.class);
	}
	
	/**
	 * Search the attributes associated with a specific tour. The search utilizes the following search parameters:
	 * query, limit, and offset.  Query is performed on the attribute name field. 
	 *
	 * @param tourId the id for the tour
	 * @param searchParams the search parameters to use in the search
	 * @return a single page of RIDB search results
	 */
	public RIDBList<RIDBAttribute> searchAttributes(int tourId, RIDBSearchParameters searchParams)
    {
        String url = client.formatSearchUrl("/tours/%s/attributes", new String[] { Integer.toString(tourId) }, searchParams);
        return (RIDBList<RIDBAttribute>) client.<RIDBListClasses.RIDBAttributeList>makeRequest(url, RIDBListClasses.RIDBAttributeList.class);
    }
	
	/**
	 * Retrieve all of the attributes associated with a tour.
	 *
	 * @param tourId the id of the tour
	 * @return an array of all of the attributes for that tour
	 */
	public RIDBAttribute[] getAllAttributes(int tourId)
    {
		final int finalId = tourId;
		RIDBPager<RIDBAttribute> pager = new RIDBPager<RIDBAttribute>()
				{
					public RIDBList<RIDBAttribute> getPage(RIDBSearchParameters searchParams) {
						return searchAttributes(finalId, searchParams);
					}
			
				};
		return client.<RIDBAttribute>getAll(null, pager, RIDBAttribute.class);
    }
	
	

}
