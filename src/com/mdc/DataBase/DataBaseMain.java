package com.mdc.DataBase;

import java.io.IOException;
import java.sql.SQLException;

public class DataBaseMain {
    public static void main(String[] args) {
        // write your code here
        try {
            MySqlConnection test = new MySqlConnection();
        } catch (IOException e) {
            e.printStackTrace();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
