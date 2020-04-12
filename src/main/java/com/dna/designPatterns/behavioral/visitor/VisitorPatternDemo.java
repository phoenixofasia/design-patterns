package com.dna.designPatterns.behavioral.visitor;

/*
*
* To separate algorithm from object
* Adding new features without modifying object
* Maintain open close principal
* Visitor classes contain changes
* Examples:
*   java.lang.model.element.Element
*   java.lang.model.element.ElementVisitor
*
* ###   Design Considerations   ###
* Interface bases
* Need to design from beginning hard to retrofit
* Visitor and Element
* Elements have visit method
* Visitor know every element
* Components: Visitor, ConcreteVisitor, Element, ConcreteElement
*
* ###   Pitfalls    ###
* Required in advance plan for adaptability
* Sometimes can be confusing
* May require to use adaptor pattern if visitor not require to implement all methods
*
* */
public class VisitorPatternDemo {

    public static void main(String[] args) {

        PartsOrder partsOrder = new PartsOrder();

        partsOrder.addPart(new Wheel());
        partsOrder.addPart(new Oil());
        partsOrder.addPart(new Fender());
        partsOrder.addPart(new Fender());

        partsOrder.accept(new AtvPartsShippingVisitor());

        // New change request
        partsOrder.accept(new AtvPartsDisplayVisitor());

    }

}
