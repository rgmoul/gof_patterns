package gof_patterns.interpreter;


/**
 * Represent an variable value - TerminalExpression in the Interpreter pattern.
 */
class VariableExpression implements Expression {
    private final String name;

    /**
     * Constructor.
     * 
     * @param name variable name
     */
    public VariableExpression(String name) {
        this.name = name;
    }

    /**
     * Returns the value of this expression.
     * @see gof_patterns.interpreter.Expression#interpret(Context)
     */
   @Override
    public double interpret(Context context) {
        return context.getVariable(name);
    }
}
