package com.nicfederal.ridbclient;

import junit.framework.Test;
import junit.framework.TestSuite;

public class ActivityTest extends RIDBTestCase {

	public ActivityTest(String name) {
		super(name);
	}
	
	/**
     * @return the suite of tests being tested
     */
    public static Test suite()
    {
        return new TestSuite( ActivityTest.class );
    }
    
    public void testActivitySearch()
    {
    	RIDBSearchParameters params = new RIDBSearchParameters();
    	params.setQuery("fishing");
    	RIDBList<RIDBActivity> results = client.Activity.search(params);
    	
    	assertTrue(results.dataLength() > 0);
    }
    
    public void testActivityGetAll()
    {
    	RIDBActivity[] results = client.Activity.getAll();
    	
    	assertTrue(results.length > 0);
    }
    
    public void testActivityGet()
    {
    	RIDBActivity result = client.Activity.get(4);
    	
    	assertNotNull(result);
    }
    

}
