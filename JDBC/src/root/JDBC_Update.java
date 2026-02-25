package root;
import java.sql.*;

public class JDBC_Update {
    public static void main(String[] args) {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/employee_db", "root", "Aswani@10");
            Statement stmt = con.createStatement();

            int id = 1; // Employee ID to update
            double salary = 780000.0; // New Salary

            String query = "UPDATE employee SET Salary = " + salary + " WHERE Employee_id = " + id;
            int rowsAffected = stmt.executeUpdate(query);

            //if (rowsAffected > 0) {
           // System.out.println("Employee data updated successfully!");
            //} else {
           // System.out.println("Employee not found!");
            //}

            con.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}

