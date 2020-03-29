package com.dna.designPatterns.structural.bridge.color;

public class Circle extends Shape {

    private final Color color;

    public Circle(Color color) {
        this.color = color;
    }

    @Override
    public void applyColor() {
        this.color.applyColor();
    }
}
