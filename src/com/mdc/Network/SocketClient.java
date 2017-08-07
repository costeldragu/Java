package com.mdc.Network;

import java.io.IOException;
import java.io.InputStream;
import java.net.Socket;
import java.util.Scanner;

public class SocketClient {
    SocketClient() {
        try(Socket s = new Socket("time-A.timefreq.bldrdoc.gov", 13)) {
            InputStream inStream = s.getInputStream();
            Scanner in = new Scanner(inStream);
            while (in.hasNextLine()) {
                String line = in.nextLine();
                System.out.printf("line");
            }
            System.out.println("Socket finised");
        }catch (IOException e) {
            System.out.printf("IOException: " + e.getMessage());
        }
    }
}
