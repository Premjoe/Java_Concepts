package oop.Encapsuslation;

public class Employee {

	// Private variables
	// use - Due to some data security, confiditional and avoid the manipulating.
	private String name;
	private int age;
	private double salary;
	private int amount;

	int amount1;

	private void empcalculation() {

		int l = 10;
		int k = 50;
		amount = l + k;
	}

	public int getEmpSalary() {
		empcalculation();
		return amount;
	}

	// Public getter and setter

	public void setName(String name) {
		this.name = name;
	}

	public String getName() {
		return name;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public int getAge() {
		return age;
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}

	public double getSalary() {
		return salary;
	}

}
