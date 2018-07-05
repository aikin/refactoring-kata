package me.aikin.refactoring.dealing.with.generalization.replace.inheritance.with.delegation;

import org.junit.Test;

import static junit.framework.TestCase.assertFalse;
import static junit.framework.TestCase.assertTrue;
import static org.junit.Assert.assertEquals;

public class ReplaceInheritanceWithDelegationTest {
    @Test
    public void should_get_size_for_my_stack() {
        MyStack myStack = new MyStack();
        myStack.push(2);
        assertEquals(1, myStack.size());
    }

    @Test
    public void should_get_is_empty_for_my_stack() {
        MyStack myStack = new MyStack();
        myStack.push(2);
        assertFalse(myStack.isEmpty());

        myStack.pop();
        assertTrue(myStack.isEmpty());
    }
}