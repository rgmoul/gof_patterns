package gof_patterns.interpreter;

/**
 * Interface defining an expression - AbstractExpression in the Interpreter pattern.
 */
interface Expression {
	/**
	 * Interprets/evaluates and expression.
	 *
	 * @param context provides context for the evaluation (i.e. variables)
	 *
	 * @return the value of the expression
	 */
    double interpret(Context context);
}