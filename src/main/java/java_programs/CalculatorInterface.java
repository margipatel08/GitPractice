package java_programs;

interface ICalculator {

	/** Returns a+b */
	public int add(int a, int b);

	/** Returns a-b */
	public int subtract(int a, int b);

	/** Returns a*b */
	public int multiply(int a, int b);

	/** Returns a/b */
	public int division(int a, int b);

}

public class CalculatorInterface implements ICalculator {

	public int a;
	public int b;
	public int result;

	public int add(int a, int b) {

		result = a + b;
		System.out.println("Sum of " + a + " and " + b + " is =" + result);
		return result;
	}

	public int subtract(int a, int b) {
		result = a - b;
		System.out.println("Substraction of " + a + " and " + b + " is =" + result);
		return result;
	}

	public int multiply(int a, int b) {
		result = a * b;
		System.out.println("Multiplication of " + a + " and " + b + " is =" + result);
		return result;
	}

	public int division(int a, int b) {
		result = a / b;
		System.out.println("Division of " + a + " and " + b + " is =" + result);
		return result;
	}
}
