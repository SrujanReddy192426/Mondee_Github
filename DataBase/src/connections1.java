import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class connections1 {
	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		// TODO Auto-generated method stub
        Class.forName("com.mysql.cj.jdbc.Driver");
        String url="jdbc:mysql://localhost:3306/jarvis";
        String username="root";
        String password="Mysql@2627";
        Connection con=DriverManager.getConnection(url, username, password);
        if(con!=null)
        	System.out.println("Connection Established");
          Statement st=con.createStatement();
         int x=st.executeUpdate("create table EMP values(eid int(10), ename varchar(20),eno varchar(20),esal varchar(20))");
          if(x!=0)
       	   System.out.println("Record Inserted");
        
         int j=st.executeUpdate("insert into EMP values(1,'SrujanReddy','9866344602','25000')");
           if(j!=0)
        	   System.out.println("Record Inserted");
           ResultSet rs=st.executeQuery("Select * from EMP");
           while(rs.next()) {
        	   System.out.println(rs.getInt(1)+" "+rs.getString(2)+" "+rs.getString(3)+" "+rs.getString(4));
           }
	}
}
           