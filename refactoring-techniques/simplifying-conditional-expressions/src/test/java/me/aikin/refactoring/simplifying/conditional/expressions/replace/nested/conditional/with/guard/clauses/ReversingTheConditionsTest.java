package me.aikin.refactoring.simplifying.conditional.expressions.replace.nested.conditional.with.guard.clauses;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class ReversingTheConditionsTest {
    @Test
    public void should_get_zero_adjusted_capital_given_capital_is_less_than_zero() {
        ReversingTheConditions reversingTheConditions = new ReversingTheConditions(-1, 10, 10, 10);
        assertEquals(0, reversingTheConditions.getAdjustedCapital(), 0);
    }

    @Test
    public void should_get_zero_adjusted_capital_given_init_rate_is_less_than_zero() {
        ReversingTheConditions reversingTheConditions = new ReversingTheConditions(10, -1, 10, 10);
        assertEquals(0, reversingTheConditions.getAdjustedCapital(), 0);
    }

    @Test
    public void should_get_zero_adjusted_capital_given_duration_is_less_than_zero() {
        ReversingTheConditions reversingTheConditions = new ReversingTheConditions(10, 10, -1, 10);
        assertEquals(0, reversingTheConditions.getAdjustedCapital(), 0);
    }

    @Test
    public void should_get_adjusted_capital_given_duration_and_capital_and_init_rate_all_are_greater_than_zero() {
        ReversingTheConditions reversingTheConditions = new ReversingTheConditions(10, 10, 5, 10);
        assertEquals(4, reversingTheConditions.getAdjustedCapital(), 0);
    }
}