package me.aikin.refactoring.composing.methods;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class ReplaceTempWithQueryTest {
    @Test
    public void should_get_right_discount_given_base_price_is_over_1000() {
        ReplaceTempWithQuery replaceTempWithQuery = new ReplaceTempWithQuery(1000, 2);
        assertEquals(1900, replaceTempWithQuery.getPrice(), 2);
    }

    @Test
    public void should_get_right_discount_given_base_price_is_less_than_1000() {
        ReplaceTempWithQuery replaceTempWithQuery = new ReplaceTempWithQuery(400, 2);
        assertEquals(784, replaceTempWithQuery.getPrice(), 2);
    }
}
