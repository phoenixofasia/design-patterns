package com.dna.designPatterns.creational.singleton;

public class SingletonPattern {

    // Not lazy loaded / Eagerly loaded
    //private static final SingletonPattern instance = new SingletonPattern();

    /* Lazy loading
        static variables are class members that are shared among all objects.
        There is only one copy in the main memory.
        The value of a volatile variable will never be stored in the cache.
        All read and write will be done from and to the main memory.
    */
    private static volatile SingletonPattern instance = null;

    private SingletonPattern() {
        if (instance != null) {
            throw new RuntimeException("Please use getInstance method to create / get instance");
        }
    }

    public static SingletonPattern getInstance() {
        if(instance == null ) {
            synchronized(SingletonPattern.class) {
                if(instance == null) {
                    instance = new SingletonPattern();
                }
            }
        }
        return instance;
    }
}
