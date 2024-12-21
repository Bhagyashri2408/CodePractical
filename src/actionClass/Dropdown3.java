package actionClass;
import java.time.Duration;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
public class Dropdown3 
{
	public static void main(String[] args) throws InterruptedException
	{
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.globalsqa.com/demo-site/draganddrop/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3));
		                                                        // css parent to child css>css
		WebElement source = driver.findElement(By.cssSelector("[class$='-draggable-handle']>[src$='_tatras_min.jpg']"));
		WebElement Dest = driver.findElement(By.cssSelector("[class$='default ui-droppable']"));
		                                                      //css path locater suffix $
		Actions Act = new Actions(driver);
		
		//Act.dragAndDrop(source, Dest).perform();
		Act.moveToElement(source).clickAndHold().moveToElement(Dest).release().build().perform();
		Thread.sleep(1000);
		driver.quit();
	}

}
