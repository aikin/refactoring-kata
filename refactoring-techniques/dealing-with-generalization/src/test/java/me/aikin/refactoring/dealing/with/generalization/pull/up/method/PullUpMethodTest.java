package me.aikin.refactoring.dealing.with.generalization.pull.up.method;

import org.junit.Test;

import java.sql.Date;
import java.time.Instant;

import static junit.framework.TestCase.assertTrue;

public class PullUpMethodTest {
    @Test
    public void should_get_bill_for_regular_customer() {
        RegularCustomer regularCustomer = new RegularCustomer();
        regularCustomer.createBill(Date.from(Instant.now()));
        assertTrue(100 == regularCustomer.getBill());
    }

    @Test
    public void should_get_bill_for_preferred_customer() {
        PreferredCustomer preferredCustomer = new PreferredCustomer();
        preferredCustomer.createBill(Date.from(Instant.now()));
        assertTrue(200 == preferredCustomer.getBill());
    }
}