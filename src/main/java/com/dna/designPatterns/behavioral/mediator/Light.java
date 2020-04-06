package com.dna.designPatterns.behavioral.mediator;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.NonNull;
import lombok.RequiredArgsConstructor;

// Receiver
@NoArgsConstructor
@RequiredArgsConstructor
public class Light {

    @Getter
    private boolean isOn = false;
    @NonNull private String location;

    public void toggle() {

        if (isOn) {
            off();
        } else {
            on();
        }

    }

    public void on() {
        System.out.println(location + " Light switched on");
        isOn = true;
    }

    public void off() {
        System.out.println(location + "Light switched off");
        isOn = false;
    }

    public boolean isOff() {
        return !isOn();
    }
}
