package com.nicfederal.ridbclient;

import java.util.Date;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * @author aford_000
 *
 */
@JsonIgnoreProperties(ignoreUnknown = true)
public class RIDBPermitEntrance {
/*
 * PermitEntranceID	INT		N	Permit Entrance ID
FacilityID	INT		N	Facility ID the Permit belongs to
PermitEntranceName	STRING	512	N	Permit Entrance Name
PermitEntranceType	STRING	255	Y	Permit Entrance Type
PermitEntranceDescription	STRING	255	Y	Permit Entrance Description
PermitEntranceAccesible	STRING	10	Y	Is the permit accessible by vehicle
Latitude	DECIMAL			Latitude of the permit location
Longitude	DECIMAL			Longitude of the permit location
District	STRING	60	Y	District the permit resides in
Town	STRING	60	Y	Town the permit resides in
Zone	STRING	255	Y	Zone the permit resides in
CreatedDate	DATETIME		N	Record creation date
LastUpdatedDate	DATETIME		N	Record last update date
 */

	@JsonProperty("PermitEntranceID")
	private int permitEntranceID;

	@JsonProperty("FacilityID")
	private int facilityID;

	@JsonProperty("PermitEntranceName")
	private String permitEntranceName;

	@JsonProperty("PermitEntranceType")
	private String permitEntranceType;

	@JsonProperty("PermitEntranceDescription")
	private String permitEntranceDescription;

	@JsonProperty("PermitEntranceAccessible")
	private String permitEntranceAccessible;

	@JsonProperty("Latitude")
	private Double latitude;

	@JsonProperty("Longitude")
	private Double longitude;

	@JsonProperty("District")
	private String district;

	@JsonProperty("Town")
	private String town;

	@JsonProperty("Zone")
	private String zone;

	@JsonProperty("CreatedDate")
	@JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "YYYY-MM-dd")
	private Date createdDate;

	@JsonProperty("LastUpdatedDate")
	@JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "YYYY-MM-dd")
	private Date lastUpdatedDate;

	@JsonProperty("ATTRIBUTES")
	private RIDBAttribute[] attributes;

	@JsonProperty("ZONES")
	private RIDBPermitEntranceZone[] zones;
	
	public int getPermitEntranceID() {
		return permitEntranceID;
	}
	public void setPermitEntranceID(int permitEntranceID) {
		this.permitEntranceID = permitEntranceID;
	}
	public int getFacilityID() {
		return facilityID;
	}
	public void setFacilityID(int facilityID) {
		this.facilityID = facilityID;
	}
	public String getPermitEntranceName() {
		return permitEntranceName;
	}
	public void setPermitEntranceName(String permitEntranceName) {
		this.permitEntranceName = permitEntranceName;
	}
	public String getPermitEntranceType() {
		return permitEntranceType;
	}
	public void setPermitEntranceType(String permitEntranceType) {
		this.permitEntranceType = permitEntranceType;
	}
	public String getPermitEntranceDescription() {
		return permitEntranceDescription;
	}
	public void setPermitEntranceDescription(String permitEntranceDescription) {
		this.permitEntranceDescription = permitEntranceDescription;
	}
	public String getPermitEntranceAccessible() {
		return permitEntranceAccessible;
	}
	public void setPermitEntranceAccessible(String permitEntranceAccessible) {
		this.permitEntranceAccessible = permitEntranceAccessible;
	}
	public Double getLatitude() {
		return latitude;
	}
	public void setLatitude(Double latitude) {
		this.latitude = latitude;
	}
	public Double getLongitude() {
		return longitude;
	}
	public void setLongitude(Double longitude) {
		this.longitude = longitude;
	}
	public String getDistrict() {
		return district;
	}
	public void setDistrict(String district) {
		this.district = district;
	}
	public String getTown() {
		return town;
	}
	public void setTown(String town) {
		this.town = town;
	}
	public String getZone() {
		return zone;
	}
	public void setZone(String zone) {
		this.zone = zone;
	}
	public Date getCreatedDate() {
		return createdDate;
	}
	public void setCreatedDate(Date createdDate) {
		this.createdDate = createdDate;
	}
	public Date getLastUpdatedDate() {
		return lastUpdatedDate;
	}
	public void setLastUpdatedDate(Date lastUpdatedDate) {
		this.lastUpdatedDate = lastUpdatedDate;
	}
	public RIDBAttribute[] getAttributes() {
		return attributes;
	}
	public void setAttributes(RIDBAttribute[] attributes) {
		this.attributes = attributes;
	}
	public RIDBPermitEntranceZone[] getZones() {
		return zones;
	}
	public void setZones(RIDBPermitEntranceZone[] zones) {
		this.zones = zones;
	}

}
