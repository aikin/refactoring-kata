package com.refactor.moving.IntroduceLocalExtension;

import java.util.Date;

public class DateCalculator {
    private Date previousDate;

    public DateCalculator(Date previousDate) {
        this.previousDate = previousDate;
    }

    public Date getDate() {
        return new Date(previousDate.getYear(), previousDate.getMonth(), previousDate.getDate() + 1);
    }
}
