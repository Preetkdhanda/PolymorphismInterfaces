package attractions;

import org.junit.Before;
import org.junit.Test;
import people.Visitor;

import static org.junit.Assert.assertEquals;

public class RollercoasterTest {

    RollerCoaster rollerCoaster;
    Visitor visitor;
    Visitor visitor2;

    @Before
    public void setUp() {
        rollerCoaster = new RollerCoaster("Blue Ridge", 10);
        visitor = new Visitor(20,201,20.00);
        visitor2 = new Visitor(10,146,20.00);
    }


    @Test
    public void hasName() {
        assertEquals("Blue Ridge", rollerCoaster.getName());
    }

    @Test
    public void hasRating() {
        assertEquals(10, rollerCoaster.getRating());
    }

    @Test
    public void hasVisitCount() {
        assertEquals(0, rollerCoaster.getVisitCount());
    }

    @Test
    public void canGoOnRollerCoaster(){
        assertEquals(true, rollerCoaster.isAllowedTo(visitor));
    }

    @Test
    public void cannotGoOnRollerCoaster(){
        assertEquals(false, rollerCoaster.isAllowedTo(visitor2));
    }

    @Test
    public void doubleChargeTallPeople(){
        assertEquals(16.80, rollerCoaster.doubleFeeForTallPeople(visitor),0.0);
    }
}
