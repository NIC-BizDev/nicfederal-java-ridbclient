package com.nicfederal.ridbclient;

public class RIDBClientModCampsite extends RIDBClientModule {

	public RIDBClientModCampsite(RIDBClient client) {
		super(client);
	}
	
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
	
	public RIDBList<RIDBCampsite> search(RIDBSearchParameters searchParams)
    {
        String url = client.formatSearchUrl("/campsites", new String[0], searchParams);
        return (RIDBList<RIDBCampsite>) client.<RIDBCampsiteList>makeRequest(url, RIDBCampsiteList.class);
    }
	
	public RIDBCampsite get(int id)
    {
        String url = client.formatUrl("/campsites/%s", new String[] { Integer.toString(id) }, null);
        //return client.makeRequest<RIDBCampsite>(url);
        // RIDB BUG:  Instead of returning a single campsite object the API returns a single element array
        RIDBCampsite[] singleElementArray = client.<RIDBCampsite[]>makeRequest(url, RIDBCampsite[].class);
        if (singleElementArray == null || singleElementArray.length == 0) return null;
        return singleElementArray[0];
    }
	
	public RIDBList<RIDBPermittedEquipment> searchPermittedEquipment(int campsiteId, RIDBSearchParameters searchParams)
    {
        String url = client.formatSearchUrl("/campsites/%s/permittedequipment", new String[] { Integer.toString(campsiteId) }, searchParams);
        return (RIDBList<RIDBPermittedEquipment>) client.<RIDBPermittedEquipmentList>makeRequest(url, RIDBPermittedEquipmentList.class);
    }
	
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
	
	public RIDBPermittedEquipment getPermittedEquipment(int campsiteId, int permittedEquipmentId)
    {
        String url = client.formatUrl("/campsites/%s/permittedequipment/%s", new String[] { Integer.toString(campsiteId), Integer.toString(permittedEquipmentId) }, null);
        //return client.makeRequest<RIDBPermittedEquipment>(url);
        // RIDB BUG:  Instead of returning a single permitted equipment object the API returns a single element array
        RIDBPermittedEquipment[] singleElementArray = client.<RIDBPermittedEquipment[]>makeRequest(url, RIDBPermittedEquipment[].class);
        if (singleElementArray == null || singleElementArray.length == 0) return null;
        return singleElementArray[0];
    }
	
	public RIDBList<RIDBAttribute> searchAttributes(int campsiteId, RIDBSearchParameters searchParams)
    {
        String url = client.formatSearchUrl("/campsites/%s/attributes", new String[] { Integer.toString(campsiteId) }, searchParams);
        return (RIDBList<RIDBAttribute>) client.<RIDBAttributeList>makeRequest(url, RIDBAttributeList.class);
    }
	
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
	
	public static class RIDBCampsiteList extends RIDBList<RIDBCampsite>
	{
		public RIDBCampsiteList() { super(); }
	}
	
	public static class RIDBAttributeList extends RIDBList<RIDBAttribute>
	{
		public RIDBAttributeList() { super(); }
	}
	
	public static class RIDBPermittedEquipmentList extends RIDBList<RIDBPermittedEquipment>
	{
		public RIDBPermittedEquipmentList() { super(); }
	}
}
