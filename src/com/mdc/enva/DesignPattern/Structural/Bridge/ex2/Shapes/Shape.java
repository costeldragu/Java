package com.mdc.enva.DesignPattern.Structural.Bridge.ex2.Shapes;

import com.mdc.enva.DesignPattern.Structural.Bridge.ex2.Colors.Color;

public abstract class Shape {
    protected Color color;

    public Shape(Color color) {
        this.color = color;
    }

    abstract public void applyColor();
}
