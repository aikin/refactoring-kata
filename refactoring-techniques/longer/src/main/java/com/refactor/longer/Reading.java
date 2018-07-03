package com.refactor.longer;

import java.util.Date;

public class Reading {
    private final Date date;
    private final int amount;

    public Reading(int amount, Date date) {
        this.amount = amount;
        this.date = date;
    }

    public Date getDate() {
        return date;
    }

    public int getAmount() {
        return amount;
    }
}
