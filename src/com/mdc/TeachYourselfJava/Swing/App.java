package com.mdc.TeachYourselfJava.Swing;

import javax.swing.*;

/**
 * Created by CaDyMaN on 04.01.2017.
 */
public class App extends JFrame {

    App() {
        //Set title
        super("Test");
        //Set window default size
        setSize(800,600);

        //DEfault action on this is close
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        CreateToolbar();

        //Set if the window is visible
        setVisible(true);
    }

    private void CreateToolbar() {
        JPanel toolbar = new JPanel();
        JButton start = new JButton("Start");

        toolbar.add(start);
        add(toolbar);
    }
}
