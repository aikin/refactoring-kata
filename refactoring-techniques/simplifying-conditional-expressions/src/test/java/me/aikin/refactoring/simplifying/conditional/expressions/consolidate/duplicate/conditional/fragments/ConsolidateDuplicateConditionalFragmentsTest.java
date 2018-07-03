package me.aikin.refactoring.simplifying.conditional.expressions.consolidate.duplicate.conditional.fragments;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class ConsolidateDuplicateConditionalFragmentsTest {
    @Test
    public void should_get_disability_amount_given_is_special_deal() {
        ConsolidateDuplicateConditionalFragments consolidateDuplicateConditionalFragments = new ConsolidateDuplicateConditionalFragments(true, 10);
        assertEquals(10.5, consolidateDuplicateConditionalFragments.disabilityAmount(), 0);
    }

    @Test
    public void should_get_zero_disability_amount_given_month_disabled_more_than_12() {
        ConsolidateDuplicateConditionalFragments consolidateDuplicateConditionalFragments = new ConsolidateDuplicateConditionalFragments(false, 10);
        assertEquals(10.8, consolidateDuplicateConditionalFragments.disabilityAmount(), 0);
    }
}