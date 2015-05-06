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
 * The client module used to access information about RIDB facilities.  To get the facilities associated with a
 * recreation area, use the recreation area module and call one of the facility search or access methods.
 * 
 * @author NIC Federal
 */
public class RIDBClientModFacility extends RIDBClientModule {

	/**
	 * Create the module during initialization of the client.
	 *
	 * @param client the client that owns the module.
	 */
	public RIDBClientModFacility(RIDBClient client) {
		super(client);
	}
	
	/**
	 * Retrieve all facilities in RIDB.  Warning: this retrieves thousands of records and takes
	 * quite a while to pull all pages of facility results.  This method should be only used
 	 * when all facilities need handled.
	 *
	 * @return an array containing all of the facilities in RIDB
	 */
	public RIDBFacility[] getAll()
    {
		RIDBPager<RIDBFacility> pager = new RIDBPager<RIDBFacility>()
				{
					public RIDBList<RIDBFacility> getPage(RIDBSearchParameters searchParams) {
						return search(searchParams);
					}
			
				};
		return client.<RIDBFacility>getAll(null, pager, RIDBFacility.class);
    }
	
	/**
	 * Search all of the facilities within RIDB and return matches.  All search parameters are supported.  The
	 * Query parameter is applied to the facility name, description, keywords, and stay limit fields.
	 *
	 * @param searchParams the search parameters to use in the search
	 * @return a single page of RIDB search results
	 */
	public RIDBList<RIDBFacility> search(RIDBSearchParameters searchParams)
    {
        String url = client.formatSearchUrl("/facilities", new String[0], searchParams);
        return (RIDBList<RIDBFacility>) client.<RIDBListClasses.RIDBFacilityList>makeRequest(url, RIDBListClasses.RIDBFacilityList.class);
    }
	
	/**
	 * Get a specific facility.
	 *
	 * @param id the id for the facility
	 * @return the facility object or null if not found
	 */
	public RIDBFacility get(int id)
    {
        String url = client.formatUrl("/facilities/%s", new String[] { Integer.toString(id) }, null);
        return client.<RIDBFacility>makeRequest(url, RIDBFacility.class);
    }
	
	/**
	 * Get all of the addresses associated with all facilities.  Warning: This retrieves thousands of records!
	 *
	 * @return an array containing ALL of the addresses for all facilities
	 */
	public RIDBFacilityAddress[] getAllAddresses()
    {
		RIDBPager<RIDBFacilityAddress> pager = new RIDBPager<RIDBFacilityAddress>()
				{
					public RIDBList<RIDBFacilityAddress> getPage(RIDBSearchParameters searchParams) {
						return searchAddresses(searchParams);
					}
			
				};
		return client.<RIDBFacilityAddress>getAll(null, pager, RIDBFacilityAddress.class);
    }
	
	/**
	 * Search facility addresses for all facilities and return matches. The query, limit, and offset search
	 * parameters are supported.  The query parameter is applied to the city, state, postal code, country code,
	 * and street address fields.
	 *
	 * @param searchParams the search parameters to use in the search
	 * @return a single page of RIDB search results
	 */
	public RIDBList<RIDBFacilityAddress> searchAddresses(RIDBSearchParameters searchParams)
    {
        String url = client.formatSearchUrl("/facilityaddresses", new String[0], searchParams);
        return (RIDBList<RIDBFacilityAddress>) client.<RIDBListClasses.RIDBFacilityAddressList>makeRequest(url, RIDBListClasses.RIDBFacilityAddressList.class);
    }
	
	/**
	 * Get all of the addresses associated with a single facility.
	 *
	 * @param facilityId the id for the facility
	 * @return an array of all of the addresses associated with that facility
	 */
	public RIDBFacilityAddress[] getAllAddresses(int facilityId)
    {
		final int finalId = facilityId;
		RIDBPager<RIDBFacilityAddress> pager = new RIDBPager<RIDBFacilityAddress>()
				{
					public RIDBList<RIDBFacilityAddress> getPage(RIDBSearchParameters searchParams) {
						return searchAddresses(finalId, searchParams);
					}
			
				};
		return client.<RIDBFacilityAddress>getAll(null, pager, RIDBFacilityAddress.class);
    }
	
	/**
	 * Search the addresses for a specific facility.  The search utilizes the following search parameters:
	 * query, limit, and offset.  The query parameter is applied to the city, state, postal code, country code,
	 * and street address fields.
	 *
	 * @param facilityId the id for the facility
	 * @param searchParams the search parameters to apply to the search
	 * @return a page of RIDB search results
	 */
	public RIDBList<RIDBFacilityAddress> searchAddresses(int facilityId, RIDBSearchParameters searchParams)
    {
        String url = client.formatSearchUrl("/facilities/%s/facilityaddresses", new String[] { Integer.toString(facilityId) }, searchParams);
        return (RIDBList<RIDBFacilityAddress>) client.<RIDBListClasses.RIDBFacilityAddressList>makeRequest(url, RIDBListClasses.RIDBFacilityAddressList.class);
    }
	
