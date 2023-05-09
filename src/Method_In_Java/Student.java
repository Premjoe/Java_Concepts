package Method_In_Java;

public class Student {

	String name;
	String location;
	int mark;

	// 1 no return and no input, we can use this function for click action like
	// check box
	public void studentDetails() {
		System.out.println("This is my first addition function");

		int a = 10;
		int b = 20;

		int c = a + b;

		System.out.println(c);
	}

	// 2. with return and no input : for further calculation i can use it

	public int mySum() {
		System.out.println("This is with return type multplication");

		int Tamil = 95;
		int English = 98;

		int total = Tamil + English;

		return total;

	}

	// 3. With variable and return type
	public int myAdd(int a, int b, int c) {

		System.out.println("Adding three number");
		int totalPoint = a + b + c;
		return totalPoint;

	}

	public static void main(String[] args) {

		Student objref = new Student();
		objref.studentDetails();
		// System.out.println(mySum);
		int myvalue = objref.mySum();
		System.out.println(myvalue + 3);
		if (myvalue < 180) {
			System.out.println("Congrats and All the best");
		} else {
			System.out.println("Learn well");
		}

		System.out.println("-----");
		int thirdFunction = objref.myAdd(10, 11, 12);
		System.out.println(thirdFunction);
		System.out.println("-----");

	}

}
