package com.mdc.enva.DesignPattern.Structural.Facade;

import java.util.List;

/**
 * Hide the implementations behind a method
 */
public class FacadeDemo {
    public static void main(String[] args) {
        // write your code here
        JdbcFacade database = new JdbcFacade();
        database.createTable();
        database.insertIntoTable();
        List<Address> addressList = database.getAddresses();
        for(Address address: addressList) {
            System.out.println(address);
        }
    }
}
