package com.backoffice.model.to;

public class ProductTO implements java.io.Serializable
{
	/**
	 * 
	 */
	private static final long serialVersionUID = -6250055717830519090L;

	private String id;
	
	private String name;
	
	private String type;
	
	private String state;
	
	private String value;
	
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public String getState() {
		return state;
	}
	public void setState(String state) {
		this.state = state;
	}
	public String getValue() {
		return value;
	}
	public void setValue(String value) {
		this.value = value;
	}
	
}