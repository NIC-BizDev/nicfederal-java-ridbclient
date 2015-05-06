package com.nicfederal.ridbclient;

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
 * Represents an address associated with a recreation facility.
 *
 * @author NIC Federal
 */
@JsonIgnoreProperties(ignoreUnknown = true)
public class RIDBFacilityAddress {
	
	/** The id of the facility address. */
	@JsonProperty("FacilityAddressID")
	private int facilityAddressID;
	
	/** The first line of the facility street address. */
	@JsonProperty("FacilityStreetAddress1")
	private String facilityStreetAddress1;

	/** The second line of the facility street address. */
	@JsonProperty("FacilityStreetAddress2")
	private String facilityStreetAddress2;

	/** The third line of the facility street address. */
	@JsonProperty("FacilityStreetAddress3")
	private String facilityStreetAddress3;

	/** The city portion of the facility address. */
	@JsonProperty("City")
	private String city;

	/** The state code for the facility address. */
	@JsonProperty("AddressStateCode")
	private String addressStateCode;

	/** The postal code for the facility address. */
	@JsonProperty("PostalCode")
	private String postalCode;

	/** The country code for the facility address. */
	@JsonProperty("AddressCountryCode")
	private String addressCountryCode;

	/** The id of the facility with which the address is associated. */
	@JsonProperty("FacilityID")
	private int facilityID;

	/** The type of facility address. */
	@JsonProperty("FacilityAddressType")
	private String facilityAddressType;
	
	/**
	 * Gets the id of the facility address.
	 *
	 * @return the id of the facility address
	 */
	public int getFacilityAddressID() {
		return facilityAddressID;
	}
	
	/**
	 * Sets the id of the facility address.
	 *
	 * @param addressID the new id of the facility address
	 */
	public void setFacilityAddressID(int addressID) {
		this.facilityAddressID = addressID;
	}
	
	/**
	 * Gets the first line of the facility street address.
	 *
	 * @return the first line of the facility street address
	 */
	public String getFacilityStreetAddress1() {
		return facilityStreetAddress1;
	}
	
	/**
	 * Sets the first line of the facility street address.
	 *
	 * @param streetAddress1 the new first line of the facility street address
	 */
	public void setFacilityStreetAddress1(String streetAddress1) {
		this.facilityStreetAddress1 = streetAddress1;
	}
	
	/**
	 * Gets the second line of the facility street address.
	 *
	 * @return the second line of the facility street address
	 */
	public String getFacilityStreetAddress2() {
		return facilityStreetAddress2;
	}
	
	/**
	 * Sets the second line of the facility street address.
	 *
	 * @param streetAddress2 the new second line of the facility street address
	 */
	public void setFacilityStreetAddress2(String streetAddress2) {
		this.facilityStreetAddress2 = streetAddress2;
	}
	
	/**
	 * Gets the third line of the facility street address.
	 *
	 * @return the third line of the facility street address
	 */
	public String getFacilityStreetAddress3() {
		return facilityStreetAddress3;
	}
	
	/**
	 * Sets the third line of the facility street address.
	 *
	 * @param streetAddress3 the new third line of the facility street address
	 */
	public void setFacilityStreetAddress3(String streetAddress3) {
		this.facilityStreetAddress3 = streetAddress3;
	}
	
	/**
	 * Gets the city portion of the facility address.
	 *
	 * @return the city portion of the facility address
	 */
	public String getCity() {
		return city;
	}
	
	/**
	 * Sets the city portion of the facility address.
	 *
	 * @param city the new city portion of the facility address
	 */
	public void setCity(String city) {
		this.city = city;
	}
	
	/**
	 * Gets the state code for the facility address.
	 *
	 * @return the state code for the facility address
	 */
	public String getAddressStateCode() {
		return addressStateCode;
	}
	
	/**
	 * Sets the state code for the facility address.
	 *
	 * @param addressStateCode the new state code for the facility address
	 */
	public void setAddressStateCode(String addressStateCode) {
		this.addressStateCode = addressStateCode;
	}
	
	/**
	 * Gets the postal code for the facility address.
	 *
	 * @return the postal code for the facility address
	 */
	public String getPostalCode() {
		return postalCode;
	}
	
	/**
	 * Sets the postal code for the facility address.
	 *
	 * @param postalCode the new postal code for the facility address
	 */
	public void setPostalCode(String postalCode) {
		this.postalCode = postalCode;
	}
	
	/**
	 * Gets the country code for the facility address.
	 *
	 * @return the country code for the facility address
	 */
	public String getAddressCountryCode() {
		return addressCountryCode;
	}
	
	/**
	 * Sets the country code for the facility address.
	 *
	 * @param addressCountryCode the new country code for the facility address
	 */
	public void setAddressCountryCode(String addressCountryCode) {
		this.addressCountryCode = addressCountryCode;
	}
	
	/**
	 * Gets the id of the facility with which the address is associated.
	 *
	 * @return the id of the facility with which the address is associated
	 */
	public int getFacilityID() {
		return facilityID;
	}
	
	/**
	 * Sets the id of the facility with which the address is associated.
	 *
	 * @param facilityID the new id of the facility with which the address is associated
	 */
	public void setFacilityID(int facilityID) {
		this.facilityID = facilityID;
	}
	
	/**
	 * Gets the type of facility address.
	 *
	 * @return the type of facility address
	 */
	public String getFacilityAddressType() {
		return facilityAddressType;
	}
	
	/**
	 * Sets the type of facility address.
	 *
	 * @param facilityAddressType the new type of facility address
	 */
	public void setFacilityAddressType(String facilityAddressType) {
		this.facilityAddressType = facilityAddressType;
	}

}
