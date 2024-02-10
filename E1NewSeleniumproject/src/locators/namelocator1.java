       package locators;

		import org.openqa.selenium.By;
		import org.openqa.selenium.WebDriver;
		import org.openqa.selenium.WebElement;
		import org.openqa.selenium.chrome.ChromeDriver;

		public class namelocator1 {

			public static void main(String[] args) throws InterruptedException {
				
				WebDriver driver = new ChromeDriver();
				driver.manage().window().maximize();
				driver.get("https://www.netflix.com/in/");
				Thread.sleep(2000);
				
				WebElement usnTB = driver.findElement(By.name("email"));
				usnTB.sendKeys("mohinigajare1995@gmail.com");
				Thread.sleep(1000);
				
	}

}
