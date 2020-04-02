package com.dna.designPatterns.structural.composite;

/*
* Components represents part or whole structure
* Compose objects into tree structure
* Individual object treated as a Composite
* Same operations applied on individuals as well as composites
* Ezamples:
*   java.awt.Component
* JSF widgets
* RESTful service GETs
*
* Design:
* Tree Structured
* Component
* Leaf or Composite, same operations
* Composite knows about child objects
* Component, Leaf, Composite
*
* ##############    Pitfalls    ###############
* Since parent and child are treated in same way it is difficult to impose restrictions
* Due to above reason sometimes we need to rely on runtime check
*
* */
public class CompositePatternDemo {

    public static void main(String[] args) {

        Menu mainManu = new Menu("Main", "/main");
        MenuItem safetyMenuItem = new MenuItem("Safety", "/safety");
        mainManu.add(safetyMenuItem);

        Menu claimsSubMenu = new Menu("Claims", "/claims");
        mainManu.add(claimsSubMenu);

        MenuItem personalClaimMenu = new MenuItem("Personal Claim", "/personalClaims");
        claimsSubMenu.add(personalClaimMenu);

        MenuItem corporateClaimMenu = new MenuItem("Corporate Claim", "/corporateClaimMenu");
        claimsSubMenu.add(corporateClaimMenu);

        Menu insuranceSubMenu = new Menu("Insurance", "/insurance");
        mainManu.add(insuranceSubMenu);

        MenuItem personalInsuranceMenu = new MenuItem("Personal Insurance", "/personalInsurance");
        insuranceSubMenu.add(personalInsuranceMenu);

        MenuItem corporateInsuranceMenu = new MenuItem("Corporate Insurance", "/corporateInsurance");
        insuranceSubMenu.add(corporateInsuranceMenu);

        System.out.println(mainManu.toString());
    }
}
