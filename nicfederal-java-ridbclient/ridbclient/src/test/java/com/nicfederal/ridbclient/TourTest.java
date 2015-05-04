package com.nicfederal.ridbclient;

import junit.framework.Test;
import junit.framework.TestSuite;

public class TourTest extends RIDBTestCase {

	public TourTest(String name) {
		super(name);
	}
	
	public static Test suite()
    {
        return new TestSuite( TourTest.class );
    }
    
    public void testTourSearch()
    {
    	RIDBSearchParameters params = new RIDBSearchParameters();
    	params.setQuery("twilight");
    	RIDBList<RIDBTour> results = client.Tour.search(params);
    	
    	assertTrue(results.dataLength() > 0);
    }
    
    public void testTourGetAll()
    {
    	RIDBTour[] results = client.Tour.getAll();
    	
    	assertTrue(results.length > 0);
    }
    
    public void testTourGet()
    {
    	RIDBTour result = client.Tour.get(1);
    	
    	assertEquals(1, result.getTourID());
    }
    
    public void testTourSearchAttributes()
    {
    	RIDBSearchParameters params = new RIDBSearchParameters();
        params.setQuery("distance");
        
        RIDBList<RIDBAttribute> result = client.Tour.searchAttributes(1, params);

        assertTrue(result.dataLength() > 0);
    }
  
    public void testTourGetAllAttributes()
    {
        
        RIDBAttribute[] result = client.Tour.getAllAttributes(1);

        assertTrue(result.length > 0);
    }

}
