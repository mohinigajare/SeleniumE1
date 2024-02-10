package DropdownHandling;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class isMultipleMethod {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		driver.get("\"file:///C:/Users/Dell/Desktop/web%20element/multiselectDD.html\"");
        
		WebElement singleselectDD = driver.findElement(By.xpath("//select[@class='select']"));
		Select sel = new Select (singleselectDD);
		boolean result = sel.isMultiple();
		System.out.println(result);

	}

}