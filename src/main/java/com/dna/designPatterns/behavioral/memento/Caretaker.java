package com.dna.designPatterns.behavioral.memento;

import java.util.Stack;

public class Caretaker {

    private Stack<EmployeeMemento> employeeHistory = new Stack<>();

    public void save(Employee emp) {
        employeeHistory.push(emp.save());
    }

    public Employee revert(Employee emp) {
        return  emp.revert(employeeHistory.pop());
    }
}
