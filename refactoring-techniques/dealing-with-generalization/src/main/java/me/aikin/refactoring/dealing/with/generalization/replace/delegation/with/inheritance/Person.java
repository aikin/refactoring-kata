package me.aikin.refactoring.dealing.with.generalization.replace.delegation.with.inheritance;

public class Person {
    String name;

    public String GetName() {
        return name;
    }

    public void SetName(String arg) {
        name = arg;
    }

    public String GetLastName() {
        return name.substring(name.lastIndexOf(' ') + 1);
    }
}

