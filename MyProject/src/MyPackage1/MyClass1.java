package MyPackage1;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
public class MyClass1 {
	public static void main(String... args) {
		String base = "http://output.jsbin.com/usidix/1";
		WebDriver Driver = MyDriver.getdriver("chrome");
		Driver.get(base);
		Driver.findElement(By.cssSelector("input[value=\"Go!\"]")).click();
		System.out.println(Driver.switchTo().alert().getText());
		Driver.quit();
	}
}
