package seleniumsesions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Business_Libraries {
public static WebDriver driver;
public static WebElement element;

public static void openBrowser (String browser) {
	
	System.setProperty("webdriver.chrome.driver","C:\\Users\\mypc\\Documents\\Bindu\\Selenium Automation\\Selenium Drivers\\chromedriver.exe");
	 driver = new ChromeDriver();
}
public static void navigateUrl () {
	try{
		driver.manage().window().maximize();
		driver.get("https://Amazon.com");
	}
	catch(Exception e) {
		e.printStackTrace();
	}
}
public static void enterText(String xpathvalue, String entervalue) {
	try {
		element = driver.findElement(By.xpath(xpathvalue));
		element.sendKeys(entervalue);
	}
	catch(Exception p) {
	}
	
}
public static void clickButton(String xpathvalue) {
	try {
	 element = driver.findElement(By.xpath(xpathvalue));
	 element.click();
		}catch(Exception k) {
		k.printStackTrace();	
		}
		}
public static void selectItem(String xpathvalue,String selectvalue) {
	try {
	element = driver.findElement(By.xpath(xpathvalue));
	Select select = new Select(element);
	select.selectByVisibleText(selectvalue);
	}catch(Exception a) {
	a.printStackTrace();
	
	}
	
}
public static void closeBrowser() {
	try {
		driver.close();
		driver.quit();
	}catch(Exception h) {
		h.printStackTrace();
	}
	
}
}

