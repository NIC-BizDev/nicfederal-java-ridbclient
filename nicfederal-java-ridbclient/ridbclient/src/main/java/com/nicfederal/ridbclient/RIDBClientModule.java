package com.nicfederal.ridbclient;

public class RIDBClientModule {
	
	protected final RIDBClient client;
	
	protected RIDBClientModule() {
		this.client = null;
	}
	
	public RIDBClientModule(RIDBClient client)
	{
		this.client = client;
	}
}
