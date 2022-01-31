 import java.sql.*;
public class connections
   {
		public static void main(String[] args) throws Exception{
			// TODO Auto-generated method stub
	           Class.forName("com.mysql.cj.jdbc.Driver");
	           String url="jdbc:mysql://localhost:3306/jarvis";
	           String username="root";
	           String password="Mysql@2627";
	           Connection co=DriverManager.getConnection(url,username,password);
	           Statement st=co.createStatement();
	           int i=st.executeUpdate("insert into emp values(1,'SrujanReddy','9866344602',30000)");
	              if(i!=0)
	              {
	            	  System.out.println("Recorded updated");
	              }
	              co.close();   
		}
   }

