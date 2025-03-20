package gof_patterns.interpreter;

/**
 * Represent an numeric value - TerminalExpression in the Interpreter pattern.
 */
class NumberExpression implements Expression {
    private final double number;

    /**
     * Constructor.
     * 
     * @param number expression value
     */
    public NumberExpression(double number) {
        this.number = number;
    }

    /**
     * Returns the value of this expression.
     * @see gof_patterns.interpreter.Expression#interpret(Context)
     */
    @Override
    public double interpret(Context context) {
        return number;
    }

}
