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
public class RIDBRecArea {
/*  RecAreaID	INT		N	RecArea ID
	OrgRecAreaID	INT		Y	The agency's internal Recreation Area ID
	RecAreaName	STRING	256	N	Full Name of the recreational area
	RecAreaDescription	STRING	MAX*	N	Text that describes the recreational area
	RecAreaDirections	STRING	MAX*	Y	Directions to the recreational area
	RecAreaFeeDescription	STRING	MAX*	Y	Text describing monetary charges associated with entrance to or usage of a recreational area
	RecAreaMapURL	STRING	256	Y	Internet address (URL) that hosts the recreational area map
	RecAreaReservationURL	STRING	256	Y	Internet address (URL) for the web site hosting the reservation system
	RecAreaPhone	STRING	256	Y	Phone number for recreational area
	RecAreaEmail	STRING	256	N	Email address of the recreational area
	RecAreaLatitude	DECIMAL		Y	Latitude in decimal degrees -90.0 to 90.0
	RecAreaLongitude	DECIMAL		Y	Longitude in decimal degrees -180.0 to 180.0
	Keywords	STRING	4000	Y	List of keywords for the recreational area
	StayLimit	STRING	500	Y	Details on the stay limits for the recreational area
 */
	@JsonProperty("RecAreaID")
	private int recAreaID;
	
	@JsonProperty("OrgRecAreaID")
	private Integer orgRecAreaID;
	
	@JsonProperty("RecAreaName")
	private String recAreaName;
	
	@JsonProperty("RecAreaDescription")
	private String recAreaDescription;

	@JsonProperty("RecAreaDirections")
	private String recAreaDirections;

	@JsonProperty("RecAreaFeeDescription")
	private String recAreaFeeDescription;

	@JsonProperty("RecAreaMapURL")
	private String recAreaMapURL;

	@JsonProperty("RecAreaReservationURL")
	private String recAreaReservationURL;

	@JsonProperty("RecAreaPhone")
	private String recAreaPhone;

	@JsonProperty("RecAreaEmail")
	private String recAreaEmail;

	@JsonProperty("RecAreaLatitude")
	private Double recAreaLatitude;

	@JsonProperty("RecAreaLongitude")
	private Double recAreaLongitude;

	@JsonProperty("Keywords")
	private String keywords;

	@JsonProperty("StayLimit")
	private String stayLimit;

	@JsonProperty("LastUpdatedDate")
	@JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "yyyy-MM-dd")
	private Date lastUpdatedDate;
	
	public int getRecAreaID() {
		return recAreaID;
	}
	public void setRecAreaID(int recAreaID) {
		this.recAreaID = recAreaID;
	}
	public Integer getOrgRecAreaID() {
		return orgRecAreaID;
	}
	public void setOrgRecAreaID(Integer orgRecAreaID) {
		this.orgRecAreaID = orgRecAreaID;
	}
	public String getRecAreaName() {
		return recAreaName;
	}
	public void setRecAreaName(String recAreaName) {
		this.recAreaName = recAreaName;
	}
	public String getRecAreaDescription() {
		return recAreaDescription;
	}
	public void setRecAreaDescription(String recAreaDescription) {
		this.recAreaDescription = recAreaDescription;
	}
	public String getRecAreaDirections() {
		return recAreaDirections;
	}
	public void setRecAreaDirections(String recAreaDirections) {
		this.recAreaDirections = recAreaDirections;
	}
	public String getRecAreaFeeDescription() {
		return recAreaFeeDescription;
	}
	public void setRecAreaFeeDescription(String recAreaFeeDescription) {
		this.recAreaFeeDescription = recAreaFeeDescription;
	}
	public String getRecAreaMapURL() {
		return recAreaMapURL;
	}
	public void setRecAreaMapURL(String recAreaMapURL) {
		this.recAreaMapURL = recAreaMapURL;
	}
	public String getRecAreaReservationURL() {
		return recAreaReservationURL;
	}
	public void setRecAreaReservationURL(String recAreaReservationURL) {
		this.recAreaReservationURL = recAreaReservationURL;
	}
	public String getRecAreaPhone() {
		return recAreaPhone;
	}
	public void setRecAreaPhone(String recAreaPhone) {
		this.recAreaPhone = recAreaPhone;
	}
	public String getRecAreaEmail() {
		return recAreaEmail;
	}
	public void setRecAreaEmail(String recAreaEmail) {
		this.recAreaEmail = recAreaEmail;
	}
	public Double getRecAreaLatitude() {
		return recAreaLatitude;
	}
	public void setRecAreaLatitude(Double recAreaLatitude) {
		this.recAreaLatitude = recAreaLatitude;
	}
	public Double getRecAreaLongitude() {
		return recAreaLongitude;
	}
	public void setRecAreaLongitude(Double recAreaLongitude) {
		this.recAreaLongitude = recAreaLongitude;
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
