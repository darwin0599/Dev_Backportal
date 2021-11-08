package com.gyf.backoffice.mapping;

import java.util.regex.Pattern;

import com.backoffice.model.to.BankAccountTO;
import com.backoffice.model.to.CustomerBackOfficeResponseTO;
import com.gyf.backoffice.model.BankAccountModel;
import com.gyf.backoffice.model.CustomerBankAccountModel;
import com.gyf.backoffice.model.SessionContextModel;
import com.gyf.log.LogWriter;

public class CustomerBankAccountMapping 
{
	
	public static CustomerBankAccountModel inquiryBankAccountResponse(CustomerBackOfficeResponseTO customerBackOffice, final SessionContextModel context)
	{
		final String METHOD_NAME = "inquiryBankAccountResponse";
		
		CustomerBankAccountModel customerBankAccount = null;
		BankAccountModel[] bankAccount = null;
		try 
		{
			customerBankAccount = new CustomerBankAccountModel();
			
			
			customerBankAccount.setFullName(context.getCustomerFullName());
			customerBankAccount.setId(context.getId());
			customerBankAccount.setIdType(context.getIdType());
			
			
			if( customerBackOffice.getBankAccountList() != null && customerBackOffice.getBankAccountList().length > 0 )
			{
				int contador = 0;
				bankAccount = new BankAccountModel[customerBackOffice.getBankAccountList().length];
				for( BankAccountTO itemBankAccount : customerBackOffice.getBankAccountList() )
				{
					bankAccount[contador] = new BankAccountModel();
					
					bankAccount[contador].setState(itemBankAccount.getState());
					bankAccount[contador].setCurrency(itemBankAccount.getCurrency());
					bankAccount[contador].setAccountNumber(itemBankAccount.getAccountNumber());
					bankAccount[contador].setAccountType(itemBankAccount.getAccountType());
					bankAccount[contador].setAccountClass(itemBankAccount.getAccountClass());
					bankAccount[contador].setSystem(itemBankAccount.getSystem());
					bankAccount[contador].setProduct(itemBankAccount.getProduct());
					bankAccount[contador].setAgency(itemBankAccount.getAgency());
					bankAccount[contador].setOverDraft(itemBankAccount.getOverDraft());
					bankAccount[contador].setAvailableBalanace(itemBankAccount.getAvailableBalanace());
					bankAccount[contador].setTradeBalance(itemBankAccount.getTradeBalance());
					bankAccount[contador].setBankCode(itemBankAccount.getBankCode());
					bankAccount[contador].setOperation(itemBankAccount.getOperation());
					bankAccount[contador].setBankName(itemBankAccount.getBankName());
					bankAccount[contador].setAlias(itemBankAccount.getAlias());
					
					String temp = itemBankAccount.getOverDraft();
					if(temp!= null && temp.split(Pattern.quote("|"),-1).length>=5)
					{
						String [] tempArray = temp.split(Pattern.quote("|"),-1);
						bankAccount[contador].setOwnerId(tempArray[0] + " " + tempArray[1]);
						bankAccount[contador].setOwnerName(tempArray[2] + " " + tempArray[4]);
					}
					
					
					
					
					contador++;
				}
				customerBankAccount.setBankAccount(bankAccount);
				
			}
			
			return customerBankAccount;
		} catch (Exception e) 
		{
			LogWriter.writeErrorLog(e, e.getMessage(),METHOD_NAME);
		}
		
		return null;
	}

}
