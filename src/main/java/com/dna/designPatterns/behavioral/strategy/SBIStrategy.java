package com.dna.designPatterns.behavioral.strategy;

public class SBIStrategy extends ValidationStrategy {

    @Override
    public boolean isValid(CreditCard creditCard) {

        boolean isValid = false;
        String ccNumber = creditCard.getNumber();
        isValid = ccNumber.startsWith("67") ||
                ccNumber.startsWith("47");

        if (isValid) {
            isValid = ccNumber.length() == 16;
        }

        if (isValid) {
            isValid = passesLuhn(ccNumber);
        }

        return isValid;

    }
}
