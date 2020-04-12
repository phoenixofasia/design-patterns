package com.dna.designPatterns.behavioral.visitor;

public class AtvPartsShippingVisitor implements AtvPartVisitor {

    private double shippingAmount = 0;

    @Override
    public void visit(Fender fender) {
        shippingAmount += 3;
        System.out.println("Fender are light and costs 3$");
    }

    @Override
    public void visit(Wheel wheel) {
        shippingAmount += 15;
        System.out.println("Wheels are bulky and costs 15$");
    }

    @Override
    public void visit(Oil oil) {
        shippingAmount += 12;
        System.out.println("Wheels are bulky and costs 12$");
    }

    @Override
    public void visit(PartsOrder partsOrder) {

        System.out.println("If customer buying more than 3 parts we are giving discount on shipping amount");
        if (partsOrder.getParts().size() > 3 ) {
            shippingAmount -=5;
        }
        System.out.println("Shipping amount is: " + shippingAmount);
    }
}
