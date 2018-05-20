package MyPackage1;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
public class MyDriver {
	public static WebDriver getdriver(String s)
	{
		if(s.equalsIgnoreCase("chrome"))
		{
		String driverPath = "C:\\SeleniumSETUP\\Driver Server\\Chrome Driver\\chromedriver.exe";
		System.setProperty("webdriver.chrome.driver",driverPath); 
	    WebDriver driver = new ChromeDriver();
		return driver;
		}
		else
		{
		System.setProperty("webdriver.firefox.marionette", "C:\\SeleniumSETUP\\Driver Server\\Gecko Driver\\geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		return driver;	
		}
}
}
