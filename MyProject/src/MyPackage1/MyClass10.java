// need to set up wget to downaload the file 


package MyPackage1;
//import java.io.IOException;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
public class MyClass10 {
    public static void main(String[] args) 
    {
    	System.setProperty("webdriver.chrome.driver","C:\\SeleniumSETUP\\Driver Server\\Chrome Driver\\chromedriver.exe");
    	String baseUrl = "http://demo.guru99.com/test/yahoo.html";
        WebDriver driver = new ChromeDriver();
        driver.get(baseUrl);
        WebElement downloadButton = driver.findElement(By.id("messenger-download"));
        String sourceLocation = downloadButton.getAttribute("href");
        System.out.print(sourceLocation);
        // desi juggad for download with direct link 
        driver.get(sourceLocation);
        try {
			Thread.sleep(10000);
		} catch (Exception e) 
        {
			System.out.print("error in try ");
		}
        
//        String wget_command = "cmd /c C:\\Wget\\wget.exe -P D: --no-check-certificate " + sourceLocation;
//        try 
//        {
//        Process exec = Runtime.getRuntime().exec(wget_command);
//        int exitVal = exec.waitFor();
//        System.out.println("Exit value: " + exitVal);
//        } catch (InterruptedException | IOException ex) {
//        System.out.println(ex.toString());
//        }
        driver.close();
        }
        
}