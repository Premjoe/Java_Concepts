package oop.Encapsuslation;

public class UserAccount {

	private String name;
	private int accountNo;
	private int Salary;
	private String accountType;
	private boolean currentAccount;

	public UserAccount(String name, int accountNo, int salary, String accountType, boolean currentAccount) {

		this.name = name;
		this.accountNo = accountNo;
		Salary = salary;
		this.accountType = accountType;
		this.currentAccount = currentAccount;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getName() {
		return name;
	}

	public int getAccountNo() {
		return accountNo;
	}

	public void setAccountNo(int accountNo) {
		this.accountNo = accountNo;
	}

	public int getSalary() {
		return Salary;
	}

	public void setSalary(int salary) {
		Salary = salary;
	}

	public String getAccountType() {

		return accountType;
	}

	public void setAccountType(String accountType) {
		this.accountType = accountType;
	}

	public boolean isCurrentAccount() {
		return currentAccount;
	}

	public void setCurrentAccount(boolean currentAccount) {
		this.currentAccount = currentAccount;
	}

}
