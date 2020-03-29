package com.dna.designPatterns.creational.abstractFactory;

import org.xml.sax.SAXException;

import javax.xml.parsers.ParserConfigurationException;
import java.io.IOException;

/*
* Factory of Factories (Group of Similar factories)
* Factory of related objects
* Uses Common Interface
*
* Pitfalls:
* Complexity
* Runtime Switch
* Pattern with in a pattern
* Problem specific
* */
public class AbstractFactoryPatternTest {

    public static void main(String[] args) throws ParserConfigurationException, IOException, SAXException {

        CreditCardFactory abstractFactory = CreditCardFactory.newInstance(647);
        CreditCard card = abstractFactory.getCreditCard(CardType.PLATINUM);
        System.out.println(card.getClass());

        abstractFactory = CreditCardFactory.newInstance(764);
        card = abstractFactory.getCreditCard(CardType.GOLD);
        System.out.println(card.getClass());
    }
}
