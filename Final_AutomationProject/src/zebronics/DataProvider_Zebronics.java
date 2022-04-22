package zebronics;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class DataProvider_Zebronics 

{
	WebDriver driver ;

	 @BeforeTest
	  public void beforeTest() throws Exception 
	 {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Lenovo\\Documents\\Automation Testing\\Browser Extension\\chromedriver.exe");  
	    driver= new ChromeDriver();		
		Thread.sleep(2000);
		driver.manage().window().maximize();
	  }	
	
	
  @Test(dataProvider = "dp")
  public void f(String  username, String password) throws Exception 
  {
	  Zebronics_POM z= new Zebronics_POM();

	    z.maximizeBrowser(driver);
		z.url(driver);
		Thread.sleep(2000);
		z.userName(driver, username);
		Thread.sleep(2000);
		z.passWord(driver, password);
		Thread.sleep(2000);
		z.loginButton(driver);
		Thread.sleep(2000);
		z.welcomeAdmin(driver);
		Thread.sleep(2000);
		z.logOut(driver);
		Thread.sleep(2000);
  }

  @DataProvider
  public Object[][] dp() {
    return new Object[][] {
      new Object[] { "Demovishal124@gmail.com", "demo123" },
      new Object[] { "vishalugale186@gmail.com", "vishal123" },
      
    };
  }
 

  @AfterTest
  public void afterTest() 
  {
	  driver.close();
  }

}
