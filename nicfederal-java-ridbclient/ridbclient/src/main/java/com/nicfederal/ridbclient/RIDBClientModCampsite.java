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
 * The client module used to access information about RIDB campsites.  To get the campsites associated with other
 * entities, such as recreation areas and facilities, use the appropriate module for that
 * entity and call one of the campsite access methods on that entity.  This module is for searching and retrieving
 * campsite information for all campsites in RIDB.
 * 
 * @author NIC Federal
 */
public class RIDBClientModCampsite extends RIDBClientModule {

	/**
	 * Create the module during initialization of the client.
	 *
	 * @param client the client that owns the module
	 */
	public RIDBClientModCampsite(RIDBClient client) {
		super(client);
	}
	
	/**
	 * Retrieve all campsites in RIDB.  Warning: this retrieves thousands of records and takes
	 * quite a while to pull all pages of campsite results.  This method should be only used
	 * when all campsites need handled.
	 *
	 * @return an array containing all of the campsites in RIDB
	 */
	public RIDBCampsite[] getAll()
    {
		RIDBPager<RIDBCampsite> pager = new RIDBPager<RIDBCampsite>()
				{
					public RIDBList<RIDBCampsite> getPage(RIDBSearchParameters searchParams) {
						return search(searchParams);
					}
			
				};
		return client.<RIDBCampsite>getAll(null, pager, RIDBCampsite.class);
    }
	
	/**
	 * Search all of the campsites within RIDB and return matches.  The query,limit, and offset search
	 * parameters are supported.  The query parameter is applied to the campsite name, type, loop, type of use
	 * (Overnight/Day), and campsite accessible (Yes/No) fields.
	 *
	 * @param searchParams the search parameters to use in the search
	 * @return a single page of RIDB search results
	 */
	public RIDBList<RIDBCampsite> search(RIDBSearchParameters searchParams)
    {
        String url = client.formatSearchUrl("/campsites", new String[0], searchParams);
        return (RIDBList<RIDBCampsite>) client.<RIDBListClasses.RIDBCampsiteList>makeRequest(url, RIDBListClasses.RIDBCampsiteList.class);
    }
	
	/**
	 * Get a specific campsite.
	 *
	 * @param id the id for the campsite
	 * @return the campsite object or null if not found
	 */
	public RIDBCampsite get(int id)
    {
        String url = client.formatUrl("/campsites/%s", new String[] { Integer.toString(id) }, null);
        //return client.makeRequest<RIDBCampsite>(url);
        // RIDB BUG:  Instead of returning a single campsite object the API returns a single element array
        RIDBCampsite[] singleElementArray = client.<RIDBCampsite[]>makeRequest(url, RIDBCampsite[].class);
        if (singleElementArray == null || singleElementArray.length == 0) return null;
        return singleElementArray[0];
    }
	
	/**
	 * Search the permitted equipment for a specific campsite.  The search utilizes the following search parameters:
	 * query, limit, and offset.  Query is performed on the equipment name and max length (in feet) fields.
	 *
	 * @param campsiteId the id for the campsite
	 * @param searchParams the search parameters to apply to the search
	 * @return a page of RIDB search results
	 */
	public RIDBList<RIDBPermittedEquipment> searchPermittedEquipment(int campsiteId, RIDBSearchParameters searchParams)
    {
        String url = client.formatSearchUrl("/campsites/%s/permittedequipment", new String[] { Integer.toString(campsiteId) }, searchParams);
        return (RIDBList<RIDBPermittedEquipment>) client.<RIDBListClasses.RIDBPermittedEquipmentList>makeRequest(url, RIDBListClasses.RIDBPermittedEquipmentList.class);
    }
	
	/**
	 * Retrieve all permitted equipment for a specific campsite.
	 *
	 * @param campsiteId the id for the campsite
	 * @return an array containing all of the permitted equipment for that campsite
	 */
	public RIDBPermittedEquipment[] getAllPermittedEquipment(int campsiteId)
    {
		final int finalId = campsiteId;
		RIDBPager<RIDBPermittedEquipment> pager = new RIDBPager<RIDBPermittedEquipment>()
				{
					public RIDBList<RIDBPermittedEquipment> getPage(RIDBSearchParameters searchParams) {
						return searchPermittedEquipment(finalId, searchParams);
					}
			
				};
		return client.<RIDBPermittedEquipment>getAll(null, pager, RIDBPermittedEquipment.class);
    }
	
	/**
	 * Retrieve a specific permitted equipment object for a given campsite.
	 *
	 * @param campsiteId the id for the campsite
	 * @param permittedEquipmentId the id for the permitted equipment object
	 * @return the permitted equipment object or null if not found
	 */
	public RIDBPermittedEquipment getPermittedEquipment(int campsiteId, int permittedEquipmentId)
    {
        String url = client.formatUrl("/campsites/%s/permittedequipment/%s", new String[] { Integer.toString(campsiteId), Integer.toString(permittedEquipmentId) }, null);
        //return client.makeRequest<RIDBPermittedEquipment>(url);
        // RIDB BUG:  Instead of returning a single permitted equipment object the API returns a single element array
        RIDBPermittedEquipment[] singleElementArray = client.<RIDBPermittedEquipment[]>makeRequest(url, RIDBPermittedEquipment[].class);
        if (singleElementArray == null || singleElementArray.length == 0) return null;
        return singleElementArray[0];
    }
	
	/**
	 * Search the attributes associated with a specific campsite. The search utilizes the following search parameters:
	 * query, limit, and offset.  Query is performed on the attribute name field.
	 *
	 * @param campsiteId the id of the campsite
	 * @param searchParams the search parameters to apply to the search
	 * @return a page of RIDB search results
	 */
	public RIDBList<RIDBAttribute> searchAttributes(int campsiteId, RIDBSearchParameters searchParams)
    {
        String url = client.formatSearchUrl("/campsites/%s/attributes", new String[] { Integer.toString(campsiteId) }, searchParams);
        return (RIDBList<RIDBAttribute>) client.<RIDBListClasses.RIDBAttributeList>makeRequest(url, RIDBListClasses.RIDBAttributeList.class);
    }
	
	/**
	 * Retrieve all of the attributes associated with a campsite.
	 *
	 * @param campsiteId the id of the campsite
	 * @return an array of all of the attributes for that campsite
	 */
	public RIDBAttribute[] getAllAttributes(int campsiteId)
    {
		final int finalId = campsiteId;
		RIDBPager<RIDBAttribute> pager = new RIDBPager<RIDBAttribute>()
				{
					public RIDBList<RIDBAttribute> getPage(RIDBSearchParameters searchParams) {
						return searchAttributes(finalId, searchParams);
					}
			
				};
		return client.<RIDBAttribute>getAll(null, pager, RIDBAttribute.class);
    }
	
	
}
