package com.mdc.Streams;

import java.io.*;

/**
 * Created by cdragu on 06.07.2017.
 */
public class Example {

    Example() {
        StringBuilder filePath = new StringBuilder(System.getProperty("user.dir"));
        filePath.append("/src/com/mdc/Streams/Resources/info.dat");
        try {
            //Read a file in binnary way
            FileInputStream fin = new FileInputStream(filePath.toString());
            fin.close();
            //Write a file in text format
            StringBuilder fileWrite = new StringBuilder(System.getProperty("user.dir"));
            fileWrite.append("/src/com/mdc/Streams/Resources/write.dat");
            PrintWriter out = new PrintWriter(fileWrite.toString());
            out.println("[settings]");
            out.println("name=Dragu Costel");
            out.println("position=Developer");
            out.println("grade=engineer");
            out.flush();
            out.close();

            //Read data line by line
            BufferedReader in = new BufferedReader(
                    new InputStreamReader(
                            new FileInputStream(fileWrite.toString()), "UTF-8")
            );
            String line;

            while ((line = in.readLine()) != null) {
                System.out.println(line);
            }


        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
    }
}
