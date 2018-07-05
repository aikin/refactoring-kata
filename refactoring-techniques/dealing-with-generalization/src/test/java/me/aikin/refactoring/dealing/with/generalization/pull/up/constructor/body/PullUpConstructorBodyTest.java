package me.aikin.refactoring.dealing.with.generalization.pull.up.constructor.body;

import org.junit.Test;

import static junit.framework.TestCase.assertFalse;
import static junit.framework.TestCase.assertTrue;

public class PullUpConstructorBodyTest {
    @Test
    public void should_not_assign_car_given_manager_grade_is_less_than_five() {
        Manager manager = new Manager("", "", 4);
        assertFalse(manager.isCarAssigned());
    }

    @Test
    public void should_assign_car_given_manager_grade_is_greater_than_four() {
        Manager manager = new Manager("", "", 5);
        assertTrue(manager.isCarAssigned());
    }

    @Test
    public void should_not_assign_car_given_is_sales_man() {
        Salesman salesman = new Salesman("", "");
        assertFalse(salesman.isCarAssigned());
    }
}