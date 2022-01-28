package com;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebFilter;

/**
 * Servlet Filter implementation class ValidateFilter1
 */
@WebFilter(servletNames = { "AccountDashboard" })
public class ValidateFilter1 implements Filter {

    /**
     * Default constructor. 
     */
    public ValidateFilter1() {
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see Filter#destroy()
	 */
	public void destroy() {
		// TODO Auto-generated method stub
	}

	/**
	 * @see Filter#doFilter(ServletRequest, ServletResponse, FilterChain)
	 */
	public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain) throws IOException, ServletException {
		String pan=request.getParameter("pan");
		System.out.println("Hii from filter");
		if(pan==null || !pan.matches("{A-Z){3}{0-9}{3}{A-Z}{1}")){
		PrintWriter out=response.getWriter();
		request.getRequestDispatcher("filter.html").include(request,response);
		out.println("<SPAN style='color:red'>Invalid PAN No.</SPAN>");
	}else{
		request.setAttribute("pan",pan);
		
		System.out.println("Bye from Filter");

	}
}
	public void init(FilterConfig fConfig) throws ServletException {
		// TODO Auto-generated method stub
	}

}
