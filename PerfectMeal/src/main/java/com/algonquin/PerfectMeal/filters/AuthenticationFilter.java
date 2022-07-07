package com.algonquin.PerfectMeal.filters;

import java.io.IOException;

import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.http.HttpServletRequest;

public class AuthenticationFilter implements Filter {

	@Override
	public void doFilter(ServletRequest arg0, ServletResponse arg1, FilterChain arg2)
			throws IOException, ServletException {

		// get the servlet request and convert
		HttpServletRequest request = (HttpServletRequest) arg0;

		// filter only specific servlets
		// TODO: define servlets to filter out (user profile page, maybe email?)
		System.out.println(request.getRequestURI());

		// apply the filter chain. It will either go to the next filter, or to the
		// requested servlet.
		arg2.doFilter(request, arg1);
	}

}
