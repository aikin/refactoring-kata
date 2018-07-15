package me.aikin.refactoring.simplifying.method.calls.separate.query.from.modifier;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class SeparateQueryFromModifierTest {
    @Test
    public void should_get_alert_message_if_people_names_include_don() {
        String[] peopleNames = new String[]{"Don", "Kent"};
        SeparateQueryFromModifier separateQueryFromModifier = new SeparateQueryFromModifier();

        String alertMessage = separateQueryFromModifier.checkSecurity(peopleNames);

        assertEquals("AlertDon", alertMessage);
    }

    @Test
    public void should_get_alert_message_if_people_names_include_john() {
        String[] peopleNames = new String[]{"John", "Kent"};
        SeparateQueryFromModifier separateQueryFromModifier = new SeparateQueryFromModifier();

        String alertMessage = separateQueryFromModifier.checkSecurity(peopleNames);

        assertEquals("AlertJohn", alertMessage);
    }

    @Test
    public void should_not_get_alert_message_if_people_names_does_include_don_and_john() {
        String[] peopleNames = new String[]{"Martin", "Kent"};
        SeparateQueryFromModifier separateQueryFromModifier = new SeparateQueryFromModifier();

        String alertMessage = separateQueryFromModifier.checkSecurity(peopleNames);

        assertEquals("null", alertMessage);
    }
}