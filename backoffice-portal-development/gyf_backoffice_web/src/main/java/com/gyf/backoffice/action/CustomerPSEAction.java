package com.gyf.backoffice.action;

import java.util.Date;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;
import javax.faces.event.ActionEvent;

import org.primefaces.context.RequestContext;

import com.backoffice.model.to.CustomerBackOfficeResponseTO;
import com.gyf.backoffice.delegate.BackOfficeDelegate;
import com.gyf.backoffice.mapping.CustomerProductsMapping;
import com.gyf.backoffice.model.CustomerPSEModel;
import com.gyf.backoffice.model.CustomerProductsModel;
import com.gyf.backoffice.model.ProductsModel;
import com.gyf.backoffice.model.PseModel;
import com.gyf.backoffice.model.SessionContextModel;
import com.gyf.constants.ConstantesSeverity;
import com.gyf.exception.ControlApplicationException;
import com.gyf.exception.model.ErrorModelControlException;
import com.gyf.tools.presentacion.backing.ActionUtil;
import com.gyf.tools.presentacion.exception.PresentationException;

@ManagedBean(name = "CustomerPSEAction")
@SessionScoped
public class CustomerPSEAction extends ActionUtil {

	private BackOfficeDelegate delegate = null;
	private SessionContextModel context = null;
	private CustomerPSEModel model = null;

	public CustomerPSEAction() {
		this.delegate = new BackOfficeDelegate();
		model = new CustomerPSEModel();
//		context = new SessionContextModel();
//		context.setCustomerFullName("Paul F. Orozco Grisales");
//		context.setId("67021045");
//		context.setIdType("CC");
//		context.setServicePoint("274");
//		context.setUserId("SQAPOROZCO");
		this.context = (SessionContextModel) super.obtenerDeSesion("SESSION_CONTEXT");
		this.model.setFullName(context.getCustomerFullName());
		this.model.setId(context.getId());
		this.model.setIdType(context.getIdType());
		
		this.model.setStartDateFilter(new Date());
		this.model.setEndDateFilter(new Date());
	}

	public void excetuteLoadPSEInfo() {
		try {
			if (this.model.getStartDateFilter().getTime() > this.model.getEndDateFilter().getTime()) {
				model.setPseList(null);
				ErrorModelControlException controlException = new ErrorModelControlException();
				controlException.setErrorCode("PSE000");
				controlException.setErrorMessage("La fecha inicial no puede ser mayor a la fecha final");
				controlException.setSeverity(ConstantesSeverity.ERROR);
				throw new ControlApplicationException(new ErrorModelControlException[] { controlException });
			}
			
			if (this.model.getEndDateFilter().getTime() > System.currentTimeMillis()) {
				model.setPseList(null);
				ErrorModelControlException controlException = new ErrorModelControlException();
				controlException.setErrorCode("PSE000");
				controlException.setErrorMessage("La fecha final no puede ser futura");
				controlException.setSeverity(ConstantesSeverity.ERROR);
				throw new ControlApplicationException(new ErrorModelControlException[] { controlException });
			}
			
			

			CustomerBackOfficeResponseTO customerBackOffice = this.delegate.inquiryPseInformation(
					CustomerProductsMapping.getProductsByCustomerMapping(context), this.model.getStartDateFilter(),
					this.model.getEndDateFilter(), this.model.getStateFilter());

			PseModel[] products = CustomerProductsMapping.getPSEInformationResponseMapping(customerBackOffice);

			if (products == null || products.length == 0) {
				model.setPseList(null);
				ErrorModelControlException controlException = new ErrorModelControlException();
				controlException.setErrorCode("PSE001");
				controlException.setErrorMessage("No se encontraron transacciones para el cliente");
				controlException.setSeverity(ConstantesSeverity.ERROR);
				throw new ControlApplicationException(new ErrorModelControlException[] { controlException });
			}
			model.setFullName(context.getCustomerFullName());
			model.setId(context.getId());
			model.setIdType(context.getIdType());
			model.setPseList(products);

		} catch (Exception e) {
			super.mostrarTablaDeErrores(this.model, e, "");
			if (!(e instanceof PresentationException)) {
				RequestContext.getCurrentInstance().execute("PF('errMsg').show()");
			}
		}
	}

	public CustomerPSEModel getModel() {
		return model;
	}
}
