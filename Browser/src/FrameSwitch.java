import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class FrameSwitch {

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver", "./Driver/chromedriver.exe");
		WebDriver driver=new ChromeDriver();// create object for browser
		
		driver.get("https://jqueryui.com/droppable/");
		
		//Get number of frames
		//System.out.println(driver.findElement(By.tagName('iFrames')).getSize());
		
		driver.switchTo().frame(driver.findElement(By.cssSelector("iframe[class='demo-frame']")));
		//driver.findElement(By.id("draggable")).click();
		
		Actions a = new Actions(driver);
		WebElement Source= driver.findElement(By.id("draggable"));
		WebElement Target= driver.findElement(By.id("droppable"));
		
		a.dragAndDrop(Source, Target).build().perform();
		driver.switchTo().defaultContent(); // must come back the previous window
		
		
		/*driver.get("http://the-internet.herokuapp.com/");
		driver.get("http://the-internet.herokuapp.com/");
		driver.findElement(By.linkText("Nested Frames")).click();
		driver.switchTo().frame("frame-top");
		driver.switchTo().frame("frame-middle");
		System.out.println(driver.findElement(By.id("content")).getText());
		
		
		driver.manage().timeouts().implicitlyWait(1, TimeUnit.MINUTES);
		driver.get("https://the-internet.herokuapp.com/");
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//*[text()='Nested Frames']")).click();
		var a=driver.switchTo().frame(driver.findElement(By.name("frame-top")));
		a.switchTo().frame(driver.findElement(By.name("frame-middle")));
		System.out.println(a.findElement(By.id("content")).getText());
		driver.switchTo().defaultContent();
		driver.quit();
		*/

	}

}
