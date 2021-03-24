package com.vastica.jdbcDemo.PreparedStatement;

import com.vastica.jdbcDemo.Connection.ConnectionFactory;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.Statement;

public class InsertData {

    public static void main(String[] args) {

        String query = "INSERT INTO user_table(user_name,password) VALUES(?,?)";

        try (
                Connection con = ConnectionFactory.getConnection();
                PreparedStatement pstmt = con.prepareStatement(query);
        ) {
            pstmt.setString(1,"kapil");
            pstmt.setString(2,"kapil");

            String msg =  pstmt.executeUpdate()> 0 ? "Insert Successfull" : "Insertion failed";

            System.out.println(msg);

        } catch (Exception e) {
            e.printStackTrace();
        }

    }
}
