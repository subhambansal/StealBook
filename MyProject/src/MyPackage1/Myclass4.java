package MyPackage1;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Myclass4{
	public static void main(String...args)
	{
		String base = "http://www.facebook.com/"; 
		System.setProperty("webdriver.chrome.driver","C:\\SeleniumSETUP\\Driver Server\\Chrome Driver\\chromedriver.exe");
		WebDriver Driver = new ChromeDriver();
		Driver.get(base);
		Driver.manage().window().maximize();
		Driver.manage().window().fullscreen();
		WebElement email,pass,log;
		email=Driver.findElement(By.id("email"));
		email.sendKeys("boyspicy");
		pass=Driver.findElement(By.id("pass"));
		pass.sendKeys("shibumybro7");
		Driver.manage().timeouts().implicitlyWait(2,TimeUnit.SECONDS);
		log=Driver.findElement(By.id("u_0_2"));
		log.click();
		Driver.close();
	}
}
