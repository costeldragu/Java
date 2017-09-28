package com.mdc.OCP.R.Q.A126;

public class SpecialException extends Exception {
    public SpecialException(String message) {
        super(message);
        System.out.println(message);
    }
}
