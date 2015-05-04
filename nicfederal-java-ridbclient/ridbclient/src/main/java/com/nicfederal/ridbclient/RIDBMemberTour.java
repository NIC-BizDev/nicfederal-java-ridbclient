package com.nicfederal.ridbclient;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

@JsonIgnoreProperties(ignoreUnknown = true)
public class RIDBMemberTour {
	
	@JsonProperty("MemberTourID")
	private int memberTourID;

	public int getMemberTourID() {
		return memberTourID;
	}

	public void setMemberTourID(int memberTourID) {
		this.memberTourID = memberTourID;
	}
}
