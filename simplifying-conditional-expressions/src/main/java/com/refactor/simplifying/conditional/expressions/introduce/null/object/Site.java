package com.refactor.simplifying.conditional.expressions.IntroduceNullObject;

public class Site {
    private Customer customer;

    public Site(Customer customer) {
        this.customer = customer;
    }

    public Customer getCustomer() {
        return customer;
    }
}
