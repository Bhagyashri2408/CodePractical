package actionClass;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.bidi.browsingcontext.CaptureScreenshotParameters.Origin;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
public class ScrollToAmount 
{
public static void main(String[] args) throws InterruptedException 
{
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://www.globalsqa.com/");
	Thread.sleep(1000);
	
	Actions Act =new Actions(driver);
	
	//Act.scrollByAmount(0, 1000).perform();
	Thread.sleep(1000);
	driver.quit();
	
}
}
