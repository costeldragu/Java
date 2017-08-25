package com.mdc.OCP.R.Q.A45;

public class A45 {
    public static void main(String[] args) throws Exception {
        A45 a45 = new A45();
        int cardNo = 12344;
        a45.readCard(cardNo);
        a45.checkCard(cardNo);


    }

    void readCard(int noCard) throws Exception {
        System.out.println("Read card");
    }

    void checkCard(int noCard)  throws RuntimeException {
        System.out.println("CheckCArd");
    }
}
