package com.nicfederal.ridbclient;

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
 * Undocumented object type that is returned when accessing RIDB activities for recreation areas.  It contains
 * the basic activity information plus some additional fields.
 * 
 * @author NIC Federal
 */
public class RIDBRecAreaActivity {

	/** The activity id. */
	@JsonProperty("ActivityID")
	private int activityID;

	/** The activity name. */
	@JsonProperty("ActivityName")
	private String activityName;

	/** The activity level. Amount of physical exertion to be expected for a given activity such as hiking, swimming, etc */
	@JsonProperty("ActivityLevel")
	private int activityLevel;

	/** The activity id of the activity's parent. */
	@JsonProperty("ActivityParentID")
	private Integer activityParentID;
	
	/** The description of the fees associated with an activity at a recreation area. */
	@JsonProperty("RecAreaActivityFeeDescription")
	private String recAreaActivityFeeDescription;
	
	/** The description of the activity at a recreation area. */
	@JsonProperty("RecAreaActivityDescription")
	private String recAreaActivityDescription;

	/**
	 * Gets the activity id.
	 *
	 * @return the activity id
	 */
	public int getActivityID() {
		return activityID;
	}

	/**
	 * Sets the activity id.
	 *
	 * @param activityID the new activity id
	 */
	public void setActivityID(int activityID) {
		this.activityID = activityID;
	}

	/**
	 * Gets the activity name.
	 *
	 * @return the activity name
	 */
	public String getActivityName() {
		return activityName;
	}

	/**
	 * Sets the activity name.
	 *
	 * @param activityName the new activity name
	 */
	public void setActivityName(String activityName) {
		this.activityName = activityName;
	}

	/**
	 * Gets the activity level.
	 *
	 * @return the activity level
	 */
	public int getActivityLevel() {
		return activityLevel;
	}

	/**
	 * Sets the activity level.
	 *
	 * @param activityLevel the new activity level
	 */
	public void setActivityLevel(int activityLevel) {
		this.activityLevel = activityLevel;
	}

	/**
	 * Gets the activity id of the activity's parent.
	 *
	 * @return the activity id of the activity's parent
	 */
	public Integer getActivityParentID() {
		return activityParentID;
	}

	/**
	 * Sets the activity id of the activity's parent.
	 *
	 * @param activityParentID the new activity id of the activity's parent
	 */
	public void setActivityParentID(Integer activityParentID) {
		this.activityParentID = activityParentID;
	}

	/**
	 * Gets the description of the fees associated with an activity at a recreation area.
	 *
	 * @return the description of the fees associated with an activity at a recreation area
	 */
	public String getRecAreaActivityFeeDescription() {
		return recAreaActivityFeeDescription;
	}

	/**
	 * Sets the description of the fees associated with an activity at a recreation area.
	 *
	 * @param recAreaActivityFeeDescription the new description of the fees associated with an activity at a recreation area
	 */
	public void setRecAreaActivityFeeDescription(
			String recAreaActivityFeeDescription) {
		this.recAreaActivityFeeDescription = recAreaActivityFeeDescription;
	}

	/**
	 * Gets the description of the activity at a recreation area.
	 *
	 * @return the description of the activity at a recreation area
	 */
	public String getRecAreaActivityDescription() {
		return recAreaActivityDescription;
	}

	/**
	 * Sets the description of the activity at a recreation area.
	 *
	 * @param recAreaActivityDescription the new description of the activity at a recreation area
	 */
	public void setRecAreaActivityDescription(String recAreaActivityDescription) {
		this.recAreaActivityDescription = recAreaActivityDescription;
	}

}
