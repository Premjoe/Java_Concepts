package oop.Encapsuslation;

public class BankClassVariable {

	private String name;
	private long accountNo;
	private double total;
	private String accountType;
	private boolean isPerm;
	private double amount;

	public long setEmpAccountNo(long accountNo) {

		this.accountNo = accountNo;

		return accountNo;

	}

	private double addingAmount() {

		int bonus = 30;
		int salary = 100;

		return amount = bonus + salary;
	}

//	public String setName(String name) { // Local variable 
//		
//		this.name = name; // Global variable = Local variable
//		
//		return name;
//		  
//	  }

	public double getEmpAmount() {
		addingAmount();
		return amount;

	}

}
