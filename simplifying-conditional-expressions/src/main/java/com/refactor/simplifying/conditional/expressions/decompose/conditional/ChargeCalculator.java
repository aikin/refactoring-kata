package com.refactor.simplifying.conditional.expressions.decompose.conditional;

import java.util.Date;

public class ChargeCalculator {
    private Date SUMMER_START = new Date(2011, 6, 1);
    private Date SUMMER_END = new Date(2011, 9, 31);
    private double winterServiceCharge = 100;
    private double winterRate = 3;
    private double summerRate = 2;

    public double getCharge(Date date, double quantity) {
        double charge;
        if (date.before(SUMMER_START) || date.after(SUMMER_END))
            charge = quantity * winterRate + winterServiceCharge;
        else charge = quantity * summerRate;
        return charge;
    }
}
