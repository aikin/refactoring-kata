package com.refactor.longer;

import org.junit.Test;

import java.util.Date;

import static org.junit.Assert.assertEquals;

public class ResidentialSiteTest {
    @Test
    public void should_not_charge_given_reading_amount_not_changed() {
        ResidentialSite subject = CreateResidentialSite();
        subject.addReading(new Reading(10, new Date(1997, 1, 1)));
        subject.addReading(new Reading(10, new Date(1997, 2, 1)));
        assertEquals(new Dollars(0), subject.charge());
    }

    @Test
    public void should_charge_9_19_given_reading_amount_increase_100() {
        ResidentialSite subject = CreateResidentialSite();
        subject.addReading(new Reading(10, new Date(1997, 1, 1)));
        subject.addReading(new Reading(110, new Date(1997, 2, 1)));
        assertEquals(new Dollars(9.19), subject.charge());
    }

    @Test
    public void should_charge_9_10_given_reading_amount_increase_99() {
        ResidentialSite subject = CreateResidentialSite();
        subject.addReading(new Reading(100, new Date(1997, 1, 1)));
        subject.addReading(new Reading(199, new Date(1997, 2, 1)));
        assertEquals(new Dollars(9.10), subject.charge());
    }

    @Test
    public void should_charge_9_28_given_reading_amount_increase_101() {
        ResidentialSite subject = CreateResidentialSite();
        subject.addReading(new Reading(1000, new Date(1997, 1, 1)));
        subject.addReading(new Reading(1101, new Date(1997, 2, 1)));
        assertEquals(new Dollars(9.28), subject.charge());
    }

    @Test
    public void should_charge_18_28_given_reading_amount_increase_199() {
        ResidentialSite subject = CreateResidentialSite();
        subject.addReading(new Reading(10000, new Date(1997, 1, 1)));
        subject.addReading(new Reading(10199, new Date(1997, 2, 1)));
        assertEquals(new Dollars(18.28), subject.charge());
    }

    @Test
    public void should_charge_18_38_given_reading_amount_increase_200() {
        ResidentialSite subject = CreateResidentialSite();
        subject.addReading(new Reading(0, new Date(1997, 1, 1)));
        subject.addReading(new Reading(200, new Date(1997, 2, 1)));
        assertEquals(new Dollars(18.38), subject.charge());
    }

    @Test
    public void should_charge_18_47_given_reading_amount_increase_201() {
        ResidentialSite subject = CreateResidentialSite();
        subject.addReading(new Reading(50, new Date(1997, 1, 1)));
        subject.addReading(new Reading(251, new Date(1997, 2, 1)));
        assertEquals(new Dollars(18.47), subject.charge());
    }

    @Test
    public void should_charge_given_reading_amount_max_increaseds() {
        ResidentialSite subject = CreateResidentialSite();
        subject.addReading(new Reading(0, new Date(1997, 1, 1)));
        subject.addReading(new Reading(Integer.MAX_VALUE, new Date(1997, 2, 1)));
        assertEquals(new Dollars(1.9730006007E8), subject.charge());
    }

    @Test(expected = ArrayIndexOutOfBoundsException.class)
    public void should_throw_exception_given_no_reading() {
        ResidentialSite subject = CreateResidentialSite();
        subject.charge();
    }

    public ResidentialSite CreateResidentialSite() {
        Zone zone = new Zone("B", 0.07, 0.06, new Date(1997, 6, 5), new Date(1997, 8, 31));
        return new ResidentialSite(zone);
    }
}