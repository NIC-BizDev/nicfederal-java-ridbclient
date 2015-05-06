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
 * The client module used to access information about RIDB recreation areas.  This module can also be used to
 * get information about other entities, such as campsites and events, associated with a recreation area.
 * 
 * @author NIC Federal
 */
public class RIDBClientModRecArea extends RIDBClientModule {

	/**
	 * Create the module during initialization of the client.
	 *
	 * @param client the client that owns the module.
	 */
	public RIDBClientModRecArea(RIDBClient client) {
		super(client);
	}

	/**
	 * Retrieve all recreation areas in RIDB.  Warning: this retrieves thousands of records and takes
	 * quite a while to pull all pages of recreation area results.  This method should be only used
	 * when all recreation areas need handled.
	 *
	 * @return an array containing all of the facilities in RIDB
	 */
	public RIDBRecArea[] getAll()
    {
		RIDBPager<RIDBRecArea> pager = new RIDBPager<RIDBRecArea>()
				{
					public RIDBList<RIDBRecArea> getPage(RIDBSearchParameters searchParams) {
						return search(searchParams);
					}
			
				};
		return client.<RIDBRecArea>getAll(null, pager, RIDBRecArea.class);
    }
	
	/**
	 * Search all of the recreation areas within RIDB and return matches.  All search parameters are supported.  The
	 * query parameter is applied to the recreation area name, description, keywords, and stay limit fields.
	 *
	 * @param searchParams the search parameters to use in the search
	 * @return a single page of RIDB search results
	 */
	public RIDBList<RIDBRecArea> search(RIDBSearchParameters searchParams)
    {
        String url = client.formatSearchUrl("/recareas", new String[0], searchParams);
        return (RIDBList<RIDBRecArea>) client.<RIDBListClasses.RIDBRecAreaList>makeRequest(url, RIDBListClasses.RIDBRecAreaList.class);
    }
	
	/**
	 * Get a specific recreation area.
	 *
	 * @param id the id for the recreation area
	 * @return the recreation area object or null if not found
	 */
	public RIDBRecArea get(int id)
    {
        String url = client.formatUrl("/recareas/%s", new String[] { Integer.toString(id) }, null);
        return client.<RIDBRecArea>makeRequest(url, RIDBRecArea.class);
    }
	
	/**
	 * Retrieve all facilities associated with a specific recreation area.
	 *
	 * @param recAreaId the id for the recreation area
	 * @return an array containing all of the facilities associated with a recreation area
	 */
	public RIDBFacility[] getAllFacilities(int recAreaId)
    {
		final int finalId = recAreaId;
		RIDBPager<RIDBFacility> pager = new RIDBPager<RIDBFacility>()
				{
					public RIDBList<RIDBFacility> getPage(RIDBSearchParameters searchParams) {
						return searchFacilities(finalId, null);
					}
				};
		return (RIDBFacility[]) client.<RIDBFacility>getAll(null, pager, RIDBFacility.class);
    }
	
	/**
	 * Search the facilities associated with a specific recreation area and return matches.  All search
	 * parameters are supported.  The query parameter is applied to the facility name, description, keywords, and stay limit fields.
	 *
	 * @param recAreaId the rec area id
	 * @param searchParams the search parameters to use in the search
	 * @return a single page of RIDB search results
	 */
	public RIDBList<RIDBFacility> searchFacilities(int recAreaId, RIDBSearchParameters searchParams)
    {
        String url = client.formatSearchUrl("/recareas/%s/facilities", new String[] { Integer.toString(recAreaId) }, searchParams);
        return (RIDBList<RIDBFacility>) client.<RIDBListClasses.RIDBFacilityList>makeRequest(url, RIDBListClasses.RIDBFacilityList.class);
    }
	
	/**
	 * Get all of the addresses associated with all recreation areas.  Warning: This retrieves thousands of records!
	 *
	 * @return an array containing ALL of the addresses for all recreation areas
	 */
	public RIDBRecAreaAddress[] getAllAddresses()
    {
		RIDBPager<RIDBRecAreaAddress> pager = new RIDBPager<RIDBRecAreaAddress>()
				{
					public RIDBList<RIDBRecAreaAddress> getPage(RIDBSearchParameters searchParams) {
						return searchAddresses(searchParams);
					}
			
				};
		return client.<RIDBRecAreaAddress>getAll(null, pager, RIDBRecAreaAddress.class);
    }
	
