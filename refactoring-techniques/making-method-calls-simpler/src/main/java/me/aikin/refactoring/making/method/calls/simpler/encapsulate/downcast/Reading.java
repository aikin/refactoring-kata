package me.aikin.refactoring.making.method.calls.simpler.encapsulate.downcast;

public class Reading {
    private  String name;

    public Reading(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
}