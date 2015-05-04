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
public class RIDBCampsite {
/*
 * CampsiteID	INT		N	Campsite ID
FacilityID	INT		N	Facility ID the campsite belongs to
CampsiteName	STRING	255	N	Campsite Name
CampsiteType	STRING	255	Y	Campsite Type
Loop	STRING	255	Y	Name of loop the campsite resides on
Type of Use	STRING	255	Y	Type of use
CampsiteAccesible	STRING	10	Y	Is the campsite accessible by vehicle
CreatedDate	DATETIME		N	Record creation date
LastUpdateDate	DATETIME		N	Record last update date
 */

	@JsonProperty("CampsiteID")
	private int campsiteID;

	@JsonProperty("FacilityID")
	private int facilityID;

	@JsonProperty("CampsiteName")
	private String campsiteName;

	@JsonProperty("CampsiteType")
	private String campsiteType;

	@JsonProperty("Loop")
	private String loop;

	@JsonProperty("TypeOfUse")
	private String typeOfUse;

	@JsonProperty("CampsiteAccessible")
	private boolean campsiteAccessible;

	@JsonProperty("CreatedDate")
	@JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "yyyy-MM-dd")
	private Date createdDate;

	@JsonProperty("LastUpdatedDate")
	@JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "yyyy-MM-dd")
	private Date lastUpdatedDate;

	@JsonProperty("ATTRIBUTES")
	private RIDBAttribute[] attributes;

	@JsonProperty("PERMITTEDEQUIPMENT")
	private RIDBPermittedEquipment[] permittedEquipment;

	@JsonProperty("ENTITYMEDIA")
	private RIDBEntityMedia[] media;
	
	public int getCampsiteID() {
		return campsiteID;
	}
	public void setCampsiteID(int campsiteID) {
		this.campsiteID = campsiteID;
	}
	public int getFacilityID() {
		return facilityID;
	}
	public void setFacilityID(int facilityID) {
		this.facilityID = facilityID;
	}
	public String getCampsiteName() {
		return campsiteName;
	}
	public void setCampsiteName(String campsiteName) {
		this.campsiteName = campsiteName;
	}
	public String getCampsiteType() {
		return campsiteType;
	}
	public void setCampsiteType(String campsiteType) {
		this.campsiteType = campsiteType;
	}
	public String getLoop() {
		return loop;
	}
	public void setLoop(String loop) {
		this.loop = loop;
	}
	public String getTypeOfUse() {
		return typeOfUse;
	}
	public void setTypeOfUse(String typeOfUse) {
		this.typeOfUse = typeOfUse;
	}
	public boolean isCampsiteAccessible() {
		return campsiteAccessible;
	}
	public void setCampsiteAccessible(boolean campsiteAccesible) {
		this.campsiteAccessible = campsiteAccesible;
	}
	public Date getCreatedDate() {
		return createdDate;
	}
	public void setCreatedDate(Date createdDate) {
		this.createdDate = createdDate;
	}
	public Date getLastUpdateDate() {
		return lastUpdatedDate;
	}
	public void setLastUpdateDate(Date lastUpdateDate) {
		this.lastUpdatedDate = lastUpdateDate;
	}
	public RIDBAttribute[] getAttributes() {
		return attributes;
	}
	public void setAttributes(RIDBAttribute[] attributes) {
		this.attributes = attributes;
	}
	public RIDBPermittedEquipment[] getPermittedEquipment() {
		return permittedEquipment;
	}
	public void setPermittedEquipment(RIDBPermittedEquipment[] permittedEquipment) {
		this.permittedEquipment = permittedEquipment;
	}
	public RIDBEntityMedia[] getMedia() {
		return media;
	}
	public void setMedia(RIDBEntityMedia[] media) {
		this.media = media;
	}

}
