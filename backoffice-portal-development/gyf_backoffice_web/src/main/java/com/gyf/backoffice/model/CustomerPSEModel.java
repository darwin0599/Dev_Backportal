package com.gyf.backoffice.model;

import java.util.Date;

import com.gyf.tools.presentacion.managed.CommonModel;

public class CustomerPSEModel extends CommonModel {
	
	private Date startDateFilter;
	private Date endDateFilter;
	private String stateFilter;

	private String fullName;

	private String idType;

	private String id;

	private String idTx;

	private PseModel[] pseList;

	public PseModel[] getPseList() {
		return pseList;
	}

	public void setPseList(PseModel[] pseList) {
		this.pseList = pseList;
	}

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

	public Date getStartDateFilter() {
		return startDateFilter;
	}

	public void setStartDateFilter(Date startDateFilter) {
		this.startDateFilter = startDateFilter;
	}

	public Date getEndDateFilter() {
		return endDateFilter;
	}

	public void setEndDateFilter(Date endDateFilter) {
		this.endDateFilter = endDateFilter;
	}

	public String getStateFilter() {
		return stateFilter;
	}

	public void setStateFilter(String stateFilter) {
		this.stateFilter = stateFilter;
	}


}
