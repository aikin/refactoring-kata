package me.aikin.refactoring.organizing.data.encapsulate.collection;

public class Course {
    private String courseName;
    private boolean isAdvantaged;

    public Course(String courseName, boolean isAdvantaged) {
        this.courseName = courseName;
        this.isAdvantaged = isAdvantaged;
    }

    public String getCourseName() {
        return courseName;
    }

    public boolean isAdvantaged() {
        return isAdvantaged;
    }
}
