package com.backoffice.integration;

import java.text.MessageFormat;
import java.util.Hashtable;

import javax.naming.Context;
import javax.naming.NamingEnumeration;
import javax.naming.directory.Attributes;
import javax.naming.directory.DirContext;
import javax.naming.directory.InitialDirContext;
import javax.naming.directory.SearchControls;
import javax.naming.directory.SearchResult;

import com.gyf.constants.ConstantesSeverity;
import com.gyf.exception.ApplicationException;
import com.gyf.exception.ControlApplicationException;
import com.gyf.exception.mngr.ExceptionManager;
import com.gyf.exception.model.ErrorModelControlException;
import com.gyf.log.LogWriter;

/**
 * De la NASA ! B-)
 * @author 
 * 		paul.orozco@arkangroupco.com
 *
 */
public class BackOfficeLDAPDelegate extends UtilDelegate
{
	private final static String CLASS_NAME ="com.backoffice.integration.BackOfficeLDAPDelegate";
	
	public void deleteCustomerFromLdap( String customerId )throws ApplicationException,ControlApplicationException
	{
		final String METHOD_NAME = "deleteCustomerFromLdap";
		DirContext dirContext = null;
		try 
		{
			Hashtable<String, String> environmentVar = new Hashtable<String, String>() ;

			environmentVar.put(Context.INITIAL_CONTEXT_FACTORY,"com.sun.jndi.ldap.LdapCtxFactory");
			environmentVar.put(Context.PROVIDER_URL,  LDAP_URL) ;
			environmentVar.put(Context.SECURITY_AUTHENTICATION,  CONNECTION_TYPE) ;
			environmentVar.put(Context.SECURITY_PRINCIPAL,  LDAP_USERNAME ) ;
			environmentVar.put(Context.SECURITY_CREDENTIALS,  LDAP_PASSWORD) ;
			dirContext = new InitialDirContext(environmentVar) ;  
			LogWriter.writeLog("Conecting to URL=[" +LDAP_URL+ "]-  Username=[" +LDAP_USERNAME+"]", METHOD_NAME);
			
			if( searchCustomer(dirContext, customerId) )
			{
				LogWriter.writeLog("Cliente [" + customerId +"] existe en el LDAP", METHOD_NAME);
				
				deleteCustomer(dirContext, customerId);
				
				LogWriter.writeLog("Se elimina Cliente [" + customerId +"] del LDAP", METHOD_NAME);
				
			}else
			{
				LogWriter.writeLog("Cliente [" + customerId +"] NO existe en el LDAP", METHOD_NAME);
				
				ErrorModelControlException controlException = new ErrorModelControlException();
				controlException.setErrorCode("LDAP001");
				controlException.setSeverity(ConstantesSeverity.ERROR);
				controlException.setErrorMessage("No se encontraron datos en el LDAP para " + customerId);
				throw new ControlApplicationException(new ErrorModelControlException[]{controlException});
			}
			
		} catch (Exception e) 
		{
			ExceptionManager.controlApplicationExceptionEjb3(e,
					CLASS_NAME, METHOD_NAME, e.getMessage(), ConstantesSeverity.FATAL);
		}finally
		{
			try 
			{
				dirContext.close();
			} catch (Exception e2) 
			{
				LogWriter.writeErrorLog(e2, e2.getMessage() , METHOD_NAME);
			}
		}
	}
	
	
	private boolean searchCustomer (DirContext dirContex, String customerId) throws ApplicationException
	{
		final String METHOD_NAME = "searchCustomer";
		NamingEnumeration<SearchResult> answer = null;
		try 
		{
			String url= MessageFormat.format(LDAP_UID, customerId);
			String searchFilter = MessageFormat.format(SEARCH_FILTER, customerId);
			SearchControls searchCtls = new SearchControls();
			searchCtls.setSearchScope(SearchControls.SUBTREE_SCOPE);
			searchCtls.setReturningAttributes(new String []
					{"cn", "gyf-primer-apellido","gyf-primer-nombre","gyf-tipo-documento" , "gyf-documento"});
			answer = dirContex.search(url, searchFilter,searchCtls);
			
			while (answer.hasMoreElements())
			{
				SearchResult sr = (SearchResult) answer.next();
				Attributes attrs = sr.getAttributes();
				if (attrs != null)
				{
					return true;
				}
			}
			
			return false;
		} catch (Exception e) 
		{
			ExceptionManager.controlApplicationException(e,
					CLASS_NAME, METHOD_NAME, e.getMessage(), ConstantesSeverity.FATAL);
		}finally
		{
			if(answer != null )
			{
				try {
					answer.close();
				} catch (Exception e2) 
				{
					LogWriter.writeErrorLog(e2, e2.getMessage() , METHOD_NAME);
				}
			}
		}
		
		return false;
	}

	
	
	
	private void deleteCustomer(DirContext dirContex, String customerId) throws ApplicationException
	{
		final String METHOD_NAME = "deleteCustomer";
		try 
		{
			String url= MessageFormat.format(LDAP_UID, customerId);
			dirContex.destroySubcontext(url);
			
		} catch (Exception e) 
		{
			ExceptionManager.controlApplicationException(e,
					CLASS_NAME, METHOD_NAME, e.getMessage(), ConstantesSeverity.FATAL);
		}
	}
}
