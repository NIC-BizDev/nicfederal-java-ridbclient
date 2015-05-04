package com.nicfederal.ridbclient;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

@JsonIgnoreProperties(ignoreUnknown = true)
public class RIDBList <T> {
	@JsonProperty("RECDATA")
	private T[] data;
	
	@JsonProperty("METADATA")
	private RIDBListMetadata metadata;

	public T[] getData() {
		return data;
	}

	public void setData(T[] data) {
		this.data = data;
	}

	public RIDBListMetadata getMetadata() {
		return metadata;
	}

	public void setMetadata(RIDBListMetadata metadata) {
		this.metadata = metadata;
	}
	
	public int dataLength()
	{
		if (data == null) return 0;
		return data.length;
	}
}
