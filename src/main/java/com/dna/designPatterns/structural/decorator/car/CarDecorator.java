package com.dna.designPatterns.structural.decorator.car;

import lombok.AllArgsConstructor;

@AllArgsConstructor
public abstract class CarDecorator implements Car {

    protected Car customCar;

    @Override
    public String build() {
        return customCar.build();
    }
}