	/**
	 * Search facility addresses for all recreation areas and return matches. The query, limit, and offset search
	 * parameters are supported.  The query parameter is applied to the city, state, postal code, country code,
	 * and street address fields.
	 *
	 * @param searchParams the search parameters to use in the search
	 * @return a single page of RIDB search results
	 */
	public RIDBList<RIDBRecAreaAddress> searchAddresses(RIDBSearchParameters searchParams)
    {
        String url = client.formatSearchUrl("/recareaaddresses", new String[0], searchParams);
        return (RIDBList<RIDBRecAreaAddress>) client.<RIDBListClasses.RIDBRecAreaAddressList>makeRequest(url, RIDBListClasses.RIDBRecAreaAddressList.class);
    }
	
	/**
	 * Get all of the addresses associated with a single recreation area.
	 *
	 * @param recAreaId the id for the recreation area
	 * @return an array of all of the addresses associated with that recreation area
	 */
	public RIDBRecAreaAddress[] getAllAddresses(int recAreaId)
    {
		final int finalId = recAreaId;
		RIDBPager<RIDBRecAreaAddress> pager = new RIDBPager<RIDBRecAreaAddress>()
				{
					public RIDBList<RIDBRecAreaAddress> getPage(RIDBSearchParameters searchParams) {
						return searchAddresses(finalId, searchParams);
					}
			
				};
		return client.<RIDBRecAreaAddress>getAll(null, pager, RIDBRecAreaAddress.class);
    }
	
	/**
	 * Search the addresses for a specific recreation area.  The search utilizes the following search parameters:
	 * query, limit, and offset.  The query parameter is applied to the city, state, postal code, country code,
	 * and street address fields.
	 *
	 * @param recAreaId the id for the recreation area
	 * @param searchParams the search parameters to apply to the search
	 * @return a page of RIDB search results
	 */
	public RIDBList<RIDBRecAreaAddress> searchAddresses(int recAreaId, RIDBSearchParameters searchParams)
    {
        String url = client.formatSearchUrl("/recareas/%s/recareaaddresses", new String[] { Integer.toString(recAreaId) }, searchParams);
        return (RIDBList<RIDBRecAreaAddress>) client.<RIDBListClasses.RIDBRecAreaAddressList>makeRequest(url, RIDBListClasses.RIDBRecAreaAddressList.class);
    }
	
	/**
	 * Retrieve a specific address for a recreation area.
	 *
	 * @param id the id for the recreation area address
	 * @return the recreation area address or null if not found
	 */
	public RIDBRecAreaAddress getAddress(int id)
    {
        String url = client.formatUrl("/recareaaddresses/%s", new String[] { Integer.toString(id) }, null);
        //return client.<RIDBRecArea>makeRequest(url, RIDBRecArea.class);
        RIDBRecAreaAddress[] singleElementArray = client.<RIDBRecAreaAddress[]>makeRequest(url, RIDBRecAreaAddress[].class);
        if (singleElementArray == null || singleElementArray.length == 0) return null;
        return singleElementArray[0];
    }
	
	/**
	 * Retrieve all of the media objects associated with a recreation area.
	 *
	 * @param recAreaId the recreation area id
	 * @return the array of media objects
	 */
	public RIDBEntityMedia[] getAllMedia(int recAreaId)
    {
		final int finalId = recAreaId;
		RIDBPager<RIDBEntityMedia> pager = new RIDBPager<RIDBEntityMedia>()
				{
					public RIDBList<RIDBEntityMedia> getPage(RIDBSearchParameters searchParams) {
						return searchMedia(finalId, searchParams);
					}
			
				};
		return client.<RIDBEntityMedia>getAll(null, pager, RIDBEntityMedia.class);
    }
	
