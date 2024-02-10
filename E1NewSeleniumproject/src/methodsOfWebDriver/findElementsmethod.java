package methodsOfWebDriver;

import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class findElementsmethod {   

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("htttps://www.google.co.in/");
		Thread.sleep(2000);
		
		WebElement activeEle = driver.switchTo().activeElement();
			activeEle.sendKeys("bikes");
		Thread.sleep(1000);
		
		List<WebElement> bikesOptions = driver.findElements(By.linkText("//div[@class='wM6W7d']"));
		
		for(int i=0; i<bikesOptions.size(); i++)
		{
			String ops=bikesOptions.get(i).getText();
			System.out.println(ops);
			Thread.sleep(1000);
		}
		for (WebElement we:bikesOptions)
		{
			String ops=we.getText();
			System.out.println(ops);
			Thread.sleep(1000);
		}
	}
}