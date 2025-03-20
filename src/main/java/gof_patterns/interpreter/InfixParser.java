/*
 * MIT License
 *
 * Copyright (c) 2025 Symbiont Software
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

import java.util.List;

import gof_patterns.interpreter.Token.TokenType;

/**
 * Parses tokens to form an expression - auxiliary component not part of the Interpreter pattern.
 */
class InfixParser {
    private final List<Token> tokens;
    private int index = 0;

    /**
     * Constructor.
     * 
     * @param tokens tokens to parse.
     */
    public InfixParser(List<Token> tokens) {
        this.tokens = tokens;
    }

    /**
     * Gets the current token or null if none remaining.
     *
     * @return the current token or null if none remaining.
     */
    private Token peek() {
        return (index < tokens.size()) ? tokens.get(index) : null;
    }

    /**
     * Get the next token.
     * 
     * @return the next token.
     */
    private Token consume() {
        return tokens.get(index++);
    }

    /**
     * Parse an expression (lowest precedence).
     * 
     * @return the resulting expression
     */
    public Expression parseExpression() {
        Expression left = parseTerm();

        while (peek() != null && (peek().value().equals("+") || peek().value().equals("-"))) {
            Token operator = consume();
            Expression right = parseTerm();
            left = operator.value().equals("+") ? new AddExpression(left, right) : new SubtractExpression(left, right);
        }
        return left;
    }

    /**
     * Parse a term (higher precedence than expression).
     * 
     * @return the resulting expression
     */
    private Expression parseTerm() {
        Expression left = parseFactor();

        while (peek() != null && (peek().value().equals("*") || peek().value().equals("/"))) {
            Token operator = consume();
            Expression right = parseFactor();
            left = operator.value().equals("*") ? new MultiplyExpression(left, right) : new DivideExpression(left, right);
        }
        return left;
    }

    /**
     * Parse a factor (parentheses or number).
     * 
     * @return expression representing the factor.
     */
    private Expression parseFactor() {
        Token token = consume();
        
        if (token.type() == TokenType.NUMBER) {
            return new NumberExpression(Double.parseDouble(token.value()));
        } else if (token.type() == TokenType.VARIABLE) {
            return new VariableExpression(token.value());
        } else if (token.type() == TokenType.LEFT_PAREN) {
            Expression expr = parseExpression();
            if (consume().type() != TokenType.RIGHT_PAREN) {
                throw new IllegalArgumentException("Mismatched parentheses");
            }
            return expr;
        }

        throw new IllegalArgumentException("Unexpected token: " + token.value());
    }
}
