package me.aikin.refactoring.organizing.data.encapsulate.filed;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class EncapsulateFiledTest {
    @Test
    public void should_get_name() {
        Person encapsulateField = new Person();
        encapsulateField.name = "Kent";
        assertEquals("Kent", encapsulateField.name);
    }
}