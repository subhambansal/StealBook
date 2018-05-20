package MyPackage1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class MyClass2 {
	public static void main(String...args)
	{
		String base = "http://www.unscramble.eu/leavrn"; 
		System.setProperty("webdriver.chrome.driver","C:\\SeleniumSETUP\\Driver Server\\Chrome Driver\\chromedriver.exe");
		WebDriver Driver = new ChromeDriver();
		Driver.get(base);
		System.out.println(Driver.getPageSource());
		System.out.println(Driver.getCurrentUrl());
		System.out.println(Driver.getWindowHandle());
		System.out.println(Driver.getClass());
		System.out.println(Driver.getWindowHandles());
		Driver.close();
	}

}
