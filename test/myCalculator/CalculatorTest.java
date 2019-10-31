package myCalculator;

import static org.junit.Assert.*;
import org.junit.Before;
import org.junit.Test;

public class CalculatorTest {
	
	Calculator calculator;
	
	@Before
	public void setup() {
		calculator = new Calculator();
	}
	
	@Test(expected = NumberFormatException.class)
	public void testInvalidOperation() {
		calculator.compute(3, 2, 7);
	}
	
	@Test
	public void testAdd() {
		float result = calculator.compute(3, 2, 1);
		assertEquals((float)5, result, 0);
	}
	
	@Test
	public void testSubtract() {
		float result = calculator.compute(3, 2, 2);
		assertEquals((float)1, result, 0);
	}
	
	@Test
	public void testMultiply() {
		float result = calculator.compute(3, 2, 3);
		assertEquals((float)6, result, 0);
	}
	
	@Test
	public void testDivide() {
		float result = calculator.compute(3, 2, 4);
		assertEquals((float)1.5, result, 0);
	}
	
	@Test(expected = NumberFormatException.class)
	public void testDivideError() {
		calculator.compute(3, 0, 4);
	}
	
	@Test
	public void testModulus() {
		float result = calculator.compute(3, 2, 5);
		assertEquals((float)1, result, 0);
	}
	
}
