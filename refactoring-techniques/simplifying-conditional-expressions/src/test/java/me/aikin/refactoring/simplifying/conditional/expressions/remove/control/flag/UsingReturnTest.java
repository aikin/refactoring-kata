package me.aikin.refactoring.simplifying.conditional.expressions.remove.control.flag;

import org.junit.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.Assert.assertEquals;

public class UsingReturnTest {
    @Test
    public void should_get_alert_message_if_people_names_include_don() {
        List<String> peopleNames = Arrays.asList("Don", "Kent");

        UsingReturn usingReturn = new UsingReturn();
        String alertMessage = usingReturn.checkSecurity(peopleNames);
        assertEquals("AlertDon", alertMessage);
    }

    @Test
    public void should_get_alert_message_if_people_names_include_john() {
        List<String> peopleNames = Arrays.asList("John", "Kent");

        UsingReturn usingReturn = new UsingReturn();
        String alertMessage = usingReturn.checkSecurity(peopleNames);
        assertEquals("AlertJohn", alertMessage);
    }

    @Test
    public void should_alert_first_matched_people() {
        List<String> peopleNames = Arrays.asList("John", "Don");

        UsingReturn usingReturn = new UsingReturn();
        String alertMessage = usingReturn.checkSecurity(peopleNames);
        assertEquals("AlertJohn", alertMessage);
    }

    @Test
    public void should_not_get_alert_message_if_people_names_does_include_don_and_john() {
        List<String> peopleNames = Arrays.asList("Martin", "Kent");

        UsingReturn usingReturn = new UsingReturn();
        String alertMessage = usingReturn.checkSecurity(peopleNames);
        assertEquals("", alertMessage);
    }
}