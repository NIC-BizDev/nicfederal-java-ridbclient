package com.nicfederal.ridbclient;

public class RIDBClientModActivity extends RIDBClientModule {

	public RIDBClientModActivity(RIDBClient client) {
		super(client);
	}

	public RIDBActivity[] getAll()
	{
		RIDBPager<RIDBActivity> pager = new RIDBPager<RIDBActivity>()
				{
					public RIDBList<RIDBActivity> getPage(RIDBSearchParameters searchParams) {
						return search(searchParams);
					}
			
				};
		return (RIDBActivity[]) client.<RIDBActivity>getAll(null, pager, RIDBActivity.class);
	}
	
	public RIDBList<RIDBActivity> search(RIDBSearchParameters searchParams)
	{
		String url = client.formatSearchUrl("/activities/", new String[0], searchParams);
        return (RIDBList<RIDBActivity>)client.<RIDBActivityList>makeRequest(url, RIDBActivityList.class);
	}
	
	public RIDBActivity get(int id)
	{
		String url = client.formatSearchUrl("/activities/%s", new String[] { Integer.toString(id) }, null);
        // RIDB bug:  For some reason this call returns a single element array instead of just the organization object
        RIDBActivity[] workaround = client.<RIDBActivity[]>makeRequest(url, RIDBActivity[].class);
        if (workaround == null || workaround.length < 1) return null;
        return workaround[0];
	}
	
	public static class RIDBActivityList extends RIDBList<RIDBActivity>
	{
		public RIDBActivityList() { super(); }
	}
}
