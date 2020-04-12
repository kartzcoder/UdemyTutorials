package training.udemyjunit;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class GreetingImplTest {

    @Before
    public void setUp() throws Exception {
    }

    @After
    public void tearDown() throws Exception {
    }

    @Test
    public void testGreetMessageForName() {
        String resultString = new GreetingImpl().greet("Donal Trump");
        String expectedString = "Namaste, Donal Trump";
        assertEquals(expectedString, resultString);
    }
}