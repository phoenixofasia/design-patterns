package com.dna.designPatterns.behavioral.iterator;


/*
*
* Used for traverse a container / collection
* Doesn't expose underlying structure
* Decouple algorithm
* Sequential in nature
* Example:
*   java.util.Iterator
*   java.util.Enumeration
*
* ###   Design Considerations   ###
* Interface based
* Factory method based
* Independent but can be fail fast or fail safe
* Components: Iterator, ConcreteIterator
*
* ###   Pitfalls    ###
* No access to index
* Uni Directional
*
*
* */
public class IteratorPatternDemo {

    public static void main(String[] args) {

        BikeRepository repo = new BikeRepository();

        repo.addBike("Cervelo");
        repo.addBike("Scott");
        repo.addBike("Fuji");

/*        Iterator<String> itr = repo.iterator();
        while (itr.hasNext()) {
            String next = itr.next();
            System.out.println(next);
            if (next.equals("Scott")) {
                repo.addBike("Scott1");
            }
        }

        for(String bike : repo) {
            System.out.println(bike);
        }*/

        repo.forEach(System.out::println);
    }
}
