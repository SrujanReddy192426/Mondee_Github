  <%@page import="java.sql.*"%>
    <%
      Connection con=null;
      Class.forName("com.mysql.cj.jdbc.Driver");
      String url="jdbc:mysql://localhost:3306/jarvis";
	     String user="root";
	     String pass="Mysql@2627";
	   con=DriverManager.getConnection(url, user, pass);
	   String id=request.getParameter("id");
	    int aid=Integer.parseInt("id");
	    String dname=(String)session.getAttribute("name");
	    PreparedStatement ps=con.prepareStatement("update appointment set status=?,dname=? where aid=?");
	    ps.setString(1, "Accepted");
	    ps.setString(2, dname);
	    ps.setInt(3, aid);
	    int x=ps.executeUpdate();
	    if(x!=0)
	    	response.sendRedirect("view_appointmen.jsp");
     %>  