package me.aikin.refactoring.making.method.calls.simpler.remove.setting.method;

public class User {
    private String id;

    public User(String id) {
        setId(id);
    }

    private void setId(String id) {
        this.id = "ZZ" + id;
    }
}
