package basicautomation;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class selenium {
public static WebDriver driver;
public static WebElement element ;
public static void openBrowser(String browser) {
	try {
System.setProperty("webdriver.chrome.driver","C:\\Users\\mypc\\Documents\\Bindu\\Selenium Automation\\Selenium Drivers\\chromedriver.exe");	
	 driver = new ChromeDriver();	
	}catch(Exception h) {
	h.printStackTrace();
	}
}
public static void navigateUrl() {	
	try {
	driver.get("https://www.kohls.com/");
}catch (Exception g) {
	g.printStackTrace();
  }
}
public static void enterText(String xpathvalue,String entervalue) {
	try {
		element = driver.findElement(By.xpath(xpathvalue));
		element.sendKeys(entervalue);
	}catch(Exception e) {
	e.printStackTrace();
	}
}
public static void clickButton(String xpathvalue) {
	try { 
		element = driver.findElement(By.xpath(xpathvalue));
		element.click();
	}catch (Exception a) {
		a.printStackTrace();
	}
}	
public static void selectItem(String xpathvalue , String selectvalue) {	
	try {
		element = driver.findElement(By.xpath(xpathvalue));
		Select select = new Select(element);
		select.selectByVisibleText(selectvalue); 
	}catch(Exception s) {
	s.printStackTrace();
	}}
public static void mouseClick()	{
	
	
	
	
	
	
	
	
	
	
	
	
	
}
}