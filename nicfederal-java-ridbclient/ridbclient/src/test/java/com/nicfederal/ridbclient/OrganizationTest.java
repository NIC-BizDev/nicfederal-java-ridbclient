/**
 * 
 */
package com.nicfederal.ridbclient;

import junit.framework.Test;
import junit.framework.TestSuite;

/**
 * @author aford_000
 *
 */
public class OrganizationTest extends RIDBTestCase {

	/**
	 * @param name
	 */
	public OrganizationTest(String name) {
		super(name);
	}

	/**
     * @return the suite of tests being tested
     */
    public static Test suite()
    {
        return new TestSuite( OrganizationTest.class );
    }
    
    public void testOrgSearch()
    {
    	RIDBSearchParameters params = new RIDBSearchParameters();
    	params.setQuery("park");
    	RIDBList<RIDBOrganization> results = client.Org.search(null);
    	
    	assertTrue(results.dataLength() > 0);
    }
    
    public void testOrgGetAll()
    {
    	RIDBOrganization[] results = client.Org.getAll();
    	
    	assertTrue(results.length > 0);
    }
    
    public void testOrgGet()
    {
    	RIDBOrganization result = client.Org.get(128);
    	
    	assertNotNull(result);
    }
    
    public void testOrgGetAllRecAreas()
    {
    	RIDBRecArea[] results = client.Org.getAllRecAreas(128);
    	
    	assertTrue(results.length > 0);
    }
    
    public void testOrgSearchRecAreas()
    {
    	RIDBClient client = new RIDBClient();
    	RIDBSearchParameters params = new RIDBSearchParameters();
    	params.setQuery("yellowstone");
    	RIDBList<RIDBRecArea> results = client.Org.searchRecAreas(128, params);
    	
    	assertTrue(results.dataLength() > 0);
    }
    
    public void testOrgGetAllFacilities()
    {
    	RIDBFacility[] results = client.Org.getAllFacilities(128);
    	
    	assertTrue(results.length > 0);
    }
    
    public void testOrgSearchFacilities()
    {
    	RIDBSearchParameters params = new RIDBSearchParameters();
    	params.setQuery("yellowstone");
    	RIDBList<RIDBFacility> results = client.Org.searchFacilities(128, params);
    	
    	assertTrue(results.dataLength() > 0);
    }

}
