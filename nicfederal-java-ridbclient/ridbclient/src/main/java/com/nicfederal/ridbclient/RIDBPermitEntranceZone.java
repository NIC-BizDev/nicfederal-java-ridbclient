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
 * Undocumented RIDB data object which relates to zones for permit entrances.
 * 
 * @author NIC Federal
 */
@JsonIgnoreProperties(ignoreUnknown = true)
public class RIDBPermitEntranceZone {

	/** The id of the permit entrance zone. */
	@JsonProperty("PermitEntranceZoneID")
	private int permitEntranceZoneID;
	
	/** The name of the permit zone. */
	@JsonProperty("Zone")
	private String zone;
	
	/**
	 * Gets the id of the permit entrance zone.
	 *
	 * @return the id of the permit entrance zone
	 */
	public int getPermitEntranceZoneID() {
		return permitEntranceZoneID;
	}
	
	/**
	 * Sets the id of the permit entrance zone.
	 *
	 * @param permitEntranceZoneID the new id of the permit entrance zone
	 */
	public void setPermitEntranceZoneID(int permitEntranceZoneID) {
		this.permitEntranceZoneID = permitEntranceZoneID;
	}
	
	/**
	 * Gets the name of the permit zone.
	 *
	 * @return the name of the permit zone
	 */
	public String getZone() {
		return zone;
	}
	
	/**
	 * Sets the name of the permit zone.
	 *
	 * @param zone the new name of the permit zone
	 */
	public void setZone(String zone) {
		this.zone = zone;
	}
}
