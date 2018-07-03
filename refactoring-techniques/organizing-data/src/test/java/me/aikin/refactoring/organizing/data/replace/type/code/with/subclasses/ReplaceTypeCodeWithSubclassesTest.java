package me.aikin.refactoring.organizing.data.replace.type.code.with.subclasses;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class ReplaceTypeCodeWithSubclassesTest {
    @Test
    public void should_get_type_of_employee() {
        Employee employee = new Employee(1);
        assertEquals(Employee.SALESMAN, employee.getType());
    }
}