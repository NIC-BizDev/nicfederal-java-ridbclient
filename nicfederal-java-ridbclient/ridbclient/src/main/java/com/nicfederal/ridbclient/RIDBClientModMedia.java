package com.nicfederal.ridbclient;

public class RIDBClientModMedia extends RIDBClientModule {

	public RIDBClientModMedia(RIDBClient client) {
		super(client);
	}
	
	public RIDBEntityMedia[] getAll()
    {
		RIDBPager<RIDBEntityMedia> pager = new RIDBPager<RIDBEntityMedia>()
				{
					public RIDBList<RIDBEntityMedia> getPage(RIDBSearchParameters searchParams) {
						return search(searchParams);
					}
			
				};
		return client.<RIDBEntityMedia>getAll(null, pager, RIDBEntityMedia.class);
    }
	
	public RIDBList<RIDBEntityMedia> search(RIDBSearchParameters searchParams)
    {
        String url = client.formatSearchUrl("/media", new String[0], searchParams);
        return (RIDBList<RIDBEntityMedia>) client.<RIDBEntityMediaList>makeRequest(url, RIDBEntityMediaList.class);
    }
	
	public RIDBEntityMedia get(int id)
    {
        String url = client.formatUrl("/media/%s", new String[] { Integer.toString(id) }, null);
        //return client.<RIDBEntityMedia>makeRequest(url, RIDBEntityMedia.class);
        RIDBEntityMedia[] singleElementArray = client.<RIDBEntityMedia[]>makeRequest(url, RIDBEntityMedia[].class);
        if (singleElementArray == null || singleElementArray.length == 0) return null;
        return singleElementArray[0];
    }
	
	public static class RIDBEntityMediaList extends RIDBList<RIDBEntityMedia>
	{
		public RIDBEntityMediaList() { super(); }
	}

}
