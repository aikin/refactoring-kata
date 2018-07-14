package me.aikin.refactoring.simplifying.method.calls.rename.method;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class RenameMethodTest {

    @Test
    public void should_get_office_telephone_number_for_customer() {
        Customer customer = new Customer("CA", "0011");
        assertEquals("(CA) 0011", customer.getTelephoneNumber());
    }
}