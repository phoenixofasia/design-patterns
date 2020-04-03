package com.dna.designPatterns.structural.flyweight;

// Instance of the Item will be flyweights
public class Item {

    private final String name;

    public Item(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return name;
    }
}
