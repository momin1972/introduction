import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ebaySearch {

	WebDriver driver;
	
	public void launchbrowser() {
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https:https://www.google.com");
		
	}
	public void searchProduct() throws InterruptedException {
		Thread.sleep(3000);
		driver.findElement(By.id("APjFqb")).sendKeys("water");
	driver.findElement(By.id("btnK")).click();
//		Thread.sleep(3000);
//		driver.findElement(By.linkText(" Daily Deals")).click();
	
	}
	public static void main(String[] args) throws InterruptedException {
		ebaySearch obj = new ebaySearch();
		obj.launchbrowser();
		obj.searchProduct();
		

	}

}
