package com.start;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class FirstServlet1
 */
@WebServlet("/FirstServlet1")
public class FirstServlet1 extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public FirstServlet1() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
    public void doGet(HttpServletRequest request, HttpServletResponse response){  
        try{  
  
        response.setContentType("text/html");  
        PrintWriter out = response.getWriter();  
          
        String n=request.getParameter("userName");  
        out.print("Welcome "+n);  
          
        //creating form that have invisible textfield  
       // out.print("<form action='SecondServlet2'>");  
       // out.print("<input type='hidden' name='uname' value='"+n+"'>");  
        //out.print("<input type='submit' value='go'>");  
        //out.print("</form>");  
        out.print("<a href='SecondServlet2?uname="+n+"'>visit</a>");  
        out.close();  
  
                }catch(Exception e){System.out.println(e);}  
    }

}
