package actionClass;
import java.time.Duration;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
public class Dropdown2 
{
public static void main(String[] args) throws InterruptedException 
{
	WebDriver driver = new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://qa-practice.netlify.app/double-click");
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3));
	
	WebElement element = driver.findElement(By.cssSelector("[id^='double-click-btn']"));
	Actions A = new Actions(driver);          //css path locate by Prefix
	
	A.doubleClick(element).perform();
	Thread.sleep(1000);
	driver.quit();
}
}
