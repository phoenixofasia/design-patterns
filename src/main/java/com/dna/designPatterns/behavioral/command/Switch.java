package com.dna.designPatterns.behavioral.command;

import com.dna.designPatterns.behavioral.command.Command.Command;

// Invoker
public class Switch {

    public void storeAndExecute(Command command) {
        command.execute();
    }
}
