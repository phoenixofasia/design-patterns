package com.dna.designPatterns.structural.bridge.color;

public class Square extends Shape {

    private Color color;
    public Square(Color color) {
        this.color = color;
    }

    @Override
    public void applyColor() {
        this.color.applyColor();
    }
}
