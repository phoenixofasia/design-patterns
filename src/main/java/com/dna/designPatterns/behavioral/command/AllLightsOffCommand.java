package com.dna.designPatterns.behavioral.command;

import com.dna.designPatterns.behavioral.command.Command.Command;
import lombok.AllArgsConstructor;

import java.util.List;

@AllArgsConstructor
public class AllLightsOffCommand implements Command {

    List<Light> lights;

    @Override
    public void execute() {

        lights.forEach( light -> {
            if(light.isOn()) {
                light.toggle();
            }
        });

    }
}
