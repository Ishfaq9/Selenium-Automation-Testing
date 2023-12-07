package SeleniumTesting;



import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.Assert;


public class CheckUrl_SauceDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		////Initialization
		WebDriverManager.chromedriver().setup();
		WebDriver driver =new ChromeDriver();
		
		// Assignment-1
		
		driver.get("https://www.saucedemo.com/");
		driver.manage().window().maximize();
		
		String expected = "https://www.saucedemo.com/";
		
		// Type-1 if-else
		if(driver.getCurrentUrl().equals(expected))
		{
			System.out.println("Correct Url");
		}
		else 
		{
			System.out.println("Incorrect Url");
		}
		
		//type-2 Assert
		Assert.assertEquals(expected,driver.getCurrentUrl());
		

	}

}
