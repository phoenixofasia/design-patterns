package com.dna.designPatterns.behavioral.strategy;

/*
*
* Eliminate conditional statement
* Behavior encapsulated in classes
* Used when difficult to add new strategy
* Client aware of strategy
* Client chooses strategy
* E.g. java.util.Comparator
*
* ###   Design Consideration    ###
* Abstract base class
* Concrete class per strategy
* Removes if/else conditions
* Strategies are independent
* Components:   Context, Strategy, ConcreteStrategy
*
* ###   Pitfalls    ###
* Client needs to be aware of strategies
*
*
* */

public class StrategyPatternDemo {

    public static void main(String[] args) {

        CreditCard sbiCard = new CreditCard(new SBIStrategy());

        sbiCard.setNumber("6734567891234567");
        sbiCard.setExpDate("05/2025");
        sbiCard.setCvv("647");

        System.out.println("Is SBI valid: " + sbiCard.isValid());

        sbiCard.setNumber("6534567891234567");
        sbiCard.setExpDate("05/2025");
        sbiCard.setCvv("647");

        System.out.println("Is SBI valid: " + sbiCard.isValid());

        CreditCard hdfcCard = new CreditCard(new HDFCStrategy());
        hdfcCard.setNumber("763456787234567");
        hdfcCard.setExpDate("05/2025");
        hdfcCard.setCvv("647");

        System.out.println("Is HDFC valid: " + hdfcCard.isValid());
    }

}
