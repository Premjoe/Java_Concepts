package WebDriver_Arch;

public class RunnerTest {

	public static void main(String[] args) {

		//ChromeDriver driver = new ChromeDriver();
		// FirefoxDriver driver = new FirefoxDriver();
		// ChromeDriver driver = new ChromeDriver();

		String browserName = "Firefox";
		WebDriver driver = null;
		switch (browserName.toLowerCase()) {
		case "chrome":
			driver = new ChromeDriver();
			break;

		case "firefox":
			driver = new FirefoxDriver();
			break;
		case "safari":
			driver = new SafariDriver();
			break;
		default:
			System.out.println("Hello, Please Pass the correct Browser");
			break;
		}
		
		driver.findElement("emailID");
		driver.sendKeys();
		driver.click();
		driver.quit();

	}

}
