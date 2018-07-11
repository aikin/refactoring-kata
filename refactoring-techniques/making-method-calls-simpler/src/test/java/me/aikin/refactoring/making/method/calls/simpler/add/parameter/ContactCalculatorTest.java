package me.aikin.refactoring.making.method.calls.simpler.add.parameter;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class ContactCalculatorTest {
    @Test
    public void should_get_contact_name() {
        ContactCalculator contactCalculator = new ContactCalculator();
        assertEquals("Kent", contactCalculator.getContact());
    }

}