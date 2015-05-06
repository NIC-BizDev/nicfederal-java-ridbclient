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
 * Provides information on the permitted equipment at a campsite.
 *
 * @author NIC Federal
 */
@JsonIgnoreProperties(ignoreUnknown = true)
public class RIDBPermittedEquipment {
	
	/** The name of the equipment. */
	@JsonProperty("EquipmentName")
	private String equipmentName;
	
	/** The maximum length of the equipment. */
	@JsonProperty("MaxLength")
	private Integer maxLength;
	
	/** The id of the permitted equipment. */
	@JsonProperty("PermittedEquipmentID")
	private Integer permittedEquipmentID;
	
	/**
	 * Gets the name of the equipment.
	 *
	 * @return the name of the equipment
	 */
	public String getEquipmentName() {
		return equipmentName;
	}
	
	/**
	 * Sets the name of the equipment.
	 *
	 * @param equipmentName the new name of the equipment
	 */
	public void setEquipmentName(String equipmentName) {
		this.equipmentName = equipmentName;
	}
	
	/**
	 * Gets the maximum length of the equipment.
	 *
	 * @return the maximum length of the equipment
	 */
	public Integer getMaxLength() {
		return maxLength;
	}
	
	/**
	 * Sets the maximum length of the equipment.
	 *
	 * @param maxLength the new maximum length of the equipment
	 */
	public void setMaxLength(Integer maxLength) {
		this.maxLength = maxLength;
	}
	
	/**
	 * Gets the id of the permitted equipment.
	 *
	 * @return the id of the permitted equipment
	 */
	public Integer getPermittedEquipmentID() {
		return permittedEquipmentID;
	}
	
	/**
	 * Sets the id of the permitted equipment.
	 *
	 * @param permittedEquipmentID the new id of the permitted equipment
	 */
	public void setPermittedEquipmentID(Integer permittedEquipmentID) {
		this.permittedEquipmentID = permittedEquipmentID;
	}
	
}
