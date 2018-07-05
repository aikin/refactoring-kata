package me.aikin.refactoring.dealing.with.generalization.pull.up.field;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class PullUpFieldTest {
    @Test
    public void should_get_engineer_name() {
        Engineer engineer = new Engineer("Kent");
        assertEquals("Engineer Kent", engineer.getName());
    }

    @Test
    public void should_get_sales_man_name() {
        Salesman engineer = new Salesman("Martin");
        assertEquals("Salesman Martin", engineer.getName());
    }
}