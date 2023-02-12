package java_programs;


class showempDetails {
	
	empDetails employeeD=new empDetails();
	empDetails emp2=new empDetails();
	
	
	
	
	 void setData()
	 {
		
		employeeD.setEmp_id(1);

		 employeeD.setEmp_age(30);

		 employeeD.setEmp_salary(100000);

		 employeeD.setEmp_name("MARGI");

		 employeeD.setEmp_email("pmargi8@gmail.com");

		 employeeD.setEmp_department("IT");
			
			
			emp2.setEmp_id(2);

			emp2.setEmp_age(32);

			emp2.setEmp_salary(100000);

			emp2.setEmp_name("Devang");

			emp2.setEmp_email("Devang@gmail.com");

			emp2.setEmp_department("Civil");
	 }
	void display () {
		 
		
			System.out.println("Employee ID="+employeeD.getEmp_id());
			System.out.println("Employee Age="+employeeD.getEmp_age());
			System.out.println("Employee Salary="+employeeD.getEmp_salary());
			System.out.println("Employee Name="+employeeD.getEmp_name());
			System.out.println("Employee Department="+employeeD.getEmp_department());
			System.out.println("Employee Email="+employeeD.getEmp_email());
			System.out.println();
			System.out.println("Employee ID="+emp2.getEmp_id());
			System.out.println("Employee Age="+emp2.getEmp_age());
			System.out.println("Employee Salary="+emp2.getEmp_salary());
			System.out.println("Employee Name="+emp2.getEmp_name());
			System.out.println("Employee Department="+emp2.getEmp_department());
			System.out.println("Employee Email="+emp2.getEmp_email());
		}
	 
	 
}
