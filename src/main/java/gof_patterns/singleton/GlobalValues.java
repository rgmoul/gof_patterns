package gof_patterns.singleton;

import java.util.HashMap;

/**
 * An example of the Singleton pattern, for storing globally available values -
 * Singleton in the Singleton pattern.
 */
public final class GlobalValues {
    /** The singleton. Uses initialization-on-demand holder idiom. */
    private static class InstanceHolder {
        static final GlobalValues instance = new GlobalValues();
    }

    private final HashMap<String,Object> valueMap = new HashMap<>();

    /**
     * Prevent external instantiation.
     */
    private GlobalValues() {
    }

    /**
     * Get the "singleton".
     *
     * @return return the single instance of this class
     */
    public static GlobalValues instance() {
        return InstanceHolder.instance;
    }

    /**
     * Add a value to the global value map.
     *
     * @param name the name for this value
     * @param value the value
     */
    public synchronized void putGlobal(final String name, final Object value) {
        valueMap.put(name, value);
    }

    /**
     * Get a value from the global value map.
     *
     * @param name the name of the value to retrieve
     */
    public synchronized Object getGlobal(final String name) {
        return valueMap.get(name);
    }

}
