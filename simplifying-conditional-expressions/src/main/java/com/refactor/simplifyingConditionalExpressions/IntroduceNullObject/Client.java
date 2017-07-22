package com.refactor.simplifyingConditionalExpressions.IntroduceNullObject;

public class Client {
    private Site site;

    public Client(Site site) {
        this.site = site;
    }

    private Customer customer() {
        return site.getCustomer();
    }

    public String getStatement() {
        String plan = customer() == null ? "Basic Plan" : customer().getPlan();
        String customerName = customer() == null ? "occupant" : customer().getName();
        int weeksDelinquent = customer() == null ? 0 : customer().getWeeksDelinquentInLastYear();

        return plan + " " + customerName + " " + weeksDelinquent;
    }
}
