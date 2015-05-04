package com.nicfederal.ridbclient;

public class RIDBClientModEvent extends RIDBClientModule {

	public RIDBClientModEvent(RIDBClient client) {
		super(client);
	}
	
	public RIDBEvent[] getAll()
	{
		RIDBPager<RIDBEvent> pager = new RIDBPager<RIDBEvent>()
				{
					public RIDBList<RIDBEvent> getPage(RIDBSearchParameters searchParams) {
						return search(searchParams);
					}
			
				};
		return (RIDBEvent[]) client.<RIDBEvent>getAll(null, pager, RIDBEvent.class);
	}
	
	public RIDBList<RIDBEvent> search(RIDBSearchParameters searchParams)
	{
		String url = client.formatSearchUrl("/events/", new String[0], searchParams);
        return (RIDBList<RIDBEvent>)client.<RIDBEventList>makeRequest(url, RIDBEventList.class);
	}
	
	public RIDBEvent get(int id)
	{
		String url = client.formatSearchUrl("/events/%s", new String[] { Integer.toString(id) }, null);
        // RIDB bug:  For some reason this call returns a single element array instead of just the organization object
        RIDBEvent[] workaround = client.<RIDBEvent[]>makeRequest(url, RIDBEvent[].class);
        if (workaround == null || workaround.length < 1) return null;
        return workaround[0];
	}
	
	public static class RIDBEventList extends RIDBList<RIDBEvent>
	{
		public RIDBEventList() { super(); }
	}
	
	

}
