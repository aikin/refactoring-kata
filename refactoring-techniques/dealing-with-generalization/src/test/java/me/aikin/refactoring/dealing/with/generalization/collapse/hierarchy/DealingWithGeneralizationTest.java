package me.aikin.refactoring.dealing.with.generalization.collapse.hierarchy;

import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public class DealingWithGeneralizationTest {
    @Test
    public void should_get_quota_for_sales_man() {
        Salesman salesman = new Salesman(10);
        assertTrue(salesman.getQuota() == 100);
    }

    @Test
    public void should_get_rate_for_sales_man() {
        Salesman salesman = new Salesman(10);
        assertEquals(10, salesman.getRate());
    }

    @Test
    public void should_get_quota_for_employee() {
        Employee employee = new Employee();
        assertTrue(employee.getQuota() == 100);
    }

}