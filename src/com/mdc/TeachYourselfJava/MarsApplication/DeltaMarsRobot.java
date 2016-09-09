package com.mdc.TeachYourselfJava.MarsApplication;


public class DeltaMarsRobot extends MarsRobot {
    DeltaMarsRobot() { }
    DeltaMarsRobot(String Name,String Status,int Temperature,int Speed) {
      this.setSpeed(Speed);
      this.setTemperature(Temperature);
      this.setName(Name);
      this.setStatus(Status);
  }
}
