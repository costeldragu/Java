package com.mdc.enva.DesignPattern.Structural.Facade;

import java.util.ArrayList;
import java.util.List;

public class JdbcFacade {

    public int createTable() {
        int count = 0;
        // try to create table and return the result
        System.out.println("Created the table");
        count = 1;
        return count;
    }

    public int insertIntoTable() {
        int count = 0;
        //Try to insert information to the table
        System.out.println("Inserted any think to table");
        count = 1;
        return 0;
    }

    public List<Address> getAddresses() {
        List<Address> addresses = new ArrayList<>();
        //Populate the list and
        addresses.add(new Address().setCity("Braila").setId(1).setStreet("hepites"));
        addresses.add(new Address().setCity("Braila").setId(2).setStreet("cocor"));
        addresses.add(new Address().setCity("Braila").setId(3).setStreet("timisoara"));
        return addresses;
    }
}
