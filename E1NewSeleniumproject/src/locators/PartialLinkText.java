package locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class PartialLinkText {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver=new ChromeDriver();//To launch Chrome Browser
		driver.manage().window().maximize();//TO Maximize Browser
		driver.get("https://www.facebook.com/");//To Launch the web application
		Thread.sleep(2000);
		
		WebElement PartOfLink = driver.findElement(By.partialLinkText("?"));//To locate forgotten password?link
		PartOfLink.click();//To click on forgotten password?link
	}

}
