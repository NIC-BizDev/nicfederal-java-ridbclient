package com.nicfederal.ridbclient;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * @author aford_000
 *
 */
@JsonIgnoreProperties(ignoreUnknown = true)
public class RIDBFacilityAddress {
	/*
	 *  AddressID	INT		N	Address ID
		StreetAddress1	STRING	256	Y	Address Line 1 of the facility
		StreetAddress2	STRING	256	Y	Address Line 2 of the facility
		StreetAddress3	STRING	256	Y	Address Line 3 of the facility
		City	STRING	60	Y	City where the facility is located
		AddressStateCode	STRING	20	N	State code for the facility
		PostalCode	STRING	20	Y	Postal code for the facility
		AddressCountryCode	STRING	5	Y	Abbreviated country code for the facility address
		FacilityID	INT		N	Foreign Key: Facility FacilityID
		FacilityAddressType	STRING	20	Y	Address type for the facility
	 */
	
	@JsonProperty("FacilityAddressID")
	private int facilityAddressID;
	
	@JsonProperty("FacilityStreetAddress1")
	private String facilityStreetAddress1;

	@JsonProperty("FacilityStreetAddress2")
	private String facilityStreetAddress2;

	@JsonProperty("FacilityStreetAddress3")
	private String facilityStreetAddress3;

	@JsonProperty("City")
	private String city;

	@JsonProperty("AddressStateCode")
	private String addressStateCode;

	@JsonProperty("PostalCode")
	private String postalCode;

	@JsonProperty("AddressCountryCode")
	private String addressCountryCode;

	@JsonProperty("FacilityID")
	private int facilityID;

	@JsonProperty("FacilityAddressType")
	private String facilityAddressType;
	
	public int getFacilityAddressID() {
		return facilityAddressID;
	}
	public void setFacilityAddressID(int addressID) {
		this.facilityAddressID = addressID;
	}
	public String getFacilityStreetAddress1() {
		return facilityStreetAddress1;
	}
	public void setFacilityStreetAddress1(String streetAddress1) {
		this.facilityStreetAddress1 = streetAddress1;
	}
	public String getFacilityStreetAddress2() {
		return facilityStreetAddress2;
	}
	public void setFacilityStreetAddress2(String streetAddress2) {
		this.facilityStreetAddress2 = streetAddress2;
	}
	public String getFacilityStreetAddress3() {
		return facilityStreetAddress3;
	}
	public void setFacilityStreetAddress3(String streetAddress3) {
		this.facilityStreetAddress3 = streetAddress3;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public String getAddressStateCode() {
		return addressStateCode;
	}
	public void setAddressStateCode(String addressStateCode) {
		this.addressStateCode = addressStateCode;
	}
	public String getPostalCode() {
		return postalCode;
	}
	public void setPostalCode(String postalCode) {
		this.postalCode = postalCode;
	}
	public String getAddressCountryCode() {
		return addressCountryCode;
	}
	public void setAddressCountryCode(String addressCountryCode) {
		this.addressCountryCode = addressCountryCode;
	}
	public int getFacilityID() {
		return facilityID;
	}
	public void setFacilityID(int facilityID) {
		this.facilityID = facilityID;
	}
	public String getFacilityAddressType() {
		return facilityAddressType;
	}
	public void setFacilityAddressType(String facilityAddressType) {
		this.facilityAddressType = facilityAddressType;
	}

}
