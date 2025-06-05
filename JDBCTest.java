package xyz;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
public class JDBCTest {
    public static void main(String[] args) {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            try (Connection con = DriverManager.getConnection(
                    "jdbc:mysql://localhost:3306/testdb", "root", "Himabindu245");
                 PreparedStatement pstmt = con.prepareStatement("REPLACE INTO students VALUES(?,?)");
                 Statement stmt = con.createStatement()) {

                Object[][] students = {
                        {1, "Ayesha"},
                        {2, "Bhavitha"},
                        {3, "Caroline"},
                        {4, "Divya"},
                        {5, "Eliza"},
                        {6, "Fizza"},
                };
                for (Object[] student : students) {
                    pstmt.setInt(1, (int) student[0]);
                    pstmt.setString(2, (String) student[1]);
                    pstmt.executeUpdate();
                }
                try (ResultSet rs = stmt.executeQuery("SELECT * FROM students")) {
                    System.out.println("Students List:");
                    while (rs.next()) {
                        System.out.println(rs.getInt("id") + " " + rs.getString("name"));
                    }
                }
            } 
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}