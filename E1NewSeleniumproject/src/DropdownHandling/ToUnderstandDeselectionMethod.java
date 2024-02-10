package DropdownHandling;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class ToUnderstandDeselectionMethod {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("file:///C:/Users/Dell/Desktop/web%20element/multiselectDD.html");
		
		WebElement multiSelectDD = driver.findElement(By.id("menu"));
		
		Select sel = new Select( multiSelectDD);
		
		sel.selectByIndex(3);
		Thread.sleep(3000);
		sel.deselectByIndex(3);
		
		sel.selectByValue("v2");
		Thread.sleep(2000);
		sel.deselectByValue("v2");
		
		sel.selectByVisibleText("chai");
		Thread.sleep(2000);
		sel.deselectByVisibleText("chai");
		
		
	}

}
