package com.Exercises;
import java.util.ArrayList;
import java.util.Arrays;

public class Syntax {


	int age ;
	int mark ;
	String name;
	String city;
	public Syntax(int age, int mark, String name) {
		
		this.age = age;
		this.mark = mark;
		this.name = name;
		
	}
public Syntax(int age, int mark, String name, String city) {
		
		this.age = age;
		this.mark = mark;
		this.name = name;
		this.city = city;
		
	}

	// Types of Methods: Default Method

	public void methodOne() {
		System.out.println("This is my Default method");
	}

	// With return type
	public int methodTwo() {

		int a = 10;
		int b = 20;

		int total = a + b;

		return total;
	}

	// With return type with variable
	public int methodThree(int a, int b) {

		int sub = a * b;
		return sub;

	}

	//
	public void methodFour() {

		int a = 10;
		int b = 10;

		System.out.println(a + b);
	}

	public static void main(String[] args) {

		int age = 30;

		if (age < 10) {
			System.out.println("The age is expacted");
		} else {
			System.out.println("Not true");
		}

		
		System.out.println("--------------------");
		String browser = "Chrome";
		switch (browser.toLowerCase()) {
		case "chrome":
			System.out.println("Passed the chrome Browser");

			break;
		case "firefox":
			System.out.println("Passed the firefox Browser");
			break;
		case "safari":
			System.out.println("Passed the safari Browser");
			break;

		default:
			System.out.println("Default message Please pass the correct browser");
			break;
		}
		System.out.println("---------normal for Loop-----------");
		
		for (int i =0; i<=5; i++) {
			System.out.println(i);
		}
		
		System.out.println("--For Reverse---");
		
		for (int i =5; i>=0; i--) {
			System.out.println(i);
		}
		
		System.out.println("---While Loop-----");
		
		int l = 0;
		while (l<=5) {
			System.out.println(l);
			l++;
		}
		System.out.println("---This is do while loop----");
		int k = 0;
		do {
			
			System.out.println(k);
			k++;
			
		} while (k<=5);
		
		System.out.println("----Static Array‚----");
		
		
		String name[] = new String [4];
		
		 name[0]= "Uk";
		 name[1] = "India";
		 name[2] = "Germany";
		 name[3]= "Japan";
		 
		 System.out.println(Arrays.toString(name));
		 System.out.println(name.length);
		 
		 
		 System.out.println("----Static Array Litrals‚----");
		 
		String myBrowser[] = {"chrome", "Safri", "Firefox"}; 
		
		System.out.println(Arrays.toString(myBrowser));
		System.out.println(myBrowser.length);
		
		
		ArrayList<String> car = new ArrayList<String>();
		
		car.add("Tata");
		car.add("tata Punch");
		car.add("Audi");
		System.out.println(car.get(1));
		System.out.println(car.size());
		
		ArrayList<Integer> number= new ArrayList<Integer>(Arrays.asList(10,20,30,40));
		System.out.println(number.add(30));
		System.out.println(number.get(3));
			
		
		
		Syntax cons = new Syntax(20, 11, "Jamesh");
		System.out.println(cons.age + " " + cons.mark + " " + cons.name );
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
