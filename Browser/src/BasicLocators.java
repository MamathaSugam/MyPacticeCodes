import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BasicLocators {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver", "./Driver/chromedriver.exe");
		WebDriver driver=new ChromeDriver(); // create object for browser
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		
		driver.get("https://login.salesforce.com/");
		driver.findElement(By.id("username")).sendKeys("my account");
		driver.findElement(By.name("pw")).sendKeys("12345");
		driver.findElement(By.cssSelector("#rememberUn")).click();
		driver.findElement(By.xpath("//*[@id=\"Login\"]")).click();
		System.out.println(driver.findElement(By.xpath("//*[@id=\"error\"]")).getText());
		//System.out.println(driver.findElement(By.cssSelector("div#error.loginError")).getText());

		//driver.close();

	}

}
