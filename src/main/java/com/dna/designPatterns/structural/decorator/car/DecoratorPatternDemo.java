package com.dna.designPatterns.structural.decorator.car;

/*
*
* ###   Concepts    ###
* Also called wrapper
* Add behavior without affecting others
* Single Responsibility Principal
* Compose behavior dynamically
* Example:
*   java.io.InputStream
*   Swing/Awt UI components
*
* ###   Design Considerations   ###
* Utilizes composition and inheritance (has-a, is-a)
* Alternative to subclassing
* Constructor requires instance from hierarchy
*
* */

import com.dna.designPatterns.structural.decorator.employee.AdditionalDetailsEmployeeDecorator;
import com.dna.designPatterns.structural.decorator.employee.Employee;
import com.dna.designPatterns.structural.decorator.employee.Gender;
import com.dna.designPatterns.structural.decorator.employee.StandartEmployee;

public class DecoratorPatternDemo {

    public static void main(String[] args) {

        Car car = new PremiumDecorator( new SafetyDecorator( new StandardCar()));

        System.out.println(car.build());

        Employee emp = new StandartEmployee(1, Gender.MALE, "Amol", "Solanke", 10000000d);
        AdditionalDetailsEmployeeDecorator empDecorator = new AdditionalDetailsEmployeeDecorator(emp);

        System.out.println("Id: " + empDecorator.getId());
        System.out.println("Gender: " + empDecorator.getGender());
        System.out.println("Greet Name: " + empDecorator.getGreetName());
        System.out.println("Full name: " + empDecorator.getFullName());
    }
}
