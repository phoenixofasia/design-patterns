package com.dna.designPatterns.behavioral.state;

import lombok.AllArgsConstructor;

@AllArgsConstructor
public class FanLowState extends State {

    Fan fan;

    @Override
    public void handleRequest() {
        System.out.println("Turning fan on to med");
        fan.setState(fan.getFanMedState());
    }

    @Override
    public String toString() {
        return "Fan is low.";
    }
}
