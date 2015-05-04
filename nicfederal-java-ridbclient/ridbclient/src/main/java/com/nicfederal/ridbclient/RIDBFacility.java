package com.nicfederal.ridbclient;

import java.util.Date;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * @author aford_000
 *
 */
@JsonIgnoreProperties(ignoreUnknown = true)
public class RIDBFacility {
/*  FacilityID	INT		N	Facility ID
	OrgFacilityID	INT		N	The agency's internal Facility ID
	FacilityName	STRING	256	N	Full name of the facility
	FacilityTypeDescription	STRING	1024	Y	Description of the type of facility
	FacilityPhone	STRING	256	Y	Phone number of the facility
	FacilityDescription	STRING	MAX*	N	Text describing the main features of the facility
	FacilityDirections	STRING	MAX*	Y	Text that provides general directions and/or the general location of the facility
	FacilityEmail	STRING	60	Y	Email address of the facility
	FacilityMapURL	STRING	256	Y	Internet address (URL) that hosts the facility map
	FacilityReservationURL	STRING	256	Y	Internet address (URL) for the web site hosting the reservation system
	FacilityLatitude	DECIMAL		Y	Latitude in decimal degrees -90.0 to 90.0
	FacilityLongitude	DECIMAL		Y	Longitude in decimal degrees -180.0 to 180.0
	FacilityAdaAccess	STRING	1024	Y	Information about the Americans with Disabilities Act accessibility for the facility
	FacilityUseFeeDescription	STRING	MAX*	Y	Text describing monetary charges associated with entrance to or usage of the facility
	LegacyFacilityID	STRING	20	Y	Legacy facility ID
	Keywords	STRING	4000	Y	List of keywords for the facility
	StayLimit	STRING	500	Y	Details on the stay limits for the facility
*/
	
	@JsonProperty("FacilityID")
	private int facilityID;

	@JsonProperty("OrgFacilityID")
	private String orgFacilityID;

	@JsonProperty("FacilityName")
	private String facilityName;

	@JsonProperty("FacilityTypeDescription")
	private String facilityTypeDescription;

	@JsonProperty("FacilityPhone")
	private String facilityPhone;

	@JsonProperty("FacilityDescription")
	private String facilityDescription;

	@JsonProperty("FacilityDirections")
	private String facilityDirections;

	@JsonProperty("FacilityEmail")
	private String facilityEmail;

	@JsonProperty("FacilityMapURL")
	private String facilityMapURL;

	@JsonProperty("FacilityReservationURL")
	private String facilityReservationURL;

	@JsonProperty("FacilityLatitude")
	private Double facilityLatitude;

	@JsonProperty("FacilityLongitude")
	private Double facilityLongitude;

	@JsonProperty("FacilityAdaAccess")
	private String facilityAdaAccess;

	@JsonProperty("FacilityUseFeeDescription")
	private String facilityUseFeeDescription;

	@JsonProperty("LegacyFacilityID")
	private String legacyFacilityID;

	@JsonProperty("Keywords")
	private String keywords;

	@JsonProperty("StayLimit")
	private String stayLimit;
	
	@JsonProperty("LastUpdatedDate")
	private Date lastUpdatedDate;
	
	public int getFacilityID() {
		return facilityID;
	}
	public void setFacilityID(int facilityID) {
		this.facilityID = facilityID;
	}
	public String getOrgFacilityID() {
		return orgFacilityID;
	}
	public void setOrgFacilityID(String orgFacilityID) {
		this.orgFacilityID = orgFacilityID;
	}
	public String getFacilityName() {
		return facilityName;
	}
	public void setFacilityName(String facilityName) {
		this.facilityName = facilityName;
	}
	public String getFacilityTypeDescription() {
		return facilityTypeDescription;
	}
	public void setFacilityTypeDescription(String facilityTypeDescription) {
		this.facilityTypeDescription = facilityTypeDescription;
	}
	public String getFacilityPhone() {
		return facilityPhone;
	}
	public void setFacilityPhone(String facilityPhone) {
		this.facilityPhone = facilityPhone;
	}
	public String getFacilityDescription() {
		return facilityDescription;
	}
	public void setFacilityDescription(String facilityDescription) {
		this.facilityDescription = facilityDescription;
	}
	public String getFacilityDirections() {
		return facilityDirections;
	}
	public void setFacilityDirections(String facilityDirections) {
		this.facilityDirections = facilityDirections;
	}
	public String getFacilityEmail() {
		return facilityEmail;
	}
	public void setFacilityEmail(String facilityEmail) {
		this.facilityEmail = facilityEmail;
	}
	public String getFacilityMapURL() {
		return facilityMapURL;
	}
	public void setFacilityMapURL(String facilityMapURL) {
		this.facilityMapURL = facilityMapURL;
	}
	public String getFacilityReservationURL() {
		return facilityReservationURL;
	}
	public void setFacilityReservationURL(String facilityReservationURL) {
		this.facilityReservationURL = facilityReservationURL;
	}
	public Double getFacilityLatitude() {
		return facilityLatitude;
	}
	public void setFacilityLatitude(Double facilityLatitude) {
		this.facilityLatitude = facilityLatitude;
	}
	public Double getFacilityLongitude() {
		return facilityLongitude;
	}
	public void setFacilityLongitude(Double facilityLongitude) {
		this.facilityLongitude = facilityLongitude;
	}
	public String getFacilityAdaAccess() {
		return facilityAdaAccess;
	}
	public void setFacilityAdaAccess(String facilityAdaAccess) {
		this.facilityAdaAccess = facilityAdaAccess;
	}
	public String getFacilityUseFeeDescription() {
		return facilityUseFeeDescription;
	}
	public void setFacilityUseFeeDescription(String facilityUseFeeDescription) {
		this.facilityUseFeeDescription = facilityUseFeeDescription;
	}
	public String getLegacyFacilityID() {
		return legacyFacilityID;
	}
	public void setLegacyFacilityID(String legacyFacilityID) {
		this.legacyFacilityID = legacyFacilityID;
	}
	public String getKeywords() {
		return keywords;
	}
	public void setKeywords(String keywords) {
		this.keywords = keywords;
	}
	public String getStayLimit() {
		return stayLimit;
	}
	public void setStayLimit(String stayLimit) {
		this.stayLimit = stayLimit;
	}
	public Date getLastUpdatedDate() {
		return lastUpdatedDate;
	}
	public void setLastUpdatedDate(Date lastUpdatedDate) {
		this.lastUpdatedDate = lastUpdatedDate;
	}

	
}
