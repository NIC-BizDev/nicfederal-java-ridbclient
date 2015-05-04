package com.nicfederal.ridbclient;

import junit.framework.Test;
import junit.framework.TestSuite;

public class FacilityTest extends RIDBTestCase {

	public FacilityTest(String name) {
		super(name);
	}
	
	public static Test suite()
    {
        return new TestSuite( FacilityTest.class );
    }

	
    public void ignoreFacilityGetAll()
    {
        
        RIDBFacility[] result = client.Facility.getAll();

        assertTrue(result.length > 0);
    }

    
    public void testFacilitySearch()
    {
        RIDBSearchParameters params = new RIDBSearchParameters();
        params.setQuery("yellowstone");
        RIDBList<RIDBFacility> result = client.Facility.search(params);

        assertTrue(result.dataLength() > 0);
    }

    
    public void testFacilityGet()
    {
        
        RIDBFacility result = client.Facility.get(234569);

        assertEquals(result.getFacilityID(), 234569);
    }

    
    public void ignoreFacilityGetAllAddressesForAll()
    {
        
        RIDBFacilityAddress[] result = client.Facility.getAllAddresses();

        assertTrue(result.length > 0);
    }

    
    public void testFacilityGetAllAddresses()
    {
        
    	RIDBFacilityAddress[] result = client.Facility.getAllAddresses(231827);

        assertTrue(result.length > 0);
    }

    
    public void testFacilitySearchAddressesForAll()
    {
        
    	RIDBSearchParameters params = new RIDBSearchParameters();
        params.setQuery("WY");
        RIDBList<RIDBFacilityAddress> result = client.Facility.searchAddresses(params);
        assertTrue(result.dataLength() > 0);
    }

    
    public void testFacilitySearchAddresses()
    {
        
    	RIDBSearchParameters params = new RIDBSearchParameters();
        params.setQuery("WY");
        RIDBList<RIDBFacilityAddress> result = client.Facility.searchAddresses(231827, params);

        assertTrue(result.dataLength() > 0);
    }

    
    public void testFacilityGetAddress()
    {
        
        RIDBFacilityAddress result = client.Facility.getAddress(23038);

        assertEquals(result.getFacilityAddressID(), 23038);
    }

    
    public void testFacilityGetAllMedia()
    {
        
        RIDBEntityMedia[] result = client.Facility.getAllMedia(231827);

        assertTrue(result.length > 0);
    }

    
    public void testFacilitySearchMedia()
    {
        
    	RIDBSearchParameters params = new RIDBSearchParameters();
        params.setQuery("landmark");
        RIDBList<RIDBEntityMedia> result = client.Facility.searchMedia(231827, params);

        assertTrue(result.dataLength() > 0);
    }

    
    public void testFacilityGetMedia()
    {
        
        RIDBEntityMedia result = client.Facility.getMedia(231827, 1726);

        // RIDB BUG:  No media ID is returned when pulling a single media item
        //assertEquals(result.MediaID, 2153);
        assertEquals(result.getEntityID(), 231827);
    }

    
    public void testFacilityGetAllLinks()
    {
        
        RIDBEntityLink[] result = client.Facility.getAllLinks(231827);

        assertTrue(result.length > 0);
    }

    
    public void testFacilitySearchLinks()
    {
        
    	RIDBSearchParameters params = new RIDBSearchParameters();
        params.setQuery("learn");
        RIDBList<RIDBEntityLink> result = client.Facility.searchLinks(231827, params);

        assertTrue(result.dataLength() > 0);
    }

    
    public void testFacilityGetLink()
    {
        
        RIDBEntityLink result = client.Facility.getLink(231827, 43834);

        // RIDB BUG:  The EntityLinkId is not returned when getting a specific link
        //assertEquals(result.EntityLinkID, 410775);
        assertEquals(231827, result.getEntityID());
    }

    
    public void testFacilityGetAllEvents()
    {
        
        RIDBEvent[] result = client.Facility.getAllEvents(200001);

        assertTrue(result.length > 0);
    }

    
    public void testFacilitySearchEvents()
    {
        
    	RIDBSearchParameters params = new RIDBSearchParameters();
        params.setQuery("test");
        RIDBList<RIDBEvent> result = client.Facility.searchEvents(200001, params);

        assertTrue(result.dataLength() > 0);
    }

    
    public void testFacilityGetEvent()
    {
        
        RIDBEvent result = client.Facility.getEvent(200001, 10021);

        assertEquals(result.getEventID(), 10021);
    }

    
    public void testFacilityGetAllActivities()
    {
        
        RIDBActivity[] result = client.Facility.getAllActivities(231827);

        assertTrue(result.length > 0);
    }

    
    public void testFacilitySearchActivities()
    {
        
    	RIDBSearchParameters params = new RIDBSearchParameters();
        params.setQuery("fishing");
        RIDBList<RIDBActivity> result = client.Facility.searchActivities(231827, params);

        assertTrue(result.dataLength() > 0);
    }

    
    public void testFacilityGetActivity()
    {
        
        RIDBActivity result = client.Facility.getActivity(231827, 11);

        assertEquals(result.getActivityID(), 11);
    }

    
    public void testFacilityGetAllCampsites()
    {
        
        RIDBCampsite[] result = client.Facility.getAllCampsites(233816);

        assertTrue(result.length > 0);
    }

    
    public void testFacilitySearchCampsites()
    {
        
    	RIDBSearchParameters params = new RIDBSearchParameters();
        params.setQuery("group");
        RIDBList<RIDBCampsite> result = client.Facility.searchCampsites(233816, params);

        assertTrue(result.dataLength() > 0);
    }

    
    public void testFacilityGetAllPermitEntrances()
    {
        
        RIDBPermitEntrance[] result = client.Facility.getAllPermitEntrances(233260);

        assertTrue(result.length > 0);
    }

    
    public void testFacilitySearchPermitEntrances()
    {
        
    	RIDBSearchParameters params = new RIDBSearchParameters();
        params.setQuery("ansel");
        RIDBList<RIDBPermitEntrance> result = client.Facility.searchPermitEntrances(233260, params);

        assertTrue(result.dataLength() > 0);
    }

    
    public void testFacilityGetAllTours()
    {
        
        RIDBTour[] result = client.Facility.getAllTours(233362);

        assertTrue(result.length > 0);
    }

    
    public void testFacilitySearchTours()
    {
        RIDBSearchParameters params = new RIDBSearchParameters();
        params.setQuery("twilight");
        RIDBList<RIDBTour> result = client.Facility.searchTours(233362, params);

        assertTrue( result.dataLength() > 0);
    }
}
