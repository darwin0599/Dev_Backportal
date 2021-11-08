package com.gyf.backoffice.action;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.concurrent.TimeUnit;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;

import org.primefaces.context.RequestContext;

import com.backoffice.model.to.ReportApprovalStateTO;
import com.gyf.backoffice.delegate.BackOfficeDelegate;
import com.gyf.backoffice.model.CreditCardModel;
import com.gyf.backoffice.model.SessionContextModel;
import com.gyf.tools.presentacion.backing.ActionUtil;
import com.gyf.tools.presentacion.exception.PresentationException;

@ManagedBean(name = "CreditCardAction")
@SessionScoped
public class CreditCardAction extends ActionUtil {

	private BackOfficeDelegate delegate = null;
	private SessionContextModel context = null;
	private CreditCardModel model = null;

	private static final SimpleDateFormat SDF = new SimpleDateFormat("dd-MM-yyyy hh:mm:ss aa");

	public CreditCardAction() {
		this.delegate = new BackOfficeDelegate();
		this.context = (SessionContextModel) super.obtenerDeSesion("SESSION_CONTEXT");
		this.model = new CreditCardModel();
		this.model.setCustomerFullName(this.context.getCustomerFullName());
		this.model.setCustomerIdType(this.context.getIdType());
		this.model.setCustomerIdNumber(this.context.getId());
	}

	public void initialLoad() {
		try {
			this.search(false);			
		} catch (Exception e) {
			this.manageException(e);
		}
	}
	
	public void search() {
		try {
			this.search(true);			
		} catch (Exception e) {
			this.manageException(e);
		}
	}
	
	private void search(boolean applyValidations) throws Exception {
		if(applyValidations) {
			this.validateFilterData();
		}
		this.model.setRecords(this.delegate.getCreditCardReport(this.buildFilter()));
	}

	private ReportApprovalStateTO buildFilter() throws Exception {
		ReportApprovalStateTO filter = new ReportApprovalStateTO();
		filter.setDocumento(this.context.getId());
		filter.setTipoDocumento(this.context.getIdType());
		filter.setFilterInitDate(this.buildCustomDate(this.model.getStartDate(), true));
		filter.setEndFilterDate(this.buildCustomDate(this.model.getEndDate(), false));
		filter.setEstado(this.model.getState());
		return filter;
	}

	private void validateFilterData() throws Exception {
		if (this.model.getStartDate() == null || this.model.getEndDate() == null
				|| (this.model.getState() == null || this.model.getState().isEmpty())) {
			throw new Exception("Todos los filtros son obligatorios.");
		} else {
			if (this.model.getStartDate().after(this.model.getEndDate())) {
				throw new Exception("La fecha inicial no puede ser mayor a la fecha final");
			} else if(!this.datesInRange(this.model.getEndDate(),this.model.getStartDate(), 365)) {
				throw new Exception("La consulta no puede ser mayor a 365 dias");				
			}

		}
	}

	private String buildCustomDate(Date date, boolean init) {
		if (date != null) {
			Calendar cal = Calendar.getInstance();
			cal.setTime(date);
			if (init) {
				cal.set(Calendar.HOUR_OF_DAY, 0);
				cal.set(Calendar.MINUTE, 0);
				cal.set(Calendar.SECOND, 0);
				cal.set(Calendar.MILLISECOND, 0);
			} else {
				cal.set(Calendar.HOUR_OF_DAY, 23);
				cal.set(Calendar.MINUTE, 59);
				cal.set(Calendar.SECOND, 59);
				cal.set(Calendar.MILLISECOND, 0);
			}
			return SDF.format(cal.getTime());
		}
		return null;
	}
	
	private boolean datesInRange( Date topDate, Date bottomDate, long limit) {
		long diffInMillies = Math.abs(topDate.getTime() - bottomDate.getTime());
		long diffInDays = TimeUnit.DAYS.convert(diffInMillies, TimeUnit.MILLISECONDS);
		return limit > diffInDays;
	}
	
	private void manageException(Exception e) {
		super.mostrarTablaDeErrores(this.model, e, "");
		if (!(e instanceof PresentationException)) {
			RequestContext.getCurrentInstance().execute("PF('errMsg').show()");
		}
	}

	public CreditCardModel getModel() {
		return model;
	}

	public void setModel(CreditCardModel model) {
		this.model = model;
	}	

}
