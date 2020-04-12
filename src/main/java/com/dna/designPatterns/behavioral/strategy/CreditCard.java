package com.dna.designPatterns.behavioral.strategy;

import lombok.Getter;
import lombok.NonNull;
import lombok.RequiredArgsConstructor;
import lombok.Setter;

@Setter
@Getter
@RequiredArgsConstructor
public class CreditCard {

    private String number;
    private String expDate;
    private String cvv;
    @NonNull  private ValidationStrategy strategy;

    public boolean isValid() {
        return strategy.isValid(this);
    }
}
