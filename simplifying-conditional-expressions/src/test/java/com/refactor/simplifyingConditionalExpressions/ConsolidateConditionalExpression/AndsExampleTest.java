package com.refactor.simplifyingConditionalExpressions.ConsolidateConditionalExpression;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class AndsExampleTest {
    @Test
    public void should_get_1_given_is_on_vacation_and_length_of_service_greater_than_10() {
        AndsExample andsExample = new AndsExample(11, true);
        assertEquals(1, andsExample.getCharge(), 0);
    }

    @Test
    public void should_get_point_5_given_is_not_on_vacation() {
        AndsExample andsExample = new AndsExample(11, false);
        assertEquals(0.5, andsExample.getCharge(), 0);
    }

    @Test
    public void should_get_point_5_given_length_of_service_not_greater_than_10() {
        AndsExample andsExample = new AndsExample(5, true);
        assertEquals(0.5, andsExample.getCharge(), 0);
    }
}