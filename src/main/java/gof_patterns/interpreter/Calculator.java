package gof_patterns.interpreter;

import java.util.List;

/**
 * Simple calculator that can evaluate infix and RPN expressions - Client in Interpreter pattern.
 */
public class Calculator {
    final Context context = new Context();

	public void setVariable(String name, double value) {
		context.setVariable(name, value);
	}
	
	double evaluateInfix(String infixExpression) {
	    List<Token> tokens = InfixLexer.tokenize(infixExpression);
	    Expression expressionTree = new InfixParser(tokens).parseExpression();
	    return expressionTree.interpret(context);
	}
	
	double evaluateRpn(String rpnExpression) {
        Expression rpnTree = ExpressionParser.parse(rpnExpression, true);
        return rpnTree.interpret(context); 
	}

}
