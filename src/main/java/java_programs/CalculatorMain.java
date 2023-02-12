package java_programs;

public class CalculatorMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		CalculatorMethods c1=new CalculatorMethods();
		c1.addition(12, 12);
		System.out.println("Addition of 2 no is= "+c1.c);
		c1.divison(24, 2);
		System.out.println("division of 2 no is= "+c1.c);
		c1.multiplication(12, 12);
		System.out.println("Mutiplication of 2 no is= "+c1.c);
		c1.substraction(10, 2);
		System.out.println("Substraction of 2 no is= "+c1.c);
		
	}

}
