package com.gyf.backoffice.model;

import java.util.List;

import javax.faces.model.SelectItem;

import com.gyf.backoffice.model.lights.LightData;
import com.gyf.tools.presentacion.managed.CommonModel;

public class InitModel extends CommonModel {

	private LightData email;
	private LightData cellphone;
	private LightData suitableForReg;
	private LightData sarlaft;
	private LightData registry;
	private LightData initSession;
	private LightData habitTrx;
	private LightData securityQuestions;
	private LightData lockedForLogonAttemps;
	private LightData actualLogged;
	private LightData lockedByAdmin;
	private boolean loadContent;
	
	private String documentType;
	private String documentNumber;
	
	private String errorMsg;
	
	private String otpCode;
	private List<SelectItem> idTypeList;
	
	public InitModel() {

	}
	
	public LightData getEmail() {
		return email;
	}
	public void setEmail(LightData email) {
		this.email = email;
	}
	public LightData getCellphone() {
		return cellphone;
	}
	public void setCellphone(LightData cellphone) {
		this.cellphone = cellphone;
	}
	public LightData getSuitableForReg() {
		return suitableForReg;
	}
	public void setSuitableForReg(LightData suitableForReg) {
		this.suitableForReg = suitableForReg;
	}
	public LightData getSarlaft() {
		return sarlaft;
	}
	public void setSarlaft(LightData sarlaft) {
		this.sarlaft = sarlaft;
	}
	public LightData getRegistry() {
		return registry;
	}
	public void setRegistry(LightData registry) {
		this.registry = registry;
	}
	public LightData getInitSession() {
		return initSession;
	}
	public void setInitSession(LightData initSession) {
		this.initSession = initSession;
	}
	public LightData getHabitTrx() {
		return habitTrx;
	}
	public void setHabitTrx(LightData habitTrx) {
		this.habitTrx = habitTrx;
	}
	public LightData getSecurityQuestions() {
		return securityQuestions;
	}
	public void setSecurityQuestions(LightData securityQuestions) {
		this.securityQuestions = securityQuestions;
	}
	public LightData getLockedForLogonAttemps() {
		return lockedForLogonAttemps;
	}
	public void setLockedForLogonAttemps(LightData lockedForLogonAttemps) {
		this.lockedForLogonAttemps = lockedForLogonAttemps;
	}
	public LightData getActualLogged() {
		return actualLogged;
	}
	public void setActualLogged(LightData actualLogged) {
		this.actualLogged = actualLogged;
	}
	public LightData getLockedByAdmin() {
		return lockedByAdmin;
	}
	public void setLockedByAdmin(LightData lockedByAdmin) {
		this.lockedByAdmin = lockedByAdmin;
	}

	public String getErrorMsg() {
		return errorMsg;
	}

	public void setErrorMsg(String errorMsg) {
		this.errorMsg = errorMsg;
	}

	public String getOtpCode() {
		return otpCode;
	}

	public void setOtpCode(String otpCode) {
		this.otpCode = otpCode;
	}

	public boolean isLoadContent() {
		return loadContent;
	}

	public void setLoadContent(boolean loadContent) {
		this.loadContent = loadContent;
	}

	public String getDocumentType() {
		return documentType;
	}

	public void setDocumentType(String documentType) {
		this.documentType = documentType;
	}

	public String getDocumentNumber() {
		return documentNumber;
	}

	public void setDocumentNumber(String documentNumber) {
		this.documentNumber = documentNumber;
	}

	public List<SelectItem> getIdTypeList() {
		return idTypeList;
	}

	public void setIdTypeList(List<SelectItem> idTypeList) {
		this.idTypeList = idTypeList;
	}	
}
