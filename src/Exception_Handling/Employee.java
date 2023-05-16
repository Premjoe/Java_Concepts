package Exception_Handling;

public class Employee {
		String exceptionName;
	public static void main(String[] args) {
			
		System.out.println("10");
		System.out.println("11");
		System.out.println("12");
		
		
		try {  // Throwing the exception
		int k= 9/0;
		System.out.println("Hi"); // It won't print hi
		System.out.println("Hi");
		}
		catch (ArithmeticException e) { // catching the exception
			System.out.println("In java 9/0 is : AE exception");
		}
		
		
		System.out.println("Hello");
		
		
		System.out.println("-------------");
		
		// case 2
		System.out.println("I am Java here and case 2 ");
		
		try {  
			
			Employee test = new Employee();
			test=null;
			
			
			System.out.println(test.exceptionName);
			System.out.println("Hi"); 
			System.out.println("Hi");
			}
			catch (NullPointerException e) {  
				System.out.println("In java 9/0 is : AE exception");
			}
		
			System.out.println("Hello this is case 2 Null pint Exception");
			
			
			
			// case 2
			System.out.println("I am Java here and case 2 ");
			
			try {  
				int g= 9/0;
				System.out.println(g);
				System.out.println("Hi"); 
				System.out.println("Hi");
				}
				catch (NullPointerException e) {  // Here It's AE exception but we passing nullPointer exception so this line of code won't execute
					System.out.println("This is case 2 null pointer exception");
				}
			
				System.out.println("Hello this is case 2 exception");

	}

}
