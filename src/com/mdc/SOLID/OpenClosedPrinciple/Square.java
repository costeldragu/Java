package com.mdc.SOLID.OpenClosedPrinciple;

public class Square implements Shape {
    private int lenght;

    public Square(int lenght) {
        this.lenght = lenght;
    }

    @Override
    public double getArea() {
        return Math.pow(lenght,2);

    }
}
