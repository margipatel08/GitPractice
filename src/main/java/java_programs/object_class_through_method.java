package java_programs;

class StudentData{
	int id;
	String Fname,Lname;
	
	
	void insertData(int id1,String fName1,String lName1)
	{
		id=id1;
		Fname=fName1;
		Lname=lName1;
		
		System.out.println(id+" "+Fname+" "+Lname);
	}
}


public class object_class_through_method {

	public static void main(String[] args) {
		StudentData s1=new StudentData();
		StudentData s2=new StudentData();
		s1.insertData(1, "Margi", "Patel");
		s2.insertData(2, "Devang", "Panchal");

	}

}
