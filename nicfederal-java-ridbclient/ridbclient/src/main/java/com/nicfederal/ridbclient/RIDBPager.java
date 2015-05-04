package com.nicfederal.ridbclient;

public interface RIDBPager <T> {
	public RIDBList<T> getPage(RIDBSearchParameters searchParams);
}
