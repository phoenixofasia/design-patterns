package com.dna.designPatterns.creational.prototype;

/*
* Avoid costly creation
* Avoid subclassing
* Typically don't use new (Except for the first object and then objects are cloned using copy constructor or clone method)
* Often utilize an interface
* Usually implemented with a registry
* ###############Pitfalls:#########################
* Sometimes not clear when to use
* Used with other patters e.g. Registry
* Dealing with Shallow or Deep copy
*
* */
public class PrototypePatternTest {

    public static void main(String[] args) {
        Registry registry = new Registry();
        Movie movie = (Movie) registry.createItem("Movie");
        movie.setTitle("Prototype demo");
        System.out.println(movie.hashCode());
        System.out.println(movie);

        Movie movie2 = (Movie) registry.createItem("Movie");
        movie2.setTitle("Gang of four");
        System.out.println(movie2.hashCode());
        System.out.println(movie2);
    }
}
