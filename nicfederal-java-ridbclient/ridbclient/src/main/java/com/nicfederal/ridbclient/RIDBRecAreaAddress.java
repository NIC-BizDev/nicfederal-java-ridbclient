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
 * Represents an address associated with a recreation area.
 *
 * @author NIC Federal
 */
@JsonIgnoreProperties(ignoreUnknown = true)
public class RIDBRecAreaAddress {

	/** The id for the recreation area address. */
	@JsonProperty("RecAreaAddressID")
	private int recAreaAddressID;

	/** The first line of the recreation area street address. */
	@JsonProperty("RecAreaStreetAddress1")
	private String recAreaStreetAddress1;

	/** The second line of the recreation area street address. */
	@JsonProperty("RecAreaStreetAddress2")
	private String recAreaStreetAddress2;

	/** The third line of the recreation area street address. */
	@JsonProperty("RecAreaStreetAddress3")
	private String recAreaStreetAddress3;

	/** The city portion of the recreation area address. */
	@JsonProperty("City")
	private String city;

	/** The state code for the recreation area address. */
	@JsonProperty("AddressStateCode")
	private String addressStateCode;

	/** The postal code for the recreation area address. */
	@JsonProperty("PostalCode")
	private String postalCode;

	/** The country code for the recreation area address. */
	@JsonProperty("AddressCountryCode")
	private String addressCountryCode;

	/** The id of the recreation area with which the address is associated. */
	@JsonProperty("RecAreaID")
	private int recAreaID;

	/** The type of recreation area address. */
	@JsonProperty("RecAreaAddressType")
	private String recAreaAddressType;

	/** The date the record was last updated in RIDB. */
	@JsonProperty("LastUpdatedDate")
	@JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "yyyy-MM-dd")
	private Date lastUpdatedDate;
	
	/**
	 * Gets the id for the recreation area address.
	 *
	 * @return the id for the recreation area address
	 */
	public int getRecAreaAddressID() {
		return recAreaAddressID;
	}
	
	/**
	 * Sets the id for the recreation area address.
	 *
	 * @param recAreaAddressID the new id for the recreation area address
	 */
	public void setRecAreaAddressID(int recAreaAddressID) {
		this.recAreaAddressID = recAreaAddressID;
	}
	
	/**
	 * Gets the first line of the recreation area street address.
	 *
	 * @return the first line of the recreation area street address
	 */
	public String getRecAreaStreetAddress1() {
		return recAreaStreetAddress1;
	}
	
	/**
	 * Sets the first line of the recreation area street address.
	 *
	 * @param recAreaStreetAddress1 the new first line of the recreation area street address
	 */
	public void setRecAreaStreetAddress1(String recAreaStreetAddress1) {
		this.recAreaStreetAddress1 = recAreaStreetAddress1;
	}
	
	/**
	 * Gets the second line of the recreation area street address.
	 *
	 * @return the second line of the recreation area street address
	 */
	public String getRecAreaStreetAddress2() {
		return recAreaStreetAddress2;
	}
	
	/**
	 * Sets the second line of the recreation area street address.
	 *
	 * @param recAreaStreetAddress2 the new second line of the recreation area street address
	 */
	public void setRecAreaStreetAddress2(String recAreaStreetAddress2) {
		this.recAreaStreetAddress2 = recAreaStreetAddress2;
	}
	
	/**
	 * Gets the third line of the recreation area street address.
	 *
	 * @return the third line of the recreation area street address
	 */
	public String getRecAreaStreetAddress3() {
		return recAreaStreetAddress3;
	}
	
	/**
	 * Sets the third line of the recreation area street address.
	 *
	 * @param recAreaStreetAddress3 the new third line of the recreation area street address
	 */
	public void setRecAreaStreetAddress3(String recAreaStreetAddress3) {
		this.recAreaStreetAddress3 = recAreaStreetAddress3;
	}
	
	/**
	 * Gets the city portion of the recreation area address.
	 *
	 * @return the city portion of the recreation area address
	 */
	public String getCity() {
		return city;
	}
	
	/**
	 * Sets the city portion of the recreation area address.
	 *
	 * @param city the new city portion of the recreation area address
	 */
	public void setCity(String city) {
		this.city = city;
	}
	
	/**
	 * Gets the state code for the recreation area address.
	 *
	 * @return the state code for the recreation area address
	 */
	public String getAddressStateCode() {
		return addressStateCode;
	}
	
	/**
	 * Sets the state code for the recreation area address.
	 *
	 * @param addressStateCode the new state code for the recreation area address
	 */
	public void setAddressStateCode(String addressStateCode) {
		this.addressStateCode = addressStateCode;
	}
	
	/**
	 * Gets the postal code for the recreation area address.
	 *
	 * @return the postal code for the recreation area address
	 */
	public String getPostalCode() {
		return postalCode;
	}
	
	/**
	 * Sets the postal code for the recreation area address.
	 *
	 * @param postalCode the new postal code for the recreation area address
	 */
	public void setPostalCode(String postalCode) {
		this.postalCode = postalCode;
	}
	
	/**
	 * Gets the country code for the recreation area address.
	 *
	 * @return the country code for the recreation area address
	 */
	public String getAddressCountryCode() {
		return addressCountryCode;
	}
	
	/**
	 * Sets the country code for the recreation area address.
	 *
	 * @param addressCountryCode the new country code for the recreation area address
	 */
	public void setAddressCountryCode(String addressCountryCode) {
		this.addressCountryCode = addressCountryCode;
	}
	
	/**
	 * Gets the id of the recreation area with which the address is associated.
	 *
	 * @return the id of the recreation area with which the address is associated
	 */
	public int getRecAreaID() {
		return recAreaID;
	}
	
	/**
	 * Sets the id of the recreation area with which the address is associated.
	 *
	 * @param recAreaID the new id of the recreation area with which the address is associated
	 */
	public void setRecAreaID(int recAreaID) {
		this.recAreaID = recAreaID;
	}
	
	/**
	 * Gets the type of recreation area address.
	 *
	 * @return the type of recreation area address
	 */
	public String getRecAreaAddressType() {
		return recAreaAddressType;
	}
	
	/**
	 * Sets the type of recreation area address.
	 *
	 * @param recAreaAddressType the new type of recreation area address
	 */
	public void setRecAreaAddressType(String recAreaAddressType) {
		this.recAreaAddressType = recAreaAddressType;
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
