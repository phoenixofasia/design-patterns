package com.dna.designPatterns.behavioral.memento;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
public class Employee {

    private String name;
    private String address;
    private String phone;

    public EmployeeMemento save() {
        return new EmployeeMemento(name, phone);
    }

    public Employee revert(EmployeeMemento emp ) {
        this.name = emp.getName();
        this.phone = emp.getPhone();
        return this;
    }
}
