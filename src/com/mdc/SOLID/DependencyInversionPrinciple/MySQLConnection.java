package com.mdc.SOLID.DependencyInversionPrinciple;

public class MySQLConnection implements DBConnectionInterface {
    @Override
    public boolean connect() {
        return false;
    }
}
