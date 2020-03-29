package com.dna.designPatterns.structural.bridge.color;

/*
* Generally planned in advance
* Uses Encapsulation, Composition and Inheritance
* Composition over inheritance
* Expect changes from both side
* Participants: Abstraction, Implementor, Refined Abstraction, Concrete Implementor
* Decouple abstraction and implementation
* Changes in abstraction won't affect client
* Example:
* Driver (JDBC driver)
*
* Steps for Creating Bridge for color and shape
* Color and shape bridge
* Create Bridge
* Another Bridge
*
* ######################    Pitfalls    ###############################
* Increases complexity
* Conceptually difficult to plan
*
*
* */
public class BridgePatternTest {

    public static void main(String[] args) {

        Color red = new Red();
        Shape redSquare = new Square(red);

        Color blue = new Blue();
        Shape blueCircle = new Circle(blue);

        Color green = new Green();
        Shape greenCircle = new Circle(green);

        blueCircle.applyColor();
        redSquare.applyColor();
        greenCircle.applyColor();

    }
}
