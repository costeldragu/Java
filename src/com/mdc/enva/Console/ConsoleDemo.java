package com.mdc.enva.Console;

import java.io.Console;

public class ConsoleDemo {
    public static void main(String[] args) {
        // write your code here
        Console console = System.console();
        if (console != null) {
            System.out.println("Tell me your name: ");
            String userInput = console.readLine();
            console.writer().println("Hello " + userInput + "!");
        }else{
            System.out.println("Console is null");
        }

    }
}
