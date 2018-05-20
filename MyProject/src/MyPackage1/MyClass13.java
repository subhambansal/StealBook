package MyPackage1;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class MyClass13 {
	public static void main(String... args) throws Exception
	{

	String base = "https://www.google.com/";
	WebDriver Driver = MyDriver.getdriver("chrome");
	Driver.get(base);	
	WebElement inputhere = Driver.findElement(By.className("gsfi"));
	inputhere.sendKeys("kuch bhi");
	Thread.sleep(2000);
	inputhere.sendKeys(Keys.ARROW_LEFT);
	Thread.sleep(2000);
	inputhere.sendKeys(Keys.ARROW_RIGHT);
}
}