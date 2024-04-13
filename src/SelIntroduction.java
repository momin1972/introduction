import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SelIntroduction {

	public static void main(String[] args) {
	
		
		System.setProperty("webdriver.chrome.driver", "C:/Users/momin/Downloads/chromedriver_win32/chromedriver.exe");
		//WebDriverManager.chrome.driver();
		WebDriver driver = new ChromeDriver();
		driver.get("https://rahulshettyacademy.com");
	//	System.out.println(driver.getTitle());
		//System.out.println(driver.getCurrentUrl());
		//driver.close();

		
	

	}

}
