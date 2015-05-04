package com.nicfederal.ridbclient;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * @author aford_000
 *
 */
@JsonIgnoreProperties(ignoreUnknown = true)
public class RIDBAttribute {
	/*
	AttributeName	STRING	60	Y	Attribute name
	AttributeValue	STRING	255	Y	Attribute value
	*/
	
	@JsonProperty("AttributeName")
	private String attributeName;

	@JsonProperty("AttributeValue")
	private String attributeValue;

	@JsonProperty("AttributeID")
	private Integer attributeID;
	
	public String getAttributeName() {
		return attributeName;
	}
	public void setAttributeName(String attributeName) {
		this.attributeName = attributeName;
	}
	public String getAttributeValue() {
		return attributeValue;
	}
	public void setAttributeValue(String attributeValue) {
		this.attributeValue = attributeValue;
	}
	public Integer getAttributeID() {
		return attributeID;
	}
	public void setAttributeID(Integer attributeID) {
		this.attributeID = attributeID;
	}
	
}
