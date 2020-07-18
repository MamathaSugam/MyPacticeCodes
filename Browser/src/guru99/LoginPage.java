package guru99;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LoginPage {

	public static void main(String[] args) {

		
		System.setProperty("webdriver.chrome.driver", "./Driver/chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		driver.get("http://www.demo.guru99.com/V4/");
		
		driver.findElement(By.name("uid")).sendKeys("mngr273132");
		driver.findElement(By.xpath("//input[@name='password']")).sendKeys("ahUpUbA");
		driver.findElement(By.xpath("//input[@name='btnLogin']")).click();
	}

}
