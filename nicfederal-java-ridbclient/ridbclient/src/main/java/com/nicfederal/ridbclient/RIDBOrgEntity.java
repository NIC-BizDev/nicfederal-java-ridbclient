package com.nicfederal.ridbclient;

/**
 * @author aford_000
 *
 */
public class RIDBOrgEntity {
/*
 *  EntityID	INT		N	RecArea ID or Facility ID
	EntityType	STRING	1024	N	"Facility" or "RecArea"
	OrgID	INT		N	The organization ID
 */
	private int entityID;
	private String entityType;
	private int orgID;
	public int getEntityID() {
		return entityID;
	}
	public void setEntityID(int entityID) {
		this.entityID = entityID;
	}
	public String getEntityType() {
		return entityType;
	}
	public void setEntityType(String entityType) {
		this.entityType = entityType;
	}
	public int getOrgID() {
		return orgID;
	}
	public void setOrgID(int orgID) {
		this.orgID = orgID;
	}
	
	
	
}
