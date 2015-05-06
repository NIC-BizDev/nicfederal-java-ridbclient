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
 * Search parameters are used to refine a search to only certain results.  Not all search
 * parameters are supported by every search method.  Please consult the documentation for
 * the search method to see what parameters are supported.
 * 
 * @author NIC Federal
 */
@JsonIgnoreProperties(ignoreUnknown = true)
public class RIDBSearchParameters {
	
	/** The substring to use in a case-insensitive substring search of certain data fields on an object. */
	@JsonProperty("QUERY")
	private String query;
	
	/** The number of records to skip when accessing pages of results. */
	@JsonProperty("OFFSET")
    private Float offsetFromJson;
    
	/** The maximum number of results to return in the results page.  The maximum allowed and default value is 50. */
	@JsonProperty("LIMIT")
	private Float limitFromJson;
	
	/** The lower date range from search results. */
	@JsonProperty("LASTUPDATED")
	@JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "YYYY-MM-dd")
	private Date lastUpdated;
	
	/** The list of state abbreviations to use in filtering results. */
	@JsonProperty("STATE")
	private String stateList;
	
	/** The list of activity ids that will be used to filer results. */
	@JsonProperty("ACTIVITY")
	private String activityList;
	
	/** The longitude to use in a proximity search. */
	@JsonProperty("LONGITUDE")
	private Double longitude;
	
	/** The latitude to use in a proximity search. */
	@JsonProperty("LATITUDE")
	private Double latitude;
	
	/** The radius to use in matching against longitude and latitude. */
	@JsonProperty("RADIUS")
	private Double radius;

	/**
	 * Gets the substring to use in a case-insensitive substring search of certain data fields on an object.
	 *
	 * @return the substring to use in a case-insensitive substring search of certain data fields on an object
	 */
	public String getQuery() {
		return query;
	}

	/**
	 * Sets the substring to use in a case-insensitive substring search of certain data fields on an object.
	 *
	 * @param query the new substring to use in a case-insensitive substring search of certain data fields on an object
	 */
	public void setQuery(String query) {
		this.query = query;
	}

	/**
	 * Gets the number of records to skip when accessing pages of results.
	 *
	 * @return the number of records to skip when accessing pages of results
	 */
	public Float getOffsetFromJson() {
		return offsetFromJson;
	}
	
	/**
	 * Gets the offset.  The offset is the number of records to skip.
	 *
	 * @return the offset
	 */
	public Integer getOffset()
	{
		if (offsetFromJson == null) return null;
		return new Integer(offsetFromJson.intValue());
	}

	/**
	 * Sets the number of records to skip when accessing pages of results.
	 *
	 * @param offsetFromJson the new number of records to skip when accessing pages of results
	 */
	public void setOffsetFromJson(Float offsetFromJson) {
		this.offsetFromJson = offsetFromJson;
	}
	
	/**
	 * Sets the offset.  The offset is the number of records to skip.
	 *
	 * @param offset the new offset
	 */
	public void setOffset(Integer offset)
	{
		if (offset != null)
			this.offsetFromJson = new Float(offset.floatValue());
		else
			this.offsetFromJson = null;
	}

	/**
	 * Gets the maximum number of results to return in the results page.
	 *
	 * @return the maximum number of results to return in the results page
	 */
	public Float getLimitFromJson() {
		return limitFromJson;
	}
	
	/**
	 * Gets the limit.  The limit is the maximum number of records returned.
	 *
	 * @return the limit
	 */
	public Integer getLimit()
	{
		if (limitFromJson == null) return null;
		return new Integer(limitFromJson.intValue());
	}

	/**
	 * Sets the maximum number of results to return in the results page.
	 *
	 * @param limitFromJson the new maximum number of results to return in the results page
	 */
	public void setLimitFromJson(Float limitFromJson) {
		this.limitFromJson = limitFromJson;
	}
	
	/**
	 * Sets the limit.  The limit is the maximum number of results returned.
	 *
	 * @param limit the new limit
	 */
	public void setLimit(Integer limit)
	{
		if (limit != null)
			this.limitFromJson = new Float(limit.floatValue());
		else
			this.limitFromJson = null;
	}

	/**
	 * Gets the lower date range from search results.
	 *
	 * @return the lower date range from search results
	 */
	public Date getLastUpdated() {
		return lastUpdated;
	}

	/**
	 * Sets the lower date range from search results.
	 *
	 * @param lastUpdated the new lower date range from search results
	 */
	public void setLastUpdated(Date lastUpdated) {
		this.lastUpdated = lastUpdated;
	}

	/**
	 * Gets the list of state abbreviations to use in filtering results.
	 *
	 * @return the list of state abbreviations to use in filtering results
	 */
	public String getStateList() {
		return stateList;
	}

	/**
	 * Sets the list of state abbreviations to use in filtering results.
	 *
	 * @param stateList the new list of state abbreviations to use in filtering results
	 */
	public void setStateList(String stateList) {
		this.stateList = stateList;
	}

	/**
	 * Gets the list of activity ids that will be used to filer results.
	 *
	 * @return the list of activity ids that will be used to filer results
	 */
	public String getActivityList() {
		return activityList;
	}

	/**
	 * Sets the list of activity ids that will be used to filer results.
	 *
	 * @param activityList the new list of activity ids that will be used to filer results
	 */
	public void setActivityList(String activityList) {
		this.activityList = activityList;
	}

	/**
	 * Gets the longitude to use in a proximity search.
	 *
	 * @return the longitude to use in a proximity search
	 */
	public Double getLongitude() {
		return longitude;
	}

	/**
	 * Sets the longitude to use in a proximity search.
	 *
	 * @param longitude the new longitude to use in a proximity search
	 */
	public void setLongitude(Double longitude) {
		this.longitude = longitude;
	}

	/**
	 * Gets the latitude to use in a proximity search.
	 *
	 * @return the latitude to use in a proximity search
	 */
	public Double getLatitude() {
		return latitude;
	}

	/**
	 * Sets the latitude to use in a proximity search.
	 *
	 * @param latitude the new latitude to use in a proximity search
	 */
	public void setLatitude(Double latitude) {
		this.latitude = latitude;
	}

	/**
	 * Gets the radius to use in matching against longitude and latitude.
	 *
	 * @return the radius to use in matching against longitude and latitude
	 */
	public Double getRadius() {
		return radius;
	}

	/**
	 * Sets the radius to use in matching against longitude and latitude.
	 *
	 * @param radius the new radius to use in matching against longitude and latitude
	 */
	public void setRadius(Double radius) {
		this.radius = radius;
	}
}
