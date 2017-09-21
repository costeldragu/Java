package com.mdc.SOLID.SingleResponsiblityPrinciple;

public class Square implements Shape {
    private int lenght;

    public Square(int lenght) {
        this.lenght = lenght;
    }

    @Override
    public int getArea() {
        return lenght;
    }
}
