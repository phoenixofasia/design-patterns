package com.dna.designPatterns.structural.facade;


import lombok.SneakyThrows;

import java.sql.Connection;
import java.sql.DriverManager;

public class DBSingleton {

    private static volatile DBSingleton instance;
    private Connection connection;

    @SneakyThrows
    private DBSingleton() {

        if (instance != null ) {
            throw new IllegalAccessException("Connection must be created using getInstance method");
        }

        Class.forName("com.mysql.cj.jdbc.Driver");
        connection = DriverManager.getConnection(
                "jdbc:mysql://localhost:3306/test_db","root","root");
    }

    @SneakyThrows
    public static DBSingleton getInstance() {
        if(instance == null ) {
            synchronized (DBSingleton.class) {
                if(instance == null) {
                    instance = new DBSingleton();
                }
            }
        }
        return instance;
    }


    public Connection getConnection() {
        return connection;
    }

}
