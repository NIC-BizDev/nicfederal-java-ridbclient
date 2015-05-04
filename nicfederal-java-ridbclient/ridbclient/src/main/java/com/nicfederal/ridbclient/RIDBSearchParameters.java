package com.nicfederal.ridbclient;

import java.util.Date;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

@JsonIgnoreProperties(ignoreUnknown = true)
public class RIDBSearchParameters {
	@JsonProperty("QUERY")
	private String query;
	
	@JsonProperty("OFFSET")
    private Float offsetFromJson;
    
	@JsonProperty("LIMIT")
	private Float limitFromJson;
	
	@JsonProperty("LASTUPDATED")
	@JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "YYYY-MM-dd")
	private Date lastUpdated;
	
	@JsonProperty("STATE")
	private String stateList;
	
	@JsonProperty("ACTIVITY")
	private String activityList;
	
	@JsonProperty("LONGITUDE")
	private Double longitude;
	
	@JsonProperty("LATITUDE")
	private Double latitude;
	
	@JsonProperty("RADIUS")
	private Double radius;

	public String getQuery() {
		return query;
	}

	public void setQuery(String query) {
		this.query = query;
	}

	public Float getOffsetFromJson() {
		return offsetFromJson;
	}
	
	public Integer getOffset()
	{
		if (offsetFromJson == null) return null;
		return new Integer(offsetFromJson.intValue());
	}

	public void setOffsetFromJson(Float offsetFromJson) {
		this.offsetFromJson = offsetFromJson;
	}
	
	public void setOffset(Integer offset)
	{
		if (offset != null)
			this.offsetFromJson = new Float(offset.floatValue());
		else
			this.offsetFromJson = null;
	}

	public Float getLimitFromJson() {
		return limitFromJson;
	}
	
	public Integer getLimit()
	{
		if (limitFromJson == null) return null;
		return new Integer(limitFromJson.intValue());
	}

	public void setLimitFromJson(Float limitFromJson) {
		this.limitFromJson = limitFromJson;
	}
	
	public void setLimit(Integer limit)
	{
		if (limit != null)
			this.limitFromJson = new Float(limit.floatValue());
		else
			this.limitFromJson = null;
	}

	public Date getLastUpdated() {
		return lastUpdated;
	}

	public void setLastUpdated(Date lastUpdated) {
		this.lastUpdated = lastUpdated;
	}

	public String getStateList() {
		return stateList;
	}

	public void setStateList(String stateList) {
		this.stateList = stateList;
	}

	public String getActivityList() {
		return activityList;
	}

	public void setActivityList(String activityList) {
		this.activityList = activityList;
	}

	public Double getLongitude() {
		return longitude;
	}

	public void setLongitude(Double longitude) {
		this.longitude = longitude;
	}

	public Double getLatitude() {
		return latitude;
	}

	public void setLatitude(Double latitude) {
		this.latitude = latitude;
	}

	public Double getRadius() {
		return radius;
	}

	public void setRadius(Double radius) {
		this.radius = radius;
	}
}
