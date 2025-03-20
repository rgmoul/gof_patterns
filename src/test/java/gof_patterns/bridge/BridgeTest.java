package gof_patterns.bridge;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertNotEquals;

import org.junit.jupiter.api.Test;

/**
 * Demonstrates the use of /tests the bridge pattern.
 */
public class BridgeTest {

    private void compare(AutomobileImplementation a, Automobile b) {
        // Note AutomobileImplementation and Automobile are not in the same hierarchy
        assertFalse(a.getClass().isAssignableFrom(b.getClass()));
        assertFalse(b.getClass().isAssignableFrom(a.getClass()));

        assertEquals(a.engineDisplacement(), b.getEngineDisplacement());
        assertEquals(a.horsepower(), b.getHorsepower());
        assertEquals(a.seatingCapacity(), b.getSeatingCapacity());
        assertEquals(a.weight(), b.getWeight());
        if (a instanceof Sportscar s) {
            assertNotEquals(0, s.getPowerWeightRatio());
        }
    }

    @Test
    void test() {
        AutomobileFactory factory;
        Sportscar car;
        SportUtility suv;

        factory = new ChevroletFactory();
        car = factory.createSportscar();
        compare(new Corvette(), car);
        car.getPowerWeightRatio();

        suv = factory.createSportUtility();
        compare(new Tahoe(), suv);

        factory = new HondaFactory();
        car = factory.createSportscar();
        compare(new S2000(), car);

        suv = factory.createSportUtility();
        compare(new Pilot(), suv);
    }

}
