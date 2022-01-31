import java.util.Scanner;
import java.sql.*;
class jdbcdemo1 {
          static Scanner s=new Scanner(System.in);
          static void insert(Statement st) throws SQLException {
  			System.out.println("Enter eid");
  			int eid = s.nextInt();
  			System.out.println("Enter ename");
  			String ename = s.next();
  			System.out.println("Enter eno");
  			String eno = s.next();
  			System.out.println("Enter esal");
  			int esal = s.nextInt();
  			int i = st.executeUpdate("insert into EMP values("+eid+",'"+ename+"',"+eno+","+esal+")");
  			if(i!= 0) {
  				System.out.println("Record Inserted");
  			}
  		}
  		static void delete(Statement st) throws SQLException{
  			System.out.println("Enter the eid that you want to delete :");
  			int eid = s.nextInt();
  			int x = st.executeUpdate("delete from EMP where eid="+eid+" ");
  			if(x != 0) {
  				System.out.println("Record Deleted");
  			}
  		}
  		static void select(Statement st) throws SQLException {
  			ResultSet rs = st.executeQuery("select * from EMP");
  			while(rs.next()) {
  				System.out.println(rs.getInt(1)+" "+rs.getString(2)+" "+rs.getString(3)+" "+rs.getString(4));
  			}	
  		}
  		static void update(Statement st) throws SQLException {
  			int j = st.executeUpdate("update EMP set esal=esal+"+5000+");
  			if(j!= 0) {
  				System.out.println("Record Updated");
  			}
  		}
  		public static void main(String args[]) throws ClassNotFoundException, SQLException {
  			Class.forName("com.mysql.cj.jdbc.Driver");
  			Connection co= DriverManager.getConnection("jdbc:mysql://localhost:3306/jarvis","root","Mysql@2627");
  			Statement st=co.createStatement();
  			while(true) {
  				System.out.println("Emp database........Enter your choice\n1.insert\n2.update\n3.delete\n4.select");
  				char ch= s.next().charAt(0);
  			
  				switch(ch) {
  				case '1' :
  					insert(st);
  					break;
  				case '2':
  					update(st);
  					break;
  				case '3' :
  					delete(st);
  					break;
  				case '4':
  					select(st);
  					break;
  				default:
  					System.out.println("INVALID OPTION");
  				}
  				System.out.println("To continue: y/n");
  				char cr=s.next().charAt(0);
  				System.out.println("want to continue:"+cr);
  				}
  		}
}

