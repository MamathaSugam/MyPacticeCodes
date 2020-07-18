import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandelChildWindow {

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver", "./Driver/chromedriver.exe");
		WebDriver driver=new ChromeDriver();// create object for browser
		
		driver.get("https://www.google.com/intl/en-GB/gmail/about/");
		driver.findElement(By.xpath("/html/body/div[2]/div[1]/div[4]/ul[1]/li[3]/a")).click();
		System.out.println("Before switching the window");
		System.out.println(driver.getTitle());
		
		Set<String> Ids = driver.getWindowHandles();
		 Iterator<String> it = Ids.iterator();
		 String parentId = it.next();
		 String childId = it.next();
		 driver.switchTo().window(childId);
		 
		System.out.println("After switching the window");
		System.out.println(driver.getTitle());


	}

}
