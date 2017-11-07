package com.refactor.composing.methods;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class ReplaceMethodWithMethodObjectTest {
    @Test
    public void should_get_right_gamma_given() {
        ReplaceMethodWithMethodObject replaceMethodWithMethodObject = new ReplaceMethodWithMethodObject();
        int gamma = replaceMethodWithMethodObject.gamma(10, 5, 100);
        assertEquals(7600, gamma);
    }
}
