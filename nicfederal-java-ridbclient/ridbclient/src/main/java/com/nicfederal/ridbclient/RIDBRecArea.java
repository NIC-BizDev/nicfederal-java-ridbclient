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
 * Information about a recreation area in RIDB.
 *
 * @author NIC Federal
 */
@JsonIgnoreProperties(ignoreUnknown = true)
public class RIDBRecArea {
	
	/** The id of the recreation area. */
	@JsonProperty("RecAreaID")
	private int recAreaID;
	
	/** The optional organization specific identifier for the recreation area. */
	@JsonProperty("OrgRecAreaID")
	private Integer orgRecAreaID;
	
	/** The name of the recreation area. */
	@JsonProperty("RecAreaName")
	private String recAreaName;
	
	/** The description of the recreation area. */
	@JsonProperty("RecAreaDescription")
	private String recAreaDescription;

	/** The directions and/or general information about the entrances. */
	@JsonProperty("RecAreaDirections")
	private String recAreaDirections;

	/** The description of the fees associated with the recreation area. */
	@JsonProperty("RecAreaFeeDescription")
	private String recAreaFeeDescription;

	/** The URL to a map of the recreation area. */
	@JsonProperty("RecAreaMapURL")
	private String recAreaMapURL;

	/** The link to the reservation website for making reservations in the recreation area. */
	@JsonProperty("RecAreaReservationURL")
	private String recAreaReservationURL;

	/** The phone number for the recreation area. */
	@JsonProperty("RecAreaPhone")
	private String recAreaPhone;

	/** The email contact for the recreation area. */
	@JsonProperty("RecAreaEmail")
	private String recAreaEmail;

	/** The latitude in decimal degrees -90.0 to 90.0. */
	@JsonProperty("RecAreaLatitude")
	private Double recAreaLatitude;

	/** The longitude in decimal degrees -180.0 to 180.0. */
	@JsonProperty("RecAreaLongitude")
	private Double recAreaLongitude;

	/** The list of keywords for the recreation area. */
	@JsonProperty("Keywords")
	private String keywords;

	/** The details on the stay limits for the recreation area. */
	@JsonProperty("StayLimit")
	private String stayLimit;

