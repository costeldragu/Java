package com.mdc.ListCrwaler;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.net.URL;

/**
 * Created by CaDyMaN on 13.01.2017.
 */
public class Main {
    public static void main(String[] args) {
        List<Thread> treades = new ArrayList<>();

        for(int x =0 ; x<1000;++x) {
            treades.add(new Thread(new SearchUrl("t"+x)));
        }


        for(Thread t : treades) {
            t.start();
        }
//        Thread test = new Thread(new SearchUrl("t"));
//        test.start();
    }
}
