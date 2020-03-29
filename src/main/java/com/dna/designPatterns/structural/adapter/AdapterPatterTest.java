package com.dna.designPatterns.structural.adapter;

import java.util.LinkedList;
import java.util.List;

/*
* Useful for connecting new code to legacy code without changing the working contract of legacy code
* Has mainly three participants: Client, Adapter and Adaptee
* E.g.
* Arrays.asList()
*
* ##########################    Pitfalls    ###########################
* Don't add functionality
*
* */
public class AdapterPatterTest {

    public static void main(String[] args) {

        List<Employee> employees = new LinkedList<>();
        employees.add(new EmployeeDB(001,"Amol", "Solanke", "amols@gmail.com"));

        EmployeeLDAP employeeLDAP = new EmployeeLDAP(002, "Advik", "Solanke", "adviks@gmail.com");

        employees.add(new EmployeeLdapAdaptor(employeeLDAP));

        System.out.println(employees);;
    }
}
