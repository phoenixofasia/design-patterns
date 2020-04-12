package com.dna.designPatterns.behavioral.strategy;

public class HDFCStrategy extends ValidationStrategy {

    @Override
    public boolean isValid(CreditCard creditCard) {

        boolean isValid = false;
        String ccNumber = creditCard.getNumber();
        isValid = ccNumber.startsWith("7");

        if (isValid) {
            isValid = ccNumber.length() == 15;
        }

        if (isValid) {
            isValid = passesLuhn(ccNumber);
        }

        return isValid;

    }
}
