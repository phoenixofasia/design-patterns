package com.dna.designPatterns.creational.builder;

public class BuilderPatternTest {

    /*
    Handles complex constructors and Large number of parameters
    Can enforce immutability once the object created
    It solve the problem to determine which constructor to use
    Creating a constructor with each parameter variation is called telescoping constructors
    Builder is commonly written with a static inner class but can also be written in separate class
    Negates the need for exposed setters
    E.g. StringBuilder, it is more clean way instead of using + operator in String
    StringBuilder has better performance than StringBuffer

    ################ Pitfalls ########################
    Complexity
    * */


    public static void main(String[] args) {
        BuilderPattern.Builder builder = new BuilderPattern.Builder();
        builder.bread("Wheat").condiments("Lettuce").dressing("Mayo").meat("Turkey");
        BuilderPattern builderPattern = builder.build();
        System.out.println(builderPattern);

        BuilderPattern.Builder builder2 = new BuilderPattern.Builder();
        builder2.bread("Wheat").dressing("Mayo").meat("Turkey");
        BuilderPattern builderPattern2 = builder2.build();
        System.out.println(builderPattern2);
    }
}
