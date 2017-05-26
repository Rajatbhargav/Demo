package com.start;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebFilter;
import javax.servlet.annotation.WebInitParam;

/**
 * Servlet Filter implementation class MyFilter2
 */
@WebFilter(
		urlPatterns = { 
				"/MyFilter2", 
				"/MyServlet2"
		}, 
		initParams = { 
				@WebInitParam(name = "construction", value = "no")
		})
public class MyFilter2 implements Filter {

    /**
     * Default constructor. 
     */
    public MyFilter2() {
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see Filter#destroy()
	 */
    FilterConfig config;  
    
    public void init(FilterConfig config) throws ServletException {  
        this.config=config;  
    }  
      
    public void doFilter(ServletRequest req, ServletResponse resp,  
        FilterChain chain) throws IOException, ServletException {  
          
        PrintWriter out=resp.getWriter();  
              
        String s=config.getInitParameter("construction");  
              
        if(s.equals("yes")){  
             out.print("This page is under construction");  
        }  
        else{  
             chain.doFilter(req, resp);//sends request to next resource  
        }  
              
    }  
    public void destroy() {}  
    }  


