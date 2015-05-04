package com.nicfederal.ridbclient;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * @author aford_000
 *
 */
@JsonIgnoreProperties(ignoreUnknown = true)
public class RIDBPermittedEquipment {
/*
 * EquipmentName	STRING	255	N	Equipment Name
MaxLength	INT		Y	Maximum length of equipment
 */
	@JsonProperty("EquipmentName")
	private String equipmentName;
	
	@JsonProperty("MaxLength")
	private Integer maxLength;
	
	@JsonProperty("PermittedEquipmentID")
	private Integer permittedEquipmentID;
	
	public String getEquipmentName() {
		return equipmentName;
	}
	public void setEquipmentName(String equipmentName) {
		this.equipmentName = equipmentName;
	}
	public Integer getMaxLength() {
		return maxLength;
	}
	public void setMaxLength(Integer maxLength) {
		this.maxLength = maxLength;
	}
	public Integer getPermittedEquipmentID() {
		return permittedEquipmentID;
	}
	public void setPermittedEquipmentID(Integer permittedEquipmentID) {
		this.permittedEquipmentID = permittedEquipmentID;
	}
	
}
