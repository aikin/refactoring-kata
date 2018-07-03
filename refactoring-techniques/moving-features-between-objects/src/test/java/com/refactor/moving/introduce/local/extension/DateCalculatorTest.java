package com.refactor.moving.introduce.local.extension;

import org.junit.Test;

import java.util.Date;

import static org.junit.Assert.assertEquals;

public class DateCalculatorTest {
    @Test
    public void should_get_correct_next_day() {
        Date previousDate = new Date(2011, 10, 11);
        DateCalculator calculateDate = new DateCalculator(previousDate);
        Date nextDay = new Date(2011, 10, 12);
        assertEquals(nextDay, calculateDate.getDate());
    }
}