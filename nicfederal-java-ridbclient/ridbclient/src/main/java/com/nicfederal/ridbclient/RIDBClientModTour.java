package com.nicfederal.ridbclient;

public class RIDBClientModTour extends RIDBClientModule {

	public RIDBClientModTour(RIDBClient client) {
		super(client);
	}
	
	public RIDBTour[] getAll()
	{
		RIDBPager<RIDBTour> pager = new RIDBPager<RIDBTour>()
				{
					public RIDBList<RIDBTour> getPage(RIDBSearchParameters searchParams) {
						return search(searchParams);
					}
			
				};
		return (RIDBTour[]) client.<RIDBTour>getAll(null, pager, RIDBTour.class);
	}
	
	public RIDBList<RIDBTour> search(RIDBSearchParameters searchParams)
	{
		String url = client.formatSearchUrl("/tours/", new String[0], searchParams);
        return (RIDBList<RIDBTour>)client.<RIDBTourList>makeRequest(url, RIDBTourList.class);
	}
	
	public RIDBTour get(int id)
	{
		String url = client.formatSearchUrl("/tours/%s", new String[] { Integer.toString(id) }, null);
        return client.<RIDBTour>makeRequest(url, RIDBTour.class);
	}
	
	public RIDBList<RIDBAttribute> searchAttributes(int tourId, RIDBSearchParameters searchParams)
    {
        String url = client.formatSearchUrl("/tours/%s/attributes", new String[] { Integer.toString(tourId) }, searchParams);
        return (RIDBList<RIDBAttribute>) client.<RIDBAttributeList>makeRequest(url, RIDBAttributeList.class);
    }
	
	public RIDBAttribute[] getAllAttributes(int tourId)
    {
		final int finalId = tourId;
		RIDBPager<RIDBAttribute> pager = new RIDBPager<RIDBAttribute>()
				{
					public RIDBList<RIDBAttribute> getPage(RIDBSearchParameters searchParams) {
						return searchAttributes(finalId, searchParams);
					}
			
				};
		return client.<RIDBAttribute>getAll(null, pager, RIDBAttribute.class);
    }
	
	public static class RIDBTourList extends RIDBList<RIDBTour>
	{
		public RIDBTourList() { super(); }
	}
	
	public static class RIDBAttributeList extends RIDBList<RIDBAttribute>
	{
		public RIDBAttributeList() { super(); }
	}

}
