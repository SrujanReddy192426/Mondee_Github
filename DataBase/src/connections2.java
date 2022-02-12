import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class connections2 {
	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		// TODO Auto-generated method stub
        Class.forName("com.mysql.cj.jdbc.Driver");
        String url="jdbc:mysql://localhost:3306/jarvis";
        String username="root";
        String password="Mysql@2627";
        Connection con=DriverManager.getConnection(url, username, password);
        if(con!=null)
        	System.out.println("Connection Established");
         PreparedStatement ps=con.prepareStatement("insert into EMP values(?,?,?,?)");
           ps.setInt(1, 1);
           ps.setString(2, "SrujanReddy");
           ps.setNString(3, "9866344602");
           ps.setNString(4, "25000");
           int x=ps.executeUpdate();
           if(x!=0)
                 System.out.println("Record Inserted");
          PreparedStatement pts=con.prepareStatement("update EMP set ename=?,eno=? where eid=?");
           pts.setString(1, "Snehankitha");
           pts.setNString(2, "9676824325");
           pts.setInt(3, 1);
           int i=pts.executeUpdate();
           if(i!=0)
                 System.out.println("Record updated");
           Statement st=con.createStatement();
           ResultSet rs=st.executeQuery("Select * from EMP");
           while(rs.next()) {
        	   System.out.println(rs.getInt(1)+" "+rs.getString(2)+" "+rs.getString(3)+" "+rs.getString(4));
           }
	}
}
           