package java_programs;

import org.junit.Assert;
import org.junit.Test;

public class CalculatorTest {
	CalculatorMethods calculator ;
	@Test
	public void testSum() {
		// Given
		CalculatorMethods calculator = new CalculatorMethods();
		// When
		int result = calculator.addition(2, 2);
		// Then
		if (result != 4) {   // if 2 + 2 != 4
			Assert.fail();
		}
	}

	@Test
	public void testMinus() {
		calculator = new CalculatorMethods();
		Assert.assertEquals(0, calculator.substraction(2, 2));
	}

	@Test
	public void testDivide() {
		 calculator = new CalculatorMethods();
		 Assert.assertEquals(2, calculator.divison(6, 3));
		// Assert.assertEquals(2,calculator.divison(6, 3));
	}
	@Test
	public void testMult() {
		 calculator = new CalculatorMethods();
		Assert.assertEquals(2, calculator.multiplication(2, 1));
	
	}

}
