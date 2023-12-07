package SeleniumTesting;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

import java.util.List;

import org.junit.Assert;
public class InfoFillup_TryTestingThis {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	////Initialization
			WebDriverManager.chromedriver().setup();
			WebDriver driver =new ChromeDriver();
			
			// Assignment-2
			
			// Launch website
			driver.get("https://trytestingthis.netlify.app/");
			driver.manage().window().maximize();
			
			//Input first name and last name
			driver.findElement(By.id("fname")).sendKeys("Ishfaq");
			driver.findElement(By.id("lname")).sendKeys("Rahman");
			
			// select male gender from Gender
			WebElement radiobutton = driver.findElement(By.id("male"));
			radiobutton.click();
			assert radiobutton.isSelected();
			System.out.println(radiobutton.isSelected());
			
			// select option 3 from "Lets you select only one option"
			WebElement testdropdown = driver.findElement(By.id("option"));
			Select dropdown = new Select(testdropdown);
			dropdown.selectByIndex(3); // select by index
			
			//select by value and visible text
//			dropdown.selectByValue("option 3");
//			dropdown.deselectByVisibleText("Option 3");
			
			
			// select Check list option 3 from "Choose applicable options"
			WebElement checklist = driver.findElement(By.name("option3"));  // using name here
			checklist.click();
			
			
			//select by  visible text
//			option3.selectByVisibleText("Option 3");
			
			// Submit button click  using absulate path
			WebElement button = driver.findElement(By.xpath("//button[@class='btn btn-success']"));
			button.click();
			
			
			
			
			
			
		
			
			
			
			
			
			
			
	}

}
