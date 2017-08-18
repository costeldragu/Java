package com.mdc.enva.DesignPattern.Structural.Bridge.ex2.Shapes;

import com.mdc.enva.DesignPattern.Structural.Bridge.ex2.Colors.Color;

public class Rectangle extends Shape {
    public Rectangle(Color color) {
        super(color);
    }

    @Override
    public void applyColor() {
        color.applyColor();
    }
}
