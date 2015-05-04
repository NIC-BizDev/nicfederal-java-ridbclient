package com.nicfederal.ridbclient;

import junit.framework.Test;
import junit.framework.TestSuite;

public class MediaTest extends RIDBTestCase {

	public MediaTest(String name) {
		super(name);
	}

	public static Test suite()
    {
        return new TestSuite( MediaTest.class );
    }
	
	public void ignoreMediaGetAll()
    {
        RIDBEntityMedia[] result = client.Media.getAll();

        assertTrue(result.length > 0);
    }


    public void testMediaSearch()
    {
    	RIDBSearchParameters params = new RIDBSearchParameters();
    	params.setQuery("lake");
        RIDBList<RIDBEntityMedia> result = client.Media.search(params);

        assertTrue(result.dataLength() > 0);
    }

    public void testMediaGet()
    {
        RIDBEntityMedia result = client.Media.get(2264);

        assertEquals(result.getMediaID(), 2264);
    }

}
