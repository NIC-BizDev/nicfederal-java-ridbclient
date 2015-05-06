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
 * Contains information on a external resources related to a RIDB entity.
 *
 * @author NIC Federal
 */
@JsonIgnoreProperties(ignoreUnknown = true)
public class RIDBEntityLink {

	/** The id of the entity link. */
	@JsonProperty("EntityLinkID")
	private int entityLinkID;

	/** The type of entity with which the link is related (e.g. Rec Area or Facility). */
	@JsonProperty("EntityType")
	private String entityType;

	/** The id of the entity with which the link is related. */
	@JsonProperty("EntityID")
	private int entityID;

	/** Type of link, e.g. Facebook, Twitter, Official site */
	@JsonProperty("LinkType")
	private String linkType;

	/** The URL for the link. */
	@JsonProperty("URL")
	private String uRL;

	/** The title of the link. */
	@JsonProperty("Title")
	private String title;

	/** The description of the link. */
	@JsonProperty("Description")
	private String description;
	
	/**
	 * Gets the type of entity with which the link is related (e.g. Rec Area or Facility).
	 *
	 * @return the type of entity with which the link is related
	 */
	public String getEntityType() {
		return entityType;
	}
	
	/**
	 * Sets the type of entity with which the link is related (e.g. Rec Area or Facility).
	 *
	 * @param entityType the new type of entity with which the link is related
	 */
	public void setEntityType(String entityType) {
		this.entityType = entityType;
	}
	
	/**
	 * Gets the id of the entity with which the link is related.
	 *
	 * @return the id of the entity with which the link is related
	 */
	public int getEntityID() {
		return entityID;
	}
	
	/**
	 * Sets the id of the entity with which the link is related.
	 *
	 * @param entityID the new id of the entity with which the link is related
	 */
	public void setEntityID(int entityID) {
		this.entityID = entityID;
	}
	
	/**
	 * Gets the type of link, e.g. Facebook, Twitter, Official site.
	 *
	 * @return the type of link, e
	 */
	public String getLinkType() {
		return linkType;
	}
	
	/**
	 * Sets the type of link, e.g. Facebook, Twitter, Official site.
	 *
	 * @param linkType the new type of link, e
	 */
	public void setLinkType(String linkType) {
		this.linkType = linkType;
	}
	
	/**
	 * Gets the URL for the link.
	 *
	 * @return the URL for the link
	 */
	public String getURL() {
		return uRL;
	}
	
	/**
	 * Sets the URL for the link.
	 *
	 * @param uRL the new URL for the link
	 */
	public void setURL(String uRL) {
		this.uRL = uRL;
	}
	
	/**
	 * Gets the title of the link.
	 *
	 * @return the title of the link
	 */
	public String getTitle() {
		return title;
	}
	
	/**
	 * Sets the title of the link.
	 *
	 * @param title the new title of the link
	 */
	public void setTitle(String title) {
		this.title = title;
	}
	
	/**
	 * Gets the description of the link.
	 *
	 * @return the description of the link
	 */
	public String getDescription() {
		return description;
	}
	
	/**
	 * Sets the description of the link.
	 *
	 * @param description the new description of the link
	 */
	public void setDescription(String description) {
		this.description = description;
	}
	
	/**
	 * Gets the id of the entity link.
	 *
	 * @return the id of the entity link
	 */
	public int getEntityLinkID() {
		return entityLinkID;
	}
	
	/**
	 * Sets the id of the entity link.
	 *
	 * @param entityLinkID the new id of the entity link
	 */
	public void setEntityLinkID(int entityLinkID) {
		this.entityLinkID = entityLinkID;
	}

	
}
