package com.nicfederal.ridbclient;

import junit.framework.Test;
import junit.framework.TestSuite;

public class LinkTest extends RIDBTestCase {

	public LinkTest(String name) {
		super(name);
	}

	public static Test suite()
    {
        return new TestSuite( LinkTest.class );
    }

    public void ignoreLinkGetAll()
    {
        RIDBEntityLink[] result = client.Link.getAll();

        assertTrue(result.length > 0);
    }


    public void testLinkSearch()
    {
    	RIDBSearchParameters params = new RIDBSearchParameters();
    	params.setQuery("lake");
        RIDBList<RIDBEntityLink> result = client.Link.search(params);

        assertTrue(result.dataLength() > 0);
    }

    public void testLinkGet()
    {
        RIDBEntityLink result = client.Link.get(2264);

        assertEquals(result.getEntityID(), 216861);
    }

}
