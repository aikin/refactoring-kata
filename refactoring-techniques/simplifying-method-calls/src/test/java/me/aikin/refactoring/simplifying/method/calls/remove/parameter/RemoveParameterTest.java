package me.aikin.refactoring.simplifying.method.calls.remove.parameter;

import org.junit.Test;

import java.time.LocalDate;

import static org.junit.Assert.assertEquals;

public class RemoveParameterTest {
    @Test
    public void should_get_contact_name() {
        ContactGenerator removeParameter = new ContactGenerator();
        assertEquals("Kent", removeParameter.getContact(LocalDate.now()));
    }
}