package testNGTests;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Cls3 {
	ChromeDriver driver;
	WebElement category;
	Select s1;
	@BeforeTest
	public void openChrome()
	{
	System.setProperty("webdriver.chrome.driver","C:\\Selenium_lib\\chromedriver.exe");
	driver = new ChromeDriver();
	driver.get("https://www.amazon.in/");
	category = driver.findElement(By.id("searchDropdownBox"));
	s1 = new Select(category);
	}
	
	@Test
	public void selectCategory1()
	{
	s1.selectByVisibleText("Amazon Fresh");
	//driver.navigate().refresh();
}
	@Test
	public void selectCategory2()
	{
	s1.selectByVisibleText("Electronics");
	//driver.navigate().refresh();
}
	@AfterTest
	public void closeChrome()
	{
		driver.close();
	}
}
