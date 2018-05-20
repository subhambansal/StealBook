package MyPackage1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Ajax {
	public static void main(String... args) {
		String URL = "http://demo.guru99.com/test/ajax.html";
		WebDriverWait wait;
		WebDriver driver = MyDriver.getdriver("chrome");
		driver.manage().window().maximize();
		driver.navigate().to(URL);
		By container = By.cssSelector(".container");
		wait = new WebDriverWait(driver, 5);
		wait.until(ExpectedConditions.presenceOfElementLocated(container));
		WebElement noTextElement = driver.findElement(By.className("radiobutton"));
		String textBefore = noTextElement.getText().trim();
		driver.findElement(By.id("yes")).click();
		driver.findElement(By.id("buttoncheck")).click();
		WebElement TextElement = driver.findElement(By.className("radiobutton"));
		wait.until(ExpectedConditions.visibilityOf(TextElement));
		String textAfter = TextElement.getText().trim();
		if (textBefore == textAfter)
		System.out.println("Ajax Call Performed");
		// Assert.assertNotEquals(textBefore, textAfter);
		//String expectedText = "Radio button is checked and it's value is Yes";
		//Assert.assertEquals(textAfter, expectedText);
		driver.close();
	}
}