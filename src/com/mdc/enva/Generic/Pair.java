package com.mdc.enva.Generic;

/**
 * Created by cdragu on 23.06.2017.
 */
public class Pair<T> {
    private T first;
    private T second;

    public Pair() {
        first = null;
        second = null;
    }

    public Pair(T first, T second) {
        this.first = first;
        this.second = second;
    }

    public T getFirst() {
        return first;
    }

    public T getSecond() {
        return second;
    }


    public Pair setFirst(T newValue) {
        first = newValue;
        return this;
    }

    public Pair setSecond(T newValue) {
        second = newValue;
        return this;
    }


    @Override
    public String toString() {
        return "First:"+ this.first + ", Second:" + this.second;
    }
}
