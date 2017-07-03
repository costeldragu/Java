package com.mdc.Awt.Bounce;

import java.awt.*;
import java.awt.event.ActionListener;
import javax.swing.*;

/**
 * Created by cdragu on 03.07.2017.
 */
public class BounceFrame extends JFrame {
    private BallComponent comp;
    public static final int STEPS = 1000;
    public static final int DELAY = 3;


    BounceFrame() {
        setTitle("Bounce");
        comp = new BallComponent();

        add(comp, BorderLayout.CENTER);

        JPanel buttonPanel = new JPanel();

        addButton(buttonPanel, "Start", event -> addBall());

        addButton(buttonPanel, "Close", event -> System.exit(0));

        add(buttonPanel, BorderLayout.SOUTH);

        pack();

    }


    public void addButton(Container c, String title, ActionListener listener)

    {

        JButton button = new JButton(title);

        c.add(button);

        button.addActionListener(listener);

    }


    /**
     * Adds a bouncing ball to the panel and makes it bounce 1,000 times.
     */
    public void addBall() {
        Ball ball = new Ball();
        comp.add(ball);
        Runnable r = () -> {

            try {


                for (int i = 1; i <= STEPS; i++) {
                    ball.move(comp.getBounds());
                    comp.paint(comp.getGraphics());
                    Thread.sleep(DELAY);
                }
            } catch (InterruptedException e) {

            }
        };
        Thread t = new Thread(r);

        t.start();


    }


}
