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
 * The client module used to access information about RIDB organizations.  This module also
 * allows you to retrieve the recreation areas and facilities associated with an organization.
 * 
 * @author NIC Federal
 */
public class RIDBClientModOrg extends RIDBClientModule {

	/**
	 * Create the module during initialization of the client.
	 *
	 * @param client the client that owns the module.
	 */
	public RIDBClientModOrg(RIDBClient client)
	{
		super(client);
	}
	
	/**
	 * Retrieve all organizations in RIDB.
	 *
	 * @return an array containing all of the organizations in RIDB
	 */
	public RIDBOrganization[] getAll()
	{
		RIDBPager<RIDBOrganization> pager = new RIDBPager<RIDBOrganization>()
				{
					public RIDBList<RIDBOrganization> getPage(RIDBSearchParameters searchParams) {
						return search(searchParams);
					}
			
				};
		return (RIDBOrganization[]) client.<RIDBOrganization>getAll(null, pager, RIDBOrganization.class);
	}
	
	/**
	 * Search all of the organizations within RIDB and return matches.  The query, limit, and offset search
	 * parameters are supported. The query parameter is applied to the organization name and organization abbreviated name fields.
	 *
	 * @param searchParams the search parameters to use in the search
	 * @return a single page of RIDB search results
	 */
	public RIDBList<RIDBOrganization> search(RIDBSearchParameters searchParams)
	{
		String url = client.formatSearchUrl("/organizations/", new String[0], searchParams);
        return (RIDBList<RIDBOrganization>)client.<RIDBListClasses.RIDBOrganizationList>makeRequest(url, RIDBListClasses.RIDBOrganizationList.class);
	}
	
	/**
	 * Get a specific organization.
	 *
	 * @param id the id of the organization
	 * @return the organization object or null if not found
	 */
	public RIDBOrganization get(int id)
	{
		String url = client.formatSearchUrl("/organizations/%s", new String[] { Integer.toString(id) }, null);
        // RIDB bug:  For some reason this call returns a single element array instead of just the organization object
        RIDBOrganization[] workaround = client.<RIDBOrganization[]>makeRequest(url, RIDBOrganization[].class);
        if (workaround == null || workaround.length < 1) return null;
        return workaround[0];
	}
	
	/**
	 * Retrieve all recreation areas associated with a specific organization.
	 *
	 * @param orgId the id for the organization
	 * @return an array containing all of the recreation areas associated with an organization
	 */
	public RIDBRecArea[] getAllRecAreas(int orgId)
    {
		final int finalId = orgId;
		RIDBPager<RIDBRecArea> pager = new RIDBPager<RIDBRecArea>()
				{
					public RIDBList<RIDBRecArea> getPage(RIDBSearchParameters searchParams) {
						return searchRecAreas(finalId, null);
					}
				};
		return (RIDBRecArea[]) client.<RIDBRecArea>getAll(null, pager, RIDBRecArea.class);
    }
	
	/**
	 * Search the recreation areas associated with a specific organization and return matches.  All search
	 * parameters are supported.  The query parameter is applied to the recreation area name, description, keywords, and stay limit fields.
	 *
	 * @param orgId the id for the organization
	 * @param searchParams the search parameters to use in the search
	 * @return a single page of RIDB search results
	 */
	public RIDBList<RIDBRecArea> searchRecAreas(int orgId, RIDBSearchParameters searchParams)
    {
        String url = client.formatSearchUrl("/organizations/%s/recareas", new String[] { Integer.toString(orgId) }, searchParams);
        return (RIDBList<RIDBRecArea>) client.<RIDBListClasses.RIDBRecAreaList>makeRequest(url, RIDBListClasses.RIDBRecAreaList.class);
    }
	
	/**
	 * Retrieve all facilities associated with a specific organization.
	 *
	 * @param orgId the id for the organization
	 * @return an array containing all of the facilities associated with an organization
	 */
	public RIDBFacility[] getAllFacilities(int orgId)
    {
		final int finalId = orgId;
		RIDBPager<RIDBFacility> pager = new RIDBPager<RIDBFacility>()
				{
					public RIDBList<RIDBFacility> getPage(RIDBSearchParameters searchParams) {
						return searchFacilities(finalId, null);
					}
				};
		return (RIDBFacility[]) client.<RIDBFacility>getAll(null, pager, RIDBFacility.class);
    }
	
	/**
	 * Search the facilities associated with a specific organization and return matches.  All search
	 * parameters are supported.  The query parameter is applied to the facility name, description, keywords, and stay limit fields.
	 *
	 * @param orgId the id for the organization
	 * @param searchParams the search parameters to use in the search
	 * @return a single page of RIDB search results
	 */
	public RIDBList<RIDBFacility> searchFacilities(int orgId, RIDBSearchParameters searchParams)
    {
        String url = client.formatSearchUrl("/organizations/%s/facilities", new String[] { Integer.toString(orgId) }, searchParams);
        return (RIDBList<RIDBFacility>) client.<RIDBListClasses.RIDBFacilityList>makeRequest(url, RIDBListClasses.RIDBFacilityList.class);
    }
	
	
}
