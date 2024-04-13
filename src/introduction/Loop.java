package introduction;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Loop {

	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://spicejet.com");
		Thread.sleep(2000);
		//driver.findElement(By.xpath("//div[text='Passengers']")).click();
		 driver.findElement(By.xpath("//div[normalize-space()='Passengers']")).click();
	}

}
