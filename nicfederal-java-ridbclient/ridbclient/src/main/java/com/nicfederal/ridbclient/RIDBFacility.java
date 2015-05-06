package com.nicfederal.ridbclient;

import java.util.Date;

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
 * Information about a recreation facility in RIDB.
 *
 * @author NIC Federal
 */
@JsonIgnoreProperties(ignoreUnknown = true)
public class RIDBFacility {

	
	/** The id for the facility. */
	@JsonProperty("FacilityID")
	private int facilityID;

	/** The optional organization specific id for the facility. */
	@JsonProperty("OrgFacilityID")
	private String orgFacilityID;

	/** The name of the facility. */
	@JsonProperty("FacilityName")
	private String facilityName;

	/** The description for the facility type. */
	@JsonProperty("FacilityTypeDescription")
	private String facilityTypeDescription;

	/** The phone number of the facility. */
	@JsonProperty("FacilityPhone")
	private String facilityPhone;

	/** A description of the facility. */
	@JsonProperty("FacilityDescription")
	private String facilityDescription;

	/** The optional text that provides general directions and/or the general location of the facility. */
	@JsonProperty("FacilityDirections")
	private String facilityDirections;

	/** The email contact for the facility. */
	@JsonProperty("FacilityEmail")
	private String facilityEmail;

	/** The Internet address (URL) for a facility map. */
	@JsonProperty("FacilityMapURL")
	private String facilityMapURL;

	/** Internet address (URL) for the website hosting the reservation system. */
	@JsonProperty("FacilityReservationURL")
	private String facilityReservationURL;

	/** The latitude in decimal degrees -90.0 to 90.0. */
	@JsonProperty("FacilityLatitude")
	private Double facilityLatitude;

	/** The longitude in decimal degrees -180.0 to 180.0. */
	@JsonProperty("FacilityLongitude")
	private Double facilityLongitude;

	/** The information about the Americans with Disabilities Act accessibility for the facility. */
	@JsonProperty("FacilityAdaAccess")
	private String facilityAdaAccess;

	/** The text describing monetary charges associated with entrance to or usage of the facility. */
	@JsonProperty("FacilityUseFeeDescription")
	private String facilityUseFeeDescription;

	/** The legacy id for the facility. */
	@JsonProperty("LegacyFacilityID")
	private String legacyFacilityID;

	/** The list of keywords for the facility. */
	@JsonProperty("Keywords")
	private String keywords;

	/** Details on the stay limits for the facility. */
	@JsonProperty("StayLimit")
	private String stayLimit;
	
	/** The date the record was last updated in RIDB. */
	@JsonProperty("LastUpdatedDate")
	private Date lastUpdatedDate;
	
	/**
	 * Gets the id for the facility.
	 *
	 * @return the id for the facility
	 */
	public int getFacilityID() {
		return facilityID;
	}
	
	/**
	 * Sets the id for the facility.
	 *
	 * @param facilityID the new id for the facility
	 */
	public void setFacilityID(int facilityID) {
		this.facilityID = facilityID;
	}
	
	/**
	 * Gets the optional oganization specific id for the facility.
	 *
	 * @return the optional oganization specific id for the facility
	 */
	public String getOrgFacilityID() {
		return orgFacilityID;
	}
	
	/**
	 * Sets the optional oganization specific id for the facility.
	 *
	 * @param orgFacilityID the new optional oganization specific id for the facility
	 */
	public void setOrgFacilityID(String orgFacilityID) {
		this.orgFacilityID = orgFacilityID;
	}
	
	/**
	 * Gets the name of the facility.
	 *
	 * @return the name of the facility
	 */
	public String getFacilityName() {
		return facilityName;
	}
	
	/**
	 * Sets the name of the facility.
	 *
	 * @param facilityName the new name of the facility
	 */
	public void setFacilityName(String facilityName) {
		this.facilityName = facilityName;
	}
	
	/**
	 * Gets the description for the facility type.
	 *
	 * @return the description for the facility type
	 */
	public String getFacilityTypeDescription() {
		return facilityTypeDescription;
	}
	
	/**
	 * Sets the description for the facility type.
	 *
	 * @param facilityTypeDescription the new description for the facility type
	 */
	public void setFacilityTypeDescription(String facilityTypeDescription) {
		this.facilityTypeDescription = facilityTypeDescription;
	}
	
	/**
	 * Gets the phone number of the facility.
	 *
	 * @return the phone number of the facility
	 */
	public String getFacilityPhone() {
		return facilityPhone;
	}
	
	/**
	 * Sets the phone number of the facility.
	 *
	 * @param facilityPhone the new phone number of the facility
	 */
	public void setFacilityPhone(String facilityPhone) {
		this.facilityPhone = facilityPhone;
	}
	
	/**
	 * Gets the a description of the facility.
	 *
	 * @return the a description of the facility
	 */
	public String getFacilityDescription() {
		return facilityDescription;
	}
	
	/**
	 * Sets the a description of the facility.
	 *
	 * @param facilityDescription the new a description of the facility
	 */
	public void setFacilityDescription(String facilityDescription) {
		this.facilityDescription = facilityDescription;
	}
	
	/**
	 * Gets the optional text that provides general directions and/or the general location of the facility.
	 *
	 * @return the optional text that provides general directions and/or the general location of the facility
	 */
	public String getFacilityDirections() {
		return facilityDirections;
	}
	
