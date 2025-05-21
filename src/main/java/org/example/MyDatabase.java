package org.example;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class MyDatabase {

    String url = "jdbc:postgresql://localhost:5432/";
    String username ="postgresql";
    String password ="root";


    public void  create(){

        try {
            Connection connection = DriverManager.getConnection(url , username , password);
            Statement statement = connection.createStatement();

            String query="insert into users(chatid , firstname , lastname , text) values (";


        } catch (SQLException e) {
            throw new RuntimeException(e);
        }

    }



}
