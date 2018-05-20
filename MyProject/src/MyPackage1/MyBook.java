package MyPackage1;
import java.io.File;
import java.io.FileInputStream;
import java.io.InputStream;
import java.util.Properties;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.Keys;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;

public class MyBook 
{
	public static void take(WebDriver Driver, String fileWithPath)throws Exception
	{
		TakesScreenshot scrShot =((TakesScreenshot)Driver);
        File SrcFile=scrShot.getScreenshotAs(OutputType.FILE);
        File DestFile=new File(fileWithPath);
        FileUtils.copyFile(SrcFile, DestFile);
	}
	public static void main(String... args)throws Exception
	{
		InputStream input = new FileInputStream("C:\\Myscreenshot\\config.properties");
		Properties prop = new Properties();
		prop.load(input);
		String ChromeLink=prop.getProperty("ChromeLink");
		String driverPath=prop.getProperty("driverPath");
		String nuberofpage = prop.getProperty("nuberofpage");
		int size=Integer.parseInt(nuberofpage);
		String base=prop.getProperty("base");
		System.setProperty("webdriver.chrome.driver",driverPath);
		ChromeOptions options = new ChromeOptions();
		String Value =  "user-data-dir="+ChromeLink;
		options.addArguments(Value);
		options.addArguments("--start-maximized");
	    WebDriver Driver = new ChromeDriver(options);
		Driver.manage().window().fullscreen();
		Driver.get(base);
		Thread.sleep(5000);
		for(int i=0; i<=size;i++)
		{
		String Path= "C:\\Myscreenshot\\"+i+".png";
		take(Driver,Path);
		Thread.sleep(1000);
		Actions action = new Actions(Driver);
		action.sendKeys(Keys.ARROW_RIGHT).build().perform();
		}
	}
}
