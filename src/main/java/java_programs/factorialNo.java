package java_programs;

public class factorialNo {

	
	void fact(int n) {
		
		int fact=1;
		for(int i=1;i<=n;i++) {
			fact=fact*i;
			
		}
		System.out.println("factorial is="+fact);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//calling method through anonymous object
		new factorialNo().fact(4);

	}

}
