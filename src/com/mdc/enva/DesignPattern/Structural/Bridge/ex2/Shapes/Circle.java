package com.mdc.enva.DesignPattern.Structural.Bridge.ex2.Shapes;

import com.mdc.enva.DesignPattern.Structural.Bridge.ex2.Colors.Color;

public class Circle extends Shape {
    public Circle(Color color) {
        super(color);
    }

    @Override
    public void applyColor() {
        color.applyColor();
    }
}
