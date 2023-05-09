package com.Class_Object;

public class Student {

	String name;
	int mark;
	char grade;

	public static void main(String[] args) {

		Student s1 = new Student();
		s1.name = "Peter";
		s1.mark = 99;
		s1.grade = 'A';

		Student s2 = new Student();
		s2.name = "Elon";
		s2.mark = 90;
		s2.grade = 'B';

		Student s3 = new Student();
		s3.name = "Ram";
		s3.mark = 80;
		s3.grade = 'C';

		Student s4 = new Student();
		s4.name = "Tim";
		s4.mark = 69;
		s4.grade = 'D';

		System.out.println(s1.name + " " + s1.mark + " " + s1.grade);
		System.out.println(s2.name + " " + s2.mark + " " + s2.grade);
		System.out.println(s3.name + " " + s3.mark + " " + s3.grade);
		System.out.println(s4.name + " " + s4.mark + " " + s4.grade);
		System.out.println("----------");

		s1 = s2;

		System.out.println(s1.name + " " + s1.mark + " " + s1.grade);
		System.out.println(s2.name + " " + s2.mark + " " + s2.grade);
		System.out.println(s3.name + " " + s3.mark + " " + s3.grade);
		System.out.println(s4.name + " " + s4.mark + " " + s4.grade);
		System.out.println("----------");

		s2 = s3;

		System.out.println(s1.name + " " + s1.mark + " " + s1.grade);
		System.out.println(s2.name + " " + s2.mark + " " + s2.grade);
		System.out.println(s3.name + " " + s3.mark + " " + s3.grade);
		System.out.println(s4.name + " " + s4.mark + " " + s4.grade);
		System.out.println("----------");

		s3 = s4;

		System.out.println(s1.name + " " + s1.mark + " " + s1.grade);
		System.out.println(s2.name + " " + s2.mark + " " + s2.grade);
		System.out.println(s3.name + " " + s3.mark + " " + s3.grade);
		System.out.println(s4.name + " " + s4.mark + " " + s4.grade);
		System.out.println("----------");

		s4 = s1;

		System.out.println(s1.name + " " + s1.mark + " " + s1.grade);
		System.out.println(s2.name + " " + s2.mark + " " + s2.grade);
		System.out.println(s3.name + " " + s3.mark + " " + s3.grade);
		System.out.println(s4.name + " " + s4.mark + " " + s4.grade);
		System.out.println("----------");
	}

}
