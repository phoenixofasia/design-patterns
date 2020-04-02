package com.dna.designPatterns.structural.decorator.car;

public class PremiumDecorator extends CarDecorator {

    public PremiumDecorator(Car customCar) {
        super(customCar);
    }

    @Override
    public String build() {
        return super.build() + addPremiumFeatures();
    }

    private String addPremiumFeatures() {
        return " + Premium Features";
    }
}
