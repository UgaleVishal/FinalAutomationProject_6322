package zebronics;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeTest;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;

public class Zebronics_Registration 
{
	WebDriver driver;
	  @BeforeTest
	  public void beforeTest() throws Exception 
	  { System.setProperty("webdriver.chrome.driver","C:\\Users\\Lenovo\\Documents\\Automation Testing\\Browser Extension\\chromedriver.exe");
		driver= new ChromeDriver();
		Thread.sleep(2000);
		
		driver.manage().window().maximize();
		
	  }

	  @Test
	  public void registration() throws Exception 
	  {
		  driver.get("https://zebronics.com/account/register");
		  Thread.sleep(2000);
		  
		  driver.findElement(By.xpath("//*[@id=\"loginInputName\"]")).sendKeys("vishal");
		  Thread.sleep(2000);
		  
		  driver.findElement(By.xpath("//*[@id=\"loginLastName\"]")).sendKeys("ugale");
		  Thread.sleep(2000);
		  
		  driver.findElement(By.xpath("//*[@id=\"loginInputEmail\"]")).sendKeys("vishalugale186@gmail.com");
		  Thread.sleep(2000);
		 	  
		  driver.findElement(By.xpath("//*[@id=\"loginInputPassword\"]")).sendKeys("vishal123");
		  Thread.sleep(2000);
		  	 
		  driver.findElement(By.xpath("//*[@id=\"create_customer\"]/div[6]/div[1]/div/button")).click();
		  Thread.sleep(2000);
		  
	  }
	
	  @AfterTest
	  public void afterTest() 
	  
	  {
		  
	  }

}
