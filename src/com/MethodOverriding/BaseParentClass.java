package com.MethodOverriding;

//method overriding in java
// Parent class or super class
public class BaseParentClass {

	void show() {
		System.out.println("This is Base class or Parent class ");
	}

	// Inherited class
	class Child extends BaseParentClass {

		// This method overrides show() of Parent
		@Override
		void show() {
			System.out.println("Child's show()");
		}
	}

	public static void main(String[] args) {

	}

}
