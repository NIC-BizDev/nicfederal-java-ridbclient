package com.nicfederal.ridbclient;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

@JsonIgnoreProperties(ignoreUnknown = true)
public class RIDBPermitEntranceZone {

	@JsonProperty("PermitEntranceZoneID")
	private int permitEntranceZoneID;
	
	@JsonProperty("Zone")
	private String zone;
	
	public int getPermitEntranceZoneID() {
		return permitEntranceZoneID;
	}
	public void setPermitEntranceZoneID(int permitEntranceZoneID) {
		this.permitEntranceZoneID = permitEntranceZoneID;
	}
	public String getZone() {
		return zone;
	}
	public void setZone(String zone) {
		this.zone = zone;
	}
}
