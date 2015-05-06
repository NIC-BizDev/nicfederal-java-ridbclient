package com.nicfederal.ridbclient;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

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
 * A single page of RIDB search results.  The RIDB API returns results in pages of up to 50 results.  The type
 * of data object in the result varies by type of search and must be supplied as a type parameter.
 *
 * @param <T> the type of result contained in the page
 * @author NIC Federal
 */
@JsonIgnoreProperties(ignoreUnknown = true)
public class RIDBList <T> {
	
	/** The search result data objects. */
	@JsonProperty("RECDATA")
	private T[] data;
	
	/** The metadata about the search that was performed. */
	@JsonProperty("METADATA")
	private RIDBListMetadata metadata;

	/**
	 * Gets the search result data objects.
	 *
	 * @return the search result data objects
	 */
	public T[] getData() {
		return data;
	}

	/**
	 * Sets the search result data objects.
	 *
	 * @param data the new search result data objects
	 */
	public void setData(T[] data) {
		this.data = data;
	}

	/**
	 * Gets the metadata about the search that was performed.
	 *
	 * @return the metadata about the search that was performed
	 */
	public RIDBListMetadata getMetadata() {
		return metadata;
	}

	/**
	 * Sets the metadata about the search that was performed.
	 *
	 * @param metadata the new metadata about the search that was performed
	 */
	public void setMetadata(RIDBListMetadata metadata) {
		this.metadata = metadata;
	}
	
	/**
	 *  The number of data objects returned from the search.
	 *
	 * @return the number of data objects returned from the search
	 */
	public int dataLength()
	{
		if (data == null) return 0;
		return data.length;
	}
}
