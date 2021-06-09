package com.cyient.assignments;

public class StudentTest {

	public static void main(String[] args) {
		Student.schoolName="Global school";
		Student.schoolAdress="456, Global school";
		
		Student s1=new Student();
		s1.roll=1001;
		s1.name="jack";
		s1.mail="jack@gmail.com";
		
		Student.printStudentDetails(s1);
		s1.printStudent();
		Student s2=new Student();
		s2.roll=1002;
		s2.name="peter";
		s2.mail="peter@gmail.com";
		
		Student s3=new Student();
		s3.roll=1003;
		s3.name="Mark";
		s3.mail="mark@gmail.com";
		
		System.out.println(Student.schoolName);
		System.out.println(Student.schoolAdress);
		
		System.out.println(s2.roll);
		System.out.println(s2.roll);
		System.out.println(s2.roll);
	}

}
