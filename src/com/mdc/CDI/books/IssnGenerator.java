package com.mdc.CDI.books;

import java.util.Random;
@EightNumbers
public class IssnGenerator implements NumberGenerator {
    @Override
    public String generateNumber() {
        return "8-" + Math.abs(new Random().nextInt());
    }
}