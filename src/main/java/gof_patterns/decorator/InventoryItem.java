package gof_patterns.decorator;

import java.util.Properties;

/**
 * A simple item maintained in an inventory system - ConcreteComponent in the
 * Decorator pattern
 */
public record InventoryItem(String inventoryId, String description) implements Inventoryable {

    /**
     * @see Inventoryable#inventoryId ()
     */
    @Override
    public Properties getProperties() {
        Properties p = new Properties();
        p.setProperty("Inventory Id", inventoryId);
        p.setProperty("Description", description);
        return p;
    }

}
