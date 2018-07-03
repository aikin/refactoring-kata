package me.aikin.refactoring.simplifying.conditional.expressions.consolidate.conditional.expression;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class OrsExampleTest {
    @Test
    public void should_get_zero_disability_amount_given_seniority_less_than_two() {
        OrsExample consolidateConditionalExpression = new OrsExample(1, 0, false);
        assertEquals(0, consolidateConditionalExpression.disabilityAmount(), 0);
    }

    @Test
    public void should_get_zero_disability_amount_given_month_disabled_more_than_12() {
        OrsExample consolidateConditionalExpression = new OrsExample(2, 13, false);
        assertEquals(0, consolidateConditionalExpression.disabilityAmount(), 0);
    }

    @Test
    public void should_get_zero_disability_amount_given_is_part_time() {
        OrsExample consolidateConditionalExpression = new OrsExample(2, 1, true);
        assertEquals(0, consolidateConditionalExpression.disabilityAmount(), 0);
    }

    @Test
    public void should_get_ten_disability_amount_given_seniority_greater_than_one_and_disabled_less_than_13_and_is_not_part_time() {
        OrsExample consolidateConditionalExpression = new OrsExample(2, 1, false);
        assertEquals(10, consolidateConditionalExpression.disabilityAmount(), 0);
    }
}