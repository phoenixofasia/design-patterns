package com.dna.designPatterns.structural.flyweight;

import lombok.AllArgsConstructor;

@AllArgsConstructor
public class Order {

    private final int orderNumber;
    private final Item item;

    public void processOrder() {
        System.out.printf("Ordering %s for order number %d\n", item.toString(), orderNumber);
    }
}
