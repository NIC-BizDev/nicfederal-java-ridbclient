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
 * Information about multimedia associated with an entity within RIDB.
 *
 * @author NIC Federal
 */
@JsonIgnoreProperties(ignoreUnknown = true)
public class RIDBEntityMedia {

	/** The type of entity with which the media item is related (e.g. Rec Area or Facility). */
	@JsonProperty("EntityType")
	private String entityType;

	/** The id of the entity with which the media item is related. */
	@JsonProperty("EntityID")
	private int entityID;

	/** The type of media item (e.g. Image, Video, etc.) */
	@JsonProperty("MediaType")
	private String mediaType;

	/** The Internet URL for the media item. */
	@JsonProperty("URL")
	private String uRL;

	/** The full title of the entity media. */
	@JsonProperty("Title")
	private String title;

	/** The optional subtitle of the entity media. */
	@JsonProperty("Subtitle")
	private String subtitle;

	/** The optional description of the entity media. */
	@JsonProperty("Description")
	private String description;

	/** The optional credits for the entity media item. */
	@JsonProperty("Credits")
	private String credits;

	/** The height in pixels for media item. */
	@JsonProperty("Height")
	private int height;

	/** The width in pixels for the media item. */
	@JsonProperty("Width")
	private int width;

	/** The optional embedded code used to insert the media into a webpage. */
	@JsonProperty("EmbedCode")
	private String embedCode;

	/** The id of the media item. */
	@JsonProperty("MediaID")
	private int mediaID;
	
	/**
	 * Gets the type of entity with which the media item is related (e.g. Rec Area or Facility).
	 *
	 * @return the type of entity with which the media item is related (e
	 */
	public String getEntityType() {
		return entityType;
	}
	
	/**
	 * Sets the type of entity with which the media item is related (e.g. Rec Area or Facility).
	 *
	 * @param entityType the new type of entity with which the media item is related (e
	 */
	public void setEntityType(String entityType) {
		this.entityType = entityType;
	}
	
	/**
	 * Gets the id of the entity with which the media item is related.
	 *
	 * @return the id of the entity with which the media item is related
	 */
	public int getEntityID() {
		return entityID;
	}
	
	/**
	 * Sets the id of the entity with which the media item is related.
	 *
	 * @param entityID the new id of the entity with which the media item is related
	 */
	public void setEntityID(int entityID) {
		this.entityID = entityID;
	}
	
	/**
	 * Gets the type of media item (e.g. Image, Video, etc.).
	 *
	 * @return the type of media item
	 */
	public String getMediaType() {
		return mediaType;
	}
	
	/**
	 * Sets the type of media item (e.g. Image, Video, etc.).
	 *
	 * @param mediaType the new type of media item
	 */
	public void setMediaType(String mediaType) {
		this.mediaType = mediaType;
	}
	
	/**
	 * Gets the Internet URL for the media item.
	 *
	 * @return the Internet URL for the media item
	 */
	public String getURL() {
		return uRL;
	}
	
	/**
	 * Sets the Internet URL for the media item.
	 *
	 * @param uRL the new Internet URL for the media item
	 */
	public void setURL(String uRL) {
		this.uRL = uRL;
	}
	
	/**
	 * Gets the full title of the entity media.
	 *
	 * @return the full title of the entity media
	 */
	public String getTitle() {
		return title;
	}
	
	/**
	 * Sets the full title of the entity media.
	 *
	 * @param title the new full title of the entity media
	 */
	public void setTitle(String title) {
		this.title = title;
	}
	
	/**
	 * Gets the optional subtitle of the entity media.
	 *
	 * @return the optional subtitle of the entity media
	 */
	public String getSubtitle() {
		return subtitle;
	}
	
	/**
	 * Sets the optional subtitle of the entity media.
	 *
	 * @param subtitle the new optional subtitle of the entity media
	 */
	public void setSubtitle(String subtitle) {
		this.subtitle = subtitle;
	}
	
	/**
	 * Gets the optional description of the entity media.
	 *
	 * @return the optional description of the entity media
	 */
	public String getDescription() {
		return description;
	}
	
	/**
	 * Sets the optional description of the entity media.
	 *
	 * @param description the new optional description of the entity media
	 */
	public void setDescription(String description) {
		this.description = description;
	}
	
	/**
	 * Gets the optional credits for the entity media item.
	 *
	 * @return the optional credits for the entity media item
	 */
	public String getCredits() {
		return credits;
	}
	
	/**
	 * Sets the optional credits for the entity media item.
	 *
	 * @param credits the new optional credits for the entity media item
	 */
	public void setCredits(String credits) {
		this.credits = credits;
	}
	
	/**
	 * Gets the height in pixels for media item.
	 *
	 * @return the height in pixels for media item
	 */
	public int getHeight() {
		return height;
	}
	
	/**
	 * Sets the height in pixels for media item.
	 *
	 * @param height the new height in pixels for media item
	 */
	public void setHeight(int height) {
		this.height = height;
	}
	
	/**
	 * Gets the width in pixels for the media item.
	 *
	 * @return the width in pixels for the media item
	 */
	public int getWidth() {
		return width;
	}
	
	/**
	 * Sets the width in pixels for the media item.
	 *
	 * @param width the new width in pixels for the media item
	 */
	public void setWidth(int width) {
		this.width = width;
	}
	
	/**
	 * Gets the optional embedded code used to insert the media into a webpage.
	 *
	 * @return the optional embedded code used to insert the media into a webpage
	 */
	public String getEmbedCode() {
		return embedCode;
	}
	
	/**
	 * Sets the optional embedded code used to insert the media into a webpage.
	 *
	 * @param embedCode the new optional embedded code used to insert the media into a webpage
	 */
	public void setEmbedCode(String embedCode) {
		this.embedCode = embedCode;
	}
	
	/**
	 * Gets the id of the media item.
	 *
	 * @return the id of the media item
	 */
	public int getMediaID() {
		return mediaID;
	}
	
	/**
	 * Sets the id of the media item.
	 *
	 * @param mediaID the new id of the media item
	 */
	public void setMediaID(int mediaID) {
		this.mediaID = mediaID;
	}

	
}
