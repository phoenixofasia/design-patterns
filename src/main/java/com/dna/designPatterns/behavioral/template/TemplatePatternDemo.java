package com.dna.designPatterns.behavioral.template;

/*
*
* Code Reuse
* Commonly used in libraries and framework
* More emphasis on algorithms
* Examples:
*   java.util.Collections#sort()
*   java.util.AbstractList#indexOf()
*
*
* ###   Design Considerations   ###
* Abstract base class
* Base calls child
* Hooks are in place and may be overridden
* Operations are in place and must be overridden
* Components: Abstract Template class and Concrete Template classes
*
*
* ###   Pitfalls    ###
* Important to restrict access correctly
* May leads to difficult program flow in complex application
*
* */
public class TemplatePatternDemo {

    public static void main(String[] args) {

        OrderTemplate webOrder = new WebOrder(true);
        webOrder.processOrder();

        System.out.println();

        OrderTemplate storeOrder = new StoreOrder(false);
        storeOrder.processOrder();


    }
}
