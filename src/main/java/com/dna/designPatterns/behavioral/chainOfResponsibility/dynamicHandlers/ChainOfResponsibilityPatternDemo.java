package com.dna.designPatterns.behavioral.chainOfResponsibility.dynamicHandlers;

import java.util.Arrays;

/*
*
* Decoupling of sender and receiver
* Receiver contains the reference to next receiver
* Promotes loose coupling
* It is okay if no handler matches
* javax.servlet.Filter#doFilter()
* Spring security filter chain
*
* ###   Design Considerations   ###
* Chain of receiver objects
* Handler is interface based
* ConcreteHandler for different implementation
* Each handler has a reference to the next handler
* Components: Handler, ConcreteHandlers
*
* ###   Pitfalls    ###
* Handling / Handler guarantee
* Chain length / Performance issue --> If chain length grows very large it can impact performance
*
* */
public class ChainOfResponsibilityPatternDemo {

    public static void main(String[] args) {

        Director advik = new Director();
        VP dipika = new VP();
        CEO amol = new CEO();

        Handler.registerHandlers(Arrays.asList(advik, dipika, amol));

        Request request = new Request(RequestType.CONFERENCE, 5000);
        advik.doFilter(request);

        request = new Request(RequestType.PURCHASE, 1500);
        advik.doFilter(request);

        request = new Request(RequestType.PURCHASE, 1501);
        advik.doFilter(request);



    }
}