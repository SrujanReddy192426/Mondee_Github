
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
	String Email=request.getParameter("Email");
 	String phone=request.getParameter("phone");
	Long mobile=Long.parseLong("phone");
	String specialist=request.getParameter("Address");
	  String sql="insert into Doctor(Dname,password,Email,phone,specialist) values(?,?,?,?)";
		 PreparedStatement pst=con.prepareStatement(sql);
	     pst.setString(1, username);
	     pst.setString(2, password);
	     pst.setString(3, Email);
	     pst.setLong(4, mobile);
	     pst.setString(5, specialist);
	     int x=pst.executeUpdate();
	     if(x!=0)
	  response.sendRedirect("./Patient_Login.html");
   %>
</body>
</html>