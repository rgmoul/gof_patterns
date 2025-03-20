package gof_patterns.decorator;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;

import java.util.Date;
import java.util.Properties;

import org.junit.jupiter.api.Test;

class DecoratorTest {

    @Test
    void test() {
        Inventoryable milk = new InventoryItem("DAIRY-01", "Milk, non-fat, 1/2 gallon");
        Date expires = new Date();
        milk = new DateSensitiveDecorator(milk, expires);
        milk = new RefrigerationDecorator(milk, 34);
        milk.display();

        Properties milkProps = milk.getProperties();
        assertEquals("Milk, non-fat, 1/2 gallon", milkProps.get("Description"));
        assertEquals("DAIRY-01", milkProps.get("Inventory Id"));
        assertEquals("34", milkProps.get("Storage Temperature"));
        assertNotNull(milkProps.get("Expires"));
    }
}
