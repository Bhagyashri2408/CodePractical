package autosuggestion;
import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class India
{
public static void main(String[] args) throws InterruptedException 
{
WebDriver driver = new ChromeDriver();
driver.manage().window().maximize();
driver.get("http://www.google.com");
driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3));

driver.findElement(By.xpath("//div[@jscontroller='vZr2rb']/textarea")).sendKeys("Ind");
//driver.findElement(By.xpath("(//div[@class='pcTkSc']/div/div/span[text()='ind'])[5]")).click();

List<WebElement> Suggetions = driver.findElements(By.xpath("//ul[@jsname='bw4e9b']//div[@class='pcTkSc']"));
System.out.println("Total of options= "+Suggetions.size());

String ExtOption = "IndiGo";
for(WebElement Opt:Suggetions)
{
	System.out.println(Opt.getText());
	String ActOption =Opt.getText();
	
	if(ActOption.equals(ExtOption))
	{Opt.click();break;}
}
Thread.sleep(1000);
driver.quit();
}
}
