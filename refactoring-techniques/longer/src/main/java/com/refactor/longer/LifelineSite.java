package com.refactor.longer;

import java.util.Arrays;

public class LifelineSite {
    private Reading[] readings = new Reading[1000];
    private static final double TAX_RATE = 0.05;

    public void addReading(Reading newReading) {
        Reading[] newArray = new Reading[readings.length + 1];
        Arrays.copyOf(readings, readings.length);
        System.arraycopy(readings, 0, newArray, 1, readings.length);
        newArray[0] = newReading;
        readings = newArray;
    }

    public Dollars charge() {
        int usage = readings[0].getAmount() - readings[1].getAmount();
        return charge(usage);
    }

    private Dollars charge(int usage) {
        double base1 = Math.min(usage, 100) * 0.03;
        if (usage > 100) {
            base1 += (Math.min(usage, 200) - 100) * 0.05;
        }
        if (usage > 200) {
            base1 += (usage - 200) * 0.07;
        }

        Dollars result = new Dollars(base1);
        Dollars tax = new Dollars(result.minus(new Dollars(8)).max(new Dollars(0)).times(TAX_RATE));
        result = result.plus(tax);

        Dollars fuelCharge = new Dollars(usage * 0.0175);
        result = result.plus(fuelCharge);
        return result.plus(new Dollars(fuelCharge.times(TAX_RATE)));
    }
}