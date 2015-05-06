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
 * Undocumented RIDB data type related to member tours.
 * 
 * @author NIC Federal
 */
@JsonIgnoreProperties(ignoreUnknown = true)
public class RIDBMemberTour {
	
	/** The id of the member tour. */
	@JsonProperty("MemberTourID")
	private int memberTourID;

	/**
	 * Gets the id of the member tour.
	 *
	 * @return the id of the member tour
	 */
	public int getMemberTourID() {
		return memberTourID;
	}

	/**
	 * Sets the id of the member tour.
	 *
	 * @param memberTourID the new id of the member tour
	 */
	public void setMemberTourID(int memberTourID) {
		this.memberTourID = memberTourID;
	}
}
