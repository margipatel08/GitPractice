package java_programs;

public class array_reverse_order {

	public static void main(String[] args) {
		
		int []arrayA= new int[]{1,2,3,4,5};
		System.out.println("Origional Array");
		for(int a=0;a<arrayA.length;a++) {
			System.out.print(arrayA[a]);
		}
		System.out.println();
		System.out.println("Reverse Array");
		for(int i=arrayA.length-1;i>=0;i--)
		{
			System.out.print(arrayA[i]);
		}
	}

}
