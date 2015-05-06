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
 * Encapsulates the search metadata that comes back from RIDB.
 * 
 * @author NIC Federal
 */
@JsonIgnoreProperties(ignoreUnknown = true)
public class RIDBListResultMetadata {
	
	/** The total count of results matching the search. */
	@JsonProperty("TOTAL_COUNT")
	private Integer totalCount;
	
	/** The number of results returned in the results page. */
	@JsonProperty("CURRENT_COUNT")
	private Integer currentCount;

	/**
	 * Gets the total count of results matching the search.
	 *
	 * @return the total count of results matching the search
	 */
	public Integer getTotalCount() {
		return totalCount;
	}

	/**
	 * Sets the total count of results matching the search.
	 *
	 * @param totalCount the new total count of results matching the search
	 */
	public void setTotalCount(Integer totalCount) {
		this.totalCount = totalCount;
	}

	/**
	 * Gets the number of results returned in the results page.
	 *
	 * @return the number of results returned in the results page
	 */
	public Integer getCurrentCount() {
		return currentCount;
	}

	/**
	 * Sets the number of results returned in the results page.
	 *
	 * @param currentCount the new number of results returned in the results page
	 */
	public void setCurrentCount(Integer currentCount) {
		this.currentCount = currentCount;
	}
	
	
}
