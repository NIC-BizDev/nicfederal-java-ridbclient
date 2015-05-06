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
 * The client module used to access information about RIDB permit entrances.  To get only the entrances associated with a facility,
 * use the facility module and call one of the permit entrance access methods on that module.  This module is for searching and retrieving
 * permit entrances associated with all entities within RIDB.
 * 
 * @author NIC Federal
 */
public class RIDBClientModPermitEntrance extends RIDBClientModule {

	/**
	 * Create the module during initialization of the client.
	 *
	 * @param client the client that owns the module.
	 */
	public RIDBClientModPermitEntrance(RIDBClient client) {
		super(client);
	}
	
	/**
	 * Retrieve all permit entrances in RIDB.  Warning: this retrieves many records.  This method should be only used
	 * when all permit entrances need handled.
	 *
	 * @return an array containing all of the permit entrances in RIDB
	 */
	public RIDBPermitEntrance[] getAll()
    {
		RIDBPager<RIDBPermitEntrance> pager = new RIDBPager<RIDBPermitEntrance>()
				{
					public RIDBList<RIDBPermitEntrance> getPage(RIDBSearchParameters searchParams) {
						return search(searchParams);
					}
			
				};
		return client.<RIDBPermitEntrance>getAll(null, pager, RIDBPermitEntrance.class);
    }
	
	/**
	 * Search all of the permit entrances within RIDB and return matches. The query, limit, and offset search
	 * parameters are supported. The Query parameter is applied to the permit name, type (Campground, Cabin, etc.),
	 * description, accessible (Yes/No), district, and town fields.
	 *
	 * @param searchParams the search parameters to use in the search
	 * @return a single page of RIDB search results
	 */
	public RIDBList<RIDBPermitEntrance> search(RIDBSearchParameters searchParams)
    {
        String url = client.formatSearchUrl("/permitentrances", new String[0], searchParams);
        return (RIDBList<RIDBPermitEntrance>) client.<RIDBListClasses.RIDBPermitEntranceList>makeRequest(url, RIDBListClasses.RIDBPermitEntranceList.class);
    }
	
	/**
	 * Get a specific permit entrance.
	 *
	 * @param id the id of the permit entrance
	 * @return the permit entrance object or null if not found
	 */
	public RIDBPermitEntrance get(int id)
    {
        String url = client.formatUrl("/permitentrances/%s", new String[] { Integer.toString(id) }, null);
        return client.<RIDBPermitEntrance>makeRequest(url, RIDBPermitEntrance.class);
    }
	
	/**
	 * Search the attributes associated with a specific permit entrance. The search utilizes the following search parameters:
	 * query, limit, and offset.  Query is performed on the attribute name field.
	 *
	 * @param permitEntranceId the id of the permit entrance
	 * @param searchParams the search parameters to apply to the search
	 * @return a page of RIDB search results
	 */
	public RIDBList<RIDBAttribute> searchAttributes(int permitEntranceId, RIDBSearchParameters searchParams)
    {
        String url = client.formatSearchUrl("/permitentrances/%s/attributes", new String[] { Integer.toString(permitEntranceId) }, searchParams);
        return (RIDBList<RIDBAttribute>) client.<RIDBListClasses.RIDBAttributeList>makeRequest(url, RIDBListClasses.RIDBAttributeList.class);
    }
	
	/**
	 * Retrieve all of the attributes associated with a permit entrance.
	 *
	 * @param permitEntranceId the id of the permit entrance
	 * @return an array of all of the attributes for that permit entrance
	 */
	public RIDBAttribute[] getAllAttributes(int permitEntranceId)
    {
		final int finalId = permitEntranceId;
		RIDBPager<RIDBAttribute> pager = new RIDBPager<RIDBAttribute>()
				{
					public RIDBList<RIDBAttribute> getPage(RIDBSearchParameters searchParams) {
						return searchAttributes(finalId, searchParams);
					}
			
				};
		return client.<RIDBAttribute>getAll(null, pager, RIDBAttribute.class);
    }
	
	/**
	 * Search the zones associated with a specific permit entrance. No query parameters are documented as having an effect on the search. 
	 *
	 * @param permitEntranceId the permit entrance id
	 * @param searchParams the search parameters to apply to the search
	 * @return a page of RIDB search results
	 */
	public RIDBList<RIDBPermitEntranceZone> searchZones(int permitEntranceId, RIDBSearchParameters searchParams)
    {
        String url = client.formatSearchUrl("/permitentrances/%s/zones", new String[] { Integer.toString(permitEntranceId) }, searchParams);
        return (RIDBList<RIDBPermitEntranceZone>) client.<RIDBListClasses.RIDBPermitEntranceZoneList>makeRequest(url, RIDBListClasses.RIDBPermitEntranceZoneList.class);
    }
	
	/**
	 * Retrieve all of the zones associated with a permit entrance.
	 *
	 * @param permitEntranceId the permit entrance id
	 * @return an array of all of the zones for that permit entrance
	 */
	public RIDBPermitEntranceZone[] getAllZones(int permitEntranceId)
    {
		final int finalId = permitEntranceId;
		RIDBPager<RIDBPermitEntranceZone> pager = new RIDBPager<RIDBPermitEntranceZone>()
				{
					public RIDBList<RIDBPermitEntranceZone> getPage(RIDBSearchParameters searchParams) {
						return searchZones(finalId, searchParams);
					}
			
				};
		return client.<RIDBPermitEntranceZone>getAll(null, pager, RIDBPermitEntranceZone.class);
    }
	
	/**
	 * Get information about a specific zone of a permit entrance.
	 *
	 * @param permitEntranceId the permit entrance id
	 * @param permitEntranceZoneId the id of the entrance zone
	 * @return the entrance zone object or null if not found
	 */
	public RIDBPermitEntranceZone getZone(int permitEntranceId, int permitEntranceZoneId)
    {
        String url = client.formatUrl("/permitentrances/%s/zones/%s", new String[] { Integer.toString(permitEntranceId), Integer.toString(permitEntranceZoneId) }, null);
        //return client.makeRequest<RIDBPermitEntranceZone>(url);
        // RIDB BUG:  Instead of returning a single object the API returns a single element array
        RIDBPermitEntranceZone[] singleElementArray = client.<RIDBPermitEntranceZone[]>makeRequest(url, RIDBPermitEntranceZone[].class);
        if (singleElementArray == null || singleElementArray.length == 0) return null;
        return singleElementArray[0];
    }
	
	
}
