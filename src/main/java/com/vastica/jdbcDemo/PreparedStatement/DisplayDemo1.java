package com.vastica.jdbcDemo.PreparedStatement;

import com.vastica.jdbcDemo.Connection.ConnectionFactory;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class DisplayDemo1 {

    public static void main(String[] args) {
        String query = "SELECT * FROM user_table WHERE user_name=? AND password=?";
        try (
                Connection con = ConnectionFactory.getConnection();
                PreparedStatement pstmt = con.prepareStatement(query);
        ) {
            pstmt.setString(1, "ashish");
            pstmt.setString(2, "ashish");

            ResultSet rs = pstmt.executeQuery();



            while (rs.next()) {
                System.out.println("=======================");
                System.out.println("Id: " + rs.getInt("Id"));
                System.out.println("Username: " + rs.getString("user_name"));
                System.out.println("Password: " + rs.getString("password"));
            }

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
