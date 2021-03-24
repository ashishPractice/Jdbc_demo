package com.vastica.jdbcDemo.PreparedStatement;

import com.vastica.jdbcDemo.Connection.ConnectionFactory;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;

public class DisplayDemo {

    public static void main(String[] args) {
        String query = "SELECT * FROM user_table";
        try (
                Connection con = ConnectionFactory.getConnection();
                PreparedStatement pstmt = con.prepareStatement(query);
        ) {

            ResultSet rs = pstmt.executeQuery();

            while (rs.next()){
                System.out.println("=======================");
                System.out.println("Id: "+rs.getInt("Id"));
                System.out.println("Username: "+rs.getString("user_name"));
                System.out.println("Password: "+rs.getString("password"));
            }

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
