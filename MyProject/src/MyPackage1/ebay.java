package MyPackage1;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
public class ebay {
	public static void main(String... args) {
		String base = "http://wwww.ebay.com";
		WebDriver Driver = MyDriver.getdriver("chrome");
		Driver.get(base);
		//System.out.println(Driver.findElements(By.tagName("a")).size()); 
		System.out.println(Driver.findElements(By.tagName("a")));
	}
}
