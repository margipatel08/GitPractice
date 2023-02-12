package java_programs;

public class parameter_consExa {

	int id;
	String name;
	
	//parameter constructor
	parameter_consExa(int i,String n){
		id=i;
		name=n;
	}
	void display() {
		System.out.println(id+" "+name);
	}
	public static void main(String[] args) {
		parameter_consExa s1=new parameter_consExa(1,"Margi");
		parameter_consExa s2=new parameter_consExa(2,"Devang");
		parameter_consExa s3=new parameter_consExa(3,"Gogo");
		s1.display();
		s2.display();
		s3.display();
		
	}

}
