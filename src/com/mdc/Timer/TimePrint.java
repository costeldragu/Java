package com.mdc.Timer;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Date;

/**
 * Created by cdragu on 16.06.2017.
 */
public class TimePrint implements ActionListener {


    @Override
    public void actionPerformed(ActionEvent e) {
        System.out.println("At the tone, the time is " + new Date());

        Toolkit.getDefaultToolkit().beep();

    }
}
