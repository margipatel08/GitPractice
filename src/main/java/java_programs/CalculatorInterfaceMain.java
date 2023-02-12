package java_programs;


import java.util.Scanner;

public class CalculatorInterfaceMain {
	public static void main(String[] args) {

		CalculatorInterface cal = new CalculatorInterface();

		String operator="";
		int number1=0, number2=0;
		Scanner input = new Scanner(System.in);
			
			first:
				while(operator != "exit") {	
				System.out.println("Enter the operator + OR - OR * OR / and type 'exit' to quite the execution");
				operator = input.next();
				if(operator == "exit") {
					
					break first;
					//System.exit(0);
				}
				
				if(operator != "exit") {
					System.out.println("Enter number 1");
					number1 = input.nextInt();
					System.out.println("Enter number 2");
					number2 = input.nextInt();		
				}
		
		

		
		
		//System.out.println("Choose an operator: +, -, *, /");
		//operator = input.next();

		// ask users to enter numbers
		

		switch (operator) 
		{

		// performs addition between numbers
		case "+":
			cal.add(number1, number2);
			break;

		// performs subtraction between numbers
		case "-":
			cal.subtract(number1, number2);
			break;

		// performs multiplication between numbers
		case "*":
			cal.multiply(number1, number2);
			break;

		// performs division between numbers
		case "/":
			cal.division(number1, number2);
			break;
			
		case "exit": 
			
			break first;
		default:
			System.out.println("Invalid operator!");
			break;
		}

		
	}input.close();
}
	
}
