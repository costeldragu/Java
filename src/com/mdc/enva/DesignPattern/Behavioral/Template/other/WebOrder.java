package com.mdc.enva.DesignPattern.Behavioral.Template.other;

public class WebOrder extends OrderTemplate {
    @Override
    public void doCheckout() {
        System.out.println("doCheckout");
    }

    @Override
    public void doPayment() {
        System.out.println("doPayment");
    }

    @Override
    public void doReceipt() {
        System.out.println("doReceipt");
    }

    @Override
    public void doDelivery() {
        System.out.println("doDelivery");
    }
}
