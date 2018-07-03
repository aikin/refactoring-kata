package me.aikin.refactoring.organizing.data.replace.array.with.object;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class ReplaceArrayWithObjectTest {
    @Test
    public void should_get_name_and_wins_given_init_row() {
        String[] row = new String[]{"Liverpool", "15"};
        ReplaceArrayWithObject replaceArrayWithObject = new ReplaceArrayWithObject(row);
        assertEquals("Liverpool", replaceArrayWithObject.getName());
        assertEquals(15, replaceArrayWithObject.getWins());
    }
}