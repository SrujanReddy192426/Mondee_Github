<html>
<body>
    <h1 align="center">Welcome to Patient Home <br><br>
    <a href="applyappointment.jsp">Apply Appointment</a>
     <a href="appointment_applied.jsp">View Appointment</a>
      <a href="index.html">Logout</a>
   </h1>
     <%@page import="java.sql.*"%>
     <table border="2" width="400" height="200" align="center">
     <tr><td>id</td> <td>Patient Name</td><td>Date</td><td>Time</td><td>specialist</td><td>Doctor Name</td></tr>
    <%
      Connection con=null;
      Class.forName("com.mysql.cj.jdbc.Driver");
      String url="jdbc:mysql://localhost:3306/jarvis";
	     String user="root";
	     String pass="Mysql@2627";
	   con=DriverManager.getConnection(url, user, pass); 
	   PreparedStatement ps=con.prepareStatement("select * from appointment");
	    ResultSet rs=ps.executeQuery();
	    while(rs.next()){
	    	%>
	    	<tr>
	    	  <td><%=rs.getInt(1) %></td><td> <%=rs.getString("pname") %></td><td> <%=rs.getString("doa")%></td><td><%=rs.getInt("toa")%></td><td><%=rs.getString("specialist")%></td><td><%=rs.getString("status")%></td>
	    	    <td><%=rs.getString("dname") %></td>
	    	</tr>
          <% }%>
    </table>
</body>
</html>       