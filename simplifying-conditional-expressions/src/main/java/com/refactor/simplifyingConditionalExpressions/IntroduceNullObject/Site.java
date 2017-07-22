package com.refactor.simplifyingConditionalExpressions.IntroduceNullObject;

public class Site {
    private Customer customer;

    public Site(Customer customer) {
        this.customer = customer;
    }

    public Customer getCustomer() {
        return customer;
    }
}
