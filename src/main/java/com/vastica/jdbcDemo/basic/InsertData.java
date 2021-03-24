package com.vastica.jdbcDemo.basic;

import com.vastica.jdbcDemo.Connection.ConnectionFactory;

import java.sql.Connection;
import java.sql.Statement;

public class InsertData {

    public static void main(String[] args) {

        try (
                Connection con = ConnectionFactory.getConnection();
                Statement stmt = con.createStatement();
        ) {
            String query = "INSERT INTO user_table(user_name,password) VALUES('bishal','bishal')";


            String msg = stmt.executeUpdate(query) > 0 ? "Insert Successfull" : "Insertion failed";

            System.out.println(msg);

        } catch (Exception e) {
            e.printStackTrace();
        }

    }
}
