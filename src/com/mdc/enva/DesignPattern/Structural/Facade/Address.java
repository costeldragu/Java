package com.mdc.enva.DesignPattern.Structural.Facade;

import java.util.PrimitiveIterator;

public class Address {
    private int id;
    private String street;
    private String city;

    public int getId() {
        return id;
    }

    public Address setId(int id) {
        this.id = id;
        return this;
    }

    public String getStreet() {
        return street;
    }

    public Address setStreet(String street) {
        this.street = street;
        return this;
    }

    public String getCity() {
        return city;
    }

    @Override
    public String toString() {
        return "Address{" +
                "id=" + id +
                ", street='" + street + '\'' +
                ", city='" + city + '\'' +
                '}';
    }

    public Address setCity(String city) {
        this.city = city;
        return this;
    }




}
