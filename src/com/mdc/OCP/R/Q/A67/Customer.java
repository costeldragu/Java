package com.mdc.OCP.R.Q.A67;

public class Customer {
    private ElectricAccount acct = new ElectricAccount();

    public void useElectricity(double kWh) {
        acct.addKWh(kWh);
    }

    public double getBill() {
        return acct.getBill();
    }
}
