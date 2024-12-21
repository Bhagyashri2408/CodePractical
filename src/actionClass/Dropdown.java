package actionClass;
import java.time.Duration;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
public class Dropdown 
{
public static void main(String[] args) throws InterruptedException 
{
	WebDriver driver = new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://www.flipkart.com/");
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3));
	
	WebElement Dropdown = driver.findElement(By.cssSelector("div[class='H6-NpN _3N4_BX']"));
	Actions A = new Actions(driver);                //css path locate using attribute value

//	A.moveToElement(Dropdown).perform();
//	A.contextClick(Dropdown).perform();
	
	A.contextClick(Dropdown).perform();
	Thread.sleep(2000);
	driver.quit();
}
}
