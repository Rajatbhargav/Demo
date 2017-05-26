package com.start;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.Statement;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class DataBs1
 */
@WebServlet("/DataBs2")
public class DataBs2 extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response)  {
		
		PrintWriter pw=null;
		
		try{  
							
			response.setContentType("text/html");  
			 pw=response.getWriter();
			 
			 String eno=request.getParameter("eno");
			  
			
			//step1 load the driver class  
			Class.forName("oracle.jdbc.driver.OracleDriver");  
			  
			//step2 create  the connection object  
			Connection con=DriverManager.getConnection(  
			"jdbc:oracle:thin:@localhost:1521:xe","system","start");  
			  
			//step3 create the statement object  
			Statement stmt=con.createStatement();  
			  
					
			//step4 execute query  
			ResultSet rs=stmt.executeQuery("select * from emp where eno="+eno);  
			
			 pw.print("<table border='1' width='100%'");  
		        pw.print("<tr><th>Eno</th>"); 
		        pw.print("<th>EName</th>"); 
		        pw.print("<th>Salary</th>");  
		        pw.print("<th>Bonus</th></tr>");  
		        while(rs.next()){  
		         pw.print("<tr><td>"+rs.getString(1)+"</td>"); 
		         pw.print("<td>"+rs.getString(2)+"</td>");
		         pw.print("<td>"+rs.getString(3)+"</td>");
		         pw.print("<td>"+rs.getString(4)+"</td></tr>");
		        }  
				
			pw.print("<a href='index9.html'>"+"Back");
				
			//step5 close the connection object  
			con.close();
			pw.close(); 
			  
			}catch(Exception e){ pw.println(e);}  
			  
	}

}
