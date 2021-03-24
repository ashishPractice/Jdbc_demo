package com.vastica.jdbcDemo.basic;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class DBcreateDemo {


    public static final String DRIVER_NAME = "com.mysql.cj.jdbc.Driver";
    public static final String URL = "jdbc:mysql://localhost:3306/";
    public static final String USER_NAME = "root";
    public static final String PASSWORD = "@Shrestha";
    public static final String SQL = "CREATE DATABASE jdbc_demo_db";

    public static void main(String[] args) {

        Connection con = null;
        Statement stmt = null;

        try {
            // 1. loading the driver
            Class.forName(DRIVER_NAME);

            // 2. creating a connection
            con = DriverManager.getConnection(URL, USER_NAME, PASSWORD);

            // 3. Obtaining the statement
            stmt = con.createStatement();

            //4. Execute the query
            if(stmt.executeUpdate(SQL)>0){
                System.out.println("Database Created");
            }

        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            try {
                // 5. Closing the connection
                con.close();
                stmt.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }

        }


        if (con != null) {
            System.out.println("Successful in created the Connection");
        }

    }
}
