package me.aikin.refactoring.organizing.data.change.bidirectional.association.to.unidirectional;

import java.util.ArrayList;
import java.util.List;

public class CustomerRepository {
    private static List<Customer> customers = new ArrayList<>();

    public static List<Customer> getInstances() {
        return customers;
    }

    public static void addCustomer(Customer customer) {
        customers.add(customer);
    }
}
