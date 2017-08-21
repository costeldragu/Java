package com.mdc.enva.DesignPattern.Behavioral.Template.other;

public abstract class OrderTemplate {
    public boolean isGift;

    public abstract void doCheckout();

    public abstract void doPayment();

    public abstract void doReceipt();

    public abstract void doDelivery();


    public final void wrapGift() {
        System.out.println("Gif was wrapt");
    }

    public final void processOrder() {
        doCheckout();
        doPayment();
        if (isGift) {
            wrapGift();
        } else {
            doReceipt();
        }
        doDelivery();

    }
}


