package com.dna.designPatterns.behavioral.state;

import lombok.Getter;
import lombok.Setter;

@Getter
public class Fan {

    private State fanOffState;
    private State fanLowState;
    private State fanMedState;
    private State fanHighState;

    @Setter
    private State state;

    public Fan() {

        fanOffState = new FanOffState(this);
        fanLowState = new FanLowState(this);
        fanMedState = new FanMedState(this);
        fanHighState = new FanHighState(this);

        state = fanOffState;
    }

    public void pullChain() {
        state.handleRequest();
    }

    @Override
    public String toString() {
        return state.toString();
    }
}
