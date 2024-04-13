package introduction;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class UpdateDropDown {

	public static void main(String[] args) throws InterruptedException {

	//	System.setProperty("webdriver.chrome.driver","C://Users//momin//Downloads//chromedriver_win32//chromedriver.exe");
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/dropdownsPractise/");
		driver.findElement(By.id("divpaxinfo")).click();
		Thread.sleep(2000L);
		//int i = 1;
		//while(i<5) {
			
		//	driver.findElement(By.id("hrefIncAdt")).click();
//		i++;
	//	}
		for(int i=1; i<5; i++) {
			driver.findElement(By.id("hrefIncAdt")).click();
			
		}
		driver.findElement(By.id("btnclosepaxoption")).click();
	System.out.println(driver.findElement(By.id("divpaxinfo")).getText());

	}

}
