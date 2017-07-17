package com.mdc.Streams;

import java.io.FileOutputStream;
import java.io.ObjectOutputStream;

/**
 * Created by cdragu on 17.07.2017.
 */
public class Serialize {

    Serialize() {
        StringBuilder filePath = new StringBuilder(System.getProperty("user.dir"));
        filePath.append("/src/com/mdc/Streams/Resources/serialize.dat");
        ObjectOutputStream out;
        try {
            out = new ObjectOutputStream(new FileOutputStream(filePath.toString()));
            Employee employee = new Employee()
                    .setFirstName("Dragu")
                    .setLastName("Costel")
                    .setGrade("Engineer")
                    .setPositions("Developer");
            out.writeObject(employee);

            out.close();

        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}
