package com.nicfederal.ridbclient;

import java.util.Date;

import com.fasterxml.jackson.annotation.JsonFormat;
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
 * Represents a permitted recreation entrance.
 *
 * @author NIC Federal
 */
@JsonIgnoreProperties(ignoreUnknown = true)
public class RIDBPermitEntrance {

	/** The id of the permit entrance. */
	@JsonProperty("PermitEntranceID")
	private int permitEntranceID;

	/** The id of the facility with which the permit entrance is associated. */
	@JsonProperty("FacilityID")
	private int facilityID;

	/** The name of the permit entrance. */
	@JsonProperty("PermitEntranceName")
	private String permitEntranceName;

	/** The type of the permit entrance. */
	@JsonProperty("PermitEntranceType")
	private String permitEntranceType;

	/** A description of the permit entrance. */
	@JsonProperty("PermitEntranceDescription")
	private String permitEntranceDescription;

	/** Details about the accessibility of the permit entrance. */
	@JsonProperty("PermitEntranceAccessible")
	private String permitEntranceAccessible;

	/** The latitude of the permit location. */
	@JsonProperty("Latitude")
	private Double latitude;

	/** The longitude of the permit location. */
	@JsonProperty("Longitude")
	private Double longitude;

	/** The district the permit resides in. */
	@JsonProperty("District")
	private String district;

	/** The town the permit resides in. */
	@JsonProperty("Town")
	private String town;

	/** The zone the permit resides in. */
	@JsonProperty("Zone")
	private String zone;

