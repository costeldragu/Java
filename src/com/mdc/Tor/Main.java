package com.mdc.Tor;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.*;
import java.util.ArrayList;
import java.util.List;


/**
 * Created by CaDyMaN on 14.01.2017.
 */
public class Main {
    private static List<String> values = new ArrayList<>();
    public static void main(String[] args) {

        values.add("ddd");
//        int x = 0;
//        for (long y=0; y < 100 && x < 100; ++y, ++x) {
//            System.out.println(x);
//        }
//        int x = 0;
//        for(long y = 0, x = 4; x < 5 && y < 10; x++, y++) { // DOES NOT COMPILE
//            System.out.print(x + " ");
//        }

        int[][] matrix = {{5,2,1},{3,9,8},{5,7,3}};

        for(int[] row:matrix) {
            for( int column : row) {
                System.out.print(column);
            }
            System.out.println("");
        }


//        System.setProperty("http.proxyHost", "webcache.example.com");
//        System.setProperty("http.proxyPort", "8080");
//        String url = new String("http://google.ro");
//        try {
//
//            URL u = new URL(url);
//            BufferedReader in = new BufferedReader(new InputStreamReader(u.openStream()));
//                String inputLine;
//                while ((inputLine = in.readLine()) != null){
//                    System.out.println(inputLine);
//                }
//            in.close();
//
//        } catch (Exception e) {
//        }
//
//        System.clearProperty("http.proxyHost");

//        HttpHost proxy = new HttpHost("127.0.0.1", 8118, "http");
//
//        DefaultHttpClient httpclient = new DefaultHttpClient();
//        try {
//            httpclient.getParams().setParameter(ConnRoutePNames.DEFAULT_PROXY, proxy);
//
//            HttpHost target = new HttpHost("www.google.com", 80, "http");
//            HttpGet req = new HttpGet("/");
//
//            System.out.println("executing request to " + target + " via " + proxy);
//            HttpResponse rsp = httpclient.execute(target, req);
//    ...
//        } finally {
//            // When HttpClient instance is no longer needed,
//            // shut down the connection manager to ensure
//            // immediate deallocation of all system resources
//            httpclient.getConnectionManager().shutdown();
//        }

//        Dog [][] theDogs = new Dog[3][];
//        System.out.println(theDogs[2][0].toString());
        Integer a =1;
        Integer b= 1;
        System.out.println(a==b);
    }

    int Long() {
        return (int)9L;
    }

    public void fly(int... ints) {
        System.out.println("...");
    }


}

interface a {
    String eat();
    Integer age();
}
interface b {
    String eat(String what);
    Integer age();
}


class Animal implements   a,b {
    @Override
    public String eat() {
        return null;
    }

    @Override
    public Integer age() {
        return 1;
    }

    @Override
    public String eat(String what) {
        return null;
    }

}

//class Dog extends Animal {
//
//    public Integer age() { }
//
//    public Integer age(int a) { }
//
//    public Character eatt() {
//
//    }
//}