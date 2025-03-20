package gof_patterns.interpreter;

/**
 * Represent the addition operation - NonterminalExpression in the Interpreter pattern.
 */
record AddExpression(Expression left, Expression right) implements Expression {
    /**
     * Performs addition.
     * @see gof_patterns.interpreter.Expression#interpret(Context)
     */
    @Override
    public double interpret(Context context) {
        return left.interpret(context) + right.interpret(context);
    }
}