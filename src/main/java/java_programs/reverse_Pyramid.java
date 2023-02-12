package java_programs;

public class reverse_Pyramid {

	public static void main(String[] args) {
		int i, j;
		int n = 7;
		for (i = n; i >= 1; i--)
		{
			for (j = i; j < n; j++) 
			{
				System.out.print(" ");
			}
			// System.out.println("");
			for (j = 1; j <= (2 * i - 1); j++) 
			{
				System.out.print("*");
			}
			System.out.println("");
		}
	}

}
