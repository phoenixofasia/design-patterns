package com.dna.designPatterns.structural.decorator.car;

public class SafetyDecorator extends CarDecorator {


    public SafetyDecorator(Car customCar) {
        super(customCar);
    }

    @Override
    public String build() {
        return super.build() + addSafety();
    }

    private String addSafety() {
        return " + Safety Features";
    }
}
