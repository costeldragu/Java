package com.mdc.enva.DesignPattern.Old.AbstratFactory;

public abstract class AbstractFactory {
    abstract Color getColor(String color);
    abstract Shape getShape(String shape) ;
}