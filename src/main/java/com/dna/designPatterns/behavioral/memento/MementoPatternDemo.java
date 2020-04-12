package com.dna.designPatterns.behavioral.memento;

/*
*
* Restore object to previous state
* Externalize internal state
* Shields complex internals
* Example :
*   java.util.Date
* java.io.Serializable
*
* ###   Design Considerations   ###
* Class based
* Components: Originator, Caretaker, Memento
*
* ###   Pitfalls    ###
* Can be expensive to store history of large objects
*
* */
public class MementoPatternDemo {

    public static void main(String[] args) {

        Employee employee = new Employee();
        employee.setName("Amol");
        employee.setAddress("Pune");
        employee.setPhone("1234567890");

        Caretaker caretaker = new Caretaker();

        // Memento 1
        caretaker.save(employee);

        // Memento 2
        employee.setPhone("9876543210");
        caretaker.save(employee);

        employee.setName("Amol Solanke");
        System.out.println("Current state: " + employee);

        // First undo
        System.out.println("First Undo: " + caretaker.revert(employee));

        // Second Undo
        System.out.println("Second Undo: " + caretaker.revert(employee));

    }
}
