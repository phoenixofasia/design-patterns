package com.dna.designPatterns.structural.adapter;

public class EmployeeLdapAdaptor implements Employee {

    private EmployeeLDAP employeeLDAP;

    public EmployeeLdapAdaptor(EmployeeLDAP employeeLDAP) {
        this.employeeLDAP = employeeLDAP;
    }

    @Override
    public int getId() {
        return employeeLDAP.getCn();
    }

    @Override
    public String getFirstName() {
        return employeeLDAP.getGivenName();
    }

    @Override
    public String getLastName() {
        return employeeLDAP.getSurName();
    }

    @Override
    public String getEmail() {
        return employeeLDAP.getMail();
    }
}
