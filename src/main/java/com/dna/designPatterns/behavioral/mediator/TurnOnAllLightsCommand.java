package com.dna.designPatterns.behavioral.mediator;

import lombok.AllArgsConstructor;

@AllArgsConstructor
public class TurnOnAllLightsCommand implements Command {

    private Mediator mediator;

    @Override
    public void execute() {
        mediator.turnOnAllLights();
    }
}
