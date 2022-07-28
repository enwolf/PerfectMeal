package com.algonquin.PerfectMeal.filters;

import java.io.IOException;

import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

public class AuthenticationFilter implements Filter {

	@Override
	public void doFilter(ServletRequest arg0, ServletResponse arg1, FilterChain arg2)
			throws IOException, ServletException {
		HttpServletRequest request = (HttpServletRequest) arg0;
		HttpServletResponse response = (HttpServletResponse) arg1;

		System.out.println(request.getRequestURI());

		if (request.getRequestURI().startsWith("/PerfectMeal/recipes")) {
			HttpSession session = request.getSession();

			if (session.getAttribute("loginEmail") == null) {
				request.getRequestDispatcher("/index.jsp").forward(request, response);
				return;
			}

		}

		// do the filter and push to the next filter for filter chaining
		// TODO: Validate if 2nd filter is being hit even when having "return" above
		arg2.doFilter(request, response);
	}
}