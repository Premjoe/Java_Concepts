package WebDriver_Arch;

public class SafariDriver implements WebDriver {
	
SafariDriver() {
		
		System.out.println("Launch the my SafariDriver");
		
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
