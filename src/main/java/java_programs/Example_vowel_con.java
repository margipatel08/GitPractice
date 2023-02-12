package java_programs;
import java.util.Scanner;
public class Example_vowel_con {
	

	    public static void main(String[] args) {
	    	
	    	Scanner string_Input=new Scanner(System.in);
	    	System.out.println("Enter String");
	    	String str=string_Input.nextLine();
	     //   String str = "HelloWorldjava";
	        int vcount = 0, ccount = 0;
	        
	        //count total no of Char in String
	        System.out.println("Total characters in String = " +str.length());
	       
	       str = str.toLowerCase();
	        for(int i = 0; i < str.length(); i++)
	        	{ char ch = str.charAt(i);
	        	if(ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') 
	        	{ vcount++; } 
	        else if((ch >= 'a'&& ch <= 'z'))
	        {
	                ccount++;
	        }
	        }
	        System.out.println("Number of Vowels= " + vcount);
	        System.out.println("Number of Consonants= " + ccount);
	        string_Input.close();
	    }
	}

