package com.gyf.backoffice.model;

public class SessionContextModel 
{
	private String userId;
	
	private String servicePoint;
	
	private String id;
	
	private String idType;
	
	private String customerFullName;
	
	public String getCustomerFullName() {
		return customerFullName;
	}

	public void setCustomerFullName(String customerFullName) {
		this.customerFullName = customerFullName;
	}

	public String getUserId() {
		return userId;
	}

	public void setUserId(String userId) {
		this.userId = userId;
	}

	public String getServicePoint() {
		return servicePoint;
	}

	public void setServicePoint(String servicePoint) {
		this.servicePoint = servicePoint;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getIdType() {
		return idType;
	}

	public void setIdType(String idType) {
		this.idType = idType;
	}
}
