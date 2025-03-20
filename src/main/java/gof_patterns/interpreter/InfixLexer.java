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
