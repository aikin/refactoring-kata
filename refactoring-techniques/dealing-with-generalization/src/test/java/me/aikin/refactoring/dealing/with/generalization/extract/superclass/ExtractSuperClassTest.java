package me.aikin.refactoring.dealing.with.generalization.extract.superclass;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class ExtractSuperClassTest {
    @Test
    public void should_get_name_for_department() {
        Department department = new Department("DepartmentName");
        assertEquals("DepartmentName", department.getName());
    }

    @Test
    public void should_get_total_cost_for_department() {
        Department department = new Department("DepartmentName");
        department.addStaff(new Employee("Kent", "1", 10));
        department.addStaff(new Employee("Martin", "1", 20));
        assertEquals(30, department.getTotalAnnualCost());
    }

    @Test
    public void should_get_name_for_employee() {
        Employee  employee = new Employee("Kent", "1", 10);
        assertEquals("Kent", employee.getName());
    }

    @Test
    public void should_get_total_cost_for_employee() {
        Employee  employee = new Employee("Kent", "1", 10);
        assertEquals(10, employee.getAnnualCost());
    }

}