package com.dna.designPatterns.creational.prototype;

import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
public class Book extends Item {

    private int numberOfPages;

    @Override
    public String toString() {
        return "Book{" +
                "numberOfPages=" + numberOfPages +
                "} " + super.toString();
    }
}
