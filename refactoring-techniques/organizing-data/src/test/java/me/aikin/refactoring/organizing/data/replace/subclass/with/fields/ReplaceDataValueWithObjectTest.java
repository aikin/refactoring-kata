package me.aikin.refactoring.organizing.data.replace.subclass.with.fields;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class ReplaceDataValueWithObjectTest {
    @Test
    public void should_get_M_code_given_is_male() {
        Male male = new Male();
        assertEquals("M", male.getCode());
    }

    @Test
    public void should_get_F_code_given_is_male() {
        FeMale feMale = new FeMale();
        assertEquals("F", feMale.getCode());
    }
}