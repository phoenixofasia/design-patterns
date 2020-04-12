package com.dna.designPatterns.behavioral.state;

/*
*
* Localize state specific behavior
* Application state stored in object
* Separate what from where
* Make sure object follow Open Close Principal
*
* ###   Design Considerations   ###
* Context, State, Concrete State
*
* ###   Pitfalls    ###
* You must know all states
* Requires more classes for implementation of all states
* Making sure to keep logic out of context
* Identify state change triggers
* 
* */
public class StatePatternDemo {

    public static void main(String[] args) {

        Fan fan = new Fan();

        fan.pullChain();
        fan.pullChain();
        fan.pullChain();
        fan.pullChain();
        fan.pullChain();
        fan.pullChain();
        fan.pullChain();
    }
}
