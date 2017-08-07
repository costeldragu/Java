package com.mdc.Network;

import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;

public class MultiConnection {
  MultiConnection() {
      int i = 1;
      try(ServerSocket s = new ServerSocket(8189)) {
          while (true) {
              Socket incoming = s.accept();
              System.out.println("Spawning " + i);
              Runnable r = new ThreadedEchoHandler(incoming);
              Thread t = new Thread(r);
              t.start();
              ++i;
          }
      } catch (IOException e) {
          e.printStackTrace();
      }
  }
}
