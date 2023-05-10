package oop.Polymorshism;

public class PolymorphismCore {

// Method over loading - Poly(many)morphism(forms) -->Polymorphism we can say 2 types
	// 1. Compile time Polymorphism (static binding), or Static Polymorphism ->(It's
	// little bit fast)
	// 2.Run time Polymorphism, Dynamic Polymorphism(Overriding)

// Method over loading will always happen in same class 	
// Complier wont allow a duplicate method
	// 1. can have same method name
	// 2. With the different parameters(data type)
	// 3. With the different types of parameter
	// 4. With different Sequence or order of the parameter
	// 5. Return type does't matter, It could be anything

	// Method overriding is happening with parent and child class

	int mark = 10;

	public void testMethod() { // 0 param

	}

	public void testMethod(int a) { // 1 Param

	}

	public void testMethod(String a) { // 1 Param

	}

	public void testMethod(int a, String k) { // 1 Param int, String

	}

	public void testMethod(String k, int a) { // 1 Param String, int

	}

	public boolean testMethod(String k, boolean flag) {

		flag = false;

		return flag;
	}

	// Real time use case of Method OverLoading

	// 1.Search
	// 2.Login module (Role based Login, supervisor, Admin)
	// 3.Payment module (UPI, NetBanking, Credit card, Debit card )
	// 4.Uber app(Car type, total Person)

	// Limits for passing argument - we can pass max 255 parameter

	// What is the advantages for Method Overloading
	// 1.Maintenance is easy, It's easy readability
	// 2.In user point of view - It's more usability (It's providing suggestion )

	public static void main(String[] args) {

		PolymorphismCore test = new PolymorphismCore();
// Which method has to be called is already decided in the compile time -> It will not decided in run time
		test.testMethod(100);
		test.testMethod("Hello");
		test.testMethod(120, "Lathen");
	}

}
