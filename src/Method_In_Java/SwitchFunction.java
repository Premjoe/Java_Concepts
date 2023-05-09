package Method_In_Java;

public class SwitchFunction {

	public boolean LaunchBrowser(String browserName) {
		System.out.println("Launching the browser " + browserName);
		boolean flag = true;
		switch (browserName.trim().toLowerCase()) {
		case "chrome":
			System.out.println("Launch chrome browser is pass");
			break;
		case "safari":

			break;
		case "firefox":

			break;
		case "opera":

			break;
		default:
			System.out.println("Error : Please pass the right browser: " + browserName);
			flag = false; // After false
			break;
		}

		return flag;
	}

	// Second Function with if else :

	public String testBrowser(String passBrowser) {

		System.out.println("Passing the correct browser");
		System.out.println("--------");

		String browserVersion = "chrome 100";

		if (passBrowser.equals("chrome")) {

			browserVersion = "chrome 111";

		} else if (passBrowser.equals("chrome")) {
			browserVersion = "chrome 112";

		} else if (passBrowser.equals("chrome")) {
			browserVersion = "chrome 115";

		} else {
			System.out.println("Browser version is not compact " + passBrowser);

		}

		return browserVersion;

	}

	public static void main(String[] args) {

		SwitchFunction objref = new SwitchFunction();
		if (objref.LaunchBrowser("Test ")) {

			System.out.println("Please enter the URl");

		}
		;
		System.out.println("--------");
		String browserversionin = objref.testBrowser("chrome 110");
		System.out.println(browserversionin);
	}

}
