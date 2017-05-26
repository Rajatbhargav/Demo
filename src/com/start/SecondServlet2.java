package com.start;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class SecondServlet2
 */
@WebServlet("/SecondServlet2")
public class SecondServlet2 extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public SecondServlet2() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
    public void doGet(HttpServletRequest request, HttpServletResponse response)  {
    try{  
    response.setContentType("text/html");  
    PrintWriter out = response.getWriter();  
      
    //Getting the value from the hidden field  
    String n=request.getParameter("uname");  
    out.print("Hello "+n);  

    out.close();  
            }catch(Exception e){System.out.println(e);}  
}

}
