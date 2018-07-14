package me.aikin.refactoring.simplifying.method.calls.encapsulate.downcast;

import org.junit.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.Assert.assertEquals;

public class EncapsulateDowncastTest {
    @Test
    public void should_get_last_reading_name() {
        List<Reading> readings = Arrays.asList(new Reading("Refactoring"), new Reading("Clean Code"));

        Site site = new Site(readings);
        String readingName = ((Reading) site.lastReading()).getName();
        assertEquals("Clean Code", readingName);
    }
}