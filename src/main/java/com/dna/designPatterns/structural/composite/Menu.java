package com.dna.designPatterns.structural.composite;

public class Menu extends MenuComponent {

    public Menu(String name, String url) {
        this.name = name;
        this.url = url;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder(print());
        menuComponents.forEach( menu -> sb.append(menu.toString()));
        return sb.toString();
    }

    @Override
    public MenuComponent add(MenuComponent menu) {
        menuComponents.add(menu);
        return menu;
    }

    @Override
    public MenuComponent remove(MenuComponent menu) {
        menuComponents.remove(menu);
        return menu;
    }

}
