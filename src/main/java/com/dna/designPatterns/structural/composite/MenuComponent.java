package com.dna.designPatterns.structural.composite;

import lombok.Getter;

import java.util.ArrayList;
import java.util.List;

public abstract class MenuComponent {

    @Getter
    String name;
    @Getter
    String url;
    List<MenuComponent> menuComponents = new ArrayList<>();

    public abstract String toString();

    public String print() {
        return new StringBuilder(name)
                .append(" : ")
                .append(url)
                .append("\n").toString();
    }

    public MenuComponent add(MenuComponent menu) {
        throw new UnsupportedOperationException("Feature not implemented at this level");
    }

    public MenuComponent remove(MenuComponent menu) {
        throw new UnsupportedOperationException("Feature not implemented at this level");
    }
}
