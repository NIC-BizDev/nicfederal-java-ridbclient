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
public class RIDBRecAreaAddress {
/*
 *  AddressID	INT		N	Address ID
	StreetAddress1	STRING	256	Y	Address Line 1 of the recreational area
	StreetAddress2	STRING	256	Y	Address Line 2 of the recreational area
	StreetAddress3	STRING	256	Y	Address Line 3 of the recreational area
	City	STRING	60	Y	City where the recreational area is located
	AddressStateCode	STRING	20	N	State code for the recreational area
	PostalCode	STRING	20	Y	Postal code for the recreational area
	AddressCountryCode	STRING	5	Y	Abbreviated country code for the recreational area address
	RecAreaID	INT		N	Foreign Key: RecArea RecAreaID
	RecAreaAddressType	STRING	20	Y	Address Type for the recreational area
 */	

	@JsonProperty("RecAreaAddressID")
	private int recAreaAddressID;

	@JsonProperty("RecAreaStreetAddress1")
	private String recAreaStreetAddress1;

	@JsonProperty("RecAreaStreetAddress2")
	private String recAreaStreetAddress2;

	@JsonProperty("RecAreaStreetAddress3")
	private String recAreaStreetAddress3;

	@JsonProperty("City")
	private String city;

	@JsonProperty("AddressStateCode")
	private String addressStateCode;

	@JsonProperty("PostalCode")
	private String postalCode;

	@JsonProperty("AddressCountryCode")
	private String addressCountryCode;

	@JsonProperty("RecAreaID")
	private int recAreaID;

	@JsonProperty("RecAreaAddressType")
	private String recAreaAddressType;

	@JsonProperty("LastUpdatedDate")
	@JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "yyyy-MM-dd")
	private Date lastUpdatedDate;
	
	public int getRecAreaAddressID() {
		return recAreaAddressID;
	}
	public void setRecAreaAddressID(int recAreaAddressID) {
		this.recAreaAddressID = recAreaAddressID;
	}
	public String getRecAreaStreetAddress1() {
		return recAreaStreetAddress1;
	}
	public void setRecAreaStreetAddress1(String recAreaStreetAddress1) {
		this.recAreaStreetAddress1 = recAreaStreetAddress1;
	}
	public String getRecAreaStreetAddress2() {
		return recAreaStreetAddress2;
	}
	public void setRecAreaStreetAddress2(String recAreaStreetAddress2) {
		this.recAreaStreetAddress2 = recAreaStreetAddress2;
	}
	public String getRecAreaStreetAddress3() {
		return recAreaStreetAddress3;
	}
	public void setRecAreaStreetAddress3(String recAreaStreetAddress3) {
		this.recAreaStreetAddress3 = recAreaStreetAddress3;
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
	public int getRecAreaID() {
		return recAreaID;
	}
	public void setRecAreaID(int recAreaID) {
		this.recAreaID = recAreaID;
	}
	public String getRecAreaAddressType() {
		return recAreaAddressType;
	}
	public void setRecAreaAddressType(String recAreaAddressType) {
		this.recAreaAddressType = recAreaAddressType;
	}
	public Date getLastUpdatedDate() {
		return lastUpdatedDate;
	}
	public void setLastUpdatedDate(Date lastUpdatedDate) {
		this.lastUpdatedDate = lastUpdatedDate;
	}

}
