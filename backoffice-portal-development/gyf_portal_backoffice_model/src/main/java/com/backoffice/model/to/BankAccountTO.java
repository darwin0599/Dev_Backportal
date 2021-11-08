package com.backoffice.model.to;

public class BankAccountTO implements java.io.Serializable 
{
	/**
	 * 
	 */
	private static final long serialVersionUID = 7457681841976761546L;
	
	private String accountNumber;
	private String accountType;
	private String accountClass;
	private String system;
	private String product;
	private String currency;
	private String agency;
	private String overDraft;
	private String availableBalanace;
	private String tradeBalance;
	private String bankCode;
	private String state;
	private String operation;
	private String bankName;
	private String alias;
	
	
	public String getAccountNumber() {
		return accountNumber;
	}
	public void setAccountNumber(String accountNumber) {
		this.accountNumber = accountNumber;
	}
	public String getAccountType() {
		return accountType;
	}
	public void setAccountType(String accountType) {
		this.accountType = accountType;
	}
	public String getAccountClass() {
		return accountClass;
	}
	public void setAccountClass(String accountClass) {
		this.accountClass = accountClass;
	}
	public String getSystem() {
		return system;
	}
	public void setSystem(String system) {
		this.system = system;
	}
	public String getProduct() {
		return product;
	}
	public void setProduct(String product) {
		this.product = product;
	}
	public String getCurrency() {
		return currency;
	}
	public void setCurrency(String currency) {
		this.currency = currency;
	}
	public String getAgency() {
		return agency;
	}
	public void setAgency(String agency) {
		this.agency = agency;
	}
	public String getOverDraft() {
		return overDraft;
	}
	public void setOverDraft(String overDraft) {
		this.overDraft = overDraft;
	}
	public String getAvailableBalanace() {
		return availableBalanace;
	}
	public void setAvailableBalanace(String availableBalanace) {
		this.availableBalanace = availableBalanace;
	}
	public String getTradeBalance() {
		return tradeBalance;
	}
	public void setTradeBalance(String tradeBalance) {
		this.tradeBalance = tradeBalance;
	}
	public String getBankCode() {
		return bankCode;
	}
	public void setBankCode(String bankCode) {
		this.bankCode = bankCode;
	}
	public String getState() {
		return state;
	}
	public void setState(String state) {
		this.state = state;
	}
	public String getOperation() {
		return operation;
	}
	public void setOperation(String operation) {
		this.operation = operation;
	}
	public String getBankName() {
		return bankName;
	}
	public void setBankName(String bankName) {
		this.bankName = bankName;
	}
	public String getAlias() {
		return alias;
	}
	public void setAlias(String alias) {
		this.alias = alias;
	}
	
}