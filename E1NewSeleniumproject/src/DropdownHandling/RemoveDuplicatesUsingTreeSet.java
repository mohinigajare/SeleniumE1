package DropdownHandling;

import java.time.Duration;
import java.util.List;
import java.util.TreeSet;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class RemoveDuplicatesUsingTreeSet {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		driver.get("file:///C:/Users/Dell/Desktop/web%20element/multiselectDD.html");
         
		WebElement multiSelectDD = driver.findElement(By.id("menu"));
		
		Select sel = new Select(multiSelectDD); // to create the object of select
		
		//to remove the Duplicates
		TreeSet<String> ts = new TreeSet <String>();// to create the object of Treeset
		
		List<WebElement> options = sel.getOptions(); // to get the list of all the options
		for(WebElement we: options)
		{
			String textToInsert = we.getText();
			
			ts.add(textToInsert);
		}
		for(String text : ts)
		{
			System.out.println(text);
		}
	}

}
