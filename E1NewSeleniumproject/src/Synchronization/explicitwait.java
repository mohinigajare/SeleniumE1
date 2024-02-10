package Synchronization;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class explicitwait {

	public static void main(String[] args) {
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(60));//to declare implicit wait
		
		WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(10));//To declare explicit wait
		
		driver.get("https://www.shoppersstack.com/");// to launch the web application
		
		driver.findElement(By.xpath("//span[text()='APPLE iphone 14 pro']")).click();
		
		driver.findElement(By.id("Check Delivery")).sendKeys("411033");
		//1st way to use explicit wait or provide waiting condition
		//wait.until(ExpectedCondition.elementToBeClickable(driver.findElement(By.xpath("//button[@id='Check']"))));
		//driver.findElement(By.xpath("//button[@id='Check']")).click();
		
		
		
		//2nd way to use Explicit wait or provide waiting condition
		WebElement checkButton = driver.findElement(By.xpath("//button[@id='Check']"));
		wait.until(ExpectedConditions.elementToBeClickable(checkButton));
		checkButton.click();
		
	}

}
