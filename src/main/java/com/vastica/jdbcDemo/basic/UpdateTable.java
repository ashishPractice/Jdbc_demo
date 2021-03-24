package com.vastica.jdbcDemo.basic;

import com.vastica.jdbcDemo.Connection.ConnectionFactory;

import java.sql.Connection;
import java.sql.Statement;

public class UpdateTable {

    public static void main(String[] args) {
        try (
                Connection con = ConnectionFactory.getConnection();
                Statement stmt = con.createStatement();
        ) {
            String query = "UPDATE user_table SET user_name='vishal', password='vishal' WHERE Id=3";


            String msg = stmt.executeUpdate(query) > 0 ? "Update Successfull" : "Update failed";

            System.out.println(msg);

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
