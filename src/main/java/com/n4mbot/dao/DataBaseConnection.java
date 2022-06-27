package com.n4mbot.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class DataBaseConnection {
    public Connection databaseLink;
    public Statement stm;

    private static final String PASSWORD = "";
    private static final int PORT = 3306;
    private static final String DB_NAME = "logindb";

    public DataBaseConnection() {
        try {
            String a = "com.mysql.cj.jdbc.Driver";
            Class.forName(a);
            databaseLink = DriverManager.getConnection("jdbc:mysql://localhost:3306/accountdata", "root", "");
            stm = databaseLink.createStatement();
        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }
}





