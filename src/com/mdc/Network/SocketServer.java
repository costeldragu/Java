package com.mdc.Network;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Scanner;

public class SocketServer {
    SocketServer() {
        try {
            ServerSocket server = new ServerSocket(8189);
            Socket incoming = server.accept();
            InputStream inStream = incoming.getInputStream();
            OutputStream outStream = incoming.getOutputStream();

            Scanner in = new Scanner(inStream);
            PrintWriter out = new PrintWriter(outStream, true /* autoFlush */);
            out.println("Hello! Enter BYE to exit.");
            boolean done = false;

            while (!done && in.hasNextLine()) {
                String line = in.nextLine();
                out.println("Echo: " + line);
                if (line.trim().equals("BYE")) done = true;
            }

        } catch (IOException e) {
            System.out.printf("IOException :" + e.getMessage());
        }


    }
}
