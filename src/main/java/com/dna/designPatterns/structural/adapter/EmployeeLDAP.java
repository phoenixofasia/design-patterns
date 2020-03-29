package com.dna.designPatterns.structural.adapter;

import lombok.Getter;

@Getter
public class EmployeeLDAP {

    private int cn;
    private String givenName;
    private String surName;
    private String mail;

    public EmployeeLDAP(int cn, String givenName, String surName, String mail) {
        this.cn = cn;
        this.givenName = givenName;
        this.surName = surName;
        this.mail = mail;
    }
}
