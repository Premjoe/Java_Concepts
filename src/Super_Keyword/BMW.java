package Super_Keyword;

public class BMW extends Car {

	// Super key word is using for to accessing the parent class properties without
	// creating the object
	// we can use inside the method only
	// we can use it in constructor but the constructor super keyword should be in first line of inside the constructor	
	// Using super keyword we can get the grand parents properties 
	// We can use super keyword in static method also but it's ugly to use always best approach is to call by class name
	int min_speed = 200;

	public void speedMethod() {

		// System.out.println(min_speed);
		System.out.println(super.min_speed);

	}

	public void ev() {
		// super.ev();
		System.out.println("TataPunch in BMW child class ");
		super.ev();
		System.out.println(super.min_speed);
	}

	BMW() {
		super(10);
		//this(19); Super and this keyword both are not possible : This key word is pointing the current class constructor
		System.out.println("This is my BMW child class default constructor");
		
	}

	BMW(int k) {
		
		System.out.println("This is my BMW class with parameter constructor " + k);
	}

}
