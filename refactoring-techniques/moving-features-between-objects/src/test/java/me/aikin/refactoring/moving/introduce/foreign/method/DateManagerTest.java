package me.aikin.refactoring.moving.introduce.foreign.method;

import org.junit.Test;

import java.util.Date;

import static org.junit.Assert.assertEquals;

public class DateManagerTest {
    @Test
    public void should_get_correct_next_day() {
        Date previousDate = new Date(2011, 11, 11);
        DateManager calculateDate = new DateManager(previousDate);
        Date nextDay = new Date(2011, 11, 12);
        assertEquals(nextDay, calculateDate.getDate());
    }
}