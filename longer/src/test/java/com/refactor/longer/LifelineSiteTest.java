package com.refactor.longer;

import org.junit.Test;

import java.util.Date;

import static org.junit.Assert.assertEquals;

public class LifelineSiteTest {
    @Test
    public void should_not_charge_given_reading_amount_not_changed() {
        LifelineSite subject = new LifelineSite();
        subject.addReading(new Reading(10, new Date(1997, 1, 1)));
        subject.addReading(new Reading(10, new Date(1997, 2, 1)));
        assertEquals(new Dollars(0), subject.charge());
    }


    @Test
    public void should_charge_4_84_given_reading_amount_increase_100() {
        LifelineSite subject = new LifelineSite();
        subject.addReading(new Reading(10, new Date(1997, 1, 1)));
        subject.addReading(new Reading(110, new Date(1997, 2, 1)));
        assertEquals(new Dollars(4.84), subject.charge());
    }

    @Test
    public void should_charge_4_79_given_reading_amount_increase_99() {
        LifelineSite subject = new LifelineSite();
        subject.addReading(new Reading(100, new Date(1997, 1, 1)));
        subject.addReading(new Reading(199, new Date(1997, 2, 1)));
        assertEquals(new Dollars(4.79), subject.charge());
    }

    @Test
    public void should_charge_4_91_given_reading_amount_increase_101() {
        LifelineSite subject = new LifelineSite();
        subject.addReading(new Reading(1000, new Date(1997, 1, 1)));
        subject.addReading(new Reading(1101, new Date(1997, 2, 1)));
        assertEquals(new Dollars(4.91), subject.charge());
    }

    @Test
    public void should_charge_11_61_given_reading_amount_increase_199() {
        LifelineSite subject = new LifelineSite();
        subject.addReading(new Reading(10000, new Date(1997, 1, 1)));
        subject.addReading(new Reading(10199, new Date(1997, 2, 1)));
        assertEquals(new Dollars(11.61), subject.charge());
    }

    @Test
    public void should_charge_11_68_given_reading_amount_increase_200() {
        LifelineSite subject = new LifelineSite();
        subject.addReading(new Reading(0, new Date(1997, 1, 1)));
        subject.addReading(new Reading(200, new Date(1997, 2, 1)));
        assertEquals(new Dollars(11.68), subject.charge());
    }

    @Test
    public void should_charge_11_77_given_reading_amount_increase_201() {
        LifelineSite subject = new LifelineSite();
        subject.addReading(new Reading(50, new Date(1997, 1, 1)));
        subject.addReading(new Reading(251, new Date(1997, 2, 1)));
        assertEquals(new Dollars(11.77), subject.charge());
    }

    @Test
    public void should_charge_given_reading_amount_max_increaseds() {
        LifelineSite subject = new LifelineSite();
        subject.addReading(new Reading(0, new Date(1997, 1, 1)));
        subject.addReading(new Reading(Integer.MAX_VALUE, new Date(1997, 2, 1)));
        assertEquals(new Dollars(1.9730005337E8), subject.charge());
    }

    @Test(expected = NullPointerException.class)
    public void should_throw_exception_given_no_reading() {
        LifelineSite subject = new LifelineSite();
        subject.charge();
    }

}