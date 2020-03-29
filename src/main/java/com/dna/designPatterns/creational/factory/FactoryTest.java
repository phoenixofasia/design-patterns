package com.dna.designPatterns.creational.factory;

import java.util.Calendar;

/*
* Doesn't expose instantiation logic
* Uses common interface
* Specified by architecture, implemented by user
*
* ########################  Pitfalls    ############
* Complexity
*
* */
public class FactoryTest {


    public static void main(String[] args) {

        SecretEngine se = SecretEngineFactory.getSecretEngine(SecretEngineType.KV1);
        System.out.println(se);

        SecretEngine se2 = SecretEngineFactory.getSecretEngine(SecretEngineType.KV2);
        System.out.println(se2);

    }
}
