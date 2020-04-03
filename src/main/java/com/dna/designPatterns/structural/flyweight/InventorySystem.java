package com.dna.designPatterns.structural.flyweight;

import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

public class InventorySystem {

    private final Catalog catalog = new Catalog();
    private final List<Order> orders = new CopyOnWriteArrayList<>();

    void takeOrder(String itemName, int orderNumber) {
        orders.add(new Order(orderNumber, catalog.lookup(itemName)));
    }

    void process() {
        orders.forEach( order -> {
            order.processOrder();
            orders.remove(order);
        });

    }

    String report() {
        return new StringBuilder("Total item objects cached: ")
                .append(catalog.totalItemsCached())
                .toString();
    }
}
