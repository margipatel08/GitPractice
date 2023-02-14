package java_programs;



class Teacher{
	
	String activity="Teaching";
	String Name;
	String Subject;
}
class MathsTeacher extends Teacher{
	
	void MathsMethod()
	{
		Name="Heena";
		Subject="Maths";
		System.out.println("Hello...");
		System.out.println(Name+ " " +"is" + " " +activity + " " + Subject);
	}
	
}
class ScienceTeacher extends Teacher{
	void ScienceMethod()
	{
		Name="Meena";
		Subject="Science";
		System.out.println("Hello this is new change ...");
		System.out.println(Name+ " " +"is" + " " +activity + " " + Subject);
	}
}

public class inheritanceExa {

	public static void main(String[] args) {
		MathsTeacher MT=new MathsTeacher();
		MT.MathsMethod();
		ScienceTeacher SC=new ScienceTeacher();
		SC.ScienceMethod();
		

	}

}
