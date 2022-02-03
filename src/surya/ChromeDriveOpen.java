package surya;

import org.openqa.selenium.chrome.ChromeDriver;

public class ChromeDriveOpen {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver","C:\\Selenium_lib\\chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://google.com");
		System.out.println("chrome is opened");		
		driver.close();
		System.out.println("chrome is closed");	
		}

}
