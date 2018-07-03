package me.aikin.refactoring.organizing.data.replace.type.code.with.classis;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class ReplaceTypeCodeWithClassTest {
    @Test
    public void should_get_blood_of_person() {
        Person person = new Person(1);
        assertEquals(1, person.getBloodGroup());
    }
}