package root;
import java.sql.*;
 
public class jdbc_example {
 
public static void main(String[] args)
{
 
try {
 
Class.forName("com.mysql.cj.jdbc.Driver"); // is a static method of the Class class used to load a class dynamically at runtime.
    
Connection con =DriverManager.getConnection("jdbc:mysql://localhost:3306/employee_db", "root", "Sweety@123");
 
Statement stmt=con.createStatement();
 
ResultSet rs=stmt.executeQuery(" select * from Emp_dbnew1");
 
while (rs.next())
{
 System.out.println(rs.getInt("Emp_id") + " " + rs.getString("First_Name"));
}
con.close();
}
 catch (Exception e)
   {
  System.out.println(e);
   }
}
 
}



	


