package me.aikin.refactoring.simplifying.method.calls.encapsulate.downcast;

public class Reading {
    private  String name;

    public Reading(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
}