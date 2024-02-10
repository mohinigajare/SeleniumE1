package locators;

import org.openqa.selenium.By;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class cssSelectorLocator {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();//to launch chrome browser
		driver.manage().window().maximize();//to maximize the browser window
		driver.get("https://www.instagram.com/");//to launch the web application
		Thread.sleep(2000);
		
		//to find/locate username textbox and pass the inputs
		WebElement usnTB = driver.findElement(By.cssSelector("input[aria-lable='phone number, username, or email']"));
		usnTB.sendKeys("qspider");
		Thread.sleep(1000);
		
		//to find/locate password textbox and pass the input
		WebElement passTB = driver.findElement(By.cssSelector("input[type='password]"));
		passTB.sendKeys("abcd@123");
		Thread.sleep(1000);
		
		//to click on login button
		WebElement loginButton = driver.findElement(By.cssSelector("button[type='submit']"));
		loginButton.click();

	}

}
