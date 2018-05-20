package MyPackage1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
public class MyClass5 {
	
	public static void main(String...args)
	{
		System.setProperty("webdriver.firefox.marionette", "C:\\SeleniumSETUP\\Driver Server\\Gecko Driver\\geckodriver.exe");
		WebDriver Driver = new FirefoxDriver();
		String base = "http://wwwfacebook.com";
		Driver.get(base);
		Driver.close();
	}
}