	/**
	 * Retrieve a specific address for a facility.
	 *
	 * @param id the id for the facility address
	 * @return the facility address or null if not found
	 */
	public RIDBFacilityAddress getAddress(int id)
    {
        String url = client.formatUrl("/facilityaddresses/%s", new String[] { Integer.toString(id) }, null);
        //return client.<RIDBFacility>makeRequest(url, RIDBFacility.class);
        RIDBFacilityAddress[] singleElementArray = client.<RIDBFacilityAddress[]>makeRequest(url, RIDBFacilityAddress[].class);
        if (singleElementArray == null || singleElementArray.length == 0) return null;
        return singleElementArray[0];
    }
	
	/**
	 * Retrieve all of the media objects associated with a facility.
	 *
	 * @param facilityId the facility id
	 * @return the array of media objects
	 */
	public RIDBEntityMedia[] getAllMedia(int facilityId)
    {
		final int finalId = facilityId;
		RIDBPager<RIDBEntityMedia> pager = new RIDBPager<RIDBEntityMedia>()
				{
					public RIDBList<RIDBEntityMedia> getPage(RIDBSearchParameters searchParams) {
						return searchMedia(finalId, searchParams);
					}
			
				};
		return client.<RIDBEntityMedia>getAll(null, pager, RIDBEntityMedia.class);
    }
	
	/**
	 * Search the media associated with a facility.  The query, offset, and limit search parameters are supported.
	 * Query is applied to the title, subtitle, description, credits, and media type fields.
	 *
	 * @param facilityId the facility id
	 * @param searchParams the search parameters for the search
	 * @return a page of RIDB search results
	 */
	public RIDBList<RIDBEntityMedia> searchMedia(int facilityId, RIDBSearchParameters searchParams)
    {
		String url = client.formatSearchUrl("/facilities/%s/media", new String[] { Integer.toString(facilityId) }, searchParams);
        return (RIDBList<RIDBEntityMedia>) client.<RIDBListClasses.RIDBEntityMediaList>makeRequest(url, RIDBListClasses.RIDBEntityMediaList.class);
    }
	
	/**
	 * Get a specific media item for a specific facility.
	 *
	 * @param facilityId the id of the facility
	 * @param mediaId the id of the media object
	 * @return the media object or null if not found
	 */
	public RIDBEntityMedia getMedia(int facilityId, int mediaId)
    {
		String url = client.formatUrl("/facilities/%s/media/%s", new String[] { Integer.toString(facilityId), Integer.toString(mediaId) }, null);
        //return client.<RIDBFacility>makeRequest(url, RIDBFacility.class);
        RIDBEntityMedia[] singleElementArray = client.<RIDBEntityMedia[]>makeRequest(url, RIDBEntityMedia[].class);
        if (singleElementArray == null || singleElementArray.length == 0) return null;
        return singleElementArray[0];
    }
	
	/**
	 * Retrieve all of the links associated with a facility.
	 *
	 * @param facilityId the facility id
	 * @return an array of links
	 */
	public RIDBEntityLink[] getAllLinks(int facilityId)
    {
		final int finalId = facilityId;
		RIDBPager<RIDBEntityLink> pager = new RIDBPager<RIDBEntityLink>()
				{
					public RIDBList<RIDBEntityLink> getPage(RIDBSearchParameters searchParams) {
						return searchLinks(finalId, searchParams);
					}
			
				};
		return client.<RIDBEntityLink>getAll(null, pager, RIDBEntityLink.class);
    }
	
	/**
	 * Search the links associated with a facility.  The query, offset, and limit search parameters are supported.
	 * Query is applied to the title, description, and link type fields.
	 *
	 * @param facilityId the facility id
	 * @param searchParams the search parameters for the search
	 * @return a page of RIDB search results
	 */
	public RIDBList<RIDBEntityLink> searchLinks(int facilityId, RIDBSearchParameters searchParams)
    {
		String url = client.formatSearchUrl("/facilities/%s/links", new String[] { Integer.toString(facilityId) }, searchParams);
        return (RIDBList<RIDBEntityLink>) client.<RIDBListClasses.RIDBEntityLinkList>makeRequest(url, RIDBListClasses.RIDBEntityLinkList.class);
    }
	
