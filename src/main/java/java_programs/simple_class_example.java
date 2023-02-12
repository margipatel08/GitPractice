package java_programs;

class registration {
	String course;
	String field;
	
}

class simple_class_example {

	int id;

	String name;

	public static void main(String args[]) {

		simple_class_example s1 = new simple_class_example();

		s1.id = 1;
		s1.name = "margi";
		System.out.println(s1.id);
		System.out.println(s1.name);

		registration s2 = new registration();
		s2.course = "MBA";
		s2.field = "Business";
		System.out.println(s2.course);
	}
}
