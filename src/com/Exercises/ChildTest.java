package com.Exercises;

public class ChildTest {

	public static void main(String[] args) {
		ChildOne obj = new ChildOne();
		obj.psgEngineering();
		obj.psgArts();
		obj.psgEngineering();
		obj.medicalCollege();
		
		System.out.println("----------");
		
		ChildTwo obj1 = new ChildTwo();
		obj1.psgSchool();
		obj1.psgEngineering();
		obj1.psgArts();
		obj1.psgEngineering();
		obj1.medicalCollege();
		ChildOne.TestMethod();
		ChildTwo.TestMethod();
		obj1.HelloWorld();
		
		
		ParentClass toptes = new ChildTwo();
		
		toptes.psgArts();
		toptes.psgEngineering();
		toptes.psgDiploma();
		
		
	}

}
