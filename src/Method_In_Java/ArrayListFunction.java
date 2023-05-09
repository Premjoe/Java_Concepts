package Method_In_Java;

import java.util.ArrayList;

public class ArrayListFunction {

	public ArrayList<String> getEmployeeDevices(String empName) {
		System.out.println("Get the List of devices from: " + empName);

		empName = empName.trim().toLowerCase();
		ArrayList<String> devicesList = new ArrayList<String>();

		if (empName.equals("red")) {
			devicesList.add("iphone 14");
			devicesList.add("Head Phone");
			devicesList.add("Mack book");
			devicesList.add("Airtell Sim card");
		}

		else if (empName.equals("blue")) {
			devicesList.add("Sam sun s4");
			devicesList.add("Mouse pad");
			devicesList.add("Think Pad");

		}

		else if (empName.equals("white")) {

			devicesList.add("Land Line");
			devicesList.add("Tab");
			devicesList.add("Lenevo");
			devicesList.add("Jio Sim card");
		} else {
			System.out.println("Employee name is not found: " + empName);
		}
		return devicesList;
	}

	public static void main(String[] args) {

		ArrayListFunction obj = new ArrayListFunction();
		ArrayList<String> deviceList = obj.getEmployeeDevices("blue");

		System.out.println("Total no devices :" + "" + deviceList + " :" + deviceList.size());

	}

}
