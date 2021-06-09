package com.cyient.assignments;

public class Student {

	public int roll;
	public String mail;
	public String name;
	public static String schoolName;
	public static String schoolAdress;
	public static String schoolNum;
	
	public static void printStudentDetails(Student s1)
    {
            System.out.println(Student.schoolName);
            System.out.println(s1.roll);
            System.out.println(Student.schoolAdress);
            System.out.println(s1.name);
           
            System.out.println(s1.mail);
    }
	
	public void printStudent()
    {
            System.out.println(Student.schoolName);
            System.out.println(roll);
            System.out.println(Student.schoolAdress);
            System.out.println(name);
           
            System.out.println(mail);
    }
	
}


