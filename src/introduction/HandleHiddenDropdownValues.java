package introduction;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public final class HandleHiddenDropdownValues {

static	WebDriver driver;
	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
 driver = new ChromeDriver();
driver.get("https:www.flipkart.com/");
		driver.findElement(By.xpath("//span[@class='r85cly']")).sendKeys("macbook pro");
		
	}

}
