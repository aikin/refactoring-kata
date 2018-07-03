package me.aikin.refactoring.composing.methods;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class SubstitueAlgorithmTest {
    @Test
    public void should_find_don_given_there_is_don_in_people_list() {
        String[] peopleList = new String[]{"Don", "Done", "Do"};
        SubstituteAlgorithm substituteAlgorithm = new SubstituteAlgorithm();
        assertEquals("Don", substituteAlgorithm.foundPerson(peopleList));
    }

    @Test
    public void should_find_john_given_there_is_john_in_people_list() {
        String[] peopleList = new String[]{"John", "Joh", "Jo"};
        SubstituteAlgorithm substituteAlgorithm = new SubstituteAlgorithm();
        assertEquals("John", substituteAlgorithm.foundPerson(peopleList));
    }

    @Test
    public void should_find_kent_given_there_is_kent_in_people_list() {
        String[] peopleList = new String[]{"Kent", "Ken", "Ke"};
        SubstituteAlgorithm substituteAlgorithm = new SubstituteAlgorithm();
        assertEquals("Kent", substituteAlgorithm.foundPerson(peopleList));
    }

    @Test
    public void should_not_find_people_given_there_is_no_matched_name_in_people_list() {
        String[] peopleList = new String[]{"Done", "Do"};
        SubstituteAlgorithm substituteAlgorithm = new SubstituteAlgorithm();
        assertEquals("", substituteAlgorithm.foundPerson(peopleList));
    }
}
