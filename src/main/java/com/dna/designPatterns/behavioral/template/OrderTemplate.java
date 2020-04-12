package com.dna.designPatterns.behavioral.template;

public abstract class OrderTemplate {

    protected boolean isGift;
    protected abstract void doCheckout();
    protected abstract void doPayment();
    protected abstract void doReceipt();
    protected abstract void doDelivery();

    public final void wrapGift() {
        System.out.println("Gift wrapped");
    }

    public final void processOrder() {
        doCheckout();
        doPayment();
        if (isGift) {
            wrapGift();
        }
        doReceipt();
        doDelivery();
    }
}
