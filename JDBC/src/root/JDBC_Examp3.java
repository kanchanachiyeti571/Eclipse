package root;
import java.sql.*;

public class JDBC_Examp3 {
    public static void main(String[] args) {
        try {
            // Load the MySQL JDBC driver
            Class.forName("com.mysql.cj.jdbc.Driver");
            
            // Establish a connection
            try (Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/employee_db", "root", "Aswani@10")) {
                // Create a statement to call the stored procedure
                try (CallableStatement cs = con.prepareCall("{call GetAllEmployees()}")) {
                    // Execute the query
                    try (ResultSet rs = cs.executeQuery()) {
                        // Process the result set
                        while (rs.next()) {
                            System.out.println(rs.getInt("Employee_id") + " - " + rs.getString("First_Name"));
                        }
                    }
                }
            }
        } catch (ClassNotFoundException e) {
            System.out.println("MySQL JDBC driver not found.");
        } catch (SQLException e) {
            System.out.println("SQL Exception: " + e.getMessage());
        }
    }
}

