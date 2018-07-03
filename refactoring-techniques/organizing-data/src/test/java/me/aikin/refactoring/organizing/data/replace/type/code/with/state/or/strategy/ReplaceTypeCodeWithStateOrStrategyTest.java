package me.aikin.refactoring.organizing.data.replace.type.code.with.state.or.strategy;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class ReplaceTypeCodeWithStateOrStrategyTest {
    public void should_get_pay_amount_for_engineer() throws Exception {
        Employee employee = new Employee(0);
        int payAmount = employee.payAmount(10, 20, 30);
        assertEquals(10, payAmount);
    }

    @Test
    public void should_get_pay_amount_for_sales_man() throws Exception {
        Employee employee = new Employee(1);
        int payAmount = employee.payAmount(10, 20, 30);
        assertEquals(30, payAmount);
    }

    @Test
    public void should_get_pay_amount_for_manager() throws Exception {
        Employee employee = new Employee(2);
        int payAmount = employee.payAmount(10, 20, 30);
        assertEquals(40, payAmount);
    }
}