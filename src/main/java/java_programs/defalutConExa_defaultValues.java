package java_programs;

public class defalutConExa_defaultValues {

	String name,lname;
	//method to display value
	void display() {
		System.out.println(name +" "+ lname);
	}
	public static void main(String[] args) {
		defalutConExa_defaultValues s1=new defalutConExa_defaultValues();
		defalutConExa_defaultValues s2=new defalutConExa_defaultValues ();
		
		s1.display();
		s2.display();

	}

}