	/**
	 * Sets the optional text that provides general directions and/or the general location of the facility.
	 *
	 * @param facilityDirections the new optional text that provides general directions and/or the general location of the facility
	 */
	public void setFacilityDirections(String facilityDirections) {
		this.facilityDirections = facilityDirections;
	}
	
	/**
	 * Gets the email contact for the facility.
	 *
	 * @return the email contact for the facility
	 */
	public String getFacilityEmail() {
		return facilityEmail;
	}
	
	/**
	 * Sets the email contact for the facility.
	 *
	 * @param facilityEmail the new email contact for the facility
	 */
	public void setFacilityEmail(String facilityEmail) {
		this.facilityEmail = facilityEmail;
	}
	
	/**
	 * Gets the Internet address (URL) for a facility map.
	 *
	 * @return the Internet address (URL) for a facility map
	 */
	public String getFacilityMapURL() {
		return facilityMapURL;
	}
	
	/**
	 * Sets the Internet address (URL) for a facility map.
	 *
	 * @param facilityMapURL the new Internet address (URL) for a facility map
	 */
	public void setFacilityMapURL(String facilityMapURL) {
		this.facilityMapURL = facilityMapURL;
	}
	
	/**
	 * Gets the Internet address (URL) for the website hosting the reservation system.
	 *
	 * @return the Internet address (URL) for the website hosting the reservation system
	 */
	public String getFacilityReservationURL() {
		return facilityReservationURL;
	}
	
	/**
	 * Sets the Internet address (URL) for the website hosting the reservation system.
	 *
	 * @param facilityReservationURL the new Internet address (URL) for the website hosting the reservation system
	 */
	public void setFacilityReservationURL(String facilityReservationURL) {
		this.facilityReservationURL = facilityReservationURL;
	}
	
	/**
	 * Gets the latitude in decimal degrees -90.0 to 90.0.
	 *
	 * @return the latitude in decimal degrees
	 */
	public Double getFacilityLatitude() {
		return facilityLatitude;
	}
	
	/**
	 * Sets the latitude in decimal degrees -90.0 to 90.0.
	 *
	 * @param facilityLatitude the new latitude in decimal degrees
	 */
	public void setFacilityLatitude(Double facilityLatitude) {
		this.facilityLatitude = facilityLatitude;
	}
	
	/**
	 * Gets the longitude in decimal degrees -180.0 to 180.0.
	 *
	 * @return the longitude in decimal degrees
	 */
	public Double getFacilityLongitude() {
		return facilityLongitude;
	}
	
	/**
	 * Sets the longitude in decimal degrees -180.0 to 180.0.
	 *
	 * @param facilityLongitude the new longitude in decimal degrees
	 */
	public void setFacilityLongitude(Double facilityLongitude) {
		this.facilityLongitude = facilityLongitude;
	}
	
	/**
	 * Gets the information about the Americans with Disabilities Act accessibility for the facility.
	 *
	 * @return the information about the Americans with Disabilities Act accessibility for the facility
	 */
	public String getFacilityAdaAccess() {
		return facilityAdaAccess;
	}
	
	/**
	 * Sets the information about the Americans with Disabilities Act accessibility for the facility.
	 *
	 * @param facilityAdaAccess the new information about the Americans with Disabilities Act accessibility for the facility
	 */
	public void setFacilityAdaAccess(String facilityAdaAccess) {
		this.facilityAdaAccess = facilityAdaAccess;
	}
	
	/**
	 * Gets the text describing monetary charges associated with entrance to or usage of the facility.
	 *
	 * @return the text describing monetary charges associated with entrance to or usage of the facility
	 */
	public String getFacilityUseFeeDescription() {
		return facilityUseFeeDescription;
	}
	
	/**
	 * Sets the text describing monetary charges associated with entrance to or usage of the facility.
	 *
	 * @param facilityUseFeeDescription the new text describing monetary charges associated with entrance to or usage of the facility
	 */
	public void setFacilityUseFeeDescription(String facilityUseFeeDescription) {
		this.facilityUseFeeDescription = facilityUseFeeDescription;
	}
	
	/**
	 * Gets the legacy id for the facility.
	 *
	 * @return the legacy id for the facility
	 */
	public String getLegacyFacilityID() {
		return legacyFacilityID;
	}
	
	/**
	 * Sets the legacy id for the facility.
	 *
	 * @param legacyFacilityID the new legacy id for the facility
	 */
	public void setLegacyFacilityID(String legacyFacilityID) {
		this.legacyFacilityID = legacyFacilityID;
	}
	
	/**
	 * Gets the list of keywords for the facility.
	 *
	 * @return the list of keywords for the facility
	 */
	public String getKeywords() {
		return keywords;
	}
	
	/**
	 * Sets the list of keywords for the facility.
	 *
	 * @param keywords the new list of keywords for the facility
	 */
	public void setKeywords(String keywords) {
		this.keywords = keywords;
	}
	
	/**
	 * Gets the details on the stay limits for the facility.
	 *
	 * @return the details on the stay limits for the facility
	 */
	public String getStayLimit() {
		return stayLimit;
	}
	
	/**
	 * Sets the details on the stay limits for the facility.
	 *
	 * @param stayLimit the new details on the stay limits for the facility
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
