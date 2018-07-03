package com.refactor.organizing.data.change.bidirectional.association.to.unidirectional;

import org.junit.Test;

import java.util.Arrays;
import java.util.List;
import java.util.Objects;
import java.util.stream.Collectors;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;


public class CustomerTest {

    @Test
    public void should_get_orders_of_customer() {
        Customer kent = new Customer("Kent");
        Customer martin = new Customer("Martin");

        Order foodForKent = new Order(kent, "Food");
        Order musicForKent = new Order(kent, "Music");
        Order foodForMartin = new Order(martin, "Food");

        kent.addOrder(foodForKent);
        kent.addOrder(musicForKent);
        martin.addOrder(foodForMartin);


        List<Order> orders = Arrays.asList(foodForKent, musicForKent, foodForMartin);
        assertEquals(2, getCustomerOrders(orders, "Kent").size());
        assertTrue(Double.compare(kent.getPriceFor(foodForKent), 9.00) == 0);
    }

    private static List<Order> getCustomerOrders(List<Order> orders, String customerName) {
        return orders.stream()
                .filter(o -> Objects.equals(o.getCustomer().getName(), customerName))
                .collect(Collectors.toList());
    }
}