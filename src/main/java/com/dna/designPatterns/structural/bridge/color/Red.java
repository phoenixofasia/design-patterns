package com.dna.designPatterns.structural.bridge.color;

public class Red implements Color {

    @Override
    public void applyColor() {
        System.out.println("Red color applied");
    }
}
