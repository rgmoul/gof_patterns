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

import java.util.ArrayList;
import java.util.List;

import gof_patterns.interpreter.Token.TokenType;

/**
 * Converts an infix string expression into a list of tokens - auxiliary component not part of the
 * Interpreter pattern.
 */
class InfixLexer {
	/**
	 * Converts an infix string expression into a list of tokens.
	 * 
	 * @param expression infix string expression to tokenize.
	 * @return the list of resulting tokens
	 */
    public static List<Token> tokenize(String expression) {
        List<Token> tokens = new ArrayList<>();
        char[] chars = expression.toCharArray();
        int i = 0;

        while (i < chars.length) {
            char c = chars[i];

            if (Character.isDigit(c) || c == '.') {
                // Capture multi-digit numbers
                StringBuilder number = new StringBuilder();
                while (i < chars.length && (Character.isDigit(chars[i]) || chars[i] == '.')) {
                    number.append(chars[i++]);
                }
                tokens.add(new Token(TokenType.NUMBER, number.toString()));
                continue;
            }

            if (Character.isLetter(c)) {
                // Capture variable names (single or multi-letter)
                StringBuilder variable = new StringBuilder();
                while (i < chars.length && Character.isLetter(chars[i])) {
                    variable.append(chars[i++]);
                }
                tokens.add(new Token(TokenType.VARIABLE, variable.toString()));
                continue;
            }

            switch (c) {
                case '+', '-', '*', '/' -> tokens.add(new Token(TokenType.OPERATOR, String.valueOf(c)));
                case '(' -> tokens.add(new Token(TokenType.LEFT_PAREN, "("));
                case ')' -> tokens.add(new Token(TokenType.RIGHT_PAREN, ")"));
                case ' ' -> {} // Ignore spaces
                default -> throw new IllegalArgumentException("Invalid character: " + c);
            }
            i++;
        }
        return tokens;
    }
}
