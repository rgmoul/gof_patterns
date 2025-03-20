package gof_patterns.decorator;

import java.util.Date;
import java.util.Properties;

/**
 * Decorates an inventory item with an expiration date - ConcreteDecorator in
 * the Decorator pattern.
 */
public class DateSensitiveDecorator extends InventoryItemDecorator {
    private final Date expires;

    /**
     * Constructor.
     *
     * @param decoratedItem the item to be decorated
     * @param expires the items expiration date
     */
    public DateSensitiveDecorator(final Inventoryable decoratedItem,
                                  final Date expires) {
        super(decoratedItem);
        this.expires = expires;
        // TODO Auto-generated constructor stub
    }

    /**
     * @see gof_patterns.decorator.Inventoryable#getProperties()
     */
    @Override
    public Properties getProperties() {
        Properties p = super.getProperties();
        p.setProperty("Expires", expires.toString());
        return p;
    }
}
