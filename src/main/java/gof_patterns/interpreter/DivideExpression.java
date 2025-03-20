package gof_patterns.interpreter;

/**
 * Represent the division operation - NonterminalExpression in the Interpreter pattern.
 */
record DivideExpression(Expression left, Expression right) implements Expression {
    /**
     * Performs division.
     * @see gof_patterns.interpreter.Expression#interpret(Context)
     */
    @Override
    public double interpret(Context context) {
        return left.interpret(context) / right.interpret(context);
    }
}