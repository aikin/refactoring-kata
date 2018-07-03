package me.aikin.refactoring.simplifying.conditional.expressions.replace.conditional.with.polymorphism;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class EmployeeTest {

    @Test
    public void should_get_pay_amount_for_engineer_given_type_is_engineer() throws Exception {
        Employee employee = new Employee(EmployeeType.ENGINEER);
        assertEquals(100, employee.payAmount());
    }

    @Test
    public void should_get_pay_amount_for_sales_man_given_type_is_sales_man() throws Exception {
        Employee employee = new Employee(EmployeeType.SALESMAN);
        assertEquals(120, employee.payAmount());
    }

    @Test
    public void should_get_pay_amount_for_manager_given_type_is_manager() throws Exception {
        Employee employee = new Employee(EmployeeType.MANAGER);
        assertEquals(150, employee.payAmount());
    }
}