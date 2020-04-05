package com.dna.designPatterns.structural.flyweight;

import lombok.AllArgsConstructor;

// Instance of the Item will be flyweights
@AllArgsConstructor
public class Item {

    private final String name;

    @Override
    public String toString() {
        return name;
    }
}
