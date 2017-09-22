package com.mdc.OCP.R.Q.A67;

public class ElectricAccount {
    private double kWh;
    private double rate = 0.07;
    private double bill;

    public void addKWh(double kWh) {
        if (kWh > 0) {
            this.kWh += kWh;
            this.bill = this.kWh * this.rate;
        }
    }

    public double getBill() {
        return bill;
    }

}
