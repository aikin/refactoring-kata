import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class InlineClassTest {

    @Test
    public void should_get_correct_telephone_number() {
        PersonForInlineClass personForInlineClass = new PersonForInlineClass("CA", "01");
        assertEquals("(CA) 01", personForInlineClass.getTelephoneNumber());
    }
}