package com.mdc.DesignPattern.Old.Factory;


public class NoShape implements Shape {

    private String shapeType;

    public NoShape() {}
    public NoShape(String shapeType) {
        this.shapeType = shapeType;
    }

    @Override
    public void draw() {
        System.out.println("No shape with the type: " + shapeType);
    }
}