package me.aikin.refactoring.dealing.with.generalization.extract.subclass;

import org.junit.Test;

import static org.junit.Assert.assertTrue;

public class ExtractSubclassTest {
    @Test
    public void should_get_total_price_given_is_labor() {
        JobItem jobItem = new JobItem(10, 2, true, new Employee(20));
        assertTrue(40 == jobItem.getTotalPrice());
    }

    @Test
    public void should_get_total_price_given_is_not_labor() {
        JobItem jobItem = new JobItem(10, 2, false, new Employee(20));
        assertTrue(20 == jobItem.getTotalPrice());
    }
}