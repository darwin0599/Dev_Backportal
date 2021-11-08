package com.gyf.backoffice.model;

import com.gyf.tools.presentacion.managed.CommonModel;

public class CustomerBankAccountModel extends CommonModel
{
	private String fullName;
	
	private String idType;
	
	private String id;
	
	private String idTx;
	
	private BankAccountModel[] bankAccount;
	

	public String getIdTx() {
		return idTx;
	}

	public void setIdTx(String idTx) {
		this.idTx = idTx;
	}

	public String getFullName() {
		return fullName;
	}

	public void setFullName(String fullName) {
		this.fullName = fullName;
	}

	public String getIdType() {
		return idType;
	}

	public void setIdType(String idType) {
		this.idType = idType;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public BankAccountModel[] getBankAccount() {
		return bankAccount;
	}

	public void setBankAccount(BankAccountModel[] bankAccount) {
		this.bankAccount = bankAccount;
	}
	
	
}
