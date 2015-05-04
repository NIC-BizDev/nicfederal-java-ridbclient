package com.nicfederal.ridbclient;

import junit.framework.Test;
import junit.framework.TestSuite;

public class PermitEntranceTest extends RIDBTestCase {

	public PermitEntranceTest(String name) {
		super(name);
	}
	
	public static Test suite()
    {
        return new TestSuite( PermitEntranceTest.class );
    }
    
    public void testPermitEntranceSearch()
    {
    	RIDBSearchParameters params = new RIDBSearchParameters();
    	params.setQuery("yellowstone");
    	RIDBList<RIDBPermitEntrance> results = client.PermitEntrance.search(params);
    	
    	assertTrue(results.dataLength() > 0);
    }
    
    public void testPermitEntranceGetAll()
    {
    	RIDBPermitEntrance[] results = client.PermitEntrance.getAll();
    	
    	assertTrue(results.length > 0);
    }
    
    public void testPermitEntranceGet()
    {
    	RIDBPermitEntrance result = client.PermitEntrance.get(1);
    	
    	assertEquals(1, result.getPermitEntranceID());
    }
    
    public void testPermitEntranceSearchAttributes()
    {
    	RIDBSearchParameters params = new RIDBSearchParameters();
        params.setQuery("important");
        
        RIDBList<RIDBAttribute> result = client.PermitEntrance.searchAttributes(1, params);

        assertTrue(result.dataLength() > 0);
    }
    
    public void testPermitEntranceGetAllAttributes()
    {
        
        RIDBAttribute[] result = client.PermitEntrance.getAllAttributes(1);

        assertTrue(result.length > 0);
    }
    
    public void testPermitEntranceGetAllZones()
    {
        
        RIDBPermitEntranceZone[] result = client.PermitEntrance.getAllZones(169);

        assertTrue(result.length > 0);
    }

    
    public void testPermitEntranceSearchZones()
    {
    	RIDBList<RIDBPermitEntranceZone> result = client.PermitEntrance.searchZones(169, null);

        assertTrue(result.dataLength() > 0);
    }
    
    public void testPermitEntranceGetZone()
    {
    	RIDBPermitEntranceZone result = client.PermitEntrance.getZone(169, 15196);
    	
    	assertEquals(15196, result.getPermitEntranceZoneID());
    }

}
