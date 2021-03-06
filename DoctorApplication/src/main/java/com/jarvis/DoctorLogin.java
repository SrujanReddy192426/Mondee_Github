 package com.jarvis;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import javax.servlet.ServletConfig;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

public class DoctorLogin extends HttpServlet {
	   Connection con=null;
	   PreparedStatement ps=null;
	public void init(ServletConfig conflig) {
		 
		 try {
			Class.forName("com.mysql.cj.jdbc.Driver");
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		 String url="jdbc:mysql://localhost:3306/jarvis";
	     String username="root";
	     String password="Mysql@2627";
	     try {
			con=DriverManager.getConnection(url, username, password);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public void doPost(HttpServletRequest request,HttpServletResponse response) throws IOException {
		 
		String username=request.getParameter("username");
		String password=request.getParameter("password");
		
		PrintWriter pw=response.getWriter();
		String sql="select * from doctor where dname=? and password=?";
		     try {
		    	ps=con.prepareStatement(sql);
		    	  ps.setString(1, username);
		    	  ps.setString(2, password);
		        HttpSession hs=request.getSession();
				ResultSet rs=ps.executeQuery();
				if(rs.next())
					hs.setAttribute("name", username);
		         hs.setAttribute("id", rs.getInt(1));
		         hs.setAttribute("specialist", rs.getString("specialist"));
			    response.sendRedirect("./doctor_home.html");
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
    }
}