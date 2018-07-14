package me.aikin.refactoring.simplifying.method.calls.hide.method;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class HideMethodTest {

    @Test
    public void should_get_last_reading_name() {
        HideMethod hideMethod = new HideMethod();
        assertEquals("Clean Code", hideMethod.getLastReadingName());
    }
}