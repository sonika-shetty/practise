package testing;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
public class formfill {
	public static void main(String[] args) {
		//step:1 declare the path
				String path="C:\\chrome testing\\chromedriver-win64\\chromedriver.exe";
				//step:2 set system property
				System.setProperty("webdriver.chrome.driver", path);
				
				//step:3 give base url
				String url="https://www.shine.com/registration/";
				
				//step:4 initiate webdriver
				WebDriver driver= new ChromeDriver();
				
				driver.get(url);
			
				//locating web elements
				WebElement name=driver.findElement(By.id("id_name"));
				name.sendKeys("ssmmss");
				WebElement email=driver.findElement(By.id("id_email"));
				email.sendKeys("ssmmss@gmail.com");
				WebElement number=driver.findElement(By.id("id_cell_phone"));
				number.sendKeys("9999999999");
				WebElement password=driver.findElement(By.id("id_password"));
				password.sendKeys("Sonika@1234");
                WebElement login=driver.findElement(By.id("registerButton"));
				login.click();
}
}
