package me.aikin.refactoring.making.method.calls.simpler.replace.parameter.with.explicit.methods;

import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public class ReplaceParameterWithExplicitMethodsTest {
    @Test
    public void should_get_setted_height_value() {
        Rectangle rectangle = new Rectangle();
        rectangle.setValue("height", 100);
        assertEquals(100, rectangle.getHeight());
    }

    @Test
    public void should_get_setted_width_value() {
        Rectangle rectangle = new Rectangle();
        rectangle.setValue("width", 50);
        assertEquals(50, rectangle.getWidth());
    }

    @Test
    public void should_create_engineer_given_type_is_engineer() {
        Employee employee = EmployeeFactory.create(0);
        assertTrue(employee instanceof Engineer);
    }

    @Test
    public void should_create_salesman_given_type_is_salesman() {
        Employee employee = EmployeeFactory.create(1);
        assertTrue(employee instanceof Salesman);
    }

    @Test
    public void should_create_manager_given_type_is_manager() {
        Employee employee = EmployeeFactory.create(2);
        assertTrue(employee instanceof Manager);
    }
}