package com.mdc.TeachYourselfJava.MarsApplication;


public class MarsRobot implements Robot {
    String status;
    int speed;
    float temperature;
    private String Name;

    @Override
    public void checkTemperature() {
        if(temperature < - 80) {
            status="returning home";
            speed=5;
        }
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    public float getTemperature() {
        return temperature;
    }

    public void setTemperature(float temperature) {
        this.temperature = temperature;
    }

    @Override
    public void showAttributes() {
        System.out.println("Status:"+status);

        System.out.println("Speed:"+speed);
        System.out.println("Temperature:"+temperature);
    }

    @Override
    public void setName(String Name) {
        this.Name = Name;
    }

    @Override
    public String getName() {
        return Name;
    }

}
