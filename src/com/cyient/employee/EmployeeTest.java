package com.cyient.employee;

public class EmployeeTest {

	public static void main(String[] args) {
		
		Employee.companyName="Cyient";
		
		Employee obj1= new Employee();
		obj1.empName="John";
		obj1.empNo=101;
		obj1.empSalary=5000;
		

		
		Employee obj2= new Employee();
		obj2.empName="Mark";
		obj2.empNo=102;
		obj2.empSalary=4000;
		
		Employee obj3= new Employee();
		obj3.empName="Peter";
		obj3.empNo=103;
		obj3.empSalary=2000;
		
	}

}
