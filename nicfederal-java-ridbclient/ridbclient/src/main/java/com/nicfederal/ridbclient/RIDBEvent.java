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
 * Information about an event in RIDB.
 *
 * @author NIC Federal
 */
@JsonIgnoreProperties(ignoreUnknown = true)
public class RIDBEvent {

	/** The id for the event. */
	@JsonProperty("EventID")
	private int eventID;

	/** The id of the entity with which the event is related. */
	@JsonProperty("EntityID")
	private int entityID;

	/** The type of entity with which the event is related (e.g. Rec Area or Facility). */
	@JsonProperty("EntityType")
	private String entityType;

	/** The id of the data steward organization for the event. */
	@JsonProperty("EventDataStewardID")
	private Integer eventDataStewardID;

	/** The name of the event. */
	@JsonProperty("EventName")
	private String eventName;

	/** The start date for the event. */
	@JsonProperty("EventStartDate")
	@JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "yyyy-MM-dd")
	private Date eventStartDate;

	/** The description of the event. */
	@JsonProperty("EventDescription")
	private String eventDescription;

	/** The optional target age group for the event. */
	@JsonProperty("EventAgeGroup")
	private String eventAgeGroup;

	/** The Internet address (URL) to a web site providing details about the event. */
	@JsonProperty("EventURLAddress")
	private String eventURLAddress;

	/** The optional text to be displayed for the URL of the event. */
	@JsonProperty("EventURLText")
	private String eventURLText;

	/** The email contact for the event. */
	@JsonProperty("EventEmail")
	private String eventEmail;

	/** Whether registration is required for an event. */
	@JsonProperty("EventRegistrationRequired")
	private boolean eventRegistrationRequired;

	/** Whether the event is ADA accessible. */
	@JsonProperty("EventADAAccess")
	private String eventADAAccess;

	/** The description of fees associated with the event. */
	@JsonProperty("EventFeeDescription")
	private String eventFeeDescription;

	/** The optional comments about the event. */
	@JsonProperty("EventComments")
	private String eventComments;

	/** The text that describes how often the event recurs. */
	@JsonProperty("EventFrequencyRateDescription")
	private String eventFrequencyRateDescription;

	/** The text that describes the extent, capacity, and scale of an event. */
	@JsonProperty("EventScopeDescription")
	private String eventScopeDescription;

	/** The text that describes the type of event. */
	@JsonProperty("EventTypeDescription")
	private String eventTypeDescription;

	/** The full name of the sponsor for the event. */
	@JsonProperty("SponsorName")
	private String sponsorName;

	/** The sponsor email address for the event. */
	@JsonProperty("SponsorEmail")
	private String sponsorEmail;

	/** The Internet address (URL) to a website for the sponsor. */
	@JsonProperty("SponsorURLAddress")
	private String sponsorURLAddress;

	/** The end date for the event. */
	@JsonProperty("EventEndDate")
	@JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "yyyy-MM-dd")
	private Date eventEndDate;

	/** The optional readable text for the URL sponsor link. */
	@JsonProperty("SponsorURLText")
	private String sponsorURLText;

	/** The phone number for the sponsor of the event. */
	@JsonProperty("SponsorPhone")
	private String sponsorPhone;

	/** The class and type of sponsor. */
	@JsonProperty("SponsorClassType")
	private String sponsorClassType;

	/** The date the event was last updated in RIDB. */
	@JsonProperty("LastUpdatedDate")
	@JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "yyyy-MM-dd")
	private Date lastUpdatedDate;
	
	/**
	 * Gets the id for the event.
	 *
	 * @return the id for the event
	 */
	public int getEventID() {
		return eventID;
	}
	
	/**
	 * Sets the id for the event.
	 *
	 * @param eventID the new id for the event
	 */
	public void setEventID(int eventID) {
		this.eventID = eventID;
	}
	
	/**
	 * Gets the id of the entity with which the event is related.
	 *
	 * @return the id of the entity with which the event is related
	 */
	public int getEntityID() {
		return entityID;
	}
	
	/**
	 * Sets the id of the entity with which the event is related.
	 *
	 * @param entityID the new id of the entity with which the event is related
	 */
	public void setEntityID(int entityID) {
		this.entityID = entityID;
	}
	
	/**
	 * Gets the type of entity with which the event is related (e.g. Rec Area or Facility).
	 *
	 * @return the type of entity with which the event is related
	 */
	public String getEntityType() {
		return entityType;
	}
	
	/**
	 * Sets the type of entity with which the event is related (e.g. Rec Area or Facility).
	 *
	 * @param entityType the new type of entity with which the event is related
	 */
	public void setEntityType(String entityType) {
		this.entityType = entityType;
	}
	
	/**
	 * Gets the id of the data steward organization for the event.
	 *
	 * @return the id of the data steward organization for the event
	 */
	public Integer getEventDataStewardID() {
		return eventDataStewardID;
	}
	
	/**
	 * Sets the id of the data steward organization for the event.
	 *
	 * @param eventDataStewardID the new id of the data steward organization for the event
	 */
	public void setEventDataStewardID(Integer eventDataStewardID) {
		this.eventDataStewardID = eventDataStewardID;
	}
	
	/**
	 * Gets the name of the event.
	 *
	 * @return the name of the event
	 */
	public String getEventName() {
		return eventName;
	}
	
	/**
	 * Sets the name of the event.
	 *
	 * @param eventName the new name of the event
	 */
	public void setEventName(String eventName) {
		this.eventName = eventName;
	}
	
	/**
	 * Gets the start date for the event.
	 *
	 * @return the start date for the event
	 */
	public Date getEventStartDate() {
		return eventStartDate;
	}
	
	/**
	 * Sets the start date for the event.
	 *
	 * @param eventStartDate the new start date for the event
	 */
	public void setEventStartDate(Date eventStartDate) {
		this.eventStartDate = eventStartDate;
	}
	
	/**
	 * Gets the description of the event.
	 *
	 * @return the description of the event
	 */
	public String getEventDescription() {
		return eventDescription;
	}
	
	/**
	 * Sets the description of the event.
	 *
	 * @param eventDescription the new description of the event
	 */
	public void setEventDescription(String eventDescription) {
		this.eventDescription = eventDescription;
	}
	
	/**
	 * Gets the optional target age group for the event.
	 *
	 * @return the optional target age group for the event
	 */
	public String getEventAgeGroup() {
		return eventAgeGroup;
	}
	
	/**
	 * Sets the optional target age group for the event.
	 *
	 * @param eventAgeGroup the new optional target age group for the event
	 */
	public void setEventAgeGroup(String eventAgeGroup) {
		this.eventAgeGroup = eventAgeGroup;
	}
	
	/**
	 * Gets the Internet address (URL) to a web site providing details about the event.
	 *
	 * @return the Internet address (URL) to a web site providing details about the event
	 */
	public String getEventURLAddress() {
		return eventURLAddress;
	}
	
	/**
	 * Sets the Internet address (URL) to a web site providing details about the event.
	 *
	 * @param eventURLAddress the new Internet address (URL) to a web site providing details about the event
	 */
	public void setEventURLAddress(String eventURLAddress) {
		this.eventURLAddress = eventURLAddress;
	}
	
	/**
	 * Gets the optional text to be displayed for the URL of the event.
	 *
	 * @return the optional text to be displayed for the URL of the event
	 */
	public String getEventURLText() {
		return eventURLText;
	}
	
	/**
	 * Sets the optional text to be displayed for the URL of the event.
	 *
	 * @param eventURLText the new optional text to be displayed for the URL of the event
	 */
	public void setEventURLText(String eventURLText) {
		this.eventURLText = eventURLText;
	}
	
	/**
	 * Gets the email contact for the event.
	 *
	 * @return the email contact for the event
	 */
	public String getEventEmail() {
		return eventEmail;
	}
	
	/**
	 * Sets the email contact for the event.
	 *
	 * @param eventEmail the new email contact for the event
	 */
	public void setEventEmail(String eventEmail) {
		this.eventEmail = eventEmail;
	}
	
	/**
	 * Checks whether registration is required for an event.
	 *
	 * @return whether registration is required for an event
	 */
	public boolean isEventRegistrationRequired() {
		return eventRegistrationRequired;
	}
	
	/**
	 * Sets whether registration is required for an event.
	 *
	 * @param eventRegistrationRequired whether registration is required for an event
	 */
	public void setEventRegistrationRequired(boolean eventRegistrationRequired) {
		this.eventRegistrationRequired = eventRegistrationRequired;
	}
	
	/**
	 * Gets whether the event is ADA accessible.
	 *
	 * @return whether the event is ADA accessible
	 */
	public String getEventADAAccess() {
		return eventADAAccess;
	}
	
	/**
	 * Sets whether the event is ADA accessible.
	 *
	 * @param eventADAAccess the new value for whether the event is ADA accessible
	 */
	public void setEventADAAccess(String eventADAAccess) {
		this.eventADAAccess = eventADAAccess;
	}
	
	/**
	 * Gets the description of fees associated with the event.
	 *
	 * @return the description of fees associated with the event
	 */
	public String getEventFeeDescription() {
		return eventFeeDescription;
	}
	
	/**
	 * Sets the description of fees associated with the event.
	 *
	 * @param eventFeeDescription the new description of fees associated with the event
	 */
	public void setEventFeeDescription(String eventFeeDescription) {
		this.eventFeeDescription = eventFeeDescription;
	}
	
	/**
	 * Gets the optional comments about the event.
	 *
	 * @return the optional comments about the event
	 */
	public String getEventComments() {
		return eventComments;
	}
	
	/**
	 * Sets the optional comments about the event.
	 *
	 * @param eventComments the new optional comments about the event
	 */
	public void setEventComments(String eventComments) {
		this.eventComments = eventComments;
	}
	
	/**
	 * Gets the text that describes how often the event recurs.
	 *
	 * @return the text that describes how often the event recurs
	 */
	public String getEventFrequencyRateDescription() {
		return eventFrequencyRateDescription;
	}
	
	/**
	 * Sets the text that describes how often the event recurs.
	 *
	 * @param eventFrequencyRateDescription the new text that describes how often the event recurs
	 */
	public void setEventFrequencyRateDescription(
			String eventFrequencyRateDescription) {
		this.eventFrequencyRateDescription = eventFrequencyRateDescription;
	}
	
	/**
	 * Gets the text that describes the extent, capacity, and scale of an event.
	 *
	 * @return the text that describes the extent, capacity, and scale of an event
	 */
	public String getEventScopeDescription() {
		return eventScopeDescription;
	}
	
	/**
	 * Sets the text that describes the extent, capacity, and scale of an event.
	 *
	 * @param eventScopeDescription the new text that describes the extent, capacity, and scale of an event
	 */
	public void setEventScopeDescription(String eventScopeDescription) {
		this.eventScopeDescription = eventScopeDescription;
	}
	
	/**
	 * Gets the text that describes the type of event.
	 *
	 * @return the text that describes the type of event
	 */
	public String getEventTypeDescription() {
		return eventTypeDescription;
	}
	
	/**
	 * Sets the text that describes the type of event.
	 *
	 * @param eventTypeDescription the new text that describes the type of event
	 */
	public void setEventTypeDescription(String eventTypeDescription) {
		this.eventTypeDescription = eventTypeDescription;
	}
	
	/**
	 * Gets the full name of the sponsor for the event.
	 *
	 * @return the full name of the sponsor for the event
	 */
	public String getSponsorName() {
		return sponsorName;
	}
	
	/**
	 * Sets the full name of the sponsor for the event.
	 *
	 * @param sponsorName the new full name of the sponsor for the event
	 */
	public void setSponsorName(String sponsorName) {
		this.sponsorName = sponsorName;
	}
	
	/**
	 * Gets the sponsor email address for the event.
	 *
	 * @return the sponsor email address for the event
	 */
	public String getSponsorEmail() {
		return sponsorEmail;
	}
	
	/**
	 * Sets the sponsor email address for the event.
	 *
	 * @param sponsorEmail the new sponsor email address for the event
	 */
	public void setSponsorEmail(String sponsorEmail) {
		this.sponsorEmail = sponsorEmail;
	}
	
	/**
	 * Gets the Internet address (URL) to a website for the sponsor.
	 *
	 * @return the Internet address (URL) to a website for the sponsor
	 */
	public String getSponsorURLAddress() {
		return sponsorURLAddress;
	}
	
	/**
	 * Sets the Internet address (URL) to a website for the sponsor.
	 *
	 * @param sponsorURLAddress the new Internet address (URL) to a website for the sponsor
	 */
	public void setSponsorURLAddress(String sponsorURLAddress) {
		this.sponsorURLAddress = sponsorURLAddress;
	}
	
	/**
	 * Gets the end date for the event.
	 *
	 * @return the end date for the event
	 */
	public Date getEventEndDate() {
		return eventEndDate;
	}
	
	/**
	 * Sets the end date for the event.
	 *
	 * @param eventEndDate the new end date for the event
	 */
	public void setEventEndDate(Date eventEndDate) {
		this.eventEndDate = eventEndDate;
	}
	
	/**
	 * Gets the optional readable text for the URL sponsor link.
	 *
	 * @return the optional readable text for the URL sponsor link
	 */
	public String getSponsorURLText() {
		return sponsorURLText;
	}
	
	/**
	 * Sets the optional readable text for the URL sponsor link.
	 *
	 * @param sponsorURLText the new optional readable text for the URL sponsor link
	 */
	public void setSponsorURLText(String sponsorURLText) {
		this.sponsorURLText = sponsorURLText;
	}
	
	/**
	 * Gets the phone number for the sponsor of the event.
	 *
	 * @return the phone number for the sponsor of the event
	 */
	public String getSponsorPhone() {
		return sponsorPhone;
	}
	
	/**
	 * Sets the phone number for the sponsor of the event.
	 *
	 * @param sponsorPhone the new phone number for the sponsor of the event
	 */
	public void setSponsorPhone(String sponsorPhone) {
		this.sponsorPhone = sponsorPhone;
	}
	
	/**
	 * Gets the class and type of sponsor.
	 *
	 * @return the class and type of sponsor
	 */
	public String getSponsorClassType() {
		return sponsorClassType;
	}
	
	/**
	 * Sets the class and type of sponsor.
	 *
	 * @param sponsorClassType the new class and type of sponsor
	 */
	public void setSponsorClassType(String sponsorClassType) {
		this.sponsorClassType = sponsorClassType;
	}
	
	/**
	 * Gets the date the event was last updated in RIDB.
	 *
	 * @return the date the event was last updated in RIDB
	 */
	public Date getLastUpdatedDate() {
		return lastUpdatedDate;
	}
	
	/**
	 * Sets the date the event was last updated in RIDB.
	 *
	 * @param lastUpdatedDate the new date the event was last updated in RIDB
	 */
	public void setLastUpdatedDate(Date lastUpdatedDate) {
		this.lastUpdatedDate = lastUpdatedDate;
	}

}
