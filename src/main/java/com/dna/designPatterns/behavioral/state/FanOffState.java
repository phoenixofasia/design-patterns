package com.dna.designPatterns.behavioral.state;

import lombok.AllArgsConstructor;

@AllArgsConstructor
public class FanOffState extends State {

    Fan fan;

    @Override
    public void handleRequest() {
        System.out.println("Turning fan on to low");
        fan.setState(fan.getFanLowState());
    }

    @Override
    public String toString() {
        return "Fan is off.";
    }
}
