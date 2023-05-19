package Exception_Handling;


public class ThrowsKeyword {
	// Throws Keyword is using for passing the exception from one method in to another method
	
	public void m1 () {
	System.out.println("This is M1 method");
	m2();
	}
	
	public void m2() { // Consider this is as a Amazon application
		System.out.println("This is M2 method");
		
		try {
			m3();
		} catch (Exception e) {
			System.out.println("Hello This is my first handling ");
			e.printStackTrace();
		}
		
	
		
		
	}
	
	public void m3 () { // This bank server 
		System.out.println("This is M3 Method");
		
		int k = 10/0;
		
	}
	

	
	
	

	
	
	public static void main(String [] args) {
		
		ThrowsKeyword obj = new ThrowsKeyword();
		
		obj.m1();
		System.out.println("bye");
		
		
		
		
		
		
		
		
		
		
	}

}
