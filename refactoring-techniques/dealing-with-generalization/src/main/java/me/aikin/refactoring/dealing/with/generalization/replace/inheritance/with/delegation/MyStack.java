package me.aikin.refactoring.dealing.with.generalization.replace.inheritance.with.delegation;

import java.util.ArrayList;

public class MyStack extends ArrayList<Object> {

    public void push(Object element) {
        add(0, element);
    }

    public Object pop() {
        Object result = this.get(0);
        remove(0);
        return result;
    }

    public int size() {
        return super.size();
    }

    public boolean isEmpty() {
        return this.size() == 0;
    }
}
