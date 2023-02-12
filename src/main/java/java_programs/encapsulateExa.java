package java_programs;


class Encapsulate{
	private String Fname,Lname;
	private int id,age;
	public String getFname() {
		return Fname;
	}


	public void setFname(String fname) {
		Fname = fname;
	}


	public String getLname() {
		return Lname;
	}


	public void setLname(String lname) {
		Lname = lname;
	}


	public int getId() {
		return id;
	}


	public void setId(int id) {
		this.id = id;
	}


	public int getAge() {
		return age;
	}


	public void setAge(int age) {
		this.age = age;
	}


	
	
	
	void show() {
		System.out.print("Data is" +" " +id +" " +age+ " " +Fname+ " "+ Lname + " " );
	}
}

public class encapsulateExa extends Encapsulate{

	public static void main(String[] args) {
		
		Encapsulate E=new Encapsulate();
		E.setId(1);
		E.setAge(29);
		E.setFname("Margi");
		E.setLname("Patel");
		E.show();
	}

}
