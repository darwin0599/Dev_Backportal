package com.gyf.backoffice.constants;

public enum Light {

	WARNING("lightwarning.png", "Tooltip", "WARNING"),
	ERROR("lighterror.png", "Tooltip", "ERROR"),
	OK("lightok.png", "Tooltip", "OK"),
	MINUS("lightminus.png", "Tooltip", "MINUS"),
	PLUS("lightplus.png", "Tooltip", "PLUS"),
	OUT("lightout.png", "Tooltip", "OUT");
	
	
	private String image;
	private String description;
	private String name;
	
	private Light(String image, String description, String name) {
		this.image = image;
		this.description = description;
		this.name = name;
	}

	public String getImage() {
		return image;
	}

	public void setImage(String image) {
		this.image = image;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
}
