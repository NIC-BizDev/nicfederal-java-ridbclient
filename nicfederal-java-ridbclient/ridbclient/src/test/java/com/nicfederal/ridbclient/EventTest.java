package com.nicfederal.ridbclient;

import junit.framework.Test;
import junit.framework.TestSuite;

public class EventTest extends RIDBTestCase {

	public EventTest(String name) {
		super(name);
	}
	
	/**
     * @return the suite of tests being tested
     */
    public static Test suite()
    {
        return new TestSuite( EventTest.class );
    }
    
    public void testEventSearch()
    {
    	RIDBSearchParameters params = new RIDBSearchParameters();
    	params.setQuery("lake");
    	RIDBList<RIDBEvent> results = client.Event.search(params);
    	
    	assertTrue(results.dataLength() > 0);
    }
    
    public void testEventGetAll()
    {
    	RIDBEvent[] results = client.Event.getAll();
    	
    	assertTrue(results.length > 0);
    }
    
    public void testEventGet()
    {
    	RIDBEvent result = client.Event.get(10835);
    	
    	assertEquals(10835, result.getEventID());
    }
    

}
