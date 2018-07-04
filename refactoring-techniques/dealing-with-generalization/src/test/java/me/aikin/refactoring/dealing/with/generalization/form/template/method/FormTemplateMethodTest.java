package me.aikin.refactoring.dealing.with.generalization.form.template.method;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class FormTemplateMethodTest {
    @Test
    public void should_get_ascii_statement_for_customer() {
        final String expectedstatement = "Rental Record for Kent\n100.0\n100.0\nAmount owed is 200.0\n";
        AsciiCustomer asciiCustomer = new AsciiCustomer("Kent");
        asciiCustomer.addRentals(new Rental());
        asciiCustomer.addRentals(new Rental());
        String statement = asciiCustomer.statement();
        assertEquals(expectedstatement, statement);
    }

    @Test
    public void should_get_html_statement_for_customer() {
        final String expectedstatement = "<H1>Rentals for <EM>Kent</EM></H1><P>\n: 100.0<BR>\n: 100.0<BR>\n<P>You owe <EM>200.0</EM><P>\n";
        HtmlCustomer htmlCustomer = new HtmlCustomer("Kent");
        htmlCustomer.addRentals(new Rental());
        htmlCustomer.addRentals(new Rental());
        String statement = htmlCustomer.statement();
        assertEquals(expectedstatement, statement);
    }

}