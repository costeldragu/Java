package com.mdc.enva.DesignPattern.Structural.Bridge.ex2;

import com.mdc.enva.DesignPattern.Structural.Bridge.ex2.Colors.Blue;
import com.mdc.enva.DesignPattern.Structural.Bridge.ex2.Colors.Color;
import com.mdc.enva.DesignPattern.Structural.Bridge.ex2.Shapes.Circle;
import com.mdc.enva.DesignPattern.Structural.Bridge.ex2.Shapes.Rectangle;
import com.mdc.enva.DesignPattern.Structural.Bridge.ex2.Shapes.Shape;

public class BridgeDemo {
    public static void main(String args[]) {
        Color blue = new Blue();
        Shape circle = new Circle(blue);
        Shape square = new Rectangle(blue);
        circle.applyColor();
        square.applyColor();
    }
}
