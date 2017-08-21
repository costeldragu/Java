package com.mdc.enva.DesignPattern.Behavioral.Memento;

import java.util.Stack;

public class Caretaker {
    private Stack<EmployeeMemento> employeeMementoHitory = new Stack<>();

    public void save(Employee emp) {
        employeeMementoHitory.push(emp.save());
    }

    public void revert(Employee emp) {
        emp.revert(employeeMementoHitory.pop());
    }
}
