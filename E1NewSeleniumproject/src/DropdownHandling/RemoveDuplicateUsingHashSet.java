package DropdownHandling;

import java.time.Duration;
import java.util.HashSet;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class RemoveDuplicateUsingHashSet {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		driver.get("file:///C:/Users/Dell/Desktop/web%20element/multiselectDD.html");
         
		WebElement multiSelectDD = driver.findElement(By.id("menu"));
		
		Select sel = new Select(multiSelectDD); // to create the object of select
		
	Hashset <String> hs = new Hashset() <String>;
	
	List<WebElement> options = sel.getOptions();
	
	for(int i=0; i <options.size(); i++)
	{
		String textToInsert = options.get(i).getAccessibleName()
	}
		
		

	}

}
