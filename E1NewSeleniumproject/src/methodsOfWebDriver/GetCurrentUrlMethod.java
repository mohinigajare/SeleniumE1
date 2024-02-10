package methodsOfWebDriver;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetCurrentUrlMethod {

	public static void main(String[] args) throws InterruptedException {
		
    WebDriver driver=new ChromeDriver();
	Thread.sleep(1000);
	driver.manage().window().maximize();
	Thread.sleep(1000);
	driver.get("http://www.flipkart.com/");
	Thread.sleep(1000);
	
	String currentUrl = driver.getCurrentUrl();
	
	System.out.println(currentUrl);	

	}

}
