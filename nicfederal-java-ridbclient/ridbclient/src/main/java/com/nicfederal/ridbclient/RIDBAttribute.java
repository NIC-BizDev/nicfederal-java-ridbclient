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
 * Attributes are key/value pairs that are associated with other entities, such as campsites and tours.
 *
 * @author NIC Federal
 */
@JsonIgnoreProperties(ignoreUnknown = true)
public class RIDBAttribute {
	
	/** The attribute name. */
	@JsonProperty("AttributeName")
	private String attributeName;

	/** The attribute value. */
	@JsonProperty("AttributeValue")
	private String attributeValue;

	/** The attribute id. Note that this is not always populated with a value depending on how the attribute is retrieved. */
	@JsonProperty("AttributeID")
	private Integer attributeID;
	
	/**
	 * Gets the attribute name.
	 *
	 * @return the attribute name
	 */
	public String getAttributeName() {
		return attributeName;
	}
	
	/**
	 * Sets the attribute name.
	 *
	 * @param attributeName the new attribute name
	 */
	public void setAttributeName(String attributeName) {
		this.attributeName = attributeName;
	}
	
	/**
	 * Gets the attribute value.
	 *
	 * @return the attribute value
	 */
	public String getAttributeValue() {
		return attributeValue;
	}
	
	/**
	 * Sets the attribute value.
	 *
	 * @param attributeValue the new attribute value
	 */
	public void setAttributeValue(String attributeValue) {
		this.attributeValue = attributeValue;
	}
	
	/**
	 * Gets the attribute id.
	 *
	 * @return the attribute id
	 */
	public Integer getAttributeID() {
		return attributeID;
	}
	
	/**
	 * Sets the attribute id.
	 *
	 * @param attributeID the new attribute id
	 */
	public void setAttributeID(Integer attributeID) {
		this.attributeID = attributeID;
	}
	
}
