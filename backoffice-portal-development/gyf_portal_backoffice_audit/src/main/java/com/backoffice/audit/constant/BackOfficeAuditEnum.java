package com.backoffice.audit.constant;

public enum BackOfficeAuditEnum 
{
	EMAILANDMOBILEINFORMATION( "emailAndMobileInformation" , "TABLERO_CONTROL" ),
	GETPRODUCTSBYCUSTOMER("getProductsByCustomer" , "VISTA360"),
	INQUIRYPSEINFORMATION("inquiryPseInformation" , "PSE"),
	INQUIRYBANKACCOUNT("inquiryBankAccount", "MATRICULA"),
	SENDOTPDIFFUSEREMAIL("sendOTPDiffuserEmail", "OTP_EMAIL"),
	SENDOTPDIFFUSERESMS("sendOTPDiffuserSMS", "OTP_SMS"),
	UPDATEUNLOCKADMINBLOCK("updateUnlockAdminBlock" , "UNLOCK_ADMIN_BLOCK"),
	UPDATEADMINBLOCK("updateAdminBlock" , "ADMIN_BLOCK"),
	DELETECUSTOMER("deleteCustomer", "CUSTOMER_DEL");
	
	
	BackOfficeAuditEnum( String methodCode, String tableCode  )
	{
		this.methodCode = methodCode;
		this.tableCode = tableCode;
	}
	
	
	private String methodCode;
	
	private String tableCode;
	

	public String getMethodCode() {
		return methodCode;
	}

	public void setMethodCode(String methodCode) {
		this.methodCode = methodCode;
	}

	public String getTableCode() {
		return tableCode;
	}

	public void setTableCode(String tableCode) {
		this.tableCode = tableCode;
	}
	
	
	public static BackOfficeAuditEnum fromValue(String v) 
	{
		for (BackOfficeAuditEnum c : BackOfficeAuditEnum.values()) {
			if (c.methodCode.equals(v)) {
				return c;
			}
		}
		return null;
	}
}
