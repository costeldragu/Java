package com.mdc.Awt.Bounce;
import java.awt.*;
import javax.swing.*;

/**
 * Created by cdragu on 03.07.2017.
 */
public class Bounce {

    public static void main(String[] args){
        EventQueue.invokeLater(() -> {
            JFrame frame = new BounceFrame();
            frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
            frame.setVisible(true);
        });
    }
}


