package com.dna.designPatterns.structural.bridge.color;

import lombok.AllArgsConstructor;

@AllArgsConstructor
public class Square extends Shape {

    private final Color color;

    @Override
    public void applyColor() {
        this.color.applyColor();
    }
}
