package oop.Encapsuslation;

public class UserAccountTest {

	public static void main(String[] args) {
		UserAccount acc = new UserAccount("BMW", 1234987, 10, "Savings", false);

		System.out.println(acc.getName());
		System.out.println(acc.getAccountNo());
		System.out.println(acc.getSalary());
		System.out.println(acc.getAccountType());
		System.out.println(acc.isCurrentAccount());

		System.out.println("-------");
		acc.setName("Prem");
		acc.setAccountNo(98786545);

		System.out.println(acc.getName());
		System.out.println(acc.getAccountNo());
		System.out.println(acc.getSalary());
		System.out.println(acc.getAccountType());
		System.out.println(acc.isCurrentAccount());

	}

}