	/**
	 * Get a specific link for a specific facility.
	 *
	 * @param facilityId the id of the facility
	 * @param linkId the id of the link object
	 * @return the link object or null if not found
	 */
	public RIDBEntityLink getLink(int facilityId, int linkId)
    {
		String url = client.formatUrl("/facilities/%s/links/%s", new String[] { Integer.toString(facilityId), Integer.toString(linkId) }, null);
        //return client.<RIDBFacility>makeRequest(url, RIDBFacility.class);
        RIDBEntityLink[] singleElementArray = client.<RIDBEntityLink[]>makeRequest(url, RIDBEntityLink[].class);
        if (singleElementArray == null || singleElementArray.length == 0) return null;
        return singleElementArray[0];
    }
	
	/**
	 * Retrieve all of the events associated with a facility.
	 *
	 * @param facilityId the facility id
	 * @return an array of events
	 */
	public RIDBEvent[] getAllEvents(int facilityId)
    {
		final int finalId = facilityId;
		RIDBPager<RIDBEvent> pager = new RIDBPager<RIDBEvent>()
				{
					public RIDBList<RIDBEvent> getPage(RIDBSearchParameters searchParams) {
						return searchEvents(finalId, searchParams);
					}
			
				};
		return client.<RIDBEvent>getAll(null, pager, RIDBEvent.class);
    }
	
	/**
	 * Search the events associated with a facility.  The query, offset, and limit search parameters are supported.
	 * Query is applied to the event name, start/end date, description, age group, ADA access, fee description, scope
	 * description, and type description fields.
	 *
	 * @param facilityId the facility id
	 * @param searchParams the search parameters for the search
	 * @return a page of RIDB search results
	 */
	public RIDBList<RIDBEvent> searchEvents(int facilityId, RIDBSearchParameters searchParams)
    {
		final int finalId = facilityId;
        String url = client.formatSearchUrl("/facilities/%s/events", new String[] { Integer.toString(finalId) }, searchParams);
        return (RIDBList<RIDBEvent>) client.<RIDBListClasses.RIDBEventList>makeRequest(url, RIDBListClasses.RIDBEventList.class);
    }
	
	/**
	 * Get a specific event for a specific facility.
	 *
	 * @param facilityId the id of the facility
	 * @param eventId the id of the event
	 * @return the event object or null if not found
	 */
	public RIDBEvent getEvent(int facilityId, int eventId)
    {
		String url = client.formatUrl("/facilities/%s/events/%s", new String[] { Integer.toString(facilityId), Integer.toString(eventId) }, null);
        //return client.<RIDBFacility>makeRequest(url, RIDBFacility.class);
        RIDBEvent[] singleElementArray = client.<RIDBEvent[]>makeRequest(url, RIDBEvent[].class);
        if (singleElementArray == null || singleElementArray.length == 0) return null;
        return singleElementArray[0];
    }
	
	/**
	 * Retrieve all of the activities associated with a facility.
	 *
	 * @param facilityId the facility id
	 * @return an array of activities
	 */
	public RIDBActivity[] getAllActivities(int facilityId)
    {
		final int finalId = facilityId;
		RIDBPager<RIDBActivity> pager = new RIDBPager<RIDBActivity>()
				{
					public RIDBList<RIDBActivity> getPage(RIDBSearchParameters searchParams) {
						return searchActivities(finalId, searchParams);
					}
			
				};
		return client.<RIDBActivity>getAll(null, pager, RIDBActivity.class);
    }
	
	/**
	 * Search the activities associated with a facility.  The query, offset, and limit search parameters are supported.
	 * Query is applied to the activity name field.
	 *
	 * @param facilityId the facility id
	 * @param searchParams the search parameters for the search
	 * @return a page of RIDB search results
	 */
	public RIDBList<RIDBActivity> searchActivities(int facilityId, RIDBSearchParameters searchParams)
    {
		String url = client.formatSearchUrl("/facilities/%s/activities", new String[] { Integer.toString(facilityId) }, searchParams);
        return (RIDBList<RIDBActivity>) client.<RIDBListClasses.RIDBActivityList>makeRequest(url, RIDBListClasses.RIDBActivityList.class);
    }
	
	/**
	 * Get a specific activity for a specific facility.
	 *
	 * @param facilityId the id of the facility
	 * @param activityId the id of the activity
	 * @return the activity object or null if not found
	 */
	public RIDBActivity getActivity(int facilityId, int activityId)
    {
		String url = client.formatUrl("/facilities/%s/activities/%s", new String[] { Integer.toString(facilityId), Integer.toString(activityId) }, null);
        //return client.<RIDBFacility>makeRequest(url, RIDBFacility.class);
        RIDBActivity[] singleElementArray = client.<RIDBActivity[]>makeRequest(url, RIDBActivity[].class);
        if (singleElementArray == null || singleElementArray.length == 0) return null;
        return singleElementArray[0];
    }
	
