package methodsOfWebDriver;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SetSizeMethod {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver= new ChromeDriver();//To launch the browser
		Thread.sleep(1000);
		driver.manage().window().maximize();//To maximize the browser window
		Thread.sleep(1000);
		
		Dimension targetSize = new Dimension(500, 400);//To  pass width and height to Dimention class.
		
		driver.manage().window().setSize(targetSize);//To pass the dimension to setSize Method.
		

	}

}
