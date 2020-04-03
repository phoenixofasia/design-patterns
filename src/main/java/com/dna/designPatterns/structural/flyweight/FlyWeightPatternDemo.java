package com.dna.designPatterns.structural.flyweight;

/*
*
* More efficient use of memory (Memory optimization)
* Large number of immutable objects
* Immutable
* Most of the object state can be extrinsic
* e.g. java.lang.String, java.lang.Integer#valueOf()
*
* ###   Design Considerations   ###
* Utilizes factory
* Encompasses creation and structure
*
* ###   Pitfalls    ###
* Complex pattern
* Often premature optimization
*
* */
public class FlyWeightPatternDemo {

    public static void main(String[] args) {

        InventorySystem ims = new InventorySystem();

        ims.takeOrder("Roomba", 1);
        ims.takeOrder("Bose Headphones", 2);
        ims.takeOrder("Samsung TV", 3);
        ims.takeOrder("Samsung TV", 4);
        ims.takeOrder("Roomba", 5);
        ims.takeOrder("Bose Headphones", 6);
        ims.takeOrder("Roomba", 7);
        ims.takeOrder("Bose Headphones", 8);
        ims.takeOrder("Samsung TV", 9);
        ims.takeOrder("Samsung TV", 10);
        ims.takeOrder("Roomba", 11);
        ims.takeOrder("Bose Headphones", 12);

        ims.process();

        System.out.println(ims.report());
    }
}
