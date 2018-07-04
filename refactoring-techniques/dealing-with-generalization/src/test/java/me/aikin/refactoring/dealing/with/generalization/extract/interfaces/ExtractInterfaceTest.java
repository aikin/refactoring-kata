package me.aikin.refactoring.dealing.with.generalization.extract.interfaces;

import org.junit.Test;

import static org.junit.Assert.assertTrue;

public class ExtractInterfaceTest {
    @Test
    public void should_get_charge_for_timesheet_given_employee_has_special_skill() {
        Timesheet timesheet = new Timesheet();
        double charge = timesheet.charge(new Employee(10, true), 2);
        assertTrue(charge == 21);
    }

    @Test
    public void should_get_charge_for_timesheet_given_employee_does_not_have_special_skill() {
        Timesheet timesheet = new Timesheet();
        double charge = timesheet.charge(new Employee(10, false), 2);
        assertTrue(charge == 20);
    }
}