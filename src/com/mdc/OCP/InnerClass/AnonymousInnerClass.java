package com.mdc.OCP.InnerClass;

/**
 * Created by cdragu on 02.02.2017.
 * Anonymous inner classes are required to extend an existing class or
 * implement an existing interface. They are useful when you have a short implementation
 * that will not be used anywhere else.
 */
public class AnonymousInnerClass {
    abstract class SaleTodayOnly {
        abstract int dollarsOff();
    }

    public int admission(int basePrice) {
        SaleTodayOnly sale = new SaleTodayOnly() {
            int dollarsOff() {
                return 3;
            }
        };
        return basePrice - sale.dollarsOff();
    }
}
