package gof_patterns.interpreter;

/**
 * Represent an arithmetic operation - base class for NonterminalExpression in the Interpreter pattern.
 */
abstract class OperatorExpression implements Expression {
    protected final Expression left;
    protected final Expression right;

    /**
     * Constructor.
     * 
     * @param left left hand expression for operation
     * @param right right hand expression for operation
     */
    public OperatorExpression(Expression left, Expression right) {
        this.left = left;
        this.right = right;
    }
}
