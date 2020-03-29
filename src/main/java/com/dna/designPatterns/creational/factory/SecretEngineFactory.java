package com.dna.designPatterns.creational.factory;

public class SecretEngineFactory {

    public static SecretEngine getSecretEngine (SecretEngineType engineTYpe) {

        switch (engineTYpe) {
            case KV1: {
                return new KV1Engine();
            }
            case KV2: {
                return new KV2Engine();
            }
            default: {
                return null;
            }
        }
    }
}
