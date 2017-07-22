package com.refactor.composingMethods;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class InlineMethodTest {
    @Test
    public void should_get_rating_2_given_more_than_five_late_deliveries() {
        final int numberOfLateDeliveries = 6;
        InlineMethod inlineMethod = new InlineMethod(numberOfLateDeliveries);
        assertEquals(2, inlineMethod.getRating());
    }

    @Test
    public void should_get_rating_1_given_less_than_five_late_deliveries() {
        final int numberOfLateDeliveries = 4;
        InlineMethod inlineMethod = new InlineMethod(numberOfLateDeliveries);
        assertEquals(1, inlineMethod.getRating());
    }
}
