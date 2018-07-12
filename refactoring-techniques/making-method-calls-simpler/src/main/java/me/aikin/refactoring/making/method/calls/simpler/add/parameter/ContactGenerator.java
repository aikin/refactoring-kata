package me.aikin.refactoring.making.method.calls.simpler.add.parameter;

import java.time.LocalDate;

public class ContactGenerator {
    public String getContact() {
        LocalDate currentDate = LocalDate.now();
        LocalDate date = LocalDate.of(2012, 12, 31);
        return currentDate.isAfter(date) ? "Kent" : "Martin";
    }
}
