package com.backoffice.model.to;

public class CustomerBackOfficeRequestTO implements java.io.Serializable {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = -1501487213655137174L;

	private String userId;
	
	
	private String servicePoint;
	
	private String id;
	
	private String idType;
	
	private String customerUserName;
	
	private String customerPassword;
	
	private String customerOTP;
	

	private String firstName;
	
	private String middleName;
	
	private String lastName;
	
	private String middleLastName;
	
	private String adminBlockCode;
	
	private String email;
	
	private String mobile;
	
	public String getCustomerUserName() {
		return customerUserName;
	}

	public void setCustomerUserName(String customerUserName) {
		this.customerUserName = customerUserName;
	}

	public String getCustomerPassword() {
		return customerPassword;
	}

	public void setCustomerPassword(String customerPassword) {
		this.customerPassword = customerPassword;
	}

	public String getCustomerOTP() {
		return customerOTP;
	}

	public void setCustomerOTP(String customerOTP) {
		this.customerOTP = customerOTP;
	}

	private String methodOfPayment;
	
	
	
	
	public String getMethodOfPayment() {
		return methodOfPayment;
	}

	public void setMethodOfPayment(String methodOfPayment) {
		this.methodOfPayment = methodOfPayment;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getMobile() {
		return mobile;
	}

	public void setMobile(String mobile) {
		this.mobile = mobile;
	}

	public String getAdminBlockCode() {
		return adminBlockCode;
	}

	public void setAdminBlockCode(String adminBlockCode) {
		this.adminBlockCode = adminBlockCode;
	}

	public String getServicePoint() {
		return servicePoint;
	}

	public void setServicePoint(String servicePoint) {
		this.servicePoint = servicePoint;
	}

	
	public String getUserId() {
		return userId;
	}

	public void setUserId(String userId) {
		this.userId = userId;
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
}
