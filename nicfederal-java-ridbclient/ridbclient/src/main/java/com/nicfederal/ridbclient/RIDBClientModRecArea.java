package com.nicfederal.ridbclient;

public class RIDBClientModRecArea extends RIDBClientModule {

	public RIDBClientModRecArea(RIDBClient client) {
		super(client);
	}

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
	
	public RIDBList<RIDBRecArea> search(RIDBSearchParameters searchParams)
    {
        String url = client.formatSearchUrl("/recareas", new String[0], searchParams);
        return (RIDBList<RIDBRecArea>) client.<RIDBRecAreaList>makeRequest(url, RIDBRecAreaList.class);
    }
	
	public RIDBRecArea get(int id)
    {
        String url = client.formatUrl("/recareas/%s", new String[] { Integer.toString(id) }, null);
        return client.<RIDBRecArea>makeRequest(url, RIDBRecArea.class);
    }
	
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
	
	public RIDBList<RIDBFacility> searchFacilities(int recAreaId, RIDBSearchParameters searchParams)
    {
        String url = client.formatSearchUrl("/recareas/%s/facilities", new String[] { Integer.toString(recAreaId) }, searchParams);
        return (RIDBList<RIDBFacility>) client.<RIDBFacilityList>makeRequest(url, RIDBFacilityList.class);
    }
	
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
	
	public RIDBList<RIDBRecAreaAddress> searchAddresses(RIDBSearchParameters searchParams)
    {
        String url = client.formatSearchUrl("/recareaaddresses", new String[0], searchParams);
        return (RIDBList<RIDBRecAreaAddress>) client.<RIDBRecAreaAddressList>makeRequest(url, RIDBRecAreaAddressList.class);
    }
	
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
	
	public RIDBList<RIDBRecAreaAddress> searchAddresses(int recAreaId, RIDBSearchParameters searchParams)
    {
        String url = client.formatSearchUrl("/recareas/%s/recareaaddresses", new String[] { Integer.toString(recAreaId) }, searchParams);
        return (RIDBList<RIDBRecAreaAddress>) client.<RIDBRecAreaAddressList>makeRequest(url, RIDBRecAreaAddressList.class);
    }
	
	public RIDBRecAreaAddress getAddress(int id)
    {
        String url = client.formatUrl("/recareaaddresses/%s", new String[] { Integer.toString(id) }, null);
        //return client.<RIDBRecArea>makeRequest(url, RIDBRecArea.class);
        RIDBRecAreaAddress[] singleElementArray = client.<RIDBRecAreaAddress[]>makeRequest(url, RIDBRecAreaAddress[].class);
        if (singleElementArray == null || singleElementArray.length == 0) return null;
        return singleElementArray[0];
    }
	
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
	
	public RIDBList<RIDBEntityMedia> searchMedia(int recAreaId, RIDBSearchParameters searchParams)
    {
		String url = client.formatSearchUrl("/recareas/%s/media", new String[] { Integer.toString(recAreaId) }, searchParams);
        return (RIDBList<RIDBEntityMedia>) client.<RIDBEntityMediaList>makeRequest(url, RIDBEntityMediaList.class);
    }
	
	public RIDBEntityMedia getMedia(int recAreaId, int mediaId)
    {
		String url = client.formatUrl("/recareas/%s/media/%s", new String[] { Integer.toString(recAreaId), Integer.toString(mediaId) }, null);
        //return client.<RIDBRecArea>makeRequest(url, RIDBRecArea.class);
        RIDBEntityMedia[] singleElementArray = client.<RIDBEntityMedia[]>makeRequest(url, RIDBEntityMedia[].class);
        if (singleElementArray == null || singleElementArray.length == 0) return null;
        return singleElementArray[0];
    }
	
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
	
	public RIDBList<RIDBEntityLink> searchLinks(int recAreaId, RIDBSearchParameters searchParams)
    {
		String url = client.formatSearchUrl("/recareas/%s/links", new String[] { Integer.toString(recAreaId) }, searchParams);
        return (RIDBList<RIDBEntityLink>) client.<RIDBEntityLinkList>makeRequest(url, RIDBEntityLinkList.class);
    }
	
	public RIDBEntityLink getLink(int recAreaId, int linkId)
    {
		String url = client.formatUrl("/recareas/%s/links/%s", new String[] { Integer.toString(recAreaId), Integer.toString(linkId) }, null);
        //return client.<RIDBRecArea>makeRequest(url, RIDBRecArea.class);
        RIDBEntityLink[] singleElementArray = client.<RIDBEntityLink[]>makeRequest(url, RIDBEntityLink[].class);
        if (singleElementArray == null || singleElementArray.length == 0) return null;
        return singleElementArray[0];
    }
	
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
	
	public RIDBList<RIDBEvent> searchEvents(int recAreaId, RIDBSearchParameters searchParams)
    {
		final int finalId = recAreaId;
        String url = client.formatSearchUrl("/recareas/%s/events", new String[] { Integer.toString(finalId) }, searchParams);
        return (RIDBList<RIDBEvent>) client.<RIDBEventList>makeRequest(url, RIDBEventList.class);
    }
	
	public RIDBEvent getEvent(int recAreaId, int eventId)
    {
		String url = client.formatUrl("/recareas/%s/events/%s", new String[] { Integer.toString(recAreaId), Integer.toString(eventId) }, null);
        //return client.<RIDBRecArea>makeRequest(url, RIDBRecArea.class);
        RIDBEvent[] singleElementArray = client.<RIDBEvent[]>makeRequest(url, RIDBEvent[].class);
        if (singleElementArray == null || singleElementArray.length == 0) return null;
        return singleElementArray[0];
    }
	
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
	
	public RIDBList<RIDBRecAreaActivity> searchActivities(int recAreaId, RIDBSearchParameters searchParams)
    {
		String url = client.formatSearchUrl("/recareas/%s/activities", new String[] { Integer.toString(recAreaId) }, searchParams);
        return (RIDBList<RIDBRecAreaActivity>) client.<RIDBRecAreaActivityList>makeRequest(url, RIDBRecAreaActivityList.class);
    }
	
	public RIDBRecAreaActivity getActivity(int recAreaId, int activityId)
    {
		String url = client.formatUrl("/recareas/%s/activities/%s", new String[] { Integer.toString(recAreaId), Integer.toString(activityId) }, null);
        //return client.<RIDBRecArea>makeRequest(url, RIDBRecArea.class);
        RIDBRecAreaActivity[] singleElementArray = client.<RIDBRecAreaActivity[]>makeRequest(url, RIDBRecAreaActivity[].class);
        if (singleElementArray == null || singleElementArray.length == 0) return null;
        return singleElementArray[0];
    }
	
	
	// inner classes to allow reflection for generics
	
	public static class RIDBRecAreaList extends RIDBList<RIDBRecArea>
	{
		public RIDBRecAreaList() { super(); }
	}
	
	public static class RIDBFacilityList extends RIDBList<RIDBFacility>
	{
		public RIDBFacilityList() { super(); }
	}
	
	public static class RIDBRecAreaAddressList extends RIDBList<RIDBRecAreaAddress>
	{
		public RIDBRecAreaAddressList() { super(); }
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
	
	public static class RIDBRecAreaActivityList extends RIDBList<RIDBRecAreaActivity>
	{
		public RIDBRecAreaActivityList() { super(); }
	}

}
