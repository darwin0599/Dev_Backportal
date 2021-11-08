package com.backoffice.vo;

public class AdminBlockVO implements java.io.Serializable {

	private String id;
	
	private String idType;
	
	private String blockCode;
	
	public AdminBlockVO(){}
	

	public AdminBlockVO(String id, String idType, String blockCode) {
		super();
		this.id = id;
		this.idType = idType;
		this.blockCode = blockCode;
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

	public String getBlockCode() {
		return blockCode;
	}

	public void setBlockCode(String blockCode) {
		this.blockCode = blockCode;
	}
	
}