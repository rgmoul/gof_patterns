package gof_patterns.interpreter;

/**
 * Represent the subtraction operation - NonterminalExpression in the Interpreter pattern.
 */
record SubtractExpression(Expression left, Expression right) implements Expression {
    /**
     * Performs subtraction.
     * @see gof_patterns.interpreter.Expression#interpret(Context)
     */
    @Override
    public double interpret(Context context) {
        return left.interpret(context) - right.interpret(context);
    }
}