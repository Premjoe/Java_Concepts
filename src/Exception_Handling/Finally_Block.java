package Exception_Handling;

import javax.security.auth.kerberos.KerberosCredMessage;

import com.MethodOverriding.TestCar;

public class Finally_Block {

	public static void main(String[] args) {
		// Exception is coming or what - 
		
		// We can do the coding with out catch block and with finally block -> but its not good practice but we can handle like this 
		
		try {
			int i = 9/0;
		} 
		catch (Exception e) {
			System.out.println("AE Exception is comin ");
			e.printStackTrace();
		}
		
		finally {
			System.out.println("Hello I am Finally Block 1");
			
		
		try {
			int k = 18/0;
		} 
		catch (Exception e) {
			System.out.println("AE Exception is comin in 2nd varibale ");
			e.printStackTrace();
		}
		
		finally {
			System.out.println("Hi, I am second finally block");
		}
		
		}
		
		
		System.out.println("Hi");
		
	}

}
