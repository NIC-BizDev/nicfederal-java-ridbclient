package com.nicfederal.ridbclient;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Date;

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
 * Contains information about a tour in RIDB.
 *
 * @author NIC Federal
 */
@JsonIgnoreProperties(ignoreUnknown = true)
public class RIDBTour {

	/** The id for the tour. */
	@JsonProperty("TourID")
	private int tourID;

	/** The id of the facility with which the tour is associated. */
	@JsonProperty("FacilityID")
	private int facilityID;

	/** The name of the tour. */
	@JsonProperty("TourName")
	private String tourName;

	/** The type of tour. */
	@JsonProperty("TourType")
	private String tourType;

	/** The description of the tour. */
	@JsonProperty("TourDescription")
	private String tourDescription;

	/** The duration of the tour. */
	@JsonProperty("TourDuration")
	private String tourDuration;

	/** The information regarding the accessibility of the tour. */
	@JsonProperty("TourAccessible")
	private String tourAccessible;

	/** The date the record was created in RIDB. */
	@JsonProperty("CreatedDate")
	@JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "YYYY-MM-dd")
	private Date createdDate;

	/** The date the record was last updated in RIDB. */
	@JsonProperty("LastUpdatedDate")
	@JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "YYYY-MM-dd")
	private Date lastUpdatedDate;

	/** The attributes associated with the tour. */
	@JsonProperty("ATTRIBUTES")
	private RIDBAttribute[] attributes;

	/** The member tours associated with the tour. */
	@JsonProperty("MEMBERTOURS")
	private RIDBMemberTour[] memberTours;

	/** The media associated with the tour. */
	@JsonProperty("ENTITYMEDIA")
	private RIDBEntityMedia[] media;
	
	/**
	 * Gets the id for the tour.
	 *
	 * @return the id for the tour
	 */
	public int getTourID() {
		return tourID;
	}

	/**
	 * Sets the id for the tour.
	 *
	 * @param tourID the new id for the tour
	 */
	public void setTourID(int tourID) {
		this.tourID = tourID;
	}

	/**
	 * Gets the id of the facility with which the tour is associated.
	 *
	 * @return the id of the facility with which the tour is associated
	 */
	public int getFacilityID() {
		return facilityID;
	}

	/**
	 * Sets the id of the facility with which the tour is associated.
	 *
	 * @param facilityID the new id of the facility with which the tour is associated
	 */
	public void setFacilityID(int facilityID) {
		this.facilityID = facilityID;
	}

	/**
	 * Gets the name of the tour.
	 *
	 * @return the name of the tour
	 */
	public String getTourName() {
		return tourName;
	}

	/**
	 * Sets the name of the tour.
	 *
	 * @param tourName the new name of the tour
	 */
	public void setTourName(String tourName) {
		this.tourName = tourName;
	}

	/**
	 * Gets the type of tour.
	 *
	 * @return the type of tour
	 */
	public String getTourType() {
		return tourType;
	}

	/**
	 * Sets the type of tour.
	 *
	 * @param tourType the new type of tour
	 */
	public void setTourType(String tourType) {
		this.tourType = tourType;
	}

	/**
	 * Gets the description of the tour.
	 *
	 * @return the description of the tour
	 */
	public String getTourDescription() {
		return tourDescription;
	}

	/**
	 * Sets the description of the tour.
	 *
	 * @param tourDescription the new description of the tour
	 */
	public void setTourDescription(String tourDescription) {
		this.tourDescription = tourDescription;
	}

	/**
	 * Gets the duration of the tour.
	 *
	 * @return the duration of the tour
	 */
	public String getTourDuration() {
		return tourDuration;
	}

	/**
	 * Sets the duration of the tour.
	 *
	 * @param tourDuration the new duration of the tour
	 */
	public void setTourDuration(String tourDuration) {
		this.tourDuration = tourDuration;
	}

	/**
	 * Gets the information regarding the accessibility of the tour.
	 *
	 * @return the information regarding the accessibility of the tour
	 */
	public String getTourAccessible() {
		return tourAccessible;
	}

	/**
	 * Sets the information regarding the accessibility of the tour.
	 *
	 * @param tourAccessible the new information regarding the accessibility of the tour
	 */
	public void setTourAccessible(String tourAccessible) {
		this.tourAccessible = tourAccessible;
	}

	/**
	 * Gets the date the record was created in RIDB.
	 *
	 * @return the date the record was created in RIDB
	 */
	public Date getCreatedDate() {
		return createdDate;
	}

	/**
	 * Sets the date the record was created in RIDB.
	 *
	 * @param createdDate the new date the record was created in RIDB
	 */
	public void setCreatedDate(Date createdDate) {
		this.createdDate = createdDate;
	}

	/**
	 * Gets the date the record was last updated in RIDB.
	 *
	 * @return the date the record was last updated in RIDB
	 */
	public Date getLastUpdatedDate() {
		return lastUpdatedDate;
	}

	/**
	 * Sets the date the record was last updated in RIDB.
	 *
	 * @param lastUpdatedDate the new date the record was last updated in RIDB
	 */
	public void setLastUpdatedDate(Date lastUpdatedDate) {
		this.lastUpdatedDate = lastUpdatedDate;
	}

	/**
	 * Gets the attributes associated with the tour.
	 *
	 * @return the attributes associated with the tour
	 */
	public RIDBAttribute[] getAttributes() {
		return attributes;
	}

	/**
	 * Sets the attributes associated with the tour.
	 *
	 * @param attributes the new attributes associated with the tour
	 */
	public void setAttributes(RIDBAttribute[] attributes) {
		this.attributes = attributes;
	}

	/**
	 * Gets the member tours associated with the tour.
	 *
	 * @return the member tours associated with the tour
	 */
	public RIDBMemberTour[] getMemberTours() {
		return memberTours;
	}

	/**
	 * Sets the member tours associated with the tour.
	 *
	 * @param memberTours the new member tours associated with the tour
	 */
	public void setMemberTours(RIDBMemberTour[] memberTours) {
		this.memberTours = memberTours;
	}

	/**
	 * Gets the media associated with the tour.
	 *
	 * @return the media associated with the tour
	 */
	public RIDBEntityMedia[] getMedia() {
		return media;
	}

	/**
	 * Sets the media associated with the tour.
	 *
	 * @param media the new media associated with the tour
	 */
	public void setMedia(RIDBEntityMedia[] media) {
		this.media = media;
	}

}
