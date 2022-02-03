package surya;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;





public class GlobalSqa {

	public static void main(String[] args){
		System.setProperty("webdriver.chrome.driver","C:\\Selenium_lib\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.globalsqa.com/demo-site/frames-and-windows/#iFrame");
		
		
		driver.switchTo().frame("globalSqa"); 
		
		String msg =driver.findElement(By.xpath("//div[@id='portfolio_items']/div[2]/a/div/div/div[1]/img")).getText();
		System.out.println(msg);
		driver.close();
		System.out.println("browser closed");
//		String bse = driver.findElement(By.id("bseindex")).getText();
//		System.out.println(bse);
//		
	

		
		
	}

}


//div[@id="portfolio_items"]/div[1]/a/div/div/div[1]/img