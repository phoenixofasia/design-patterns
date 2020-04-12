package com.dna.designPatterns.behavioral.template;

public class StoreOrder extends OrderTemplate {

    public StoreOrder(boolean isGift) {
        this.isGift = isGift;
    }

    @Override
    protected void doCheckout() {
        System.out.println("Store order checkout done");
    }

    @Override
    protected void doPayment() {
        System.out.println("Store Order payment taken");
    }

    @Override
    protected void doReceipt() {
        System.out.println("Store order receipt printed");
    }

    @Override
    protected void doDelivery() {
        System.out.println("Store order handed over to customer");
    }
}
