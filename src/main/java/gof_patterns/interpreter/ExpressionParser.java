/*
 * MIT License
 *
 * Copyright (c) 2025 Russ Moul
 *
 * Permission is hereby granted, free of charge, to any person obtaining a copy
 * of this software and associated documentation files (the "Software"), to deal
 * in the Software without restriction, including without limitation the rights
 * to use, copy, modify, merge, publish, distribute, sublicense, and/or sell
 * copies of the Software, and to permit persons to whom the Software is
 * furnished to do so, subject to the following conditions:
 *
 * The above copyright notice and this permission notice shall be included in all
 * copies or substantial portions of the Software.
 *
 * THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR
 * IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY,
 * FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE
 * AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER
 * LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM,
 * OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN THE
 * SOFTWARE.
 */

package gof_patterns.interpreter;

import java.util.Deque;
import java.util.LinkedList;
import java.util.List;

/**
 * Parses an expression string to form an expression - auxiliary component not part of the Interpreter pattern.
 */
class ExpressionParser {
	/**
	 * Parses a string to build an expression.
	 * 
	 * @param expression the string to parse
	 * @param isRPN indicates if the expression is in RPN or infix notation
	 * @return the resultant expression
	 */
    public static Expression parse(String expression, boolean isRPN) {
        if (isRPN) {
            return parseRPN(expression);
        } else {
            List<Token> tokens = InfixLexer.tokenize(expression);
            return new InfixParser(tokens).parseExpression();
        }
    }

    
	/**
	 * Parses a RPN string to build an expression.
	 * 
	 * @param rpnExpression the string to parse
	 * @return the resultant expression
	 */
    private static Expression parseRPN(String rpnExpression) {
        Deque<Expression> stack = new LinkedList<>();
        String[] tokens = rpnExpression.split(" ");

        for (String token : tokens) {
            if (token.matches("-?\\d*\\.?\\d+")) { 
                // Token is a number
                stack.push(new NumberExpression(Double.parseDouble(token)));
            } else if (token.matches("[a-zA-Z]+")) { 
                // Token is a variable
                stack.push(new VariableExpression(token));
            } else { 
                // Token is an operator
                Expression right = stack.pop();
                Expression left = stack.pop();

                switch (token) {
                    case "+" -> stack.push(new AddExpression(left, right));
                    case "-" -> stack.push(new SubtractExpression(left, right));
                    case "*" -> stack.push(new MultiplyExpression(left, right));
                    case "/" -> stack.push(new DivideExpression(left, right));
                    default -> throw new IllegalArgumentException("Invalid token: " + token);
                }
            }
        }
        return stack.pop(); // Final expression tree
    }
}