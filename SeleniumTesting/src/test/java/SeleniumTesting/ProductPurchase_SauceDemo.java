package SeleniumTesting;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;
public class ProductPurchase_SauceDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// TODO Auto-generated method stub

		////Initialization
				WebDriverManager.chromedriver().setup();
				WebDriver driver =new ChromeDriver();
				
				
				// Launch website
				driver.get("https://www.saucedemo.com/");
				driver.manage().window().maximize();
		
				// Assignment-3
				
				// logIn using relative path
				driver.findElement(By.xpath("//input[@id='user-name']")).sendKeys("standard_user");
				driver.findElement(By.xpath("//input[@id='password']")).sendKeys("secret_sauce");
				driver.findElement(By.xpath("//input[@id='login-button']")).click();
				
				// add to cart "Test.allTheThings() T-Shirt (Red)"
				driver.findElement(By.xpath("//button[@id='add-to-cart-test.allthethings()-t-shirt-(red)']")).click();
				
				//view product 
				driver.findElement(By.xpath("//a[@class='shopping_cart_link']")).click();
				
				//check out the product
				driver.findElement(By.xpath("//button[@id='checkout']")).click();
				
				// fill up the necessary infromation
				driver.findElement(By.xpath("//input[@id='first-name']")).sendKeys("Ishfaq");
				driver.findElement(By.xpath("//input[@id='last-name']")).sendKeys("Rahman");
				driver.findElement(By.xpath("//input[@id='postal-code']")).sendKeys("1229");
				driver.findElement(By.xpath("//input[@id='continue']")).click();
				
				// finish the process
				driver.findElement(By.xpath("//button[@id='finish']")).click();
				
				
	}

}
