package com.nicfederal.ridbclient;

public class RIDBClientModFacility extends RIDBClientModule {

	public RIDBClientModFacility(RIDBClient client) {
		super(client);
	}
	
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
	
	public RIDBList<RIDBFacility> search(RIDBSearchParameters searchParams)
    {
        String url = client.formatSearchUrl("/facilities", new String[0], searchParams);
        return (RIDBList<RIDBFacility>) client.<RIDBFacilityList>makeRequest(url, RIDBFacilityList.class);
    }
	
	public RIDBFacility get(int id)
    {
        String url = client.formatUrl("/facilities/%s", new String[] { Integer.toString(id) }, null);
        return client.<RIDBFacility>makeRequest(url, RIDBFacility.class);
    }
	
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
	
	public RIDBList<RIDBFacilityAddress> searchAddresses(RIDBSearchParameters searchParams)
    {
        String url = client.formatSearchUrl("/facilityaddresses", new String[0], searchParams);
        return (RIDBList<RIDBFacilityAddress>) client.<RIDBFacilityAddressList>makeRequest(url, RIDBFacilityAddressList.class);
    }
	
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
	
	public RIDBList<RIDBFacilityAddress> searchAddresses(int facilityId, RIDBSearchParameters searchParams)
    {
        String url = client.formatSearchUrl("/facilities/%s/facilityaddresses", new String[] { Integer.toString(facilityId) }, searchParams);
        return (RIDBList<RIDBFacilityAddress>) client.<RIDBFacilityAddressList>makeRequest(url, RIDBFacilityAddressList.class);
    }
	
	public RIDBFacilityAddress getAddress(int id)
    {
        String url = client.formatUrl("/facilityaddresses/%s", new String[] { Integer.toString(id) }, null);
        //return client.<RIDBFacility>makeRequest(url, RIDBFacility.class);
        RIDBFacilityAddress[] singleElementArray = client.<RIDBFacilityAddress[]>makeRequest(url, RIDBFacilityAddress[].class);
        if (singleElementArray == null || singleElementArray.length == 0) return null;
        return singleElementArray[0];
    }
	
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
	
	public RIDBList<RIDBEntityMedia> searchMedia(int facilityId, RIDBSearchParameters searchParams)
    {
		String url = client.formatSearchUrl("/facilities/%s/media", new String[] { Integer.toString(facilityId) }, searchParams);
        return (RIDBList<RIDBEntityMedia>) client.<RIDBEntityMediaList>makeRequest(url, RIDBEntityMediaList.class);
    }
	
	public RIDBEntityMedia getMedia(int facilityId, int mediaId)
    {
		String url = client.formatUrl("/facilities/%s/media/%s", new String[] { Integer.toString(facilityId), Integer.toString(mediaId) }, null);
        //return client.<RIDBFacility>makeRequest(url, RIDBFacility.class);
        RIDBEntityMedia[] singleElementArray = client.<RIDBEntityMedia[]>makeRequest(url, RIDBEntityMedia[].class);
        if (singleElementArray == null || singleElementArray.length == 0) return null;
        return singleElementArray[0];
    }
	
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
	
	public RIDBList<RIDBEntityLink> searchLinks(int facilityId, RIDBSearchParameters searchParams)
    {
		String url = client.formatSearchUrl("/facilities/%s/links", new String[] { Integer.toString(facilityId) }, searchParams);
        return (RIDBList<RIDBEntityLink>) client.<RIDBEntityLinkList>makeRequest(url, RIDBEntityLinkList.class);
    }
	
	public RIDBEntityLink getLink(int facilityId, int linkId)
    {
		String url = client.formatUrl("/facilities/%s/links/%s", new String[] { Integer.toString(facilityId), Integer.toString(linkId) }, null);
        //return client.<RIDBFacility>makeRequest(url, RIDBFacility.class);
        RIDBEntityLink[] singleElementArray = client.<RIDBEntityLink[]>makeRequest(url, RIDBEntityLink[].class);
        if (singleElementArray == null || singleElementArray.length == 0) return null;
        return singleElementArray[0];
    }
	
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
	
	public RIDBList<RIDBEvent> searchEvents(int facilityId, RIDBSearchParameters searchParams)
    {
		final int finalId = facilityId;
        String url = client.formatSearchUrl("/facilities/%s/events", new String[] { Integer.toString(finalId) }, searchParams);
        return (RIDBList<RIDBEvent>) client.<RIDBEventList>makeRequest(url, RIDBEventList.class);
    }
	
