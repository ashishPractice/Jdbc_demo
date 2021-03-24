package com.vastica.jdbcDemo.PreparedStatement;

import com.mysql.cj.xdevapi.UpdateStatement;
import com.vastica.jdbcDemo.Connection.ConnectionFactory;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.Statement;

public class UpdateTable {

    public static void main(String[] args) {
        String query = "UPDATE user_table SET user_name=?, password=? WHERE Id=?";
        try (
                Connection con = ConnectionFactory.getConnection();
                PreparedStatement pstmt = con.prepareStatement(query);
        ) {

            pstmt.setString(1,"ram");
            pstmt.setString(2,"ram");
            pstmt.setInt(3,4);


            String msg = pstmt.executeUpdate() > 0 ? "Update Successfull" : "Update failed";

            System.out.println(msg);

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
