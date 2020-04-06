package com.dna.designPatterns.behavioral.mediator;

import lombok.AllArgsConstructor;

@AllArgsConstructor
public class TurnOffAllLightsCommand implements Command {

    private Mediator mediator;

    @Override
    public void execute() {
        mediator.turnOffAllLights();
    }
}
