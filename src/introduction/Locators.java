package introduction;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Locators {

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver","C:/Users/momin/Downloads/chromedriver_win32/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://contact@rahulshettyacademy.com");
		System.out.println(driver.getTitle());  //to get title
		System.out.println(driver.getCurrentUrl()); //to see current URL or landed the correct URL
		driver.findElement(By.className("btn")).click();
		driver.findElement(By.name("name")).sendKeys("Mominl Islma");
		driver.findElement(By.id("user_email")).sendKeys("mominit91@gmail.com");
		driver.findElement(By.name("password")).sendKeys("islam1972");
		driver.findElement(By.className("m-l-0-xs")).click();
		//driver.findElement(By.name("commit")).click();
		driver.findElement(By.tagName("a")).click();
		//driver.close();
		
	}

}
