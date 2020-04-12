package com.dna.designPatterns.behavioral.observer;

/*
*
* One to Many observers
* Decoupled objects
* can be used to enable event handling
* Public/Subscribe model typically is asynchronous and observer is typically synchronous
* Typically used in MVC
* Examples:
*   java.util.Observer
*   java.util.EventListener
*   javax.jms.Topic
*
*  ###  Design Considerations   ###
* Subject, Concrete Subjects
* Observer, Concrete Observers
*
* ###   Pitfalls    ###
* Since subject is not aware of its observers there might be unexpected updates
* What changed is not clear
* Disconnected nature makes debugging difficult
*
* */
public class ObserverPatternDemo {

    public static void main(String[] args) {

        Subject subject = new MessageStream();

        PhoneClient phoneClient = new PhoneClient(subject);
        TabletClient tabletClient = new TabletClient(subject);


        phoneClient.addMessage("Here is new message!");
        tabletClient.addMessage("Here is new message!");


    }
}
