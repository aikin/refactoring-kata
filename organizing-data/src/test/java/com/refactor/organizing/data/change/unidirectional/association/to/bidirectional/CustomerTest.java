package com.refactor.organizing.data.change.unidirectional.association.to.bidirectional;

import org.junit.Test;

import java.util.Arrays;
import java.util.List;
import java.util.Objects;
import java.util.stream.Collectors;

import static org.junit.Assert.assertEquals;

public class CustomerTest {
    @Test
    public void should_get_orders_of_customer() {
        Customer kent = new Customer("Kent");
        Customer martin = new Customer("Martin");
        Order foodForKent = new Order(kent, "Food");
        Order musicForKent = new Order(kent, "Music");
        Order foodForMartin = new Order(martin, "Food");

        List<Order> orders = Arrays.asList(foodForKent, musicForKent, foodForMartin);
        assertEquals(2, GetCustomerOrders(orders, "Kent").size());
    }

    private static List<Order> GetCustomerOrders(List<Order> orders, String customerName) {
        return orders.stream()
                .filter(o -> Objects.equals(o.getCustomer().getName(), customerName))
                .collect(Collectors.toList());
    }

}