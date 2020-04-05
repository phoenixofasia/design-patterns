package com.dna.designPatterns.structural.bridge.color;

import lombok.AllArgsConstructor;

@AllArgsConstructor
public class Circle extends Shape {

    private final Color color;

    @Override
    public void applyColor() {
        this.color.applyColor();
    }
}
