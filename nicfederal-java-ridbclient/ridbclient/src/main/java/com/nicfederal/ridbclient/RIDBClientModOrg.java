package com.nicfederal.ridbclient;

public class RIDBClientModOrg extends RIDBClientModule {

	public RIDBClientModOrg(RIDBClient client)
	{
		super(client);
	}
	
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
	
	public RIDBList<RIDBOrganization> search(RIDBSearchParameters searchParams)
	{
		String url = client.formatSearchUrl("/organizations/", new String[0], searchParams);
        return (RIDBList<RIDBOrganization>)client.<RIDBOrganizationList>makeRequest(url, RIDBOrganizationList.class);
	}
	
	public RIDBOrganization get(int id)
	{
		String url = client.formatSearchUrl("/organizations/%s", new String[] { Integer.toString(id) }, null);
        // RIDB bug:  For some reason this call returns a single element array instead of just the organization object
        RIDBOrganization[] workaround = client.<RIDBOrganization[]>makeRequest(url, RIDBOrganization[].class);
        if (workaround == null || workaround.length < 1) return null;
        return workaround[0];
	}
	
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
	
	public RIDBList<RIDBRecArea> searchRecAreas(int orgId, RIDBSearchParameters searchParams)
    {
        String url = client.formatSearchUrl("/organizations/%s/recareas", new String[] { Integer.toString(orgId) }, searchParams);
        return (RIDBList<RIDBRecArea>) client.<RIDBRecAreaList>makeRequest(url, RIDBRecAreaList.class);
    }
	
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
	
	public RIDBList<RIDBFacility> searchFacilities(int orgId, RIDBSearchParameters searchParams)
    {
        String url = client.formatSearchUrl("/organizations/%s/facilities", new String[] { Integer.toString(orgId) }, searchParams);
        return (RIDBList<RIDBFacility>) client.<RIDBFacilityList>makeRequest(url, RIDBFacilityList.class);
    }
	
	public static class RIDBOrganizationList extends RIDBList<RIDBOrganization>
	{
		public RIDBOrganizationList() { super(); }
	}
	
	public static class RIDBRecAreaList extends RIDBList<RIDBRecArea>
	{
		public RIDBRecAreaList() { super(); }
	}
	
	public static class RIDBFacilityList extends RIDBList<RIDBFacility>
	{
		public RIDBFacilityList() { super(); }
	}
}
