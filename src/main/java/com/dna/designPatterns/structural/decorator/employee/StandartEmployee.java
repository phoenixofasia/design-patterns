package com.dna.designPatterns.structural.decorator.employee;

import lombok.Getter;

@Getter
public class StandartEmployee implements Employee {

    private Integer id;
    private Gender gender;
    private String firstName;
    private String lastName;
    private Double salary;

    public StandartEmployee(Integer id, Gender gender, String firstName, String lastName, Double salary) {
        this.id = id;
        this.gender = gender;
        this.firstName = firstName;
        this.lastName = lastName;
        this.salary = salary;
    }
}
