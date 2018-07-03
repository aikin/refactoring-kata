package me.aikin.refactoring.organizing.data.encapsulate.collection;

import me.aikin.refactoring.organizing.data.encapsulate.collection.encapsulate.arrays.SkillManager;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.assertEquals;

public class EncapsulateCollectionTest {

    @Test
    public void should_init_courses_for_person() {
        Person kent = new Person();
        List courses = new ArrayList<Course>();
        courses.add(new Course("SmalTalk Programming", false));
        courses.add(new Course("Appreciating Single Malts", true));
        kent.courses = courses;
        kent.courses.add(new Course("Refactoring", true));

        long advantagedCount = kent.courses.stream().filter(Course::isAdvantaged).count();

        assertEquals(2, advantagedCount);
    }

    @Test
    public void should_init_skills() {
        SkillManager skillManager = new SkillManager();
        skillManager.skills = new String[2]; 
        skillManager.skills[0] = "Refactoring";
        skillManager.skills[1] = "TDD";

        assertEquals("Refactoring", skillManager.skills[0]);
        assertEquals("TDD", skillManager.skills[1]);
    }

}