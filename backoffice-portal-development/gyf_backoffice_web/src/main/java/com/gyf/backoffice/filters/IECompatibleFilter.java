package com.gyf.backoffice.filters;

import java.io.IOException;
import java.util.logging.Logger;

import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.http.HttpServletResponse;

public class IECompatibleFilter implements Filter {

	public void destroy() {
	}
	public Logger log = Logger.getLogger(getClass().toString());


	public void doFilter(ServletRequest request, ServletResponse response, FilterChain filters)
			throws IOException, ServletException {
		log.info("I'm in IECompatibleFilter");

		((HttpServletResponse) response).setHeader("X-UA-Compatible", "IE=EmulateIE8");
		filters.doFilter(request, response);

	}

	public void init(FilterConfig arg0) throws ServletException {

	}

}
