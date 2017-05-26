package com.start;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class DemoServlet3
 */
@WebServlet("/DemoServlet3")
public class DemoServlet3 extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
	public void doGet(HttpServletRequest req,HttpServletResponse res)  
	{  
	try{  
	  
	res.setContentType("text/html");  
	PrintWriter out=res.getWriter();  
	  
	ServletContext context=getServletContext();  
	context.setAttribute("company","startcareer");  
	  
	out.println("Welcome to first servlet");  
	out.println("<a href='DemoServlet4'>visit</a>");  
	out.close();  
	  
	}catch(Exception e){System.out.println(e);}  
	}
	  
}
