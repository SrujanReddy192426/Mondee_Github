
<html>
<body>
    <%@page import="java.sql.*"%>
    <%
      Connection con=null;
      Class.forName("com.mysql.cj.jdbc.Driver");
      String url="jdbc:mysql://localhost:3306/jarvis";
	     String user="root";
	     String pass="Mysql@2627";
	   con=DriverManager.getConnection(url, user, pass);
	   String username=request.getParameter("username");
		String password=request.getParameter("password");
		String email=request.getParameter("email");
		String phone=request.getParameter("phone");
		long mobile=Long.parseLong(phone);
		String address=request.getParameter("address");
		String sql="insert into patient(pname,email,password,phone,address) values(?,?,?,?,?)";
		PreparedStatement ps=con.prepareStatement(sql);
  	       ps.setString(1, username);
  	       ps.setString(2, email);
  	       ps.setString(3, password);
  	       ps.setLong(4, mobile);
  	       ps.setString(5, address);
  	     int x=ps.executeUpdate();
			if(x!=0)
			    response.sendRedirect("./patient_login.html");
    %>
</body>
</html>