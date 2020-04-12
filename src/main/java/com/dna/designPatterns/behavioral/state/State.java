package com.dna.designPatterns.behavioral.state;

public abstract class State {

    public void handleRequest() {
        throw new IllegalStateException("This state not implemented yet");
    }
}
