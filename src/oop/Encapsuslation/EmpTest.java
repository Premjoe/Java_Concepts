package oop.Encapsuslation;

public class EmpTest {

	public static void main(String[] args) {
		Employee e1 = new Employee();
		// e1.name = "Prem"; we can't access directly

		e1.setName("Tom");
		e1.setAge(30);
		e1.setSalary(13.98);
		String name = e1.getName();
		System.out.println(name);

		System.out.println(e1.getAge());
		System.out.println(e1.getSalary());

		int totalAmount = e1.getEmpSalary();
		System.out.println(totalAmount);

		Employee e2 = new Employee();
		int totalAmountt = e2.getEmpSalary();
		System.out.println(totalAmountt);

	}

}
