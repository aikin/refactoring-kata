package com.refactor.longer;

import org.junit.Test;

import java.util.Date;

import static org.junit.Assert.assertEquals;

public class DisabilitySiteTest {
    @Test
    public void should_not_charge_given_reading_amount_not_changed() {
        DisabilitySite subject = createDisabilitySite();
        subject.addReading(new Reading(10, new Date(1997, 1, 1)));
        subject.addReading(new Reading(10, new Date(1997, 2, 1)));
        assertEquals(new Dollars(0), subject.charge());
    }

    @Test
    public void should_charge_8_14_given_reading_amount_increase_100() {
        DisabilitySite subject = createDisabilitySite();
        subject.addReading(new Reading(10, new Date(1997, 1, 1)));
        subject.addReading(new Reading(110, new Date(1997, 2, 1)));
        assertEquals(new Dollars(8.14), subject.charge());
    }

    @Test
    public void should_charge_8_06_given_reading_amount_increase_99() {
        DisabilitySite subject = createDisabilitySite();
        subject.addReading(new Reading(100, new Date(1997, 1, 1)));
        subject.addReading(new Reading(199, new Date(1997, 2, 1)));
        assertEquals(new Dollars(8.06), subject.charge());
    }

    @Test
    public void should_charge_8_22_given_reading_amount_increase_101() {
        DisabilitySite subject = createDisabilitySite();
        subject.addReading(new Reading(1000, new Date(1997, 1, 1)));
        subject.addReading(new Reading(1101, new Date(1997, 2, 1)));
        assertEquals(new Dollars(8.22), subject.charge());
    }

    @Test
    public void should_charge_16_12_given_reading_amount_increase_199() {
        DisabilitySite subject = createDisabilitySite();
        subject.addReading(new Reading(10000, new Date(1997, 1, 1)));
        subject.addReading(new Reading(10199, new Date(1997, 2, 1)));
        assertEquals(new Dollars(16.12), subject.charge());
    }

    @Test
    public void should_charge_16_20_given_reading_amount_increase_200() {
        DisabilitySite subject = createDisabilitySite();
        subject.addReading(new Reading(0, new Date(1997, 1, 1)));
        subject.addReading(new Reading(200, new Date(1997, 2, 1)));
        assertEquals(new Dollars(16.20), subject.charge());
    }

    @Test
    public void should_charge_16_28_given_reading_amount_increase_201() {
        DisabilitySite subject = createDisabilitySite();
        subject.addReading(new Reading(50, new Date(1997, 1, 1)));
        subject.addReading(new Reading(251, new Date(1997, 2, 1)));
        assertEquals(new Dollars(16.28), subject.charge());
    }

    @Test
    public void should_charge_given_reading_amount_max_increaseds() {
        DisabilitySite subject = createDisabilitySite();
        subject.addReading(new Reading(0, new Date(1997, 1, 1)));
        subject.addReading(new Reading(Integer.MAX_VALUE, new Date(1997, 2, 1)));
        assertEquals(new Dollars(1.7738214892E8), subject.charge());
    }

    @Test(expected = ArrayIndexOutOfBoundsException.class)
    public void should_throw_exception_given_no_reading() {
        DisabilitySite subject = createDisabilitySite();
        subject.charge();
    }

    public DisabilitySite createDisabilitySite() {
        Zone zone = new Zone("A", 0.06, 0.07, new Date(1997, 5, 15), new Date(1997, 9, 10));
        return new DisabilitySite(zone);
    }
}