package com.backoffice.vo;

public class CustomerRegistredVO implements java.io.Serializable
{
	
	public CustomerRegistredVO()
	{}
	
	
	public CustomerRegistredVO(String id, String idType, String registerDate) {
		super();
		this.id = id;
		this.idType = idType;
		this.setRegisterDate(registerDate);
	}


	private String id;
	
	private String idType;
	
	private boolean register;
	
	private String registerDate;

	public boolean isRegister() {
		return register;
	}

	public void setRegister(boolean register) {
		this.register = register;
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


	public String getRegisterDate() {
		return registerDate;
	}


	public void setRegisterDate(String registerDate) {
		this.registerDate = registerDate;
	}
	
}