	public RIDBEvent getEvent(int facilityId, int eventId)
    {
		String url = client.formatUrl("/facilities/%s/events/%s", new String[] { Integer.toString(facilityId), Integer.toString(eventId) }, null);
        //return client.<RIDBFacility>makeRequest(url, RIDBFacility.class);
        RIDBEvent[] singleElementArray = client.<RIDBEvent[]>makeRequest(url, RIDBEvent[].class);
        if (singleElementArray == null || singleElementArray.length == 0) return null;
        return singleElementArray[0];
    }
	
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
	
	public RIDBList<RIDBActivity> searchActivities(int facilityId, RIDBSearchParameters searchParams)
    {
		String url = client.formatSearchUrl("/facilities/%s/activities", new String[] { Integer.toString(facilityId) }, searchParams);
        return (RIDBList<RIDBActivity>) client.<RIDBActivityList>makeRequest(url, RIDBActivityList.class);
    }
	
	public RIDBActivity getActivity(int facilityId, int activityId)
    {
		String url = client.formatUrl("/facilities/%s/activities/%s", new String[] { Integer.toString(facilityId), Integer.toString(activityId) }, null);
        //return client.<RIDBFacility>makeRequest(url, RIDBFacility.class);
        RIDBActivity[] singleElementArray = client.<RIDBActivity[]>makeRequest(url, RIDBActivity[].class);
        if (singleElementArray == null || singleElementArray.length == 0) return null;
        return singleElementArray[0];
    }
	
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
	
	public RIDBList<RIDBCampsite> searchCampsites(int facilityId, RIDBSearchParameters searchParams)
    {
		final int finalId = facilityId;
        String url = client.formatSearchUrl("/facilities/%s/campsites", new String[] { Integer.toString(finalId) }, searchParams);
        return (RIDBList<RIDBCampsite>) client.<RIDBCampsiteList>makeRequest(url, RIDBCampsiteList.class);
    }
	
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
	
	public RIDBList<RIDBPermitEntrance> searchPermitEntrances(int facilityId, RIDBSearchParameters searchParams)
    {
		final int finalId = facilityId;
        String url = client.formatSearchUrl("/facilities/%s/permitentrances", new String[] { Integer.toString(finalId) }, searchParams);
        return (RIDBList<RIDBPermitEntrance>) client.<RIDBPermitEntranceList>makeRequest(url, RIDBPermitEntranceList.class);
    }
	
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
	
	public RIDBList<RIDBTour> searchTours(int facilityId, RIDBSearchParameters searchParams)
    {
		String url = client.formatSearchUrl("/facilities/%s/tours", new String[] { Integer.toString(facilityId) }, searchParams);
        return (RIDBList<RIDBTour>) client.<RIDBTourList>makeRequest(url, RIDBTourList.class);
    }
	
	// Inner concrete classes so reflection works with generics
	
	public static class RIDBFacilityList extends RIDBList<RIDBFacility>
	{
		public RIDBFacilityList() { super(); }
	}
	
	public static class RIDBFacilityAddressList extends RIDBList<RIDBFacilityAddress>
	{
		public RIDBFacilityAddressList() { super(); }
	}
	
	public static class RIDBEntityMediaList extends RIDBList<RIDBEntityMedia>
	{
		public RIDBEntityMediaList() { super(); }
	}
	
	public static class RIDBEntityLinkList extends RIDBList<RIDBEntityLink>
	{
		public RIDBEntityLinkList() { super(); }
	}
	
	public static class RIDBEventList extends RIDBList<RIDBEvent>
	{
		public RIDBEventList() { super(); }
	}
	
	public static class RIDBActivityList extends RIDBList<RIDBActivity>
	{
		public RIDBActivityList() { super(); }
	}

	public static class RIDBCampsiteList extends RIDBList<RIDBCampsite>
	{
		public RIDBCampsiteList() { super(); }
	}
	
	public static class RIDBTourList extends RIDBList<RIDBTour>
	{
		public RIDBTourList() { super(); }
	}
	
	public static class RIDBPermitEntranceList extends RIDBList<RIDBPermitEntrance>
	{
		public RIDBPermitEntranceList() { super(); }
	}

}
