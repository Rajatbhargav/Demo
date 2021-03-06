package com.start;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Enumeration;

import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebInitParam;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class DemoServlet1
 */
@WebServlet(
		urlPatterns = { "/DemoServlet1" }, 
		initParams = { 
				@WebInitParam(name = "username", value = "system"),
				@WebInitParam(name="password", value="oracle")
		})
public class DemoServlet1 extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
	public void doGet(HttpServletRequest request, HttpServletResponse response)  
		    throws ServletException, IOException {  
		  
		    response.setContentType("text/html");  
		    PrintWriter out = response.getWriter();  
		      
		    ServletConfig config=getServletConfig();  
		    Enumeration<String> e=config.getInitParameterNames();  
	          
		    String str="";  
		    while(e.hasMoreElements()){  
		    str=e.nextElement();  
		    out.print("<br>Name: "+str);  
		    out.print(" value: "+config.getInitParameter(str));  
		    }  
		          
		    out.close();  
		}  

}
