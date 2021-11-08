package com.gyf.backoffice.action;

import java.util.logging.Logger;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;
import javax.faces.event.ActionEvent;

import org.primefaces.context.RequestContext;

import com.backoffice.model.to.CustomerBackOfficeResponseTO;
import com.gyf.backoffice.delegate.BackOfficeDelegate;
import com.gyf.backoffice.mapping.CustomerBankAccountMapping;
import com.gyf.backoffice.mapping.CustomerProductsMapping;
import com.gyf.backoffice.model.CustomerBankAccountModel;
import com.gyf.backoffice.model.SessionContextModel;
import com.gyf.constants.ConstantesSeverity;
import com.gyf.exception.ControlApplicationException;
import com.gyf.exception.model.ErrorModelControlException;
import com.gyf.tools.presentacion.backing.ActionUtil;
import com.gyf.tools.presentacion.exception.PresentationException;

@ManagedBean(name="CustomerBankAccountAction")
@SessionScoped
public class CustomerBankAccountAction extends ActionUtil
{
	private BackOfficeDelegate delegate = null;
	private SessionContextModel context = null;
	private CustomerBankAccountModel model = null;
	Logger log = Logger.getLogger(getClass().toString());
	
	public CustomerBankAccountAction()
	{
		this.delegate = new BackOfficeDelegate();
		model  = new CustomerBankAccountModel();
		context = new SessionContextModel();
		log.info(String.format("CustomerBankAccountModel: %s, SessionContextModel: %s", model.equals(null),context.equals(null)));
		context.setCustomerFullName("Paul F. Orozco Grisales");
		context.setId("94541719");
		context.setIdType("CC");
		context.setServicePoint("274");
		context.setUserId("SQAPOROZCO");
		this.context = (SessionContextModel) super.obtenerDeSesion("SESSION_CONTEXT");
		this.model.setFullName(context.getCustomerFullName());
		this.model.setId(context.getId());
		this.model.setIdType(context.getIdType());
	}
	
	
	
	public void excetuteLoadProducts(ActionEvent ev)
	{
		try 
		{
			CustomerBackOfficeResponseTO customerBackOffice= 
					this.delegate.inquiryBankAccount(CustomerProductsMapping.getProductsByCustomerMapping(context));
			
			
			if( customerBackOffice.getBankAccountList() == null || customerBackOffice.getBankAccountList().length == 0 )
			{
				model.setBankAccount(null);
				ErrorModelControlException controlException = new ErrorModelControlException();
				controlException.setErrorCode("CP001");
				controlException.setErrorMessage("No se encontraron cuentas bancarias registradas para el cliente");
				controlException.setSeverity(ConstantesSeverity.ERROR);
				throw new ControlApplicationException(new ErrorModelControlException[]{controlException});
			}
			
			model = CustomerBankAccountMapping.inquiryBankAccountResponse(customerBackOffice, this.context);
			
		} catch (Exception e) 
		{
			super.mostrarTablaDeErrores(this.model, e, "");
			if ( !(e instanceof PresentationException) )
			{
				RequestContext.getCurrentInstance().execute("PF('errMsg').show()");
			}
		}
	}
	
	public CustomerBankAccountModel getModel() {
		return model;
	}
}
