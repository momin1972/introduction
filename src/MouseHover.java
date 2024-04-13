import java.time.Duration;


import org.openqa.selenium.WebDriver;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class MouseHover {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		//System.setProperty("webdriver.chrome.driver", "C:/Users/momin/Downloads/chromedriver_win32/chromedriver.exe");
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		//driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		Thread.sleep(4000);
		driver.get("https://google.com");
//		Thread.sleep(4000);
//		Actions action = new Actions(driver);
//		
//	WebElement mainItem2 = driver.findElement(By.xpath("//a[contains(text(),'Main Item 2')]"));
//		action.moveToElement(mainItem2).perform();
//		WebElement subSubList = driver.findElement(By.xpath("//a[contains(text(),'SUB SUB LIST ')]"));
//		action.moveToElement(subSubList).perform();
//		WebElement subSubItem1 = driver.findElement(By.xpath("//a[contains(text(),'Sub Sub Item 1')]"));
//		action.moveToElement(subSubItem1).click();
//		driver.close();
		
		
		
	}

}
