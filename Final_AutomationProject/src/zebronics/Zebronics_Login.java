package zebronics;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeTest;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;

public class Zebronics_Login 
{
	
	WebDriver driver;
	 @BeforeTest
	  public void beforeTest() throws Exception 
	  {
		 System.setProperty("webdriver.chrome.driver","C:\\Users\\Lenovo\\Documents\\Automation Testing\\Browser Extension\\chromedriver.exe");
			driver= new ChromeDriver();
			Thread.sleep(2000);
			
			driver.manage().window().maximize();
	  }
		@Test
	  public void login() throws Exception 
	  {
			driver.get("https://zebronics.com/account/login");
			Thread.sleep(2000);
			
			driver.findElement(By.xpath("//*[@id=\"loginInputName\"]")).sendKeys("vishalugale186@gmail.com");
			Thread.sleep(2000);
			
			driver.findElement(By.xpath("//*[@id=\"loginInputEmail\"]")).sendKeys("vishal123");
			Thread.sleep(2000);
			
			driver.findElement(By.xpath("//*[@id=\"customer_login\"]/div[4]/div[1]/div/button")).click();		
			Thread.sleep(2000);
			
			driver.findElement(By.xpath("//*[@id=\"shopify-section-header-template\"]/header/div[2]/div/div/div[3]/div[3]/div/button")).click();		
			Thread.sleep(2000);
			
			driver.findElement(By.xpath("//*[@id=\"shopify-section-header-template\"]/header/div[2]/div/div/div[3]/div[3]/div/div/div[2]/ul/li[2]/a")).click();		
			Thread.sleep(2000);
			
		
	  }
	 
	
	  @AfterTest
	  public void afterTest() 
	  {
		  driver.close();
	  }

}
