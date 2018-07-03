package me.aikin.refactoring.organizing.data.self.encapsulate.field;

import org.junit.Test;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

public class IntRangeTest {
    @Test
    public void should_not_include_when_number_is_less_than_low_and_greater_than_high() {
        IntRange intRange = new IntRange(50, 100);
        assertFalse(intRange.includes(150));
    }

    @Test
    public void should_include_when_after_number_grow_is_between_low_and_high() {
        IntRange intRange = new IntRange(50, 100);
        intRange.grow(2);
        assertTrue(intRange.includes(150));
    }

    @Test
    public void should_include_when_number_is_between_low_and_high() {
        IntRange intRange = new IntRange(50, 100);
        assertTrue(intRange.includes(80));
    }

}