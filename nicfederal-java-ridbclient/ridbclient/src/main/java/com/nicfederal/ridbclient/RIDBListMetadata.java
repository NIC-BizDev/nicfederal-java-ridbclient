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
 * The metadata returned from a search request.
 * 
 * @author NIC Federal
 */
@JsonIgnoreProperties(ignoreUnknown = true)
public class RIDBListMetadata {
	
	/** The search parameters used for the search. */
	@JsonProperty("SEARCH_PARAMETERS")
	private RIDBSearchParameters searchParameters;
	
	/** The results metadata. */
	@JsonProperty("RESULTS")
	private RIDBListResultMetadata results;

	/**
	 * Gets the search parameters used for the search.
	 *
	 * @return the search parameters used for the search
	 */
	public RIDBSearchParameters getSearchParameters() {
		return searchParameters;
	}

	/**
	 * Sets the search parameters used for the search.
	 *
	 * @param searchParameters the new search parameters used for the search
	 */
	public void setSearchParameters(RIDBSearchParameters searchParameters) {
		this.searchParameters = searchParameters;
	}

	/**
	 * Gets the results metadata.
	 *
	 * @return the results metadata
	 */
	public RIDBListResultMetadata getResults() {
		return results;
	}

	/**
	 * Sets the results metadata.
	 *
	 * @param results the new results metadata
	 */
	public void setResults(RIDBListResultMetadata results) {
		this.results = results;
	}
}
