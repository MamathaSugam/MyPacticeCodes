import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LaunchBrowsers {

	public static void main(String[] args) {
		 
		//System.setProperty("webdriver.chrome.driver","E:\\SeleniumProjects\\Selenium2020-Workspace\\Browser\\Driver\\chromedriver.exe");
		System.setProperty("webdriver.chrome.driver","./Driver/chromedriver.exe"); // Another way to give driver path

		WebDriver driver=new ChromeDriver(); //Create objective for browsers
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		driver.get("https://www.google.com/");
		System.out.println(driver.getCurrentUrl());
		System.out.println(driver.getTitle());
		//System.out.println(driver.getPageSource());
		driver.get("https://www.facebook.com/");
		System.out.println(driver.getCurrentUrl());
		System.out.println(driver.getTitle());
		driver.get("https://www.gmail.com/");
		System.out.println(driver.getCurrentUrl());
		System.out.println("Title is= "+ driver.getTitle());
		driver.close();
		//driver.quit(); 
	
			
	}

}
