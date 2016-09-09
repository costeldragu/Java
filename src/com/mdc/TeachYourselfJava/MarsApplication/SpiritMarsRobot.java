package com.mdc.TeachYourselfJava.MarsApplication;


public class SpiritMarsRobot extends MarsRobot {

    public SpiritMarsRobot() {};
    public SpiritMarsRobot(String Name,String Status,int Temperature,int Speed) {
        this.setSpeed(Speed);
        this.setTemperature(Temperature);
        this.setName(Name);
        this.setStatus(Status);
    }

}
