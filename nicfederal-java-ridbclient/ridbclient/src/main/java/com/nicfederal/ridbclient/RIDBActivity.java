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
 * Data class representing recreational activities.
 *
 * @author NIC Federal
 */
@JsonIgnoreProperties(ignoreUnknown = true)
public class RIDBActivity {
	
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
	 * @param recActivityName the new activity name
	 */
	public void setActivityName(String recActivityName) {
		this.activityName = recActivityName;
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
	 * @param recActivityLevel the new activity level
	 */
	public void setActivityLevel(int recActivityLevel) {
		this.activityLevel = recActivityLevel;
	}
	
	/**
	 * Gets the activity parent id.
	 *
	 * @return the activity parent id
	 */
	public Integer getActivityParentID() {
		return activityParentID;
	}
	
	/**
	 * Sets the activity parent id.
	 *
	 * @param activityParentID the new activity parent id
	 */
	public void setActivityParentID(Integer activityParentID) {
		this.activityParentID = activityParentID;
	}
	
}
