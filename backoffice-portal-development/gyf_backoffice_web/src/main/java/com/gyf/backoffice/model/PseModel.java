package com.gyf.backoffice.model;

import java.util.Calendar;
import java.util.Date;

public class PseModel implements java.io.Serializable
{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	private Date operationDae;
	
	private String type;
	
	private String methodOfPayment;
	
	private String status;
	
	private String notificationStatus;
	
	private String notificationAttempts;
	
	private String userId;

	

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public String getMethodOfPayment() {
		return methodOfPayment;
	}

	public void setMethodOfPayment(String methodOfPayment) {
		this.methodOfPayment = methodOfPayment;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public String getNotificationStatus() {
		return notificationStatus;
	}

	public void setNotificationStatus(String notificationStatus) {
		this.notificationStatus = notificationStatus;
	}

	public String getNotificationAttempts() {
		return notificationAttempts;
	}

	public void setNotificationAttempts(String notificationAttempts) {
		this.notificationAttempts = notificationAttempts;
	}

	public String getUserId() {
		return userId;
	}

	public void setUserId(String userId) {
		this.userId = userId;
	}

	public Date getOperationDae() {
		return operationDae;
	}

	public void setOperationDae(Date operationDae) {
		this.operationDae = operationDae;
	}
	
}
