package actionClass;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
public class ScrollToElement 
{
public static void main(String[] args) throws InterruptedException 
{
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://www.globalsqa.com/");
	Thread.sleep(1000);
	
	WebElement element = driver.findElement(By.xpath("//h3[text()='Contact Info']"));
	Actions Act =new Actions(driver);
	 
	Act.scrollToElement(element).perform();
	Thread.sleep(1000);
	driver.quit();
}
}
