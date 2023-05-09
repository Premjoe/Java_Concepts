package com.MethodCalling;

public class User {

	public void sendEmail() {
		System.out.println("This is send email");
	}

	public static void getEmail(User refvalue) { // refvalue = objref
		System.out.println("This is get Email");

		refvalue.sendEmail();

//	User obj = new User();
//	obj.sendEmail();
//		This is ugly 
	}

	public static void main(String[] args) {
		User refvalue = new User();
		User.getEmail(refvalue);

	}

}
