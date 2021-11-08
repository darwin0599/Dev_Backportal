package com.gyf.backoffice.mapping;

import com.backoffice.model.to.CustomerBackOfficeRequestTO;
import com.backoffice.model.to.CustomerBackOfficeResponseTO;
import com.backoffice.model.to.ProductTO;
import com.backoffice.model.to.PseTO;
import com.gyf.backoffice.model.ProductsModel;
import com.gyf.backoffice.model.PseModel;
import com.gyf.backoffice.model.SessionContextModel;
import com.gyf.log.LogWriter;

public class CustomerProductsMapping 
{
	
	public static CustomerBackOfficeRequestTO getProductsByCustomerMapping( SessionContextModel sessionContext )
	{
		final String METHOD_NAME = "getProductsByCustomerMapping";
		CustomerBackOfficeRequestTO backOfficeRequest = null;
		
		try 
		{
			backOfficeRequest = new CustomerBackOfficeRequestTO();
			backOfficeRequest.setId(sessionContext.getId());
			backOfficeRequest.setIdType(sessionContext.getIdType());
			backOfficeRequest.setServicePoint(sessionContext.getServicePoint());
			backOfficeRequest.setUserId(sessionContext.getUserId());
			
			return backOfficeRequest;
		} catch (Exception e) 
		{
			LogWriter.writeErrorLog(e, e.getMessage(), METHOD_NAME);
		}
		
		return null;
	}
	
	
	public static ProductsModel[] getProductsByCustomerResponseMapping(CustomerBackOfficeResponseTO customerBackOffice)
	{
		final String METHOD_NAME = "getProductsByCustomerResponseMapping";
		ProductsModel[] products = null;
		try 
		{
			if(customerBackOffice != null && 
					customerBackOffice.getProductList() != null && customerBackOffice.getProductList().size() > 0)
			{
				products = new ProductsModel[customerBackOffice.getProductList().size()];
				int contador = 0; 
				for( ProductTO itemProduct : customerBackOffice.getProductList() )
				{
					products[contador] = new ProductsModel();
					products[contador].setProductName(itemProduct.getName());
					products[contador].setTotalValue(itemProduct.getValue());
					products[contador].setTotalValueLabel(itemProduct.getType());
					products[contador].setId(itemProduct.getId());
					contador ++;
				}
			}
			
			return products;
		} catch (Exception e) 
		{
			LogWriter.writeErrorLog(e, e.getMessage(), METHOD_NAME);
		}
		return null;
	}
	
	
	public static PseModel[] getPSEInformationResponseMapping(CustomerBackOfficeResponseTO customerBackOffice)
	{
		final String METHOD_NAME = "getProductsByCustomerResponseMapping";
		PseModel[] products = null;
		try 
		{
			if(customerBackOffice != null && 
					customerBackOffice.getPseList() != null && customerBackOffice.getPseList().length > 0)
			{
				products = new PseModel[customerBackOffice.getPseList().length];
				int contador = 0; 
				for( PseTO itemProduct : customerBackOffice.getPseList() )
				{
					products[contador] = new PseModel();
					products[contador].setMethodOfPayment(itemProduct.getMethodOfPayment());
					products[contador].setNotificationAttempts(itemProduct.getNotificationAttempts());
					products[contador].setNotificationStatus(itemProduct.getNotificationStatus());
					products[contador].setOperationDae(itemProduct.getOperationDae());
					products[contador].setStatus(itemProduct.getStatus());
					products[contador].setType(itemProduct.getType());
					products[contador].setUserId(itemProduct.getUserId());
					contador ++;
				}
			}
			
			return products;
		} catch (Exception e) 
		{
			LogWriter.writeErrorLog(e, e.getMessage(), METHOD_NAME);
		}
		return null;
	}
	
	
	
}
