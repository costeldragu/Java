package com.mdc.TeachYourselfJava.MarsApplication;

import java.util.List;
import java.util.ArrayList;

public class MarsApplication {
    public static void main(String[] arguments) {
        //To Be Continued;
        List<MarsRobot> spirits = new ArrayList<MarsRobot>();

        spirits.add(new SpiritMarsRobot("Spirit Mars 1","Exploring",-60,2));
        spirits.add(new SpiritMarsRobot("Spirit Mars 2","Exploring",-60,3));
        spirits.add(new DeltaMarsRobot("Delta Mars 3","Exploring",-60,4));
        spirits.add(new SpiritMarsRobot("Spirit Mars 4","Exploring",-60,3));
        spirits.add(new SpiritMarsRobot("Spirit Mars 5","Exploring",-60,1));
        spirits.add(new DeltaMarsRobot("Delta Mars 6","Exploring",-60,4));
        spirits.add(new SpiritMarsRobot("Spirit Mars 7","Exploring",-60,1));
        spirits.add(new DeltaMarsRobot("Delta Mars 8","Exploring",-60,3));
        spirits.add(new SpiritMarsRobot("Spirit Mars 9","Exploring",-60,5));
        spirits.add(new DeltaMarsRobot("Delta Mars 10","Exploring",-60,7));

        robotsStatus(spirits);


    }

    public static void robotsStatus(List<MarsRobot> robots) {
        for ( MarsRobot robot : robots
                ) {
            robot.showAttributes();

        }
    }

}
