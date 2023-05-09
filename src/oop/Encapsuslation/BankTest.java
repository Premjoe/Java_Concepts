package oop.Encapsuslation;

public class BankTest {

	public static void main(String[] args) {
		BankClassVariable ref = new BankClassVariable();

		long useraccountNumber = ref.setEmpAccountNo(98790865678L);
		System.out.println("The user account number is: " + useraccountNumber);

	}

}
