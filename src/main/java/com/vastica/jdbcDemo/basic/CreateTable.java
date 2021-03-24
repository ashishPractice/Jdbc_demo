package com.vastica.jdbcDemo.basic;

import com.vastica.jdbcDemo.Connection.ConnectionFactory;

import java.sql.Connection;
import java.sql.Statement;

public class CreateTable {

    private Connection con= null;
    private Statement stmt = null;

    public static void main(String[] args) {

       try (
               Connection con = ConnectionFactory.getConnection();
               Statement stmt = con.createStatement();
               ){
           String query = "CREATE TABLE user_table(Id int not null auto_increment, user_name varchar(45), password varchar(45), primary key(Id))";

           stmt.executeUpdate(query);
           System.out.println("Table Created");

       }catch (Exception e){
           e.printStackTrace();
       }

    }
}
