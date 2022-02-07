
<html>
<body>
  <%@page import="java.sql.*"%>
  <%
    Connection con=null;
    Class.forName("com.mysql.cj.jdbc.Driver");
    String url="jdbc:mysql://localhost:3306/jarvis";
	String usrname="root";
	String pswd="Mysql@2627";
	con=DriverManager.getConnection(url, usrname, pswd);
	String username=request.getParameter("username");
	String password=request.getParameter("password");
	  String sql="select * from Doctor where Dname=? amd password=?";
		 PreparedStatement pst=con.prepareStatement(sql);
	     pst.setString(1, username);
	     pst.setString(2, password);
	     int x=pst.executeUpdate();
	     if(x!=0)
	  response.sendRedirect("./Patient_Home.html");
   %>
</body>
</html>