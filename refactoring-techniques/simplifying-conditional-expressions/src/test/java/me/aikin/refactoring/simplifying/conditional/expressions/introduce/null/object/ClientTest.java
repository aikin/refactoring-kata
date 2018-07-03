import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class ClientTest {
    @Test
    public void should_get_basic_statement_given_does_not_have_customer() {
        Site site = new Site(null);
        Client client = new Client(site);
        assertEquals("Basic Plan occupant 0", client.getStatement());
    }

    @Test
    public void should_get_customer_statement_given_has_customer() {
        Site site = new Site(new Customer());
        Client client = new Client(site);
        assertEquals("Real Plan Name 100", client.getStatement());
    }
}