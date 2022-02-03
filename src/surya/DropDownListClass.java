package surya;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;


public class DropDownListClass {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","C:\\Selenium_lib\\chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://login.yahoo.com/account/create");
		WebElement FirstName = driver.findElement(By.id("usernamereg-firstName"));
		FirstName.sendKeys("surya");
		
		WebElement surName = driver.findElement(By.id("usernamereg-lastName"));
		surName.sendKeys("ravikumar");
		
//		WebElement emailAddress = driver.findElement(By.id("usernamereg-yid"));
//		emailAddress.sendKeys("suryaravikumar5");
		
		WebElement password = driver.findElement(By.id("usernamereg-password"));
		password.sendKeys("Yahoo1234@$%");
		
		WebElement mobileNumber = driver.findElement(By.name("phone"));
		mobileNumber.sendKeys("9877654310");
//		driver.close();
		
		
		
	
	}

}
