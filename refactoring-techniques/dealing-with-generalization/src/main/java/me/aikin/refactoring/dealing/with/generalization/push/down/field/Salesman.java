package me.aikin.refactoring.dealing.with.generalization.push.down.field;

public class Salesman extends Employee {
    public Salesman(double salesmanQuotaQuota) {
        salesmanQuota = salesmanQuotaQuota;
    }

    public double getSalesmanQuota() {
        return salesmanQuota;
    }
}
