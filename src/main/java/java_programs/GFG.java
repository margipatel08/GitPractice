package java_programs;

//Java Program Illustrating Can we have
//Multiple main() Methods

//Importing input output classes


//Main class
class GFG {

	// Method 1
	// Main driver method
	public static void main(int i)
	{

		// Print statement for method 1
		System.out.println(i);
	}

	// Method 2
	// Main driver method
	public static void main(String s)
	{

		// Print statement for method 2
		System.out.println(s);
		System.out.println("hello");
	}

	// Method 3
	// Main driver method
	public static void main(String[] args)
	{

		// Calling above 2 main methods
		main(1);
		main("hi");
	}
}