	/** The date the record was last updated in RIDB. */
	@JsonProperty("LastUpdatedDate")
	@JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "yyyy-MM-dd")
	private Date lastUpdatedDate;
	
	/**
	 * Gets the id of the recreation area.
	 *
	 * @return the id of the recreation area
	 */
	public int getRecAreaID() {
		return recAreaID;
	}
	
	/**
	 * Sets the id of the recreation area.
	 *
	 * @param recAreaID the new id of the recreation area
	 */
	public void setRecAreaID(int recAreaID) {
		this.recAreaID = recAreaID;
	}
	
	/**
	 * Gets the optional organization specific identifier for the recreation area.
	 *
	 * @return the optional organization specific identifier for the recreation area
	 */
	public Integer getOrgRecAreaID() {
		return orgRecAreaID;
	}
	
	/**
	 * Sets the optional organization specific identifier for the recreation area.
	 *
	 * @param orgRecAreaID the new optional organization specific identifier for the recreation area
	 */
	public void setOrgRecAreaID(Integer orgRecAreaID) {
		this.orgRecAreaID = orgRecAreaID;
	}
	
	/**
	 * Gets the name of the recreation area.
	 *
	 * @return the name of the recreation area
	 */
	public String getRecAreaName() {
		return recAreaName;
	}
	
	/**
	 * Sets the name of the recreation area.
	 *
	 * @param recAreaName the new name of the recreation area
	 */
	public void setRecAreaName(String recAreaName) {
		this.recAreaName = recAreaName;
	}
	
	/**
	 * Gets the description of the recreation area.
	 *
	 * @return the description of the recreation area
	 */
	public String getRecAreaDescription() {
		return recAreaDescription;
	}
	
	/**
	 * Sets the description of the recreation area.
	 *
	 * @param recAreaDescription the new description of the recreation area
	 */
	public void setRecAreaDescription(String recAreaDescription) {
		this.recAreaDescription = recAreaDescription;
	}
	
	/**
	 * Gets the directions and/or general information about the entrances.
	 *
	 * @return the directions and/or general information about the entrances
	 */
	public String getRecAreaDirections() {
		return recAreaDirections;
	}
	
	/**
	 * Sets the directions and/or general information about the entrances.
	 *
	 * @param recAreaDirections the new directions and/or general information about the entrances
	 */
	public void setRecAreaDirections(String recAreaDirections) {
		this.recAreaDirections = recAreaDirections;
	}
	
	/**
	 * Gets the description of the fees associated with the recreation area.
	 *
	 * @return the description of the fees associated with the recreation area
	 */
	public String getRecAreaFeeDescription() {
		return recAreaFeeDescription;
	}
	
	/**
	 * Sets the description of the fees associated with the recreation area.
	 *
	 * @param recAreaFeeDescription the new description of the fees associated with the recreation area
	 */
	public void setRecAreaFeeDescription(String recAreaFeeDescription) {
		this.recAreaFeeDescription = recAreaFeeDescription;
	}
	
	/**
	 * Gets the URL to a map of the recreation area.
	 *
	 * @return the URL to a map of the recreation area
	 */
	public String getRecAreaMapURL() {
		return recAreaMapURL;
	}
	
	/**
	 * Sets the URL to a map of the recreation area.
	 *
	 * @param recAreaMapURL the new URL to a map of the recreation area
	 */
	public void setRecAreaMapURL(String recAreaMapURL) {
		this.recAreaMapURL = recAreaMapURL;
	}
	
	/**
	 * Gets the link to the reservation website for making reservations in the recreation area.
	 *
	 * @return the link to the reservation website for making reservations in the recreation area
	 */
	public String getRecAreaReservationURL() {
		return recAreaReservationURL;
	}
	
	/**
	 * Sets the link to the reservation website for making reservations in the recreation area.
	 *
	 * @param recAreaReservationURL the new link to the reservation website for making reservations in the recreation area
	 */
	public void setRecAreaReservationURL(String recAreaReservationURL) {
		this.recAreaReservationURL = recAreaReservationURL;
	}
	
	/**
	 * Gets the phone number for the recreation area.
	 *
	 * @return the phone number for the recreation area
	 */
	public String getRecAreaPhone() {
		return recAreaPhone;
	}
	
	/**
	 * Sets the phone number for the recreation area.
	 *
	 * @param recAreaPhone the new phone number for the recreation area
	 */
	public void setRecAreaPhone(String recAreaPhone) {
		this.recAreaPhone = recAreaPhone;
	}
	
	/**
	 * Gets the email contact for the recreation area.
	 *
	 * @return the email contact for the recreation area
	 */
	public String getRecAreaEmail() {
		return recAreaEmail;
	}
	
	/**
	 * Sets the email contact for the recreation area.
	 *
	 * @param recAreaEmail the new email contact for the recreation area
	 */
	public void setRecAreaEmail(String recAreaEmail) {
		this.recAreaEmail = recAreaEmail;
	}
	
	/**
	 * Gets the latitude in decimal degrees -90.0 to 90.0.
	 *
	 * @return the latitude in decimal degrees
	 */
	public Double getRecAreaLatitude() {
		return recAreaLatitude;
	}
	
	/**
	 * Sets the latitude in decimal degrees -90.0 to 90.0.
	 *
	 * @param recAreaLatitude the new latitude in decimal degrees
	 */
	public void setRecAreaLatitude(Double recAreaLatitude) {
		this.recAreaLatitude = recAreaLatitude;
	}
	
	/**
	 * Gets the longitude in decimal degrees -180.0 to 180.0.
	 *
	 * @return the longitude in decimal degrees
	 */
	public Double getRecAreaLongitude() {
		return recAreaLongitude;
	}
	
	/**
	 * Sets the longitude in decimal degrees -180.0 to 180.0.
	 *
	 * @param recAreaLongitude the new longitude in decimal degrees
	 */
	public void setRecAreaLongitude(Double recAreaLongitude) {
		this.recAreaLongitude = recAreaLongitude;
	}
	
	/**
	 * Gets the list of keywords for the recreation area.
	 *
	 * @return the list of keywords for the recreation area
	 */
	public String getKeywords() {
		return keywords;
	}
	
	/**
	 * Sets the list of keywords for the recreation area.
	 *
	 * @param keywords the new list of keywords for the recreation area
	 */
	public void setKeywords(String keywords) {
		this.keywords = keywords;
	}
	
	/**
	 * Gets the details on the stay limits for the recreation area.
	 *
	 * @return the details on the stay limits for the recreation area
	 */
	public String getStayLimit() {
		return stayLimit;
	}
	
	/**
	 * Sets the details on the stay limits for the recreation area.
	 *
	 * @param stayLimit the new details on the stay limits for the recreation area
	 */
	public void setStayLimit(String stayLimit) {
		this.stayLimit = stayLimit;
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

	
}
