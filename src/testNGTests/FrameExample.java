package testNGTests;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class FrameExample {

	public static void main(String[] args) {
		System.setProperty("webdriver.gecko.driver","D:\\Training3rdJan2022\\Selenium_lib\\geckodriver.exe" );
		 WebDriver driver = new FirefoxDriver();
		 driver.get("http://www.leafground.com/pages/frame.html");
		 driver.switchTo().frame(0);
		 driver.findElement(By.id("Click")).click();
		 driver.switchTo().defaultContent();
		 driver.switchTo().frame(1);
		 driver.switchTo().frame("frame2");
		 driver.findElement(By.id("Click1")).click();
		 driver.switchTo().defaultContent();
		 driver.switchTo().frame(2);
		 driver.switchTo().frame("frame2");
		System.out.println(driver.findElement(By.tagName("body")).getText()); 
	}

}
