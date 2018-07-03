package me.aikin.refactoring.organizing.data.replace.data.value.with.object;

import org.junit.Test;

import java.util.Arrays;
import java.util.List;
import java.util.Objects;

import static org.junit.Assert.assertEquals;

public class ReplaceDataValueWithObjectTest {

    @Test
    public void should_get_number_of_orders_for_customer() {
        List<Order> orders = Arrays.asList(new Order("Kent"), new Order("Kent"), new Order("Martin"));
        assertEquals(2, NumberOfOrdersFor(orders, "Kent"));
    }

    private static long NumberOfOrdersFor(List<Order> orders, String customer) {
        return orders.stream().filter(o -> Objects.equals(o.getCustomer(), customer)).count();
    }
}