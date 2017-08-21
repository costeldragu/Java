package com.mdc.enva.DesignPattern.Behavioral.Template.other;

public class TemplateDemo {
    public static void main(String[] args) {
        // write your code here
        System.out.println("Web order:");

        OrderTemplate webOrder = new WebOrder();
        webOrder.processOrder();
    }
}
