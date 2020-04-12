package com.dna.designPatterns.behavioral.state;

import lombok.AllArgsConstructor;

@AllArgsConstructor
public class FanHighState extends State {

    Fan fan;

    @Override
    public void handleRequest() {
        System.out.println("Turning fan to off");
        fan.setState(fan.getFanOffState());
    }

    @Override
    public String toString() {
        return "Fan is High.";
    }
}
