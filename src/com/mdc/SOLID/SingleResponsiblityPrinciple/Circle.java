package com.mdc.SOLID.SingleResponsiblityPrinciple;

public class Circle implements Shape {
    private int radius;

    Circle(int radius) {
        this.radius = radius;
    }

    @Override
    public int getArea() {
        return radius;
    }
}
