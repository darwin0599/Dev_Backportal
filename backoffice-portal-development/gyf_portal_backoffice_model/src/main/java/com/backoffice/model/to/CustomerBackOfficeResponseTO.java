package com.backoffice.model.to;

import java.util.List;

public class CustomerBackOfficeResponseTO implements java.io.Serializable {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 3143445400108309507L;
	
	private String userId;
	
	private String servicePoint;
	
	private String id;
	
	private String idType;
	
	private String email;
	
	private boolean emailFlag;

	private String mobile;
	
	private boolean mobileFlag;
	
	private boolean available;
	
	private boolean registredFlag;
	
	private boolean lockLoginFlag;
	
	private boolean complianceListFlag;
	
	private String complianceListCode;
	
	private String complianceListDescription;
	
	private String sessionInit;
	
	private String registredInit;
	
	private boolean sessionInitFlag;
	
	private String currentSession;
	
	private boolean currentSessionFlag;
	
	private String adminBlockCode;
	
	private boolean adminBlockCodeFlag;
	
	private boolean habitsFlag;
	
	private boolean securityQuestionsFlag;
	
	private boolean otpDiffuserSent;
	
	private List<ProductTO> productList;
	
	private BankAccountTO[] bankAccountList;
	
	private PseTO[] pseList;
	
	private String firstName;
	
	private String middleName;
	
	private String lastName;
	
	private String middleLastName;	
	
	private List<ValueDomainElementTO> valueDomainElement;
	
	
	public List<ValueDomainElementTO> getValueDomainElement() {
		return valueDomainElement;
	}

	public void setValueDomainElement(List<ValueDomainElementTO> valueDomainElement) {
		this.valueDomainElement = valueDomainElement;
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

	public PseTO[] getPseList() {
		return pseList;
	}

	public void setPseList(PseTO[] pseList) {
		this.pseList = pseList;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public boolean isEmailFlag() {
		return emailFlag;
	}

	public void setEmailFlag(boolean emailFlag) {
		this.emailFlag = emailFlag;
	}

	public String getMobile() {
		return mobile;
	}

	public void setMobile(String mobile) {
		this.mobile = mobile;
	}

	public boolean isMobileFlag() {
		return mobileFlag;
	}

	public void setMobileFlag(boolean mobileFlag) {
		this.mobileFlag = mobileFlag;
	}

	public boolean isAvailable() {
		return available;
	}

	public void setAvailable(boolean available) {
		this.available = available;
	}

	public boolean isRegistredFlag() {
		return registredFlag;
	}

	public void setRegistredFlag(boolean registredFlag) {
		this.registredFlag = registredFlag;
	}

	public boolean isComplianceListFlag() {
		return complianceListFlag;
	}

	public void setComplianceListFlag(boolean complianceListFlag) {
		this.complianceListFlag = complianceListFlag;
	}

	public String getComplianceListCode() {
		return complianceListCode;
	}

	public void setComplianceListCode(String complianceListCode) {
		this.complianceListCode = complianceListCode;
	}

	public String getComplianceListDescription() {
		return complianceListDescription;
	}

	public void setComplianceListDescription(String complianceListDescription) {
		this.complianceListDescription = complianceListDescription;
	}

	public String getSessionInit() {
		return sessionInit;
	}

	public void setSessionInit(String sessionInit) {
		this.sessionInit = sessionInit;
	}

	public boolean isSessionInitFlag() {
		return sessionInitFlag;
	}

	public void setSessionInitFlag(boolean sessionInitFlag) {
		this.sessionInitFlag = sessionInitFlag;
	}

	public String getCurrentSession() {
		return currentSession;
	}

	public void setCurrentSession(String currentSession) {
		this.currentSession = currentSession;
	}

	public boolean isCurrentSessionFlag() {
		return currentSessionFlag;
	}

	public void setCurrentSessionFlag(boolean currentSessionFlag) {
		this.currentSessionFlag = currentSessionFlag;
	}

	public String getAdminBlockCode() {
		return adminBlockCode;
	}

	public void setAdminBlockCode(String adminBlockCode) {
		this.adminBlockCode = adminBlockCode;
	}

	public boolean isAdminBlockCodeFlag() {
		return adminBlockCodeFlag;
	}

	public void setAdminBlockCodeFlag(boolean adminBlockCodeFlag) {
		this.adminBlockCodeFlag = adminBlockCodeFlag;
	}
	
	public boolean isHabitsFlag() {
		return habitsFlag;
	}

	public void setHabitsFlag(boolean habitsFlag) {
		this.habitsFlag = habitsFlag;
	}

	public boolean isSecurityQuestionsFlag() {
		return securityQuestionsFlag;
	}

	public void setSecurityQuestionsFlag(boolean securityQuestionsFlag) {
		this.securityQuestionsFlag = securityQuestionsFlag;
	}

	public boolean isOtpDiffuserSent() {
		return otpDiffuserSent;
	}

	public void setOtpDiffuserSent(boolean otpDiffuserSent) {
		this.otpDiffuserSent = otpDiffuserSent;
	}

	public List<ProductTO> getProductList() {
		return productList;
	}

	public void setProductList(List<ProductTO> productList) {
		this.productList = productList;
	}

	public BankAccountTO[] getBankAccountList() {
		return bankAccountList;
	}

	public void setBankAccountList(BankAccountTO[] bankAccountList) {
		this.bankAccountList = bankAccountList;
	}

	public boolean isLockLoginFlag() {
		return lockLoginFlag;
	}

	public void setLockLoginFlag(boolean lockLoginFlag) {
		this.lockLoginFlag = lockLoginFlag;
	}

	public String getRegistredInit() {
		return registredInit;
	}

	public void setRegistredInit(String registredInit) {
		this.registredInit = registredInit;
	}
	
}
