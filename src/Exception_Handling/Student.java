package Exception_Handling;

public class Student {

	public static int getStudentMark(String name) {
		System.out.println("Getting marks for ..: " + name);
		if (name.equals("Eden")) {
			try {
				int l = 7 / 3;
				return 100; // 89 will replace the 100
			}

			catch (ArithmeticException e) {
				System.out.println("Hello, AE is commming and I caught the Exception");
				
				//e.printStackTrace();
				return 99; // Function will return only one value, It won't return parally 3 return 
			}
			finally {
				System.out.println("This is my finally block");
				return 89;
			}
			

		} else if (name.equals("Peter")) {

			return 99;

		} else {
			System.out.println("Please pass the correct Student");

			return -1;
		}
	}

	public static void main(String[] args) {

		int k = Student.getStudentMark("Eden");
		System.out.println(k);

	}

}