	/**
	 * Search the media associated with a recreation area.  The query, offset, and limit search parameters are supported.
	 * Query is applied to the title, subtitle, description, credits, and media type fields.
	 *
	 * @param recAreaId the recreation area id
	 * @param searchParams the search parameters for the search
	 * @return a page of RIDB search results
	 */
	public RIDBList<RIDBEntityMedia> searchMedia(int recAreaId, RIDBSearchParameters searchParams)
    {
		String url = client.formatSearchUrl("/recareas/%s/media", new String[] { Integer.toString(recAreaId) }, searchParams);
        return (RIDBList<RIDBEntityMedia>) client.<RIDBListClasses.RIDBEntityMediaList>makeRequest(url, RIDBListClasses.RIDBEntityMediaList.class);
    }
	
	/**
	 * Get a specific media item for a specific recreation area.
	 *
	 * @param recAreaId the id of the recreation area
	 * @param mediaId the id of the media object
	 * @return the media object or null if not found
	 */
	public RIDBEntityMedia getMedia(int recAreaId, int mediaId)
    {
		String url = client.formatUrl("/recareas/%s/media/%s", new String[] { Integer.toString(recAreaId), Integer.toString(mediaId) }, null);
        //return client.<RIDBRecArea>makeRequest(url, RIDBRecArea.class);
        RIDBEntityMedia[] singleElementArray = client.<RIDBEntityMedia[]>makeRequest(url, RIDBEntityMedia[].class);
        if (singleElementArray == null || singleElementArray.length == 0) return null;
        return singleElementArray[0];
    }
	
	/**
	 * Retrieve all of the links associated with a recreation area.
	 *
	 * @param recAreaId the recreation area id
	 * @return an array of links
	 */
	public RIDBEntityLink[] getAllLinks(int recAreaId)
    {
		final int finalId = recAreaId;
		RIDBPager<RIDBEntityLink> pager = new RIDBPager<RIDBEntityLink>()
				{
					public RIDBList<RIDBEntityLink> getPage(RIDBSearchParameters searchParams) {
						return searchLinks(finalId, searchParams);
					}
			
				};
		return client.<RIDBEntityLink>getAll(null, pager, RIDBEntityLink.class);
    }
	
	/**
	 * Search the links associated with a recreation area.  The query, offset, and limit search parameters are supported.
	 * Query is applied to the title, description, and link type fields.
	 *
	 * @param recAreaId the recreation area id
	 * @param searchParams the search parameters for the search
	 * @return a page of RIDB search results
	 */
	public RIDBList<RIDBEntityLink> searchLinks(int recAreaId, RIDBSearchParameters searchParams)
    {
		String url = client.formatSearchUrl("/recareas/%s/links", new String[] { Integer.toString(recAreaId) }, searchParams);
        return (RIDBList<RIDBEntityLink>) client.<RIDBListClasses.RIDBEntityLinkList>makeRequest(url, RIDBListClasses.RIDBEntityLinkList.class);
    }
	
	/**
	 * Get a specific link for a specific recreation area.
	 *
	 * @param recAreaId the id of the recreation area
	 * @param linkId the id of the link object
	 * @return the link object or null if not found
	 */
	public RIDBEntityLink getLink(int recAreaId, int linkId)
    {
		String url = client.formatUrl("/recareas/%s/links/%s", new String[] { Integer.toString(recAreaId), Integer.toString(linkId) }, null);
        //return client.<RIDBRecArea>makeRequest(url, RIDBRecArea.class);
        RIDBEntityLink[] singleElementArray = client.<RIDBEntityLink[]>makeRequest(url, RIDBEntityLink[].class);
        if (singleElementArray == null || singleElementArray.length == 0) return null;
        return singleElementArray[0];
    }
	
	/**
	 * Retrieve all of the events associated with a recreation area.
	 *
	 * @param recAreaId the recreation area id
	 * @return an array of events
	 */
	public RIDBEvent[] getAllEvents(int recAreaId)
    {
		final int finalId = recAreaId;
		RIDBPager<RIDBEvent> pager = new RIDBPager<RIDBEvent>()
				{
					public RIDBList<RIDBEvent> getPage(RIDBSearchParameters searchParams) {
						return searchEvents(finalId, searchParams);
					}
			
				};
		return client.<RIDBEvent>getAll(null, pager, RIDBEvent.class);
    }
	
