package com.mdc.enva.DesignPattern.Behavioral.Interpreter;

public class TerminalExpression implements Expression {
    private String data;

    public TerminalExpression(String data) {
        this.data = data;
    }

    @Override
    public boolean interpret(String contenxt) {
        return false;
    }
}
