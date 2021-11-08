package com.backoffice.vo;

public class CustomerExtraDataVO implements java.io.Serializable
{
	/**
	 * 
	 */
	private static final long serialVersionUID = -8494096277750976700L;

	
	public CustomerExtraDataVO(){}
	
	
	public CustomerExtraDataVO(String id, String idType) {
		super();
		this.id = id;
		this.idType = idType;
	}


	private String id;
	
	private String idType;
	
	private String sessionInit;
	
	private String currentSession;
	
	private String adminBlockCode;
	
	private String habits;
	
	private String securityQuestions;
	
	private String lockLogin;

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

	public String getSessionInit() {
		return sessionInit;
	}

	public void setSessionInit(String sessionInit) {
		this.sessionInit = sessionInit;
	}

	public String getCurrentSession() {
		return currentSession;
	}

	public void setCurrentSession(String currentSession) {
		this.currentSession = currentSession;
	}

	public String getAdminBlockCode() {
		return adminBlockCode;
	}

	public void setAdminBlockCode(String adminBlockCode) {
		this.adminBlockCode = adminBlockCode;
	}

	public String getHabits() {
		return habits;
	}

	public void setHabits(String habits) {
		this.habits = habits;
	}

	public String getSecurityQuestions() {
		return securityQuestions;
	}

	public void setSecurityQuestions(String securityQuestions) {
		this.securityQuestions = securityQuestions;
	}


	public String getLockLogin() {
		return lockLogin;
	}


	public void setLockLogin(String lockLogin) {
		this.lockLogin = lockLogin;
	}
	
}