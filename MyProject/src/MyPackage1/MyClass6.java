package MyPackage1;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
public class MyClass6{
	public static void main(String...args)
	{
		String base = "http://www.facebook.com/"; 
		WebDriver Driver = MyDriver.getdriver("chrome");
		Driver.get(base);
		Driver.manage().window().maximize();		
		Driver.findElement(By.id("email")).sendKeys("boyspicy");
		Driver.findElement(By.id("pass")).sendKeys("shibumybro7");
		Driver.manage().timeouts().implicitlyWait(2,TimeUnit.SECONDS);
		Driver.findElement(By.id("u_0_2")).click();
		Driver.close();
	}
}