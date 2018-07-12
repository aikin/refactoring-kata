package me.aikin.refactoring.making.method.calls.simpler.introduce.parameter.object;

import java.time.LocalDate;

public class Entry {
    private int value;
    private LocalDate chargeDate;

    public Entry(int value, LocalDate chargeDate) {
        this.value = value;
        this.chargeDate = chargeDate;
    }

    public LocalDate getChargeDate() {
        return chargeDate;
    }

    public int getValue() {
        return value;
    }
}