	/**
	 * Retrieve all of the campsites associated with a facility.
	 *
	 * @param facilityId the id of the facility
	 * @return an array of campsites
	 */
	public RIDBCampsite[] getAllCampsites(int facilityId)
    {
		final int finalId = facilityId;
		RIDBPager<RIDBCampsite> pager = new RIDBPager<RIDBCampsite>()
				{
					public RIDBList<RIDBCampsite> getPage(RIDBSearchParameters searchParams) {
						return searchCampsites(finalId, searchParams);
					}
			
				};
		return client.<RIDBCampsite>getAll(null, pager, RIDBCampsite.class);
    }
	
	/**
	 * Search the campsites associated with a facility.  The query, offset, and limit search parameters are supported.
	 * Query is applied to the campsite name, type, loop, type of use (Overnight/Day), campsite accessible (Yes/No) fields.
	 *
	 * @param facilityId the id of the facility
	 * @param searchParams the search parameters for the search
	 * @return a page of RIDB search results
	 */
	public RIDBList<RIDBCampsite> searchCampsites(int facilityId, RIDBSearchParameters searchParams)
    {
		final int finalId = facilityId;
        String url = client.formatSearchUrl("/facilities/%s/campsites", new String[] { Integer.toString(finalId) }, searchParams);
        return (RIDBList<RIDBCampsite>) client.<RIDBListClasses.RIDBCampsiteList>makeRequest(url, RIDBListClasses.RIDBCampsiteList.class);
    }
	
	/**
	 * Retrieve all of the permit entrances associated with a facility.
	 *
	 * @param facilityId the id of the facility
	 * @return an array of permit entrances
	 */
	public RIDBPermitEntrance[] getAllPermitEntrances(int facilityId)
    {
		final int finalId = facilityId;
		RIDBPager<RIDBPermitEntrance> pager = new RIDBPager<RIDBPermitEntrance>()
				{
					public RIDBList<RIDBPermitEntrance> getPage(RIDBSearchParameters searchParams) {
						return searchPermitEntrances(finalId, searchParams);
					}
			
				};
		return client.<RIDBPermitEntrance>getAll(null, pager, RIDBPermitEntrance.class);
    }
	
	/**
	 * Search the permit entrances associated with a facility.  The query, offset, and limit search parameters are supported.
	 * Query is applied to the permit name, type (Campground, Cabin, etc.), description, accessible (Yes/No), district, and town fields.
	 *
	 * @param facilityId the id of the facility
	 * @param searchParams the search parameters for the search
	 * @return a page of RIDB search results
	 */
	public RIDBList<RIDBPermitEntrance> searchPermitEntrances(int facilityId, RIDBSearchParameters searchParams)
    {
		final int finalId = facilityId;
        String url = client.formatSearchUrl("/facilities/%s/permitentrances", new String[] { Integer.toString(finalId) }, searchParams);
        return (RIDBList<RIDBPermitEntrance>) client.<RIDBListClasses.RIDBPermitEntranceList>makeRequest(url, RIDBListClasses.RIDBPermitEntranceList.class);
    }
	
	/**
	 * Retrieve all of the tours associated with a facility.
	 *
	 * @param facilityId the id of the facility
	 * @return an array of tours
	 */
	public RIDBTour[] getAllTours(int facilityId)
    {
		final int finalId = facilityId;
		RIDBPager<RIDBTour> pager = new RIDBPager<RIDBTour>()
				{
					public RIDBList<RIDBTour> getPage(RIDBSearchParameters searchParams) {
						return searchTours(finalId, searchParams);
					}
			
				};
		return client.<RIDBTour>getAll(null, pager, RIDBTour.class);
    }
	
	/**
	 * Search the tours associated with a facility.  The query, offset, and limit search parameters are supported.
	 * Query is applied to the tour name, type, description, and accessible (Yes/No) fields.
	 *
	 * @param facilityId the id of the facility
	 * @param searchParams the search parameters for the search
	 * @return a page of RIDB search results
	 */
	public RIDBList<RIDBTour> searchTours(int facilityId, RIDBSearchParameters searchParams)
    {
		String url = client.formatSearchUrl("/facilities/%s/tours", new String[] { Integer.toString(facilityId) }, searchParams);
        return (RIDBList<RIDBTour>) client.<RIDBListClasses.RIDBTourList>makeRequest(url, RIDBListClasses.RIDBTourList.class);
    }
	
	

}
