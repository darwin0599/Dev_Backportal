package com.gyf.backoffice.model;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import javax.faces.model.SelectItem;

import com.backoffice.model.to.ReportApprovalStateTO;
import com.gyf.backoffice.constants.CreditCardStatus;
import com.gyf.tools.presentacion.managed.CommonModel;

public class CreditCardModel extends CommonModel {

	
	private String customerFullName;
	private String customerIdType;
	private String customerIdNumber;
	
	private Date startDate;
	private Date endDate;
	private String state;
	
	private List<SelectItem> stateOptions;
	
	private List<ReportApprovalStateTO> records;

	public String getCustomerFullName() {
		return customerFullName;
	}

	public void setCustomerFullName(String customerFullName) {
		this.customerFullName = customerFullName;
	}

	public String getCustomerIdType() {
		return customerIdType;
	}

	public void setCustomerIdType(String customerIdType) {
		this.customerIdType = customerIdType;
	}

	public String getCustomerIdNumber() {
		return customerIdNumber;
	}

	public void setCustomerIdNumber(String customerIdNumber) {
		this.customerIdNumber = customerIdNumber;
	}

	public Date getStartDate() {
		return startDate;
	}

	public void setStartDate(Date startDate) {
		this.startDate = startDate;
	}

	public Date getEndDate() {
		return endDate;
	}

	public void setEndDate(Date endDate) {
		this.endDate = endDate;
	}

	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
	}

	public List<ReportApprovalStateTO> getRecords() {
		return records;
	}

	public void setRecords(List<ReportApprovalStateTO> records) {
		this.records = records;
	}

	public List<SelectItem> getStateOptions() {
		if( this.stateOptions == null || this.stateOptions.isEmpty() ) {
			this.stateOptions = new ArrayList<SelectItem>();
			this.stateOptions.add(new SelectItem("", "Seleccione"));
			for( CreditCardStatus st : CreditCardStatus.values() ) {
				this.stateOptions.add(new SelectItem(st.getValue(), st.getValue()));
			}
		}
		return this.stateOptions;
	}

	public void setStateOptions(List<SelectItem> stateOptions) {
		this.stateOptions = stateOptions;
	}	
}
