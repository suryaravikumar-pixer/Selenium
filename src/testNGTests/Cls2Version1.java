package testNGTests;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Cls2Version1 {
	ChromeDriver driver;
	@BeforeTest
public void openBrowser()
{
	System.setProperty("webdriver.chrome.driver","D:\\Training3rdJan2022\\Selenium_lib\\chromedriver.exe");
	driver = new ChromeDriver();
	System.out.println("Chrome opened opened");
	driver.get("https://register.rediff.com/register/register.php");
	System.out.println("Opened Rediffmail registration page");
}

@BeforeMethod
public void refreshScreen() throws InterruptedException
{
	driver.navigate().refresh();
	Thread.sleep(2000);
}
@Test
public void registrationUser1() throws Exception
{
	WebElement FullName = driver.findElement(By.xpath("//table[@id = 'tblcrtac']/tbody/tr[3]/td[3]/input"));
	WebElement RediffEmailId = driver.findElement(By.xpath("//table[@id = 'tblcrtac']/tbody/tr[7]/td[3]/input[1]"));
	FullName.clear();
	FullName.sendKeys("user");
	RediffEmailId.clear();
	RediffEmailId.sendKeys("user1_123");
	driver.findElement(By.xpath("//table[@id = 'tblcrtac']/tbody/tr[7]/td[3]/input[2]")).click();
	driver.findElement(By.xpath("//table[@id = 'tblcrtac']/tbody/tr[20]/td/div/table/tbody/tr/td[3]/div[2]/div[2]/img")).click();
	Thread.sleep(2000);
	driver.findElement(By.xpath("//div[@id='country_id']/ul/li[10]")).click();	
}
@Test
public void registrationUser2() throws Exception
{
	WebElement FullName = driver.findElement(By.xpath("//table[@id = 'tblcrtac']/tbody/tr[3]/td[3]/input"));
	WebElement RediffEmailId = driver.findElement(By.xpath("//table[@id = 'tblcrtac']/tbody/tr[7]/td[3]/input[1]"));
	FullName.clear();
	FullName.sendKeys("user");
	RediffEmailId.clear();
	RediffEmailId.sendKeys("user2_123");
	driver.findElement(By.xpath("//table[@id = 'tblcrtac']/tbody/tr[7]/td[3]/input[2]")).click();
	driver.findElement(By.xpath("//table[@id = 'tblcrtac']/tbody/tr[20]/td/div/table/tbody/tr/td[3]/div[2]/div[2]/img")).click();
	Thread.sleep(2000);
	driver.findElement(By.xpath("//div[@id='country_id']/ul/li[15]")).click();	
}
@AfterTest
public void closeBrowser()
{
	driver.close();
	System.out.println("Close browser");
}
}
