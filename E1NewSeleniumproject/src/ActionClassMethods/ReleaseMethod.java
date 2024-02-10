package ActionClassMethods;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ReleaseMethod {

	public static void main(String[] args) {
		
			WebDriver driver = new ChromeDriver();
			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
			driver.get("https://demoapps.qspiders.com/ui?scenario=1");
			
			driver.findElement(By.xpath(("//section[text()='Mouse Actions']")).
			driver.findElement(By.xpath(("//section[text()='Mouse Actions']")).
					

	}

}
