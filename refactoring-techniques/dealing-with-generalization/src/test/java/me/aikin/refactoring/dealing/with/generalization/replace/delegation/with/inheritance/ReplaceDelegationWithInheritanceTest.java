package me.aikin.refactoring.dealing.with.generalization.replace.delegation.with.inheritance;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class ReplaceDelegationWithInheritanceTest {
    @Test
    public void should_get_employee_name() {
        Employee employee = new Employee();
        employee.SetName("Kent");
        assertEquals("Kent", employee.GetName());
    }

    @Test
    public void should_get_statement_of_employee() {
        Employee employee = new Employee();
        employee.SetName("Kent Back");
        assertEquals("Emp: Back", employee.Statement());
    }
}