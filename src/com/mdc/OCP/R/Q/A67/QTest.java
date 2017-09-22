package com.mdc.OCP.R.Q.A67;

import org.junit.Test;
import org.junit.Assert.*;

import static org.junit.Assert.assertEquals;

public class QTest {

    @Test
    public void testKWh() {
        Customer c = new Customer();

        c.useElectricity(11);
        assertEquals(0.7,c.getBill(),1);


    }
}
