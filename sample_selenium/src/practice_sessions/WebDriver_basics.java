package practice_sessions;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebDriver_basics {

	public static void main(String[] args) {
	
System.setProperty("webdriver.chrome.driver","C:\\Users\\mypc\\Documents\\Bindu\\Selenium Automation\\Selenium Drivers\\chromedriver.exe");
	WebDriver driver = new ChromeDriver();
	driver.get("https://www.amazon.com/");
		
	}

}
