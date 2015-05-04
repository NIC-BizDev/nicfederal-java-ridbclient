package com.nicfederal.ridbclient;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * @author aford_000
 *
 */
@JsonIgnoreProperties(ignoreUnknown = true)
public class RIDBActivity {
/*
 *  ActivityID	INT		N	Activity ID
	RecActivityName	STRING	60	N	Name of the activity
	RecActivityLevel	INT		N	Amount of physical exertion to be expected for a given activity such as hiking, swimming, etc
 */
	
	@JsonProperty("ActivityID")
	private int activityID;

	@JsonProperty("ActivityName")
	private String activityName;

	@JsonProperty("ActivityLevel")
	private int activityLevel;

	@JsonProperty("ActivityParentID")
	private Integer activityParentID;
	
	public int getActivityID() {
		return activityID;
	}
	public void setActivityID(int activityID) {
		this.activityID = activityID;
	}
	public String getActivityName() {
		return activityName;
	}
	public void setActivityName(String recActivityName) {
		this.activityName = recActivityName;
	}
	public int getActivityLevel() {
		return activityLevel;
	}
	public void setActivityLevel(int recActivityLevel) {
		this.activityLevel = recActivityLevel;
	}
	public Integer getActivityParentID() {
		return activityParentID;
	}
	public void setActivityParentID(Integer activityParentID) {
		this.activityParentID = activityParentID;
	}
	
}
