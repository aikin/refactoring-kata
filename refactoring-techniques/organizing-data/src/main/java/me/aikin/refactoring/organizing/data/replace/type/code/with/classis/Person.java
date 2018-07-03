package me.aikin.refactoring.organizing.data.replace.type.code.with.classis;

public class Person {
    public static int O = 0;
    public static int A = 1;
    public static int B = 2;
    public static int AB = 3;

    private int bloodGroup;

    public Person(int bloodGroup) {
        this.bloodGroup = bloodGroup;
    }

    public int getBloodGroup() {
        return bloodGroup;
    }
}

