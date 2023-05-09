package Method_In_Java;

public class TypesOfFunction {
	// Methods and Functions are same
	// In high level programming language calling as methods
	// Methods are used for business logic or Feature
	// can not create the method in inside the method
	// Methods are independent or parallel to each other
	// Method is part of member class

	String name;
	int age;
	// Types of Methods :

	// 1.no return and no input :
	// We are not passing inside the function so calling as no input
	// Void - can not return anything (here no return key word)

	public void testAutomation() {

		System.out.println("This is my first test method");

		int mark = 100;
		System.out.println(mark);

	}

	// 2.Return with no input

	public int sum() {
		int i = 10;
		int k = 11;
		int total = (i + k);

		return total;
	}

	// 2.1

	public String getTuitorName() {
		System.out.println("Finding my tutor name: ");
		String name = "Naveen";
		return name;
	}

	// 3 with return and with argument

	public int lastFunction(int a, int b) {

		System.out.println("Adding the number");
		int y = a + b;
		return y;
	}

	// 1.1 We can create the blank return method with void
	public void nameList() {

		int a = 1;
		int b = 2;

		int k = a + b;
		System.out.println(k);
		return;
	}

	public static void main(String[] args) {
		// Can not create the methods and data members directly
		// System.out.println(name);
		// If we want to access the data members and methods in inside the main method,
		// should create the object

		TypesOfFunction objref = new TypesOfFunction();
		// 1
		objref.name = "Prem";
		objref.age = 30;
		System.out.println(objref.name + " " + objref.age);
		objref.testAutomation(); // Calling method

		System.out.println("--------");
		// 2
		int totalsum = objref.sum();
		System.out.println(totalsum - 5 + 10);

		System.out.println("--------");

		String triner = objref.getTuitorName();

		if (triner.equals("Naveen")) {
			System.out.println("Hello Naveen, Thanks for the Java course");
		}

		else {
			System.out.println("This is Angela for your new trainer");
		}
		System.out.println("--------");
		// 3
		int finalout = objref.lastFunction(100, 100);
		System.out.println(finalout);
		System.out.println("--------");

	}

}
