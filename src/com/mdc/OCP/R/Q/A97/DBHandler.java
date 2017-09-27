package com.mdc.OCP.R.Q.A97;

public class DBHandler {
    DBConfiguration configureDB(String uname, String password) {
        //insert code here
        return new DBConfiguration();
    }

    public static void main(String[] args) {
        DBHandler r = new DBHandler();
        DBConfiguration dbConfig = r.configureDB("manager","manager");
    }
}
