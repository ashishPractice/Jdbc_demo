package com.vastica.jdbcDemo.basic;

import com.vastica.jdbcDemo.Connection.ConnectionFactory;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;

public class DisplayDemo {

    public static void main(String[] args) {
        try (
                Connection con = ConnectionFactory.getConnection();
                Statement stmt = con.createStatement();
        ) {
            String query = "SELECT * FROM user_table";

            ResultSet rs = stmt.executeQuery(query);

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
