package com.mdc.enva.DesignPattern.Structural.Bridge.ex1;

public class Shape1BridgeDemo {
    public static void main(String args[]) {
        Circle circle = new BlueCircle();
        Square square = new RedSquare();
        Square greenSqare = new GreenSquare();
        circle.applyColor();
        square.applyColor();
        greenSqare.applyColor();
    }
}
