package com.vastica.jdbcDemo.basic;

import com.vastica.jdbcDemo.Connection.ConnectionFactory;

import java.sql.Connection;
import java.sql.Statement;

public class DeleteDemo {
    public static void main(String[] args) {
        try (
                Connection con = ConnectionFactory.getConnection();
                Statement stmt = con.createStatement();
        ) {
            String query = "DELETE FROM user_table WHERE Id = 3";


            String msg = stmt.executeUpdate(query) > 0 ? "Delete Successfull" : "Deletion failed";

            System.out.println(msg);

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
