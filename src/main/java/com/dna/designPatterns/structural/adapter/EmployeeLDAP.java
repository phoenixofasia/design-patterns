package com.dna.designPatterns.structural.adapter;

import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor
public class EmployeeLDAP {

    private int cn;
    private String givenName;
    private String surName;
    private String mail;

}
