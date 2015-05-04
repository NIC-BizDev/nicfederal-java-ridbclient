package com.nicfederal.ridbclient;

public class RIDBClientModLink extends RIDBClientModule {

	public RIDBClientModLink(RIDBClient client) {
		super(client);
	}
	
	public RIDBEntityLink[] getAll()
    {
		RIDBPager<RIDBEntityLink> pager = new RIDBPager<RIDBEntityLink>()
				{
					public RIDBList<RIDBEntityLink> getPage(RIDBSearchParameters searchParams) {
						return search(searchParams);
					}
			
				};
		return client.<RIDBEntityLink>getAll(null, pager, RIDBEntityLink.class);
    }
	
	public RIDBList<RIDBEntityLink> search(RIDBSearchParameters searchParams)
    {
        String url = client.formatSearchUrl("/links", new String[0], searchParams);
        return (RIDBList<RIDBEntityLink>) client.<RIDBEntityLinkList>makeRequest(url, RIDBEntityLinkList.class);
    }
	
	public RIDBEntityLink get(int id)
    {
        String url = client.formatUrl("/links/%s", new String[] { Integer.toString(id) }, null);
        //return client.<RIDBEntityLink>makeRequest(url, RIDBEntityLink.class);
        RIDBEntityLink[] singleElementArray = client.<RIDBEntityLink[]>makeRequest(url, RIDBEntityLink[].class);
        if (singleElementArray == null || singleElementArray.length == 0) return null;
        return singleElementArray[0];
    }
	
	public static class RIDBEntityLinkList extends RIDBList<RIDBEntityLink>
	{
		public RIDBEntityLinkList() { super(); }
	}
	

}
