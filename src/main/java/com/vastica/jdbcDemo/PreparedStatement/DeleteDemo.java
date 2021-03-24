package com.vastica.jdbcDemo.PreparedStatement;

import com.mysql.cj.xdevapi.UpdateStatement;
import com.vastica.jdbcDemo.Connection.ConnectionFactory;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.Statement;

public class DeleteDemo {
    public static void main(String[] args) {

        String query = "DELETE FROM user_table WHERE Id = ?";
        try (
                Connection con = ConnectionFactory.getConnection();
                PreparedStatement pstmt = con.prepareStatement(query);
        ) {

            pstmt.setInt(1,5);

            String msg = pstmt.executeUpdate() > 0 ? "Delete Successfull" : "Deletion failed";

            System.out.println(msg);

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
