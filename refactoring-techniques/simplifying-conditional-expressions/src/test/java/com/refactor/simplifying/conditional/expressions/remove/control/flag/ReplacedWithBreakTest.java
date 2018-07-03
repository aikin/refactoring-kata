package com.refactor.simplifying.conditional.expressions.remove.control.flag;

import org.junit.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.Assert.assertEquals;

public class ReplacedWithBreakTest {
    @Test
    public void should_get_alert_message_if_people_names_include_don() {
        List<String> peopleNames = Arrays.asList("Don", "Kent");

        ReplacedWithBreak replacedWithBreak = new ReplacedWithBreak();
        replacedWithBreak.checkSecurity(peopleNames);
        assertEquals("Alert", replacedWithBreak.getAlertedMessage());
    }

    @Test
    public void should_get_alert_message_if_people_names_include_john() {
        List<String> peopleNames = Arrays.asList("John", "Kent");

        ReplacedWithBreak replacedWithBreak = new ReplacedWithBreak();
        replacedWithBreak.checkSecurity(peopleNames);
        assertEquals("Alert", replacedWithBreak.getAlertedMessage());
    }

    @Test
    public void should_not_get_alert_message_if_people_names_does_include_don_and_john() {
        List<String> peopleNames = Arrays.asList("Martin", "Kent");

        ReplacedWithBreak replacedWithBreak = new ReplacedWithBreak();
        replacedWithBreak.checkSecurity(peopleNames);
        assertEquals("", replacedWithBreak.getAlertedMessage());
    }
}