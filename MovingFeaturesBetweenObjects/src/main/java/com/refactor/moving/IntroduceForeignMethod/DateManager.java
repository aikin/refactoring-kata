package com.refactor.moving.IntroduceForeignMethod;

import java.util.Date;

public class DateManager {
    private Date previousDate;

    public DateManager(Date previousDate) {
        this.previousDate = previousDate;
    }

    public Date getDate() {
        return new Date(previousDate.getYear(), previousDate.getMonth(), previousDate.getDate() + 1);
    }
}
