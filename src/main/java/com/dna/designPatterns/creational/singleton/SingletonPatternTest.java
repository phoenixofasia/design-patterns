package com.dna.designPatterns.creational.singleton;

public class SingletonPatternTest {

    public static void main(String[] args) {
        SingletonPattern sp = SingletonPattern.getInstance();
        System.out.println(sp);

        SingletonPattern sp2 = SingletonPattern.getInstance();
        System.out.println(sp2);
    }
}
