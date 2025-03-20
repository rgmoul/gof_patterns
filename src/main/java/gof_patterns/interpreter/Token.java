package gof_patterns.interpreter;

/**
 * Token from infix expression - auxiliary component not part of the Interpreter pattern.
 */
record Token (TokenType type, String value) {
	/** Allowed token types. */
	public enum TokenType {
	    NUMBER, VARIABLE, OPERATOR, LEFT_PAREN, RIGHT_PAREN
	}
}
