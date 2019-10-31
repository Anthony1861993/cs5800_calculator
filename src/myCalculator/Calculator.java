package myCalculator;

public class Calculator {
	
	private int firstInput;
	private int secondInput;
	private int operation;
	
	public float compute(int firstInput, int secondInput, int operation) {
		switch (operation) {
		case 1:
			return add(firstInput, secondInput);
		case 2:
			return subtract(firstInput, secondInput);
		case 3:
			return multiply(firstInput, secondInput);
		case 4:
			return divide(firstInput, secondInput);
		case 5:
			return modulus(firstInput, secondInput);
		default:
			throw new NumberFormatException("Invalid operation");
		}
	}
	
	private int add(int a, int b) {
		return a+b;
	}
	
	private int subtract(int a, int b) {
		return a-b;
	}
	
	private int multiply(int a, int b) {
		return a*b;
	}
	
	private float divide(int a, int b) {
		if (b == 0) throw new NumberFormatException("divisor cannot be zero");
		return (float)a/b;
	}
	
	private int modulus(int a, int b) {
		return a%b;
	}
	
}

