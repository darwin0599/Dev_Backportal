package com.gyf.backoffice.model.lights;

import java.io.Serializable;

public class LightData implements Serializable {

	private String label;
	private String imageName;	
	private String tooltip;
	private String firstName;	
	private String middleName;
	private String lastName;	
	private String middleLastName;
	private boolean registered;
	
	
	public LightData(String label, String imageName, String tooltip) {
		super();
		this.label = label;
		this.imageName = imageName;
		this.tooltip = tooltip;
	}
	
	public String getImageName() {
		return imageName;
	}
	public void setImageName(String imageName) {
		this.imageName = imageName;
	}
	public String getLabel() {
		return label;
	}
	public void setLabel(String label) {
		this.label = label;
	}
	public String getTooltip() {
		return tooltip;
	}
	public void setTooltip(String tooltip) {
		this.tooltip = tooltip;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getMiddleName() {
		return middleName;
	}

	public void setMiddleName(String middleName) {
		this.middleName = middleName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getMiddleLastName() {
		return middleLastName;
	}

	public void setMiddleLastName(String middleLastName) {
		this.middleLastName = middleLastName;
	}

	public boolean isRegistered() {
		return registered;
	}

	public void setRegistered(boolean registered) {
		this.registered = registered;
	}
	
}
