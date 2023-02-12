package java_programs;
import java.util.*;

public class Pattern_2 {
	public static void main(String[] args)     
	   {    
		Scanner myObj = new Scanner(System.in);  // Create a Scanner object
	    System.out.println("Enter Number");

	    int num = myObj.nextInt();
	       int i ,j;    
	    //   int n = 5;    
	           for(i = 0; i<num; i++ )    
	           {    
	                for(j = 0; j<=i ; j++)    
	                   {    
	                       System.out.print("*");    
	                   }    
	                        System.out.println("");    
	           }        
	   }
}
