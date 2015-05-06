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
 * An organizational entity within RIDB.
 *
 * @author NIC Federal
 */
@JsonIgnoreProperties(ignoreUnknown = true)
public class RIDBOrganization {

	/** The id of the organization. */
	@JsonProperty("OrgID")
	private int orgId;

	/** The organization name. */
	@JsonProperty("OrgName")
	private String orgName;

	/** The short form of the organization name. */
	@JsonProperty("OrgAbbrevName")
	private String orgAbbrevName;

	/** The URL address of the organization's website. */
	@JsonProperty("OrgURLAddress")
	private String orgURLAddress;

	/** The text that should be used for links to the organization's website. */
	@JsonProperty("OrgURLText")
	private String orgURLText;

	/** The URL to an image to use for the organization. */
	@JsonProperty("OrgImageURL")
	private String orgImageURL;

	/** The optional jurisdiction type for the organization. */
	@JsonProperty("OrgJurisdictionType")
	private String orgJurisdictionType;

	/** The date that the organization was last updated in RIDB. */
	@JsonProperty("LastUpdatedDate")
	@JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "yyyy-MM-dd")
	private Date lastUpdateDate;

	/**
	 * Gets the id of the organization.
	 *
	 * @return the id of the organization
	 */
	public int getOrgId() {
		return orgId;
	}

	/**
	 * Sets the id of the organization.
	 *
	 * @param orgId the new id of the organization
	 */
	public void setOrgId(int orgId) {
		this.orgId = orgId;
	}

	/**
	 * Gets the organization name.
	 *
	 * @return the organization name
	 */
	public String getOrgName() {
		return orgName;
	}

	/**
	 * Sets the organization name.
	 *
	 * @param orgName the new organization name
	 */
	public void setOrgName(String orgName) {
		this.orgName = orgName;
	}

	/**
	 * Gets the short form of the organization name.
	 *
	 * @return the short form of the organization name
	 */
	public String getOrgAbbrevName() {
		return orgAbbrevName;
	}

	/**
	 * Sets the short form of the organization name.
	 *
	 * @param orgAbbrevName the new short form of the organization name
	 */
	public void setOrgAbbrevName(String orgAbbrevName) {
		this.orgAbbrevName = orgAbbrevName;
	}

	/**
	 * Gets the URL address of the organization's website.
	 *
	 * @return the URL address of the organization's website
	 */
	public String getOrgURLAddress() {
		return orgURLAddress;
	}

	/**
	 * Sets the URL address of the organization's website.
	 *
	 * @param orgURLAddress the new URL address of the organization's website
	 */
	public void setOrgURLAddress(String orgURLAddress) {
		this.orgURLAddress = orgURLAddress;
	}

	/**
	 * Gets the text that should be used for links to the organization's website.
	 *
	 * @return the text that should be used for links to the organization's website
	 */
	public String getOrgURLText() {
		return orgURLText;
	}

	/**
	 * Sets the text that should be used for links to the organization's website.
	 *
	 * @param orgURLText the new text that should be used for links to the organization's website
	 */
	public void setOrgURLText(String orgURLText) {
		this.orgURLText = orgURLText;
	}

	/**
	 * Gets the URL to an image to use for the organization.
	 *
	 * @return the URL to an image to use for the organization
	 */
	public String getOrgImageURL() {
		return orgImageURL;
	}

	/**
	 * Sets the URL to an image to use for the organization.
	 *
	 * @param orgImageURL the new URL to an image to use for the organization
	 */
	public void setOrgImageURL(String orgImageURL) {
		this.orgImageURL = orgImageURL;
	}

	/**
	 * Gets the optional jurisdiction type for the organization.
	 *
	 * @return the optional jurisdiction type for the organization
	 */
	public String getOrgJurisdictionType() {
		return orgJurisdictionType;
	}

	/**
	 * Sets the optional jurisdiction type for the organization.
	 *
	 * @param orgJurisdictionType the new optional jurisdiction type for the organization
	 */
	public void setOrgJurisdictionType(String orgJurisdictionType) {
		this.orgJurisdictionType = orgJurisdictionType;
	}

}
