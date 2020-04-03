package com.dna.designPatterns.structural.flyweight;

import java.util.HashMap;
import java.util.Map;

// Catalog acts as a factory and catch for item flyweight objects
public class Catalog {

    private Map<String, Item> items = new HashMap<>();

    public Item lookup(String itemName) {
        if (!items.containsKey(itemName)) {
            items.put(itemName, new Item(itemName));
        }
        return items.get(itemName);
    }

    public int totalItemsCached() {
        return items.size();
    }
}
