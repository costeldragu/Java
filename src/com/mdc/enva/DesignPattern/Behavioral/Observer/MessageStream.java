package com.mdc.enva.DesignPattern.Behavioral.Observer;

import java.util.ArrayDeque;
import java.util.Collection;
import java.util.Deque;
import java.util.Iterator;

public class MessageStream extends Subject {

    private Deque<String> messageHistory = new ArrayDeque<>();

    @Override
    String getState() {
        return null;
    }

    @Override
    void setState(String message) {
        messageHistory.add(message);
    }
}
