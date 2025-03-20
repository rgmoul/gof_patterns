package gof_patterns.interpreter;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

/**
 * Demonstrates use of /tests the Interpreter pattern.
 */
public class InterpreterTest {

	@Test
	void test() {
        Calculator calc = new Calculator();
        calc.setVariable("x", 2.2);
        calc.setVariable("a", 4);
        
        assertEquals(21.44, calc.evaluateInfix("5.2 * x + a + 6"));
        assertEquals(21.44, calc.evaluateRpn("5.2 x * a + 6 +"));
	}

}
