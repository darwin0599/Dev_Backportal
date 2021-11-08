package com.backoffice.vo;

public class DeleteCustomerVO 
{
	public DeleteCustomerVO(){}
	
	public DeleteCustomerVO(String id, String idType, String userId) {
		super();
		this.id = id;
		this.idType = idType;
		this.userId = userId;
	}

	private String id;
	
	private String idType;
	
	private String userId;
	

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

	public String getUserId() {
		return userId;
	}

	public void setUserId(String userId) {
		this.userId = userId;
	}
	
	
}
