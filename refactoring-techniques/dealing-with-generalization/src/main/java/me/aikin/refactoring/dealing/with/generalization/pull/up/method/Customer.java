package me.aikin.refactoring.dealing.with.generalization.pull.up.method;

import java.util.Date;

public abstract class Customer {
    protected Date lastBillDate;
    private double bill;

    public double getBill() {
        return bill;
    }

    public void addBill(Date date, Double amount) {
        bill = amount;
    }
}

