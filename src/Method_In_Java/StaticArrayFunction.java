package Method_In_Java;

import java.util.Arrays;

public class StaticArrayFunction {

	public String[] getStaticDevices(String empName) {

		System.out.println("Getting the emp devices details :" + empName);

		String devicesList[] = new String[4];

		if (empName.equals("tom")) {
			devicesList[0] = "Apple Tab";
			devicesList[1] = "Apple Mouse";
			devicesList[2] = "Apple MacBokk";
			devicesList[3] = "Apple phone";

		}

		else if (empName.equals("sam")) {
			devicesList[0] = "Apple Tab";
			devicesList[1] = "Apple Mouse";

		} else if (empName.equals("joseph")) {
			devicesList[0] = "Apple Tab";
			devicesList[1] = "Apple Mouse";
			devicesList[2] = "Apple MacBokk";
			devicesList[3] = "Apple Test";

		} else {
			System.out.println("Empoloyee is not Found: " + empName);
		}

		return devicesList;

	}

	public static void main(String[] args) {

		StaticArrayFunction obj = new StaticArrayFunction();
		String[] finalList = obj.getStaticDevices("sam");
		System.out.println(Arrays.toString(finalList) + " " + finalList.length);

//		for (String e : finalList) {
//			System.out.println(e);
//			if (finalList.equals(null)) {
//				System.out.println("Found 20 and exit");
//			}
//		}

		if (finalList.equals(null)) {
			System.out.println("Test");
		}

	}

}
