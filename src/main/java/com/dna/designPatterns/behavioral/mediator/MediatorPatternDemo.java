package com.dna.designPatterns.behavioral.mediator;

/*
*
* To achieve loose coupling
* Well-defined but complex objects
* To create reusable components
* Acts as hub/router
* Example:
*   java.util.Timer
*   java.lang.reflect.Method#invoke
*
* ###   Design Considerations   ###
* Interface based with concrete classes
* Mediator knows about colleagues
* Components: Mediator, ConcreteMediator
*
* ###   Pitfalls    ###
* Not to create deity object
* Limits subclassing
* decision to use Over or with command
*
* */
public class MediatorPatternDemo {

    public static void main(String[] args) {

        Mediator mediator = new Mediator();

        mediator.registerLight(new Light("Kitchen"));
        mediator.registerLight(new Light("Bedroom"));

        Command turnOnAllLightsCommand = new TurnOnAllLightsCommand(mediator);
        turnOnAllLightsCommand.execute();

        Command turnOffAllLightsCommand = new TurnOffAllLightsCommand(mediator);
        turnOffAllLightsCommand.execute();

    }

}
