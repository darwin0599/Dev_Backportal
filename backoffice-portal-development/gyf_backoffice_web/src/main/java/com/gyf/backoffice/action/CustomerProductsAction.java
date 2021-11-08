package com.gyf.backoffice.action;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;
import javax.faces.event.ActionEvent;

import org.primefaces.context.RequestContext;

import com.backoffice.model.to.CustomerBackOfficeResponseTO;
import com.gyf.backoffice.delegate.BackOfficeDelegate;
import com.gyf.backoffice.mapping.CustomerProductsMapping;
import com.gyf.backoffice.model.CustomerProductsModel;
import com.gyf.backoffice.model.ProductsModel;
import com.gyf.backoffice.model.SessionContextModel;
import com.gyf.constants.ConstantesSeverity;
import com.gyf.exception.ControlApplicationException;
import com.gyf.exception.model.ErrorModelControlException;
import com.gyf.tools.presentacion.backing.ActionUtil;
import com.gyf.tools.presentacion.exception.PresentationException;

@ManagedBean(name="CustomerProductsAction")
@SessionScoped
public class CustomerProductsAction extends ActionUtil
{
	
	private BackOfficeDelegate delegate = null;
	private SessionContextModel context = null;
	private CustomerProductsModel model = null;
	
	public CustomerProductsAction()
	{
		this.delegate = new BackOfficeDelegate();
		model  = new CustomerProductsModel();
//		context = (SessionContextModel) FacesContext.getCurrentInstance().getExternalContext().getSessionMap().get("SESSION_CONTEXT");
//		context = new SessionContextModel();
//		context.setCustomerFullName("Paul F. Orozco Grisales  ");
//		context.setId("94541719");
//		context.setIdType("CC");
//		context.setServicePoint("274");
//		context.setUserId("SQAPOROZCO");
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
					this.delegate.getProductsByCustomer(CustomerProductsMapping.getProductsByCustomerMapping(context));
			
			ProductsModel[] products = CustomerProductsMapping.getProductsByCustomerResponseMapping(customerBackOffice);

			if( products == null || products.length == 0 )
			{
				ErrorModelControlException controlException = new ErrorModelControlException();
				controlException.setErrorCode("CP001");
				controlException.setErrorMessage("No se encontraron productos registrados para el cliente");
				controlException.setSeverity(ConstantesSeverity.ERROR);
				throw new ControlApplicationException(new ErrorModelControlException[]{controlException});
			}
			model.setFullName(context.getCustomerFullName());
			model.setId(context.getId());
			model.setIdType(context.getIdType());
			model.setProducts(products);
			
			
		} catch (Exception e) 
		{
			super.mostrarTablaDeErrores(this.model, e, "");
			if ( !(e instanceof PresentationException) )
			{
				RequestContext.getCurrentInstance().execute("PF('errMsg').show()");
			}
		}
	}
	
	public CustomerProductsModel getModel() {
		return model;
	}
}
