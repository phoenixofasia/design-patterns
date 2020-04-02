package com.dna.designPatterns.structural.facade;

public class FacadePatternDBDemo {

    public static void main(String[] args) {

        // You can make queries dynamic but for demo purpose used static queries
        AddressFacade addressFacade = new AddressFacade();
        System.out.println(addressFacade.createTable()+1 + " Table already exists or created");
        System.out.println(addressFacade.insertIntoTable() + " rows inserted");
        addressFacade.selectTable().forEach( System.out::println );
        addressFacade.closeConnection();
    }
}
