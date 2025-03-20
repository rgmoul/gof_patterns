package gof_patterns.interpreter;

import java.util.HashMap;
import java.util.Map;

/**
 * A context for storing variables = Context in the Interpreter pattern.
 */
class Context {
    private final Map<String, Double> variables = new HashMap<>();

    public void setVariable(String name, double value) {
        variables.put(name, value);
    }

    public double getVariable(String name) {
        if (!variables.containsKey(name)) {
            throw new IllegalArgumentException("Undefined variable: " + name);
        }
        return variables.get(name);
    }
}
