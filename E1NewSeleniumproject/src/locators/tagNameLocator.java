package locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class tagNameLocator {

	public static void main(String[] args) throws InterruptedException {
	
		WebDriver driver=new ChromeDriver();//Launch the browser
		driver.manage().window().maximize();//To maximize the browser window
		driver.get("file:///C:/Users/Dell/Desktop/web%20element/textbox.html");//To launch web application
		Thread.sleep(2000);
		
		WebElement textBox = driver.findElement(By.tagName("input"));//Find password TextField on the webpage
		
		textBox.sendKeys("manager");//To pass the inputs to password TextField
		
		//Note:-Inputs are passed to UserName TextField because it is the 1st element designed with input tag
		

	}

}