	/**
	 * Search the events associated with a recreation area.  The query, offset, and limit search parameters are supported.
	 * Query is applied to the event name, start/end date, description, age group, ADA access, fee description, scope
	 * description, and type description fields.
	 *
	 * @param recAreaId the recreation area id
	 * @param searchParams the search parameters for the search
	 * @return a page of RIDB search results
	 */
	public RIDBList<RIDBEvent> searchEvents(int recAreaId, RIDBSearchParameters searchParams)
    {
		final int finalId = recAreaId;
        String url = client.formatSearchUrl("/recareas/%s/events", new String[] { Integer.toString(finalId) }, searchParams);
        return (RIDBList<RIDBEvent>) client.<RIDBListClasses.RIDBEventList>makeRequest(url, RIDBListClasses.RIDBEventList.class);
    }
	
	/**
	 * Get a specific event for a specific recreation area.
	 *
	 * @param recAreaId the id of the recreation area
	 * @param eventId the id of the event
	 * @return the event object or null if not found
	 */
	public RIDBEvent getEvent(int recAreaId, int eventId)
    {
		String url = client.formatUrl("/recareas/%s/events/%s", new String[] { Integer.toString(recAreaId), Integer.toString(eventId) }, null);
        //return client.<RIDBRecArea>makeRequest(url, RIDBRecArea.class);
        RIDBEvent[] singleElementArray = client.<RIDBEvent[]>makeRequest(url, RIDBEvent[].class);
        if (singleElementArray == null || singleElementArray.length == 0) return null;
        return singleElementArray[0];
    }
	
	/**
	 * Retrieve all of the activities associated with a recreation area.
	 *
	 * @param recAreaId the recreation area id
	 * @return an array of activities
	 */
	public RIDBRecAreaActivity[] getAllActivities(int recAreaId)
    {
		final int finalId = recAreaId;
		RIDBPager<RIDBRecAreaActivity> pager = new RIDBPager<RIDBRecAreaActivity>()
				{
					public RIDBList<RIDBRecAreaActivity> getPage(RIDBSearchParameters searchParams) {
						return searchActivities(finalId, searchParams);
					}
			
				};
		return client.<RIDBRecAreaActivity>getAll(null, pager, RIDBRecAreaActivity.class);
    }
	
	/**
	 * Search the activities associated with a recreation area.  The query, offset, and limit search parameters are supported.
	 * Query is applied to the activity name field.
	 *
	 * @param recAreaId the recreation area id
	 * @param searchParams the search parameters for the search
	 * @return a page of RIDB search results
	 */
	public RIDBList<RIDBRecAreaActivity> searchActivities(int recAreaId, RIDBSearchParameters searchParams)
    {
		String url = client.formatSearchUrl("/recareas/%s/activities", new String[] { Integer.toString(recAreaId) }, searchParams);
        return (RIDBList<RIDBRecAreaActivity>) client.<RIDBListClasses.RIDBRecAreaActivityList>makeRequest(url, RIDBListClasses.RIDBRecAreaActivityList.class);
    }
	
	/**
	 * Get a specific activity for a specific recreation area.
	 *
	 * @param recAreaId the id of the recreation area
	 * @param activityId the id of the activity
	 * @return the activity object or null if not found
	 */
	public RIDBRecAreaActivity getActivity(int recAreaId, int activityId)
    {
		String url = client.formatUrl("/recareas/%s/activities/%s", new String[] { Integer.toString(recAreaId), Integer.toString(activityId) }, null);
        //return client.<RIDBRecArea>makeRequest(url, RIDBRecArea.class);
        RIDBRecAreaActivity[] singleElementArray = client.<RIDBRecAreaActivity[]>makeRequest(url, RIDBRecAreaActivity[].class);
        if (singleElementArray == null || singleElementArray.length == 0) return null;
        return singleElementArray[0];
    }


}
