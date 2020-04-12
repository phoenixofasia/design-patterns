package com.dna.designPatterns.behavioral.template;

public class WebOrder extends OrderTemplate {

    public WebOrder(boolean isGift) {
        this.isGift = isGift;
    }

    @Override
    protected void doCheckout() {
        System.out.println("Web order checkout done");
    }

    @Override
    protected void doPayment() {
        System.out.println("Web order payment done");
    }

    @Override
    protected void doReceipt() {
        System.out.println("Web order receipt generated");
    }

    @Override
    protected void doDelivery() {
        System.out.println("Web order delivered");
    }
}
