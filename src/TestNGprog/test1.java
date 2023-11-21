package TestNGprog;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class test1 {

	@Test
	public static void test1() throws InterruptedException {
		System.setProperty("WebDriver chrome driver", "C:\\Users\\lru3825\\Downloads\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.get("https://www.google.com/");
		Thread.sleep(3000);
		driver.quit();
	}
	
	@Test
	public static void test2() throws InterruptedException
	{
		System.setProperty("WebDriver chrome driver", "C:\\Users\\lru3825\\Downloads\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.get("https://www.facebook.com/");
		Thread.sleep(3000);
		driver.quit();
		
	}

}
