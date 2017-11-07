package com.refactor.composing.methods;

import org.junit.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.Assert.assertEquals;

public class ExtractMethodTest {

    @Test
    public void should_get_right_customer_owns() {
        String expectedCustomerOwns = "****/n**Customer Owns**/n****/nname:ExtractMethod/namount:140.0";
        List<Order> orders = Arrays.asList(new Order(10), new Order(20));
        ExtractMethod extractMethod = new ExtractMethod(orders);

        String owns = extractMethod.printOwning("ExtractMethod", 100);

        assertEquals(expectedCustomerOwns, owns);
    }
}


