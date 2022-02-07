package com.jarvis;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import javax.servlet.ServletConfig;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class DoctorRegister extends HttpServlet {

	Connection con=null;
	PreparedStatement pst=null;
	public void init(ServletConfig config)
	{
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
	
	  public void doPost(HttpServletRequest request , HttpServletResponse response) throws IOException {
	    	String username=request.getParameter("username");
	    	String password=request.getParameter("password");
	    	String Email=request.getParameter("Email");
	     	String phone=request.getParameter("phone");
	    	Long mobile=Long.parseLong("phone");
	    	String specialist=request.getParameter("specialist");
	    	
	    	    PrintWriter pw=response.getWriter();
	    	    String sql="insert into Doctor(Dname,password,Email,phone,specialist) values(?,?,?,?)";
	    	    try {
					pst=con.prepareStatement(sql);
				     pst.setString(1, username);
				     pst.setString(2, password);
				     pst.setString(3, Email);
				     pst.setLong(4, mobile);
				     pst.setString(5, specialist);
				     int x=pst.executeUpdate();
				     if(x!=0)
				  response.sendRedirect("./Doctor_Login.html");
				} catch (SQLException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
	    	  
	   }
}
	
