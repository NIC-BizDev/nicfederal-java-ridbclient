package com.nicfederal.ridbclient;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

@JsonIgnoreProperties(ignoreUnknown = true)
public class RIDBListMetadata {
	@JsonProperty("SEARCH_PARAMETERS")
	private RIDBSearchParameters searchParameters;
	
	@JsonProperty("RESULTS")
	private RIDBListResultMetadata results;

	public RIDBSearchParameters getSearchParameters() {
		return searchParameters;
	}

	public void setSearchParameters(RIDBSearchParameters searchParameters) {
		this.searchParameters = searchParameters;
	}

	public RIDBListResultMetadata getResults() {
		return results;
	}

	public void setResults(RIDBListResultMetadata results) {
		this.results = results;
	}
}
