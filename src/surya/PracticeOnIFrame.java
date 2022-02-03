package surya;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class PracticeOnIFrame {

	public static void main(String[] args){
		System.setProperty("webdriver.chrome.driver","C:\\Selenium_lib\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.rediff.com/");
		System.out.println("Browser opened");
		driver.manage().window().maximize() ; // maximize the browser window
//		driver.switchTo().frame("moneyiframe"); // give value of id or name  
		driver.switchTo().frame(0);  // this is a first iframe so, we can use index value as 0
		String msg =driver.findElement(By.tagName("b")).getText();
		System.out.println(msg);
		String bse = driver.findElement(By.id("bseindex")).getText();
		System.out.println(bse);
		
		// focusing in an link
		driver.switchTo().defaultContent();
		driver.findElement(By.linkText("NEWS")).click();
		driver.findElement(By.linkText("SPORTS")).click();
		driver.close();
		System.out.println("Close browser");
		

		
		
	}

}




//*[@id="portfolio_items"]/div[1]/a/div/div/div[1]/img