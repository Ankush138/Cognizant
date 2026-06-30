import org.junit.Test;
import static org.junit.Assert.*;


public class AssertionTest {

    @Test
    public void testViratKohliDetails() {

        Cricketer virat = new Cricketer("Virat Kohli", "Royal Challengers Bengaluru", 82);

        assertEquals("Virat Kohli", virat.getName());
        assertTrue(virat.hasMoreThan50Centuries());
        assertFalse(virat.getCountry().equals("Australia"));
        assertNull(virat.getRetirementYear());
        assertNotNull(virat);
    }
}