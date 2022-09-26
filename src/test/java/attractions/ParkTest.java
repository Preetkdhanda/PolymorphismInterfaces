package attractions;

import org.junit.Before;
import org.junit.Test;
import people.Visitor;
import people.VisitorTest;

import static org.junit.Assert.assertEquals;

public class ParkTest {

    Park park;
    Visitor visitor;

    @Before
    public void setUp() throws Exception {
        park = new Park("Leafy Meadows", 9);
        visitor = new Visitor(14, 1.2, 40.0);

    }

    @Test
    public void hasName() {
        assertEquals("Leafy Meadows", park.getName());
    }

    @Test
    public void hasRating() {
        assertEquals(9, park.getRating());
    }

    @Test
    public void hasVisitCount() {
        assertEquals(0, park.getVisitCount());
    }


}
