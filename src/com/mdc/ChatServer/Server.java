package com.mdc.ChatServer;

import com.mdc.Network.ThreadedEchoHandler;

import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.BlockingQueue;

public class Server {
    public static List<Thread> clients = new ArrayList<>();
    public static BlockingQueue<String> messages = new ArrayBlockingQueue<>(1024);
    public static void main(String[] args) {
        int i = 1;
        try(ServerSocket s = new ServerSocket(8189)) {
            while (true) {
                Socket incoming = s.accept();
                System.out.println("Client connected " + i);
                Runnable client = new ThreadSoket(incoming,messages);
                Thread t = new Thread(client,"Client " + i);
                t.start();
                clients.add(t);
                ++i;
            }
        } catch (IOException e) {
            e.printStackTrace();
        }

    }



}
