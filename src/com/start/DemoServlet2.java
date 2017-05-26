package com.start;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Enumeration;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class DemoServlet2
 */
//@WebServlet("/DemoServlet2")
public class DemoServlet2 extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
	public void doGet(HttpServletRequest req,HttpServletResponse res)  
			throws ServletException,IOException  
			{  
			res.setContentType("text/html");  
			PrintWriter pw=res.getWriter();  
			  
			//creating ServletContext object  
			ServletContext context=getServletContext();  
			  
			Enumeration<String> e=context.getInitParameterNames();  
		      
			String str="";  
			while(e.hasMoreElements()){  
			    str=e.nextElement();  
			    pw.print("<br> "+context.getInitParameter(str));  
			}    
			}

}
