package assignment;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class FlipkartAssignment2 {

	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
	    driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	   WebDriverWait wait= new WebDriverWait(driver,Duration.ofSeconds(15));
		driver.get("https://www.flipkart.com/");
		
		driver.findElement(By.name("q")).sendKeys("Hp Laptop");
		driver.findElement(By.xpath("//button[@type='submit']")).click();
		
		driver.findElement(By.xpath("//div[text()='Brand']")).click();
		driver.findElement(By.xpath("div[text()='Hp']/ precending-sibling :: div[@class='_24_Dny']")).click();
		
		wait.until(ExpectedConditions.visibilityOf(driver.findElement(By.xpath("div[text()='Core i5']/ precending-sibling :: div[@class='_24_Dny']"))));
        driver.findElement(By.xpath("div[text()='Core i5']/ precending-sibling :: div[@class='_24_Dny']")).click();
		
		
		driver.findElement(By.xpath("//div[text()='RAM Capacity'])[1]")).click();
		driver.findElement(By.xpath("div[text()='8 GB']/ precending-sibling :: div[@class='_24_Dny']")).click();
		
		
		driver.findElement(By.xpath("//div[text()='Operating System']")).click();
		driver.findElement(By.xpath("div[text()='Window 11']/ precending-sibling :: div[@class='_24_Dny']")).click();
		
		List<WebElement> laptops = driver.findElements(By.xpath("//div[@class='_4rR01T']"));
		
		List<WebElement> laptopPrices = driver.findElements(By.xpath("//div[@class='_4rR01t']/ ancestor :: div[@class='_3ply-c row']/ descendant :: div[@class='_30jeq3 _1_WHN1']"));
		
		for(int i=0; i < laptops.size(); i++)
		{
			String op = laptops.get(i).getText();
			
			for(int j=i; j<=i; j++)
{
				String price = laptopPrices.get(j).getText();
	 System.out.println(op+":"+price);
	
	
}
     System.out.println();
		}
		

	}

}
