package com.mdc.enva.AutomateTesting.Parameterized;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameters;

import java.util.Arrays;
import java.util.List;

@RunWith(Parameterized.class)
public class ParameterizedTest {
    private int input;
    private int expected;

    public ParameterizedTest(int input, int expected) {
        this.input = input;
        this.expected = expected;
    }

    @Parameters
    public static List<Object[]> data() {
        return Arrays.asList(new Object[][]{
                {5, 5},
                {6, 5},
                {6, 5},
        });
    }

    @Test
    public void testParameters() {
        System.out.println(input);
        System.out.println(expected);
    }
}
