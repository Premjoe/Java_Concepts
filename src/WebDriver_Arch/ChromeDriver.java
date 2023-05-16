package WebDriver_Arch;

public class ChromeDriver implements WebDriver{
	
	ChromeDriver() {
		
		System.out.println("Launch the my ChromeDriver");
		
	}

	@Override
	public void click() {
		System.out.println("Click on the Element");
		
	}

	@Override
	public void sendKeys() {
		System.out.println("Sending value to the Element");
		
		
	}

	@Override
	public void quit() {
		
		System.out.println("Quit my Browser");
		
	}

	@Override
	public void findElement(String ele) {
		System.out.println("find Element: " + ele);
		
		
		
	}

}
