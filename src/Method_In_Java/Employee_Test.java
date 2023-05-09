package Method_In_Java;

public class Employee_Test {

	// First write the Acceptance Criteria
	// I want to calculate the score or marks
	// create a function : getEmployeeMarks

	public int getEmployeeMarks(String empName) {

		int marks = -1;

		if (empName.equals("Blue")) {
			marks = 99;
		} else if (empName.equals("Red")) {
			marks = 80;
		} else if (empName.equals("Green")) {
			marks = 70;
		} else if (empName.equals("Yello")) {
			marks = 50;
		} else {
			System.out.println("Emp name is found ...." + empName);
		}
		return marks;

	}

	public static void main(String[] args) {

		Employee_Test objref = new Employee_Test();

		int newVariable = objref.getEmployeeMarks("Blue");
		System.out.println(newVariable);

		if (newVariable >= 0) {
			System.out.println("Send the Mark Sheet to Student");
		}

	}

}
