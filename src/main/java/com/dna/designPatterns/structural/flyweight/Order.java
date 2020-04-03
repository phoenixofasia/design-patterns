package com.dna.designPatterns.structural.flyweight;

public class Order {

    private final int orderNumber;
    private final Item item;


    public Order(int orderNumber, Item item) {
        this.orderNumber = orderNumber;
        this.item = item;
    }

    public void processOrder() {
        System.out.printf("Ordering %s for order number %d\n", item.toString(), orderNumber);
    }
}
