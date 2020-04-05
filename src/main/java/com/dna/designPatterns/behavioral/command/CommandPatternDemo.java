package com.dna.designPatterns.behavioral.command;

import com.dna.designPatterns.behavioral.command.Command.Command;

import java.util.Arrays;

/*
*
* Encapsulate request as an object
* Object-oriented callback
* Decouple sender from processor
* E.g. java.lang.Runnable
*
* ###   Design Considerations   ###
* Object per command
* Command Interface
* Execute method
* Components: Command, Invoker, ConcreteCommand
*
* ###   Pitfalls    ###
* Need knowledge of other patterns to fully utilize this pattern
* Changes of code duplication when creating multiple commands
*
* */

// Client
public class CommandPatternDemo {

    public static void main(String[] args) {

        Light bedroomLight = new Light();
        Light keithLight = new Light();
        Light hallLight = new Light();
        Switch lightSwitch = new Switch();

        Command onCommand = new OnCommand(bedroomLight);
        lightSwitch.storeAndExecute(onCommand);

        Command toggleCommand = new ToggleCommand(keithLight);
        lightSwitch.storeAndExecute(toggleCommand);

        Command allLightsOffCommand = new AllLightsOffCommand(Arrays.asList(bedroomLight,
                keithLight, hallLight));

        lightSwitch.storeAndExecute(allLightsOffCommand);

    }
}
