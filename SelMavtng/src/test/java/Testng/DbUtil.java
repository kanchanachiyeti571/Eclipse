package Testng;



import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class DbUtil {

    public static Object[][] getSingleDatabaseRow() throws Exception {
        List<Object[]> data = new ArrayList<>();
        
        // ✅ Fixed: database name is employee_db, not root
        String dbUrl = "jdbc:mysql://localhost:3306/employee_db";
        String dbUser = "root";
        String dbPassword = "Sweety@571";
        String query = "SELECT username, password FROM login_test_data WHERE username = 'student'";
        
        try (Connection conn = DriverManager.getConnection(dbUrl, dbUser, dbPassword);
             Statement stmt = conn.createStatement();
             ResultSet rs = stmt.executeQuery(query)) {
            
            if (rs.next()) {
                String username = rs.getString("username");
                String password = rs.getString("password");
                data.add(new Object[]{username, password});
            }
            
        } catch (SQLException e) {
            e.printStackTrace();
            throw e;
        }
        
        return data.toArray(new Object[0][]);
    }
}