package com.backoffice.model.to;

public class BackOfficeAuditTO implements java.io.Serializable
{

	/**
	 * 
	 */
	private static final long serialVersionUID = -439655584106520011L;
	
	
	private String userName;
	
	private String servicePoint;
	
	private String action;
	
	private String idType;
	
	private String id;
	
	private String state;

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getServicePoint() {
		return servicePoint;
	}

	public void setServicePoint(String servicePoint) {
		this.servicePoint = servicePoint;
	}

	public String getAction() {
		return action;
	}

	public void setAction(String action) {
		this.action = action;
	}

	public String getIdType() {
		return idType;
	}

	public void setIdType(String idType) {
		this.idType = idType;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
	}
	
}