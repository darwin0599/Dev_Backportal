package com.gyf.backoffice.servlets;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.gyf.backoffice.constants.InitServicesEnum;
import com.gyf.constants.ConstantesSeverity;
import com.gyf.exception.ControlApplicationException;
import com.gyf.exception.model.ErrorModelControlException;
import com.gyf.tools.autenticacionsbi.constantes.AutenticacionConstantes;

public class Init extends HttpServlet
{
	/**
	 * 
	 */
	private final static String ERROR_PAGE = "error/error.xhtml";
	
	/**
	 * 
	 */
	private final static String MENU_PAGE =	"pages/init.xhtml";
	
	/**
	 * 
	 */
	private final static String NOSESSION_PAGE = "error/no_session.xhtml";
	
	/**
	 * Constructor of the object.
	 */
	public Init()
	{
		super();
	}

	/**
	 * The doGet method of the servlet. <br>
	 *
	 * This method is called when a form has its tag value method equals to get.
	 * 
	 * @param request the request send by the client to the server
	 * @param response the response send by the server to the client
	 * @throws ServletException if an error occurred
	 * @throws IOException if an error occurred
	 */
	public void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException
	{
		String elementosUrl = request.getParameter("params");
		
		try
		{
			request.getSession().setAttribute("RUTA", InitServicesEnum.INIT_SBI);
			
			// Valido que no haya datos de usuario en sesion
			String userInSession = (String)request.getSession().
					getAttribute(AutenticacionConstantes.CASHIER_IN_SESSION);
			if(userInSession != null && !userInSession.trim().equals(""))
			{
				response.sendRedirect(NOSESSION_PAGE);
				return;
			}
			
			if( elementosUrl != null && elementosUrl.trim().length() > 0 )
			{
				request.getSession().setAttribute("params", elementosUrl);
				response.sendRedirect(MENU_PAGE);
			}else
			{
				ErrorModelControlException [] controlExceptions = new ErrorModelControlException[1];
				controlExceptions[0] = new ErrorModelControlException();
				controlExceptions[0].setErrorCode("-1000");
				controlExceptions[0].setSeverity(ConstantesSeverity.FATAL);
				controlExceptions[0].setErrorMessage("Los parametros NO fueron suministrado");
				throw new ControlApplicationException(controlExceptions);
			}
		} catch (Exception e)
		{
			request.getSession().setAttribute("ERROR_OBJECT", e);
			response.sendRedirect(ERROR_PAGE);
		}
	}

	/**
	 * The doPost method of the servlet. <br>
	 *
	 * This method is called when a form has its tag value method equals to post.
	 * 
	 * @param request the request send by the client to the server
	 * @param response the response send by the server to the client
	 * @throws ServletException if an error occurred
	 * @throws IOException if an error occurred
	 */
	public void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException
	{
		doGet(request, response);
	}

}
