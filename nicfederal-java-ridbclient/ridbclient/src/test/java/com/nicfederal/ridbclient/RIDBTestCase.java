package com.nicfederal.ridbclient;

import junit.framework.TestCase;

public class RIDBTestCase extends TestCase {

	public RIDBTestCase(String name) {
		super(name);
	}
	
	protected RIDBClient client = null;
	
	protected void setUp()
	{
		client = new RIDBClient();
	}
	
	protected void tearDown()
	{
		client = null;
	}

}
