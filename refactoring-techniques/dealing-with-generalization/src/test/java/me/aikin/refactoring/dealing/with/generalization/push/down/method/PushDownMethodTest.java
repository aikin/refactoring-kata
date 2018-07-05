package me.aikin.refactoring.dealing.with.generalization.push.down.method;

import org.junit.Test;

import static junit.framework.TestCase.assertTrue;

public class PushDownMethodTest {
    @Test
    public void should_get_salesman_quota() {
        Salesman salesman = new Salesman();
        assertTrue(100 == salesman.getSalesmanQuota());
    }
}