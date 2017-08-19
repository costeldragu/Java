package com.mdc.enva.DesignPattern.Behavioral.Mediator;

import java.awt.Toolkit;
import java.util.Timer;
import java.util.TimerTask;

public class MediatorEventDemo {
    private  Timer timer;
    private Toolkit toolkit;

    MediatorEventDemo() {
        toolkit = Toolkit.getDefaultToolkit();
        timer = new Timer();
        timer.schedule(new T1(), 3000);


    }

    public static void main(String[] args) {

        new MediatorEventDemo();

    }
    class T1 extends TimerTask{

        @Override
        public void run() {
            System.out.println("time is out");
            toolkit.beep();
            timer.cancel();
        }
    }
}
