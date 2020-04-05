package com.dna.designPatterns.behavioral.command;

import com.dna.designPatterns.behavioral.command.Command.Command;
import lombok.AllArgsConstructor;

// ConcreteCommand
@AllArgsConstructor
public class ToggleCommand implements Command {

    Light light;

    @Override
    public void execute() {
        light.toggle();
    }
}