	/** The record creation date. */
	@JsonProperty("CreatedDate")
	@JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "YYYY-MM-dd")
	private Date createdDate;

	/** The record last update date. */
	@JsonProperty("LastUpdatedDate")
	@JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "YYYY-MM-dd")
	private Date lastUpdatedDate;

	/** The attributes associated with the permit entrance. */
	@JsonProperty("ATTRIBUTES")
	private RIDBAttribute[] attributes;

	/** The zones to which the permit relates. */
	@JsonProperty("ZONES")
	private RIDBPermitEntranceZone[] zones;
	
	/**
	 * Gets the id of the permit entrance.
	 *
	 * @return the id of the permit entrance
	 */
	public int getPermitEntranceID() {
		return permitEntranceID;
	}
	
	/**
	 * Sets the id of the permit entrance.
	 *
	 * @param permitEntranceID the new id of the permit entrance
	 */
	public void setPermitEntranceID(int permitEntranceID) {
		this.permitEntranceID = permitEntranceID;
	}
	
	/**
	 * Gets the id of the facility with which the permit entrance is associated.
	 *
	 * @return the id of the facility with which the permit entrance is associated
	 */
	public int getFacilityID() {
		return facilityID;
	}
	
	/**
	 * Sets the id of the facility with which the permit entrance is associated.
	 *
	 * @param facilityID the new id of the facility with which the permit entrance is associated
	 */
	public void setFacilityID(int facilityID) {
		this.facilityID = facilityID;
	}
	
	/**
	 * Gets the name of the permit entrance.
	 *
	 * @return the name of the permit entrance
	 */
	public String getPermitEntranceName() {
		return permitEntranceName;
	}
	
	/**
	 * Sets the name of the permit entrance.
	 *
	 * @param permitEntranceName the new name of the permit entrance
	 */
	public void setPermitEntranceName(String permitEntranceName) {
		this.permitEntranceName = permitEntranceName;
	}
	
	/**
	 * Gets the type of the permit entrance.
	 *
	 * @return the type of the permit entrance
	 */
	public String getPermitEntranceType() {
		return permitEntranceType;
	}
	
	/**
	 * Sets the type of the permit entrance.
	 *
	 * @param permitEntranceType the new type of the permit entrance
	 */
	public void setPermitEntranceType(String permitEntranceType) {
		this.permitEntranceType = permitEntranceType;
	}
	
	/**
	 * Gets a description of the permit entrance.
	 *
	 * @return a description of the permit entrance
	 */
	public String getPermitEntranceDescription() {
		return permitEntranceDescription;
	}
	
	/**
	 * Sets the description of the permit entrance.
	 *
	 * @param permitEntranceDescription the new description of the permit entrance
	 */
	public void setPermitEntranceDescription(String permitEntranceDescription) {
		this.permitEntranceDescription = permitEntranceDescription;
	}
	
	/**
	 * Gets the details about the accessibility of the permit entrance.
	 *
	 * @return the details about the accessibility of the permit entrance
	 */
	public String getPermitEntranceAccessible() {
		return permitEntranceAccessible;
	}
	
	/**
	 * Sets the details about the accessibility of the permit entrance.
	 *
	 * @param permitEntranceAccessible the new details about the accessibility of the permit entrance
	 */
	public void setPermitEntranceAccessible(String permitEntranceAccessible) {
		this.permitEntranceAccessible = permitEntranceAccessible;
	}
	
	/**
	 * Gets the latitude of the permit location.
	 *
	 * @return the latitude of the permit location
	 */
	public Double getLatitude() {
		return latitude;
	}
	
	/**
	 * Sets the latitude of the permit location.
	 *
	 * @param latitude the new latitude of the permit location
	 */
	public void setLatitude(Double latitude) {
		this.latitude = latitude;
	}
	
	/**
	 * Gets the longitude of the permit location.
	 *
	 * @return the longitude of the permit location
	 */
	public Double getLongitude() {
		return longitude;
	}
	
	/**
	 * Sets the longitude of the permit location.
	 *
	 * @param longitude the new longitude of the permit location
	 */
	public void setLongitude(Double longitude) {
		this.longitude = longitude;
	}
	
	/**
	 * Gets the district the permit resides in.
	 *
	 * @return the district the permit resides in
	 */
	public String getDistrict() {
		return district;
	}
	
	/**
	 * Sets the district the permit resides in.
	 *
	 * @param district the new district the permit resides in
	 */
	public void setDistrict(String district) {
		this.district = district;
	}
	
	/**
	 * Gets the town the permit resides in.
	 *
	 * @return the town the permit resides in
	 */
	public String getTown() {
		return town;
	}
	
	/**
	 * Sets the town the permit resides in.
	 *
	 * @param town the new town the permit resides in
	 */
	public void setTown(String town) {
		this.town = town;
	}
	
	/**
	 * Gets the zone the permit resides in.
	 *
	 * @return the zone the permit resides in
	 */
	public String getZone() {
		return zone;
	}
	
	/**
	 * Sets the zone the permit resides in.
	 *
	 * @param zone the new zone the permit resides in
	 */
	public void setZone(String zone) {
		this.zone = zone;
	}
	
	/**
	 * Gets the record creation date.
	 *
	 * @return the record creation date
	 */
	public Date getCreatedDate() {
		return createdDate;
	}
	
	/**
	 * Sets the record creation date.
	 *
	 * @param createdDate the new record creation date
	 */
	public void setCreatedDate(Date createdDate) {
		this.createdDate = createdDate;
	}
	
	/**
	 * Gets the record last update date.
	 *
	 * @return the record last update date
	 */
	public Date getLastUpdatedDate() {
		return lastUpdatedDate;
	}
	
	/**
	 * Sets the record last update date.
	 *
	 * @param lastUpdatedDate the new record last update date
	 */
	public void setLastUpdatedDate(Date lastUpdatedDate) {
		this.lastUpdatedDate = lastUpdatedDate;
	}
	
	/**
	 * Gets the attributes associated with the permit entrance.
	 *
	 * @return the attributes associated with the permit entrance
	 */
	public RIDBAttribute[] getAttributes() {
		return attributes;
	}
	
	/**
	 * Sets the attributes associated with the permit entrance.
	 *
	 * @param attributes the new attributes associated with the permit entrance
	 */
	public void setAttributes(RIDBAttribute[] attributes) {
		this.attributes = attributes;
	}
	
	/**
	 * Gets the zones to which the permit relates.
	 *
	 * @return the zones to which the permit relates
	 */
	public RIDBPermitEntranceZone[] getZones() {
		return zones;
	}
	
	/**
	 * Sets the zones to which the permit relates.
	 *
	 * @param zones the new zones to which the permit relates
	 */
	public void setZones(RIDBPermitEntranceZone[] zones) {
		this.zones = zones;
	}

}
