package com.mdc.OCP.R.Q.A10;

public class Circle {
    double radius;
    public double area;
    public Circle(double r) {
        radius = r;
    }
    public double getRadius() {
        return  radius;
    }
    private void setRadius(double r) {
        radius = r;
    }

    public double getArea() {
        return Math.PI * radius * radius;
    }
}
