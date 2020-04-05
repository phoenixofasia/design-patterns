package com.dna.designPatterns.structural.decorator.employee;

import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor
public class StandartEmployee implements Employee {

    private Integer id;
    private Gender gender;
    private String firstName;
    private String lastName;
    private Double salary;

}
