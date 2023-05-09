package oop.Encapsuslation;

public class Registertest {

	public static void main(String[] args) {
		// CRUD API

		// Post call create the user
		// User 1:
		RegisterEnscaConstru reg = new RegisterEnscaConstru("Blue", 30, 9789876545L, "India", true);

		// Get call
		System.out.println(reg.getName());
		System.out.println(reg.getAge());
		System.out.println(reg.getPhoneNumber());
		;
		System.out.println(reg.getLocation());
		System.out.println(reg.isPermenant());

		// What is the important of setters : For updating the user values ex : location
		// Update the value : Put call
		reg.setLocation("Germany");
		reg.setPhoneNumber(+498765676545L);

		System.out.println("----------------");

		System.out.println(reg.getName());
		System.out.println(reg.getAge());
		System.out.println(reg.getPhoneNumber());
		;
		System.out.println(reg.getLocation());
		System.out.println(reg.isPermenant());

		System.out.println("----------------");

		// User 2

		RegisterEnscaConstru reg2 = new RegisterEnscaConstru(9876565434L);

		System.out.println(reg2.getName());
		System.out.println(reg2.getAge());
		System.out.println(reg2.getPhoneNumber());
		;
		System.out.println(reg2.getLocation());
		System.out.println(reg2.isPermenant());

		System.out.println("----------------");

		reg2.setName("Red");
		reg2.setAge(24);
		reg2.setLocation("Bangalore");
		reg2.setPermenant(false);

		System.out.println(reg2.getName());
		System.out.println(reg2.getAge());
		System.out.println(reg2.getPhoneNumber());
		;
		System.out.println(reg2.getLocation());
		System.out.println(reg2.isPermenant());
	}

}
