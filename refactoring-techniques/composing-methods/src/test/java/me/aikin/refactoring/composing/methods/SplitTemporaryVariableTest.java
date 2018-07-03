package me.aikin.refactoring.composing.methods;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class SplitTemporaryVariableTest {
    @Test
    public void should_set_right_perimeter_and_area() {
        SplitTemporaryVariable splitTemporaryVariable = new SplitTemporaryVariable();
        splitTemporaryVariable.setPerimeterAndArea(20, 10);
        assertEquals(120, splitTemporaryVariable.getDoublePerimeter(), 2);
        assertEquals(400, splitTemporaryVariable.getDoubleArea(), 2);
    }
}
