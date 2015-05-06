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
 * RIDB data object encapsulating information stored in RIDB for a campsite.
 *
 * @author NIC Federal
 */
@JsonIgnoreProperties(ignoreUnknown = true)
public class RIDBCampsite {

	/** The campsite id. */
	@JsonProperty("CampsiteID")
	private int campsiteID;

	/** The id of the facility with which the campsite is associated. */
	@JsonProperty("FacilityID")
	private int facilityID;

	/** The campsite name. */
	@JsonProperty("CampsiteName")
	private String campsiteName;

	/** The campsite type. */
	@JsonProperty("CampsiteType")
	private String campsiteType;

	/** The loop on which the campsite resides. */
	@JsonProperty("Loop")
	private String loop;

	/** The type of use allowed. */
	@JsonProperty("TypeOfUse")
	private String typeOfUse;

	/** Whether the campsite is handicap accessible. */
	@JsonProperty("CampsiteAccessible")
	private boolean campsiteAccessible;

	/** The date the campsite record was created. */
	@JsonProperty("CreatedDate")
	@JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "yyyy-MM-dd")
	private Date createdDate;

	/** The date the record was last updated within RIDB. */
	@JsonProperty("LastUpdatedDate")
	@JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "yyyy-MM-dd")
	private Date lastUpdatedDate;

	/** The attributes associated with the campsite. */
	@JsonProperty("ATTRIBUTES")
	private RIDBAttribute[] attributes;

	/** The permitted equipment allowed at the campsite. */
	@JsonProperty("PERMITTEDEQUIPMENT")
	private RIDBPermittedEquipment[] permittedEquipment;

	/** The media associated with the campsite. */
	@JsonProperty("ENTITYMEDIA")
	private RIDBEntityMedia[] media;
	
	/**
	 * Gets the campsite id.
	 *
	 * @return the campsite id
	 */
	public int getCampsiteID() {
		return campsiteID;
	}
	
	/**
	 * Sets the campsite id.
	 *
	 * @param campsiteID the new campsite id
	 */
	public void setCampsiteID(int campsiteID) {
		this.campsiteID = campsiteID;
	}
	
	/**
	 * Gets the id of the facility with which the campsite is associated.
	 *
	 * @return the id of the facility with which the campsite is associated
	 */
	public int getFacilityID() {
		return facilityID;
	}
	
	/**
	 * Sets the id of the facility with which the campsite is associated.
	 *
	 * @param facilityID the new id of the facility with which the campsite is associated
	 */
	public void setFacilityID(int facilityID) {
		this.facilityID = facilityID;
	}
	
	/**
	 * Gets the campsite name.
	 *
	 * @return the campsite name
	 */
	public String getCampsiteName() {
		return campsiteName;
	}
	
	/**
	 * Sets the campsite name.
	 *
	 * @param campsiteName the new campsite name
	 */
	public void setCampsiteName(String campsiteName) {
		this.campsiteName = campsiteName;
	}
	
	/**
	 * Gets the campsite type.
	 *
	 * @return the campsite type
	 */
	public String getCampsiteType() {
		return campsiteType;
	}
	
	/**
	 * Sets the campsite type.
	 *
	 * @param campsiteType the new campsite type
	 */
	public void setCampsiteType(String campsiteType) {
		this.campsiteType = campsiteType;
	}
	
	/**
	 * Gets the loop on which the campsite resides.
	 *
	 * @return the loop on which the campsite resides
	 */
	public String getLoop() {
		return loop;
	}
	
	/**
	 * Sets the loop on which the campsite resides.
	 *
	 * @param loop the new loop on which the campsite resides
	 */
	public void setLoop(String loop) {
		this.loop = loop;
	}
	
	/**
	 * Gets the type of use allowed.
	 *
	 * @return the type of use allowed
	 */
	public String getTypeOfUse() {
		return typeOfUse;
	}
	
	/**
	 * Sets the type of use allowed.
	 *
	 * @param typeOfUse the new type of use allowed
	 */
	public void setTypeOfUse(String typeOfUse) {
		this.typeOfUse = typeOfUse;
	}
	
	/**
	 * Checks whether the campsite is handicap accessible.
	 *
	 * @return whether the campsite is handicap accessible
	 */
	public boolean isCampsiteAccessible() {
		return campsiteAccessible;
	}
	
	/**
	 * Sets whether the campsite is handicap accessible.
	 *
	 * @param campsiteAccesible the new value for whether the campsite is handicap accessible
	 */
	public void setCampsiteAccessible(boolean campsiteAccesible) {
		this.campsiteAccessible = campsiteAccesible;
	}
	
	/**
	 * Gets the date the campsite record was created.
	 *
	 * @return the date the campsite record was created
	 */
	public Date getCreatedDate() {
		return createdDate;
	}
	
	/**
	 * Sets the date the campsite record was created.
	 *
	 * @param createdDate the new date the campsite record was created
	 */
	public void setCreatedDate(Date createdDate) {
		this.createdDate = createdDate;
	}
	
	/**
	 * Gets the last update date.
	 *
	 * @return the last update date
	 */
	public Date getLastUpdateDate() {
		return lastUpdatedDate;
	}
	
	/**
	 * Sets the last update date.
	 *
	 * @param lastUpdateDate the new last update date
	 */
	public void setLastUpdateDate(Date lastUpdateDate) {
		this.lastUpdatedDate = lastUpdateDate;
	}
	
	/**
	 * Gets the attributes associated with the campsite.
	 *
	 * @return the attributes associated with the campsite
	 */
	public RIDBAttribute[] getAttributes() {
		return attributes;
	}
	
	/**
	 * Sets the attributes associated with the campsite.
	 *
	 * @param attributes the new attributes associated with the campsite
	 */
	public void setAttributes(RIDBAttribute[] attributes) {
		this.attributes = attributes;
	}
	
	/**
	 * Gets the permitted equipment allowed at the campsite.
	 *
	 * @return the permitted equipment allowed at the campsite
	 */
	public RIDBPermittedEquipment[] getPermittedEquipment() {
		return permittedEquipment;
	}
	
	/**
	 * Sets the permitted equipment allowed at the campsite.
	 *
	 * @param permittedEquipment the new permitted equipment allowed at the campsite
	 */
	public void setPermittedEquipment(RIDBPermittedEquipment[] permittedEquipment) {
		this.permittedEquipment = permittedEquipment;
	}
	
	/**
	 * Gets the media associated with the campsite.
	 *
	 * @return the media associated with the campsite
	 */
	public RIDBEntityMedia[] getMedia() {
		return media;
	}
	
	/**
	 * Sets the media associated with the campsite.
	 *
	 * @param media the new media associated with the campsite
	 */
	public void setMedia(RIDBEntityMedia[] media) {
		this.media = media;
	}

}
