package com.dna.designPatterns.behavioral.state;

import lombok.AllArgsConstructor;

@AllArgsConstructor
public class FanMedState extends State {

    Fan fan;

    @Override
    public void handleRequest() {
        System.out.println("Turning fan on to high");
        fan.setState(fan.getFanHighState());
    }

    @Override
    public String toString() {
        return "Fan is med.";
    }
}
