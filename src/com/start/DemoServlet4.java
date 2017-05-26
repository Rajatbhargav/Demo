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
 * Servlet implementation class DemoServlet4
 */
@WebServlet("/DemoServlet4")
public class DemoServlet4 extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public DemoServlet4() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
    public void doGet(HttpServletRequest req,HttpServletResponse res)  
    {  
    try{  
      
    res.setContentType("text/html");  
    PrintWriter out=res.getWriter();  
      
    ServletContext context=getServletContext();  
    String n=(String)context.getAttribute("company");  
      
    out.println("Welcome to "+n);  
    out.close();  
      
    }catch(Exception e){System.out.println(e);}  
	}

}
