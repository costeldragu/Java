package com.mdc.Network;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Scanner;

public class ThreadedEchoHandler implements Runnable {
    private Socket incoming;

    ThreadedEchoHandler(Socket incoming) {
        this.incoming = incoming;
    }

    @Override
    public void run() {

        // wait for client connection
        try {
            InputStream inStream = incoming.getInputStream();
            OutputStream outStream = incoming.getOutputStream();
            try (Scanner in = new Scanner(inStream)) {
                PrintWriter out = new PrintWriter(outStream, true /* autoFlush */);
                out.println("Hello! Enter BYE to exit.");
                // echo client input
                boolean done = false;
                while (!done && in.hasNextLine()) {
                    String line = in.nextLine();
                    out.println("Echo: " + line);
                    if (line.trim().equals("BYE")) done = true;
                }
            }

        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                incoming.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}


