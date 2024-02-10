package Synchronization;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ImplicitWait {

	public static void main(String[] args) {
		
		WebDriver driver=new ChromeDriver();//To Launch Chrome Browser
		driver.manage().window().maximize();//To Maximize the Browser
		
		//To apply implicit wait
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		driver.get("https://www.instagram.com/");
		driver.findElement(By.name("username")).sendKeys("Qspiders");
	}

}
