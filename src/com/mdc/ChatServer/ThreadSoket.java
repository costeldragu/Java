package com.mdc.ChatServer;

import com.mysql.jdbc.StringUtils;

import java.awt.font.NumericShaper;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.io.PrintWriter;
import java.net.Socket;
import java.util.Collections;
import java.util.Scanner;
import java.util.concurrent.BlockingQueue;
import java.util.stream.IntStream;

public class ThreadSoket implements Runnable {
    private Socket incoming;
    private int lineHeaderLenght = 150;
    private char headerTableChar = '*';
    BlockingQueue<String> messages ;



    ThreadSoket(Socket incoming , BlockingQueue<String> messages) {
        this.incoming = incoming;
        this.messages = messages;
    }

    @Override
    public void run() {
// wait for client connection
        try {
            InputStream inStream = incoming.getInputStream();
            OutputStream outStream = incoming.getOutputStream();
            try (Scanner in = new Scanner(inStream)) {
                PrintWriter out = new PrintWriter(outStream, true /* autoFlush */);

                out.println(printHeader());
                out.println("Hello! Enter BYE to exit.");
                // echo client input
                boolean done = false;
                while (!done) {

                    if(in.hasNextLine()) {
                        String line = in.nextLine();
                        out.println("Echo: " + line);
                        if (line.trim().equals("BYE")) done = true;
                    }
                    System.out.println("working");
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

    /**
     * Print the headers
     * @return
     */
    private String printHeader() {
        StringBuilder header = new StringBuilder();
        String message = "Welcome to MDC server !!";
        header.append(stringRepeat("*", lineHeaderLenght, true));
        header.append(printLine(message));
        header.append(stringRepeat("*", lineHeaderLenght, true));
        return header.toString();
    }

    /**
     * @param string
     * @param times
     * @return
     */
    private String stringRepeat(String string, int times, boolean newline) {
        StringBuilder repeatString = new StringBuilder();
        Collections.nCopies(times, 0).stream().forEach(i -> repeatString.append(string));

//        for (int x = 0; x < times; ++x) {
//            repeatString.append(string);
//        }
        if (newline) {
            repeatString.append("\n\r");
        }
        return repeatString.toString();
    }

    /**
     *
     * @param string
     * @param times
     * @return
     */
    private String stringRepeat(String string, int times) {
        return stringRepeat(string, times, false);
    }

    /**
     *
     * @param message
     * @return
     */
    private String printLine(String message) {
        StringBuilder line = new StringBuilder();
        int difference = (int) ((lineHeaderLenght - message.length()) / 2)-1;
        line.append(headerTableChar);
        line.append(stringRepeat(" ",difference));
        line.append(message);
        line.append(stringRepeat(" ",difference));
        line.append(headerTableChar);
        line.append("\n\r");
        return line.toString();
    }
}