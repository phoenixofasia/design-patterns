package com.dna.designPatterns.structural.decorator.car;

public abstract class CarDecorator implements Car {

    protected Car customCar;

    public CarDecorator(Car customCar) {
        this.customCar = customCar;
    }

    @Override
    public String build() {
        return customCar.build();
    }
}
