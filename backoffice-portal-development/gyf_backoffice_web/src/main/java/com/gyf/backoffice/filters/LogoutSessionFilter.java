package com.gyf.backoffice.filters;

import java.io.IOException;
import java.util.logging.Logger;

import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import com.gyf.log.LogWriter;

public class LogoutSessionFilter implements Filter {

	public void destroy() {

	}
	
	public Logger log = Logger.getLogger(getClass().toString());

	public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain)
			throws IOException, ServletException {
		
		log.info("I'm in LogoutSessionFilter");

		try {

			LogWriter.writeLog("iniciando cierre de sesion", "doFilter");
			LogWriter.writeLog("cierre sesion: revisando el request", "doFilter");
			if (request instanceof HttpServletRequest) {
				HttpServletRequest httpRequest = (HttpServletRequest) request;

				// Get the existing session.
				LogWriter.writeLog("cierre sesion: obtiene la sesion actual", "doFilter");
				HttpSession session = httpRequest.getSession(false);

				// Invalidate the existing session.
				LogWriter.writeLog("cierre sesion: sesion actual " + session, "doFilter");
				if (session != null) {
					LogWriter.writeLog("cierre sesion: invalidando la sesion", "doFilter");
					session.invalidate();
				}
			}

		} catch (Exception e) {
			LogWriter.writeErrorLog(e.getMessage(), "doFilter");
		}

		if (request instanceof HttpServletRequest) {
			HttpServletRequest httpRequest = (HttpServletRequest) request;
			// Create a new session for the user.
			LogWriter.writeLog("cierre sesion: creando sesion nueva vacia", "doFilter");
			httpRequest.getSession(true);
		}

		// ejecuta la pagina
		LogWriter.writeLog("cierre sesion: ejecutando la siguiente pagina", "doFilter");
		chain.doFilter(request, response);

	}

	public void init(FilterConfig filterConfig) throws ServletException {

	}
}