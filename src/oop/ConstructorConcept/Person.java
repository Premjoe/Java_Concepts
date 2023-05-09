package oop.ConstructorConcept;

public class Person {

	String name;
	int age;
	char gender;
	double height;
	boolean isActive;
	String location;

	public Person(String name, int age, char gender, double height) {

		this.name = name;
		this.age = age;
		this.gender = gender;
		this.height = height;
	}

	public Person(String name, int age, char gender, double height, boolean isActive) {

		this.name = name;
		this.age = age;
		this.gender = gender;
		this.height = height;
		this.isActive = isActive;
	}

	public Person(String name, int age, char gender, double height, boolean isActive, String location) {

		this.name = name;
		this.age = age;
		this.gender = gender;
		this.height = height;
		this.isActive = isActive;
		this.location = location;
	}

	public static void main(String[] args) {
		// obj
		Person obj = new Person("Musk", 30, 'm', 6.1);
		System.out.println(obj.name + " " + obj.age + " " + obj.gender + " " + obj.height);

		System.out.println("-------");
		// obj 1
		Person obj1 = new Person("Rosen", 30, 'm', 6.1, true);
		System.out.println(obj1.name + " " + obj1.age + " " + obj1.gender + " " + obj1.height + " " + obj1.isActive);

		System.out.println("-------");
		// obj 2
		Person obj2 = new Person("Sara", 30, 'f', 6.1, false, "Germany");
		System.out.println(obj2.name + " " + obj2.age + " " + obj2.gender + " " + obj2.height + " " + obj2.isActive
				+ " " + obj2.location);

	}

}
