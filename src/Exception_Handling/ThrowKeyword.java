package Exception_Handling;

public class ThrowKeyword {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String browser = null;

		if (browser == null) {
			try {
				throw new Exception("NOBROWSEREXCEPTION");
			} catch (Exception e) {
				System.out.println("browser not found....please pass the right browser");
				e.printStackTrace();
			}
		}

	}
	// Using throw key word we can customise the exception, Here throw key word is throwing the exception and not handling it 
	//finally block - DB connection
	//compile/runtime exception
	//use case of throw -- custom exception
	
}
