package me.aikin.refactoring.organizing.data.replace.type.code.with.classis;

public class Client {
    public void updateBloodGroup() {
        Person person = new Person(Person.AB);
        int bloodGroup = person.getBloodGroup();
    }
}
