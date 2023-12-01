package testing;
import java.io.File;
import java.io.IOException;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import com.google.common.io.Files;
import com.sun.jna.platform.FileUtils;


public class screenshot {
public static void main(String[] args) throws IOException {
		
        System.setProperty("webdriver.chrome.driver", "C:\\chrome testing\\chromedriver-win64\\chromedriver.exe");
		
		WebDriver driver= new ChromeDriver();
		driver.get("https://amazon.in");
		driver.manage().window().maximize();
		File f = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		Files.copy(f, new File("C:\\Users\\VARSHINI V R\\Downloads\\selenium screenshot\\amaz.png"));
}
}
