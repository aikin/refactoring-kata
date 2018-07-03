package com.refactor.composing.methods;

import org.junit.Test;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

public class InlineTempTest {
    @Test
    public void should_get_true_given_amount_over_1000() {
        InlineTemp inlineTemp = new InlineTemp(2000);
        assertTrue(inlineTemp.isAmountOver1000());
    }

    @Test
    public void should_get_false_given_amount_less_than_1000() {
        InlineTemp inlineTemp = new InlineTemp(500);
        assertFalse(inlineTemp.isAmountOver1000());
    }

}
