package testing;

import java.io.IOException;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;


public class handling_file_cloud {

	private static WebDriver driver = null;
	 
	 public static void main(String[] args) throws IOException, InterruptedException {
	 
	     driver = new FirefoxDriver();
	     driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	     driver.get("http://toolsqa.com/automation-practice-form");
	     driver.findElement(By.id("photo")).click();
	     Runtime.getRuntime().exec("D:\\AutoIt\\AutoItTest.exe");
	     Thread.sleep(5000);
	     driver.close();

	 }
}
