package com.start;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebFilter;

/**
 * Servlet Filter implementation class MyFilter1
 */
@WebFilter({ "/MyFilter1", "/MyServlet1" })
public class MyFilter1 implements Filter {

    /**
     * Default constructor. 
     */
    public MyFilter1() {
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
	
	/**
	 * @see Filter#init(FilterConfig)
	 */
	public void init(FilterConfig arg0) throws ServletException {}  
    
	public void doFilter(ServletRequest req, ServletResponse resp,  
	        FilterChain chain) throws IOException, ServletException {  
	          
	    PrintWriter out=resp.getWriter();  
	          
	    String password=req.getParameter("password");  
	    if(password.equals("admin")){  
	    chain.doFilter(req, resp);//sends request to next resource  
	    }  
	    else{  
	    out.print("username or password error!");  
	    RequestDispatcher rd=req.getRequestDispatcher("index6.html");  
	    rd.include(req, resp);  
	    }  
}}
