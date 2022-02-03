package surya;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class AmazonCategorySearch{

	public static void main(String[] args) throws Exception {
		
		System.setProperty("webdriver.chrome.driver","C:\\Selenium_lib\\chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.amazon.in/");
		WebElement category = driver.findElement(By.id("searchDropdownBox"));
		Select s1 = new Select(category);
		s1.selectByVisibleText("Electronics");
		
		WebElement typeOfProduct = driver.findElement(By.id("twotabsearchtextbox"));
		typeOfProduct.sendKeys("laptop");
		Thread.sleep(2000);

		driver.findElement(By.id("nav-search-submit-button")).click();
		driver.findElement(By.xpath("//*[@id=\"search\"]/div[1]/div[1]/div/span[3]/div[2]/div[2]/div/span/div/div/div/div/div[2]/div[2]/div/div/div[1]/h2/a/span[1]")).click();
		
		driver.close();
	}

}


