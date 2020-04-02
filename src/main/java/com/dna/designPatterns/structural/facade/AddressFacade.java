package com.dna.designPatterns.structural.facade;

import lombok.Data;
import lombok.SneakyThrows;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

public class AddressFacade {

    private DBSingleton instance;

    public AddressFacade() {
        this.instance = DBSingleton.getInstance();
    }

    @SneakyThrows
    public int createTable() {
        int count;
        Connection connection = instance.getConnection();
        Statement stmt = connection.createStatement();
        count = stmt.executeUpdate("CREATE TABLE IF NOT EXISTS ADDRESS (ID INTEGER, STREET_NAME VARCHAR(20), CITY VARCHAR(20))");
        stmt.close();
        return count;
    }

    @SneakyThrows
    public int insertIntoTable() {
        int count;
        Connection connection = instance.getConnection();
        Statement stmt = connection.createStatement();
        count = stmt.executeUpdate("INSERT INTO ADDRESS (ID, STREET_NAME, CITY) VALUES (1, 'Lohegaon', 'Pune')");
        stmt.close();
        return count;
    }

    @SneakyThrows
    public List<Address> selectTable() {

        List<Address> addresses = new ArrayList<>();
        Connection connection = instance.getConnection();
        Statement stmt = connection.createStatement();
        ResultSet rs = stmt.executeQuery("SELECT ID, STREET_NAME, CITY FROM ADDRESS");

        while (rs.next()) {
            Address address = new Address();
            address.setId(rs.getInt(1));
            address.setStreetName(rs.getString(2));
            address.setCity(rs.getString(3));
            addresses.add(address);
        }
        rs.close();
        stmt.close();
        return addresses;
    }

    @SneakyThrows
    public void closeConnection() {
        instance.getConnection().close();
    }
}

@Data
class Address {

    int id;
    String streetName;
    String city;
}