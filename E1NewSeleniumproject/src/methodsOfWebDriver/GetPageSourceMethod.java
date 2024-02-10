package methodsOfWebDriver;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetPageSourceMethod {
	
	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver=new ChromeDriver();
		Thread.sleep(2000);
		driver.get("http://www.facebook.com/");
		Thread.sleep(2000);
		
		String pageSource = driver.getPageSource();
		
		System.out.println(pageSource);	
		
	}
		

}
