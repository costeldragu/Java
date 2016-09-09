package com.mdc.TeachYourselfJava.MarsApplication;

import java.util.List;
import java.util.ArrayList;

public class MarsApplication {
    public static void main(String[] arguments) {
        //To Be Continued;
        List<MarsRobot> spirits = new ArrayList<MarsRobot>();


        MarsRobot spirit = new SpiritMarsRobot();
        spirit.setStatus("Exploring");
        spirit.setSpeed(2);
        spirit.setTemperature(-60);
        spirit.showAttributes();
        System.out.println("Increasing speed to 3.");
        spirit.setSpeed(3);
        spirit.showAttributes();
        System.out.println("Checking the temperature.");
        spirit.checkTemperature();
        spirit.showAttributes();
    }
}
