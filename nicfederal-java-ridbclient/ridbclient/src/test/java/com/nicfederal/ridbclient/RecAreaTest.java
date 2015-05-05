package com.nicfederal.ridbclient;

import java.util.Calendar;
import java.util.Date;

import junit.framework.Test;
import junit.framework.TestSuite;

public class RecAreaTest extends RIDBTestCase {

	public RecAreaTest(String name) {
		super(name);
	}

	public static Test suite()
    {
        return new TestSuite( RecAreaTest.class );
    }

	
    public void ignoreRecAreaGetAll()
    {
        
        RIDBRecArea[] result = client.RecArea.getAll();

        assertTrue(result.length > 0);
    }

    
    public void testRecAreaSearch()
    {
        RIDBSearchParameters params = new RIDBSearchParameters();
        params.setQuery("yellowstone");
        RIDBList<RIDBRecArea> result = client.RecArea.search(params);

        assertTrue(result.dataLength() > 0);
    }
    
    public void testRecAreaSearchAllParams()
    {
    	Calendar cal = Calendar.getInstance();
    	cal.setTime(new Date());
    	cal.add(Calendar.YEAR, -5);
    	Date dateParam = cal.getTime();
    	
    	RIDBSearchParameters params = new RIDBSearchParameters();
    	params.setQuery("yellowstone");
    	params.setLimit(25);
    	params.setOffset(0);
    	params.setLatitude(44.422573);
    	params.setLongitude(-110.586700);
    	params.setRadius(100.0);
    	params.setStateList("WY,MT,ID");
    	params.setActivityList("6,7");
    	params.setLastUpdated(dateParam);
    	RIDBList<RIDBRecArea> result = client.RecArea.search(params);

        assertTrue(result.dataLength() > 0);
    }

    
    public void testRecAreaGet()
    {
        
        RIDBRecArea result = client.RecArea.get(6);

        assertEquals(result.getRecAreaID(), 6);
    }

    public void testRecAreaGetAllFacilities()
    {
    	RIDBFacility[] results = client.RecArea.getAllFacilities(440);
    	
    	assertTrue(results.length > 0);
    }
    
    public void testRecAreaSearchFacilities()
    {
    	RIDBSearchParameters params = new RIDBSearchParameters();
    	params.setQuery("williams");
    	RIDBList<RIDBFacility> results = client.RecArea.searchFacilities(440, params);
    	
    	assertTrue(results.dataLength() > 0);
    }
    
    public void ignoreRecAreaGetAllAddressesForAll()
    {
        
        RIDBRecAreaAddress[] result = client.RecArea.getAllAddresses();

        assertTrue(result.length > 0);
    }

    
    public void testRecAreaGetAllAddresses()
    {
        
    	RIDBRecAreaAddress[] result = client.RecArea.getAllAddresses(440);

        assertTrue(result.length > 0);
    }

    
    public void testRecAreaSearchAddressesForAll()
    {
        
    	RIDBSearchParameters params = new RIDBSearchParameters();
        params.setQuery("GA");
        RIDBList<RIDBRecAreaAddress> result = client.RecArea.searchAddresses(params);
        assertTrue(result.dataLength() > 0);
    }

    
    public void testRecAreaSearchAddresses()
    {
        
    	RIDBSearchParameters params = new RIDBSearchParameters();
        params.setQuery("GA");
        RIDBList<RIDBRecAreaAddress> result = client.RecArea.searchAddresses(440, params);

        assertTrue(result.dataLength() > 0);
    }

    
    public void testRecAreaGetAddress()
    {
        
        RIDBRecAreaAddress result = client.RecArea.getAddress(53739);

        assertEquals(result.getRecAreaAddressID(), 53739);
    }

    
    public void testRecAreaGetAllMedia()
    {
        
        RIDBEntityMedia[] result = client.RecArea.getAllMedia(440);

        assertTrue(result.length > 0);
    }

    
    public void testRecAreaSearchMedia()
    {
        
    	RIDBSearchParameters params = new RIDBSearchParameters();
        params.setQuery("campground");
        RIDBList<RIDBEntityMedia> result = client.RecArea.searchMedia(440, params);

        assertTrue(result.dataLength() > 0);
    }

    
    public void testRecAreaGetMedia()
    {
        
        RIDBEntityMedia result = client.RecArea.getMedia(440, 2153);

        // RIDB BUG:  No media ID is returned when pulling a single media item
        //assertEquals(result.MediaID, 2153);
        assertEquals(result.getEntityID(), 440);
    }

    
    public void testRecAreaGetAllLinks()
    {
        
        RIDBEntityLink[] result = client.RecArea.getAllLinks(440);

        assertTrue(result.length > 0);
    }

    
    public void testRecAreaSearchLinks()
    {
        
    	RIDBSearchParameters params = new RIDBSearchParameters();
        params.setQuery("lake");
        RIDBList<RIDBEntityLink> result = client.RecArea.searchLinks(440, params);

        assertTrue(result.dataLength() > 0);
    }

    
    public void testRecAreaGetLink()
    {
        
        RIDBEntityLink result = client.RecArea.getLink(440, 410775);

        // RIDB BUG:  The EntityLinkId is not returned when getting a specific link
        //assertEquals(result.EntityLinkID, 410775);
        assertEquals(440, result.getEntityID());
    }

    
    public void testRecAreaGetAllEvents()
    {
        
        RIDBEvent[] result = client.RecArea.getAllEvents(440);

        assertTrue(result.length > 0);
    }

    
    public void testRecAreaSearchEvents()
    {
        
    	RIDBSearchParameters params = new RIDBSearchParameters();
        params.setQuery("cleanup");
        RIDBList<RIDBEvent> result = client.RecArea.searchEvents(440, params);

        assertTrue(result.dataLength() > 0);
    }

    
    public void testRecAreaGetEvent()
    {
        
        RIDBEvent result = client.RecArea.getEvent(440, 10834);

        assertEquals(result.getEventID(), 10834);
    }

    
    public void testRecAreaGetAllActivities()
    {
        
        RIDBRecAreaActivity[] result = client.RecArea.getAllActivities(440);

        assertTrue(result.length > 0);
    }

    
    public void testRecAreaSearchActivities()
    {
        
    	RIDBSearchParameters params = new RIDBSearchParameters();
        params.setQuery("fishing");
        RIDBList<RIDBRecAreaActivity> result = client.RecArea.searchActivities(440, params);

        assertTrue(result.dataLength() > 0);
    }

    
    public void testRecAreaGetActivity()
    {
        
        RIDBRecAreaActivity result = client.RecArea.getActivity(440, 11);

        assertEquals(result.getActivityID(), 11);
    }
}
