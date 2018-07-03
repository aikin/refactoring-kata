import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class PersonForExtractClassTest {
    @Test
    public void should_get_correct_telephone_number() {
        PersonForExtractClass personForExtractClass = new PersonForExtractClass("CA", "01");
        assertEquals("(CA) 01", personForExtractClass.getTelephoneNumber());
    }
}