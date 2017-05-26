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
 * Servlet implementation class DataBS
 */
@WebServlet("/DataBS")
public class DataBS extends HttpServlet {
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
			  
			String ename=request.getParameter("ename");//will return value  
			//pw.println("Welcome "+name);  
			  
			String salary=request.getParameter("salary");
			String bonus=request.getParameter("bonus");
			//step1 load the driver class  
			Class.forName("oracle.jdbc.driver.OracleDriver");  
			  
			//step2 create  the connection object  
			Connection con=DriverManager.getConnection(  
			"jdbc:oracle:thin:@localhost:1521:xe","system","start");  
			  
			//step3 create the statement object  
			Statement stmt=con.createStatement();  
			  
			
			int i=stmt.executeUpdate("insert into emp(eno,ename,salary,bonus)values('"+eno+"','"+ename+"','"+salary+"','"+bonus+"')");
			//int i=stmt.executeUpdate("insert into emp(eno,ename,salary,bonus)values(106,'siya',20000,2000)");
			
			//step4 execute query  
			ResultSet rs=stmt.executeQuery("select * from emp");  
			
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
				
			
				
			//step5 close the connection object  
			con.close();
			pw.close(); 
			  
			}catch(Exception e){ pw.println(e);}  
			  
	}

}
