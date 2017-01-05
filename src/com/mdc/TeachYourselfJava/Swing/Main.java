package com.mdc.TeachYourselfJava.Swing;

import javax.swing.*;

/**
 * Created by CaDyMaN on 04.01.2017.
 */
public class Main {

    public static void main(String[] args) {
     App mainF = new App();


    }

    private static void setLookAndFeel() throws ClassNotFoundException, UnsupportedLookAndFeelException, InstantiationException, IllegalAccessException {
        try {
            UIManager.setLookAndFeel(
                    "com.sun.java.swing.plaf.nimbus.NimbusLookAndFeel"
            );
        } catch (Exception exc) {
            // ignore error
        }
    }
}


