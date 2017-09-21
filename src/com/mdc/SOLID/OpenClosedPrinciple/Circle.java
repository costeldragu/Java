package com.mdc.SOLID.OpenClosedPrinciple;

public class Circle implements Shape {
    private int radius;

    Circle(int radius) {
        this.radius = radius;
    }

    @Override
    public double getArea() {
        return Math.PI * Math.pow(radius, 2);
    }


}
