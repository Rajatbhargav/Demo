package com.start;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class DemoServlet
 */
@WebServlet("/DemoServlet")
public class DemoServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
	public void doGet(HttpServletRequest req,HttpServletResponse res)  
			throws ServletException,IOException  
			{  
			res.setContentType("text/html");  
			PrintWriter pw=res.getWriter();  
			  
			res.sendRedirect("http://www.google.com");  
			  
			pw.close();  
			}

}
