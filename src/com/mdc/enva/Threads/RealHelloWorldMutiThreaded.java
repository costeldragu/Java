package com.mdc.enva.Threads;

public class RealHelloWorldMutiThreaded {

 //   public static class Greeter extends Thread {
    public static class Greeter implements Runnable {
        private String country;
        public Greeter(String country) {
            this.country = country;
        }
        @Override
        public void run() {
            try{
                Thread.sleep((long)(Math.random() * 5000));
            }catch (InterruptedException e) {

            }

            long id = Thread.currentThread().getId();
            System.out.println(id + ": Hello " + country + "!");
        }
    }

    public static void main(String[] args) {
        String countries[] = {"France", "India", "China", "USA"};
        for(String country : countries) {
            Greeter greeter = new Greeter(country);
            new Thread(greeter, country + " thread").start();
//            System.out.println("Hello " + country + "!");
//           new Greeter(country).start();
//           new Greeter(country).run();
        }
    }

}
