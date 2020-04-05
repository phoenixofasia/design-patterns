package com.dna.designPatterns.structural.decorator.employee;

import lombok.AllArgsConstructor;

@AllArgsConstructor
public abstract class EmployeeDecorator implements Employee {

    protected Employee customEmployee;

    @Override
    public Integer getId() {
        return customEmployee.getId();
    }

    @Override
    public Gender getGender() {
        return customEmployee.getGender();
    }

    @Override
    public String getFirstName() {
        return customEmployee.getFirstName();
    }

    @Override
    public String getLastName() {
        return customEmployee.getLastName();
    }

    @Override
    public Double getSalary() {
        return customEmployee.getSalary();
    }
}
