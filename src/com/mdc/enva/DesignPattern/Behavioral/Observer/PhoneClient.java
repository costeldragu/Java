package com.mdc.enva.DesignPattern.Behavioral.Observer;

import java.security.PublicKey;

public class PhoneClient extends Observer {
    public PhoneClient(Subject subject) {
        this.subject = subject;
        subject.attach(this);
    }

    @Override
    void update() {
        System.out.println("Phone Stream: " + subject.getState());
    }

    public void addMessage(String message) {
        subject.setState(message + " sent from phone");
    }
}
