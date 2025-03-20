package gof_patterns.interpreter;

/**
 * Represent the multiplication operation - NonterminalExpression in the Interpreter pattern.
 */
record MultiplyExpression(Expression left, Expression right) implements Expression {
   /**
    * Performs multiplication.
    * @see gof_patterns.interpreter.Expression#interpret(Context)
    */
    @Override
    public double interpret(Context context) {
        return left.interpret(context) * right.interpret(context);
    }
}