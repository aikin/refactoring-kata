package com.refactor.longer;

import java.text.DecimalFormat;

public class Dollars {
    private double amount;

    public Dollars(double d) {
        amount = d;
    }

    public Dollars(Dollars dollars) {
        amount = dollars.amount;
    }

    public Dollars plus(Dollars dollars) {
        return new Dollars(amount + dollars.amount);
    }

    public Dollars times(double taxRate) {
        return new Dollars(amount * taxRate);
    }

    public Dollars min(Dollars dollars) {
        return amount <= dollars.amount ? this : dollars;
    }

    public Dollars minus(Dollars dollars) {
        return new Dollars(amount - dollars.amount);
    }

    public Dollars max(Dollars dollars) {
        return amount >= dollars.amount ? this : dollars;
    }

    public boolean isGreaterThan(Dollars dollars) {
        return amount > dollars.amount;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Dollars dollars = (Dollars) o;

        DecimalFormat decimalFormat = new DecimalFormat("0.00");
        return decimalFormat.format(amount).equals(decimalFormat.format(dollars.amount));
    }

    @Override
    public int hashCode() {
        long temp = Double.doubleToLongBits(amount);
        return (int) (temp ^ (temp >>> 32));
    }
}
