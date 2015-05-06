package com.nicfederal.ridbclient;

/*
Copyright 2015 NIC Federal

Licensed under the Apache License, Version 2.0 (the "License");
you may not use this file except in compliance with the License.
You may obtain a copy of the License at

    http://www.apache.org/licenses/LICENSE-2.0

Unless required by applicable law or agreed to in writing, software
distributed under the License is distributed on an "AS IS" BASIS,
WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
See the License for the specific language governing permissions and
limitations under the License.
*/
/**
 * A delegate interface that returns a single result page from the RIDB API.
 *
 * @param <T> the type of data object in the results
 * @author NIC Federal
 */
public interface RIDBPager <T> {
	
	/**
	 * Gets the page.
	 *
	 * @param searchParams Search parameters that should be used in conducting the search
	 * @return a single page of RIDB search results
	 */
	public RIDBList<T> getPage(RIDBSearchParameters searchParams);
}
