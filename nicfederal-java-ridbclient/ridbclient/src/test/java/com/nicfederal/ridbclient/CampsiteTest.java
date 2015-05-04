package com.nicfederal.ridbclient;

import junit.framework.Test;
import junit.framework.TestSuite;

public class CampsiteTest extends RIDBTestCase {

	public CampsiteTest(String name) {
		super(name);
	}
	
	public static Test suite()
    {
        return new TestSuite( CampsiteTest.class );
    }

	/* This takes too long to return to be in the test suite
	public void testCampsiteGetAll()
    {
        
        RIDBCampsite[] result = client.Campsite.getAll();

        assertTrue(result.length > 0);
    }
    */
    
    public void testCampsiteSearch()
    {
        RIDBSearchParameters params = new RIDBSearchParameters();
        params.setQuery("yellowstone");
        
        RIDBList<RIDBCampsite> result = client.Campsite.search(params);

        assertTrue(result.dataLength() > 0);
    }

    
    public void testCampsiteGet()
    {
        
        RIDBCampsite result = client.Campsite.get(51458);

        assertEquals(result.getCampsiteID(), 51458);
    }

    
    public void testCampsiteGetAllPermittedEquipment()
    {
        
        RIDBPermittedEquipment[] result = client.Campsite.getAllPermittedEquipment(51458);

        assertTrue(result.length > 0);
    }

    
    public void testCampsiteSearchPermittedEquipment()
    {
    	RIDBSearchParameters params = new RIDBSearchParameters();
        params.setQuery("fifth");
        
        RIDBList<RIDBPermittedEquipment> result = client.Campsite.searchPermittedEquipment(51458, params);

        assertTrue(result.dataLength() > 0);
    }

    
    public void testCampsiteSearchAttributes()
    {
    	RIDBSearchParameters params = new RIDBSearchParameters();
        params.setQuery("max");
        
        RIDBList<RIDBAttribute> result = client.Campsite.searchAttributes(51458, params);

        assertTrue(result.dataLength() > 0);
    }


    
    public void testCampsiteGetAllAttributes()
    {
        
        RIDBAttribute[] result = client.Campsite.getAllAttributes(51458);

        assertTrue(result.length > 0);
    }
}
