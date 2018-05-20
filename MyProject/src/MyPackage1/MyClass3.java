package MyPackage1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class MyClass3 {
	public static void main(String...args)
	{
		String base = "http://www.phptravels.net/"; 
		System.setProperty("webdriver.chrome.driver","C:\\SeleniumSETUP\\Driver Server\\Chrome Driver\\chromedriver.exe");
		WebDriver Driver = new ChromeDriver();
		Driver.get(base);
		Driver.manage().window().maximize();
		Driver.manage().window().fullscreen();
		String id;
		id=Driver.findElement(By.id("offcanvas-menu")).getTagName();
		try 
		{
			Thread.sleep(10000);
		} catch (Exception e) 
		{
			System.out.println("Error in try");
		}
		System.out.println(id);
		Driver.close();
	}
}
