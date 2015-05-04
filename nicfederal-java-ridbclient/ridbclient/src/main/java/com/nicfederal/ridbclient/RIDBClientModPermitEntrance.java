package com.nicfederal.ridbclient;

public class RIDBClientModPermitEntrance extends RIDBClientModule {

	public RIDBClientModPermitEntrance(RIDBClient client) {
		super(client);
	}
	
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
	
	public RIDBList<RIDBPermitEntrance> search(RIDBSearchParameters searchParams)
    {
        String url = client.formatSearchUrl("/permitentrances", new String[0], searchParams);
        return (RIDBList<RIDBPermitEntrance>) client.<RIDBPermitEntranceList>makeRequest(url, RIDBPermitEntranceList.class);
    }
	
	public RIDBPermitEntrance get(int id)
    {
        String url = client.formatUrl("/permitentrances/%s", new String[] { Integer.toString(id) }, null);
        return client.<RIDBPermitEntrance>makeRequest(url, RIDBPermitEntrance.class);
    }
	
	public RIDBList<RIDBAttribute> searchAttributes(int permitEntranceId, RIDBSearchParameters searchParams)
    {
        String url = client.formatSearchUrl("/permitentrances/%s/attributes", new String[] { Integer.toString(permitEntranceId) }, searchParams);
        return (RIDBList<RIDBAttribute>) client.<RIDBAttributeList>makeRequest(url, RIDBAttributeList.class);
    }
	
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
	
	public RIDBList<RIDBPermitEntranceZone> searchZones(int permitEntranceId, RIDBSearchParameters searchParams)
    {
        String url = client.formatSearchUrl("/permitentrances/%s/zones", new String[] { Integer.toString(permitEntranceId) }, searchParams);
        return (RIDBList<RIDBPermitEntranceZone>) client.<RIDBPermitEntranceZoneList>makeRequest(url, RIDBPermitEntranceZoneList.class);
    }
	
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
	
	public RIDBPermitEntranceZone getZone(int permitEntranceId, int permitEntranceZoneId)
    {
        String url = client.formatUrl("/permitentrances/%s/zones/%s", new String[] { Integer.toString(permitEntranceId), Integer.toString(permitEntranceZoneId) }, null);
        //return client.makeRequest<RIDBPermitEntranceZone>(url);
        // RIDB BUG:  Instead of returning a single object the API returns a single element array
        RIDBPermitEntranceZone[] singleElementArray = client.<RIDBPermitEntranceZone[]>makeRequest(url, RIDBPermitEntranceZone[].class);
        if (singleElementArray == null || singleElementArray.length == 0) return null;
        return singleElementArray[0];
    }
	
	public static class RIDBPermitEntranceList extends RIDBList<RIDBPermitEntrance>
	{
		public RIDBPermitEntranceList() { super(); }
	}
	
	public static class RIDBAttributeList extends RIDBList<RIDBAttribute>
	{
		public RIDBAttributeList() { super(); }
	}
	
	public static class RIDBPermitEntranceZoneList extends RIDBList<RIDBPermitEntranceZone>
	{
		public RIDBPermitEntranceZoneList() { super(); }
	}
}
