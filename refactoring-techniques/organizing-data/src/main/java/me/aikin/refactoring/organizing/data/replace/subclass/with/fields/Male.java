package me.aikin.refactoring.organizing.data.replace.subclass.with.fields;

public class Male extends Person {
    @Override
    protected boolean isMale() {
        return true;
    }

    @Override
    public String getCode() {
        return "M";
    }
}
