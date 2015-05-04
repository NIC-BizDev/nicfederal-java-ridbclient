package com.nicfederal.ridbclient;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Date;

/**
 * @author aford_000
 *
 */
@JsonIgnoreProperties(ignoreUnknown = true)
public class RIDBOrganization {
	// OrgID	INT		N	Organization ID
	// OrgName	STRING	60	N	Full name of organization
	// OrgAbbrevName	STRING	20	Y	Abbreviated name of the organization
	// OrgURLAddress	STRING	256	N	Internet address (URL) for web site of the organization responsible for submitting and maintaining the data to be exchanged
	// OrgURLText	STRING	256	Y	Optional Readable text that provides the URL address link
	// OrgImageURL	STRING	256	Y	Internet address (URL) that hosts the sample image or photo of the organization
	// OrgType	STRING	40	Y	Organization type
	// OrgJurisdictionType	STRING	20	Y	Organization jurisdiction type

	@JsonProperty("OrgID")
	private int orgId;

	@JsonProperty("OrgName")
	private String orgName;

	@JsonProperty("OrgAbbrevName")
	private String orgAbbrevName;

	@JsonProperty("OrgURLAddress")
	private String orgURLAddress;

	@JsonProperty("OrgURLText")
	private String orgURLText;

	@JsonProperty("OrgImageURL")
	private String orgImageURL;

	@JsonProperty("OrgJurisdictionType")
	private String orgJurisdictionType;

	@JsonProperty("LastUpdatedDate")
	@JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "yyyy-MM-dd")
	private Date lastUpdateDate;

	public int getOrgId() {
		return orgId;
	}

	public void setOrgId(int orgId) {
		this.orgId = orgId;
	}

	public String getOrgName() {
		return orgName;
	}

	public void setOrgName(String orgName) {
		this.orgName = orgName;
	}

	public String getOrgAbbrevName() {
		return orgAbbrevName;
	}

	public void setOrgAbbrevName(String orgAbbrevName) {
		this.orgAbbrevName = orgAbbrevName;
	}

	public String getOrgURLAddress() {
		return orgURLAddress;
	}

	public void setOrgURLAddress(String orgURLAddress) {
		this.orgURLAddress = orgURLAddress;
	}

	public String getOrgURLText() {
		return orgURLText;
	}

	public void setOrgURLText(String orgURLText) {
		this.orgURLText = orgURLText;
	}

	public String getOrgImageURL() {
		return orgImageURL;
	}

	public void setOrgImageURL(String orgImageURL) {
		this.orgImageURL = orgImageURL;
	}

	public String getOrgJurisdictionType() {
		return orgJurisdictionType;
	}

	public void setOrgJurisdictionType(String orgJurisdictionType) {
		this.orgJurisdictionType = orgJurisdictionType;
	}

}
