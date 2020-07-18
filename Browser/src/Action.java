import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Action {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "./Driver/chromedriver.exe");
		WebDriver driver=new ChromeDriver();// create object for browser
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);

		driver.get("https://www.amazon.com/");
		
		Actions a= new Actions(driver);
		//moves to specific element
		//a.moveToElement(driver.findElement(By.cssSelector("a[id='nav-link-accountList']"))).build().perform();
		

		/*WebElement move1 = driver.findElement(By.id("id=\'twotabsearchtextbox\'"));
		a.moveToElement(move1).click().keyDown(Keys.SHIFT).sendKeys("hello").doubleClick().build().perform();	*/
	
		WebElement move= driver.findElement(By.cssSelector("a[id='nav-link-accountList']"));

		a.moveToElement(driver.findElement(By.xpath("//*[@id=\'twotabsearchtextbox\']"))).click().keyDown(Keys.SHIFT).sendKeys("hello").doubleClick().build().perform();	
	
		a.moveToElement(move).contextClick().build().perform(); 
	}

}
