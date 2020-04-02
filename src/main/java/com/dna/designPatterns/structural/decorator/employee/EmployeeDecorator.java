package com.dna.designPatterns.structural.decorator.employee;

public abstract class EmployeeDecorator implements Employee {

    protected Employee customEmployee;

    public EmployeeDecorator(Employee customEmployee) {
        this.customEmployee = customEmployee;
    }

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
