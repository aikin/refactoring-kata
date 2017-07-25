package com.refactor.longer;

import org.junit.Test;

import java.util.Date;

import static org.junit.Assert.assertEquals;

public class BusinessSiteTest {

    @Test
    public void should_not_charge_given_reading_amount_not_changed() {
        BusinessSite subject = new BusinessSite();
        subject.addReading(new Reading(10, new Date(1997, 1, 1)));
        subject.addReading(new Reading(10, new Date(1997, 2, 1)));
        assertEquals(new Dollars(0), subject.charge());
    }

    @Test
    public void should_charge_7_26_given_reading_amount_increase_100() {
        BusinessSite subject = new BusinessSite();
        subject.addReading(new Reading(10, new Date(1997, 1, 1)));
        subject.addReading(new Reading(110, new Date(1997, 2, 1)));
        assertEquals(new Dollars(7.26), subject.charge());
    }

    @Test
    public void should_charge_7_19_given_reading_amount_increase_99() {
        BusinessSite subject = new BusinessSite();
        subject.addReading(new Reading(100, new Date(1997, 1, 1)));
        subject.addReading(new Reading(199, new Date(1997, 2, 1)));
        assertEquals(new Dollars(7.19), subject.charge());
    }

    @Test
    public void should_charge_7_33_given_reading_amount_increase_101() {
        BusinessSite subject = new BusinessSite();
        subject.addReading(new Reading(1000, new Date(1997, 1, 1)));
        subject.addReading(new Reading(1101, new Date(1997, 2, 1)));
        assertEquals(new Dollars(7.33), subject.charge());
    }

    @Test

    public void should_charge_14_41_given_reading_amount_increase_101() {
        BusinessSite subject = new BusinessSite();
        subject.addReading(new Reading(10000, new Date(1997, 1, 1)));
        subject.addReading(new Reading(10199, new Date(1997, 2, 1)));
        assertEquals(new Dollars(14.41), subject.charge());
    }

    @Test

    public void should_charge_14_48_given_reading_amount_increase_200() {
        BusinessSite subject = new BusinessSite();
        subject.addReading(new Reading(0, new Date(1997, 1, 1)));
        subject.addReading(new Reading(200, new Date(1997, 2, 1)));
        assertEquals(new Dollars(14.48), subject.charge());
    }

    @Test

    public void should_charge_14_5_given_reading_amount_increase_201() {
        BusinessSite subject = new BusinessSite();
        subject.addReading(new Reading(50, new Date(1997, 1, 1)));
        subject.addReading(new Reading(251, new Date(1997, 2, 1)));
        assertEquals(new Dollars(14.55), subject.charge());
    }

    @Test

    public void should_charge_given_reading_amount_max_increaseds() {
        BusinessSite subject = new BusinessSite();
        subject.addReading(new Reading(0, new Date(1997, 1, 1)));
        subject.addReading(new Reading(Integer.MAX_VALUE, new Date(1997, 2, 1)));
        assertEquals(new Dollars(1.5220290473E8), subject.charge());
    }


    @Test(expected = NullPointerException.class)
    public void should_throw_exception_given_no_reading() {
        BusinessSite subject = new BusinessSite();
        subject.charge();
    }
}