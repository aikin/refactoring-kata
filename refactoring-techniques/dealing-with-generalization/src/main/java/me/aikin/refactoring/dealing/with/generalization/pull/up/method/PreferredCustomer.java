package me.aikin.refactoring.dealing.with.generalization.pull.up.method;

import java.util.Date;

public class PreferredCustomer extends Customer {
    public void createBill(Date date) {
        double chargeAmount = ChargeFor(lastBillDate, date);
        addBill(date, chargeAmount);
    }

    public double ChargeFor(Date startDate, Date endDate) {
        return 200;
    }
}


