package me.aikin.refactoring.dealing.with.generalization.push.down.field;

import org.junit.Test;

import static junit.framework.TestCase.assertTrue;

public class PushDownFieldTest {
    @Test
    public void should_get_sales_man_quota() {
        Salesman salesman = new Salesman(100);
        assertTrue(100 == salesman.getSalesmanQuota());
    }
}