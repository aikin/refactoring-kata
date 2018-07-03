package me.aikin.refactoring.organizing.data.change.value.to.reference;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class CustomerTest {
    @Test
    public void should_get_number_of_orders_for_customer() {
        Order kentOrder1 = new Order("Kent");
        Order kentOrder2 = new Order("Kent");
        assertEquals("Kent", kentOrder1.getCustomer().getCustomerName());
        assertEquals("Kent", kentOrder2.getCustomer().getCustomerName());

        // Should Pass
//            assertEquals(kentOrder1.Customer, kentOrder2.Customer);
    }
}