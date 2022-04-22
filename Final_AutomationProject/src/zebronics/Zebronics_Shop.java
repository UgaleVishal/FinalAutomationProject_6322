package zebronics;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Zebronics_Shop 
{
	WebDriver driver;
	 @BeforeTest
	  public void beforeTest() throws Exception 
	 {
			
			System.setProperty("webdriver.chrome.driver","C:\\Users\\Lenovo\\Documents\\Automation Testing\\Browser Extension\\chromedriver.exe");			
			driver =new ChromeDriver();
			Thread.sleep(2000);
			 
			driver.manage().window().maximize();

	 }
	  @Test(priority= 1)
	  public void login() throws Exception 
	  {
		    driver.get("https://zebronics.com/account/login");
			Thread.sleep(2000);
			
			//Notification:
			driver.findElement(By.xpath("//*[@id=\"onesignal-slidedown-cancel-button\"]")).click();
			Thread.sleep(2000);
			
			driver.findElement(By.xpath("//*[@id=\"loginInputName\"]")).sendKeys("vishalugale186@gmail.com");
			Thread.sleep(2000);
			
			driver.findElement(By.xpath("//*[@id=\"loginInputEmail\"]")).sendKeys("vishal123");
			Thread.sleep(2000);
			
			driver.findElement(By.xpath("//*[@id=\"customer_login\"]/div[4]/div[1]/div/button")).click();		
			Thread.sleep(2000);			
		
			 //Audio 
		 	driver.findElement(By.xpath("//*[@id=\\\"shopify-section-header-template\\\"]/header/div[2]/div/div/div[2]/div/div/nav/ul/li[1]/a")).click();
		 	Thread.sleep(2000);
		 	
		 	//Step 1: Create Object Of Action Class
			Actions a= new Actions(driver);
			
			//Step 2: Create Object Of List With WebElement
			List<WebElement> ls= driver.findElements(By.xpath("/html/body/div[3]/div/div[5]/div[1]/div[1]/div/div/div/div[3]/div[1]/li"));
			
			//Step 3: Store size of list
			int listSize= ls.size();
			System.out.println("No. Of Modules: "+listSize);
			
			//Step 4: For Loop
			for(int i=1; i<=listSize; i++)
			{
				//wait
				Thread.sleep(2000);
				
				//Display Module'Name
				System.out.println(driver.findElement(By.xpath("/html/body/div[3]/div/div[5]/div[1]/div[1]/div/div/div/div[3]/div[1]/li["+i+"]")).getText());
				
				//Perform Mouse Hover
				a.moveToElement(driver.findElement(By.xpath("/html/body/div[3]/div/div[5]/div[1]/div[1]/div/div/div/div[3]/div[1]/li["+i+"]"))).click().perform();
					
							
			}
				
	  }
	  
	  @Test(priority= 2)
	  public void mouseHover() throws Exception 
	  {
		//Step 1: Create Object Of Action Class
			Actions a= new Actions(driver);
			
			//Step 2: Create Object Of List With WebElement
			List<WebElement> ls= driver.findElements(By.xpath("/html/body/div[1]/header/div[2]/div/div/div[2]/div/div/nav/ul/li"));
			
			//Step 3: Store size of list
			int listSize= ls.size();
			System.out.println("No. Of Modules: "+listSize);
			
			//Step 4: For Loop
			for(int i=1; i<=listSize; i++)
			{
				//wait
				Thread.sleep(2000);
				
				//Display Module'Name
				System.out.println(driver.findElement(By.xpath("/html/body/div[1]/header/div[2]/div/div/div[2]/div/div/nav/ul/li["+i+"]")).getText());
				
				//Perform Mouse Hover
				a.moveToElement(driver.findElement(By.xpath("/html/body/div[1]/header/div[2]/div/div/div[2]/div/div/nav/ul/li["+i+"]"))).click().perform();
			}
				
	  }

	  
	  @Test(priority= 3)
	  public void audioModule() throws Exception 
	  {
		  // Audio:-
		 	driver.findElement(By.xpath("//*[@id=\"shopify-section-header-template\"]/header/div[2]/div/div/div[2]/div/div/nav/ul/li[1]/a")).click();
		 	Thread.sleep(2000);	
		 	
		 	driver.findElement(By.xpath("//*[@id=\"boost-pfs-filter-tree-pf-c-collection\"]/div/ul/li[1]/div[1]/a/span")).click();
		 	Thread.sleep(2000);	
			
		 	driver.findElement(By.xpath("//*[@id=\"boost-pfs-filter-tree-pf-c-collection\"]/div/ul/li[2]/div[1]/a/span")).click();
		 	Thread.sleep(2000);	
		 	
		 	driver.findElement(By.xpath("//*[@id=\"boost-pfs-filter-tree-pf-c-collection\"]/div/ul/li[3]/div[1]/a/span")).click();
		 	Thread.sleep(2000);	
		 	
		 	driver.findElement(By.xpath("//*[@id=\"boost-pfs-filter-tree-pf-c-collection\"]/div/ul/li[4]/div[1]/a/span")).click();
		 	Thread.sleep(2000);	
	  }
	  
	  @Test(priority= 4)
	  public void periPherral() throws Exception 
	  {
		//Peripheral:-
		 	driver.findElement(By.xpath("//*[@id=\"shopify-section-header-template\"]/header/div[2]/div/div/div[2]/div/div/nav/ul/li[2]/a")).click();
		 	Thread.sleep(2000);
		 	
		 	driver.findElement(By.xpath("//*[@id=\"boost-pfs-filter-tree-pf-c-collection\"]/div/ul/li[1]/div[1]/a/span")).click();
		 	Thread.sleep(2000);
		 	
		 	driver.findElement(By.xpath("/html/body/div[1]/header/div[2]/div/div/div[2]/div/div/nav/ul/li[2]/a")).click();
		 	Thread.sleep(2000);
		 	
		 	driver.findElement(By.xpath("//*[@id=\"boost-pfs-filter-tree-pf-c-collection\"]/div/ul/li[2]/div[1]/a/span")).click();
		 	Thread.sleep(2000);
		 	
		 	driver.findElement(By.xpath("/html/body/div[1]/header/div[2]/div/div/div[2]/div/div/nav/ul/li[2]/a")).click();
		 	Thread.sleep(2000);
		 	
		 	driver.findElement(By.xpath("//*[@id=\"boost-pfs-filter-tree-pf-c-collection\"]/div/ul/li[3]/div[1]/a/span")).click();
		 	Thread.sleep(2000);
		 	
		 	driver.findElement(By.xpath("//*[@id=\"boost-pfs-filter-tree-pf-c-collection\"]/div/ul/li[4]/div[1]/a/span")).click();
		 	Thread.sleep(2000);
		 	
		 	driver.findElement(By.xpath("//*[@id=\"boost-pfs-filter-tree-pf-c-collection\"]/div/ul/li[5]/div[1]/a/span")).click();
		 	Thread.sleep(2000);
		 	
		 	driver.findElement(By.xpath("//*[@id=\"boost-pfs-filter-tree-pf-c-collection\"]/div/ul/li[6]/div[1]/a/span")).click();
		 	Thread.sleep(2000);
		 		 	
		 	driver.findElement(By.xpath("//*[@id=\"boost-pfs-filter-tree-pf-c-collection\"]/div/ul/li[7]/div[1]/a/span")).click();
		 	Thread.sleep(2000);
		 	
		 	driver.findElement(By.xpath("//*[@id=\"boost-pfs-filter-tree-pf-c-collection\"]/div/ul/li[8]/div[1]/a/span")).click();
		 	Thread.sleep(2000);
		 	
		 	driver.findElement(By.xpath("//*[@id=\"boost-pfs-filter-tree-pf-c-collection\"]/div/ul/li[9]/div[1]/a/span")).click();
		 	Thread.sleep(2000);
		 	
		 	driver.findElement(By.xpath("//*[@id=\"boost-pfs-filter-tree-pf-c-collection\"]/div/ul/li[10]/div[1]/a/span")).click();
		 	Thread.sleep(2000);
		 	
		 	driver.findElement(By.xpath("//*[@id=\"boost-pfs-filter-tree-pf-c-collection\"]/div/ul/li[11]/div[1]/a/span")).click();
		 	Thread.sleep(2000);
		 	
		 	driver.findElement(By.xpath("//*[@id=\"boost-pfs-filter-tree-pf-c-collection\"]/div/ul/li[12]/div[1]/a/span")).click();
		 	Thread.sleep(2000);
		 	
		 	driver.findElement(By.xpath("//*[@id=\"boost-pfs-filter-tree-pf-c-collection\"]/div/ul/li[13]/div[1]/a/span")).click();
		 	Thread.sleep(2000);
		 	
		 	driver.findElement(By.xpath("//*[@id=\"boost-pfs-filter-tree-pf-c-collection\"]/div/ul/li[14]/div[1]/a/span")).click();
		 	Thread.sleep(2000);
		 	
		 	driver.findElement(By.xpath("//*[@id=\"boost-pfs-filter-tree-pf-c-collection\"]/div/ul/li[15]/div[1]/a/span")).click();
		 	Thread.sleep(2000);
	  }
	  
	  @Test(priority= 5)
	  public void accessories() throws Exception 
	  {
		//Accessories:-
		 	driver.findElement(By.xpath("/html/body/div[1]/header/div[2]/div/div/div[2]/div/div/nav/ul/li[3]/a/span")).click();
		 	Thread.sleep(2000);
		 	
		 	driver.findElement(By.xpath("//*[@id=\"boost-pfs-filter-tree-pf-c-collection\"]/div/ul/li[1]/div[1]/a/span")).click();
		 	Thread.sleep(2000);
		 	
		 	driver.findElement(By.xpath("//*[@id=\"boost-pfs-filter-tree-pf-c-collection\"]/div/ul/li[2]/div[1]/a/span")).click();
		 	Thread.sleep(2000);
		 	
		 	driver.findElement(By.xpath("//*[@id=\"boost-pfs-filter-tree-pf-c-collection\"]/div/ul/li[3]/div[1]/button/span")).click();
		 	Thread.sleep(2000);
		 	
		 	driver.findElement(By.xpath("//*[@id=\"boost-pfs-filter-tree-pf-c-collection\"]/div/ul/li[3]/div[2]/div[1]/div[1]/a/span[2]")).click();
		 	Thread.sleep(2000);
		 	
		 	driver.findElement(By.xpath("//*[@id=\"boost-pfs-filter-tree-pf-c-collection\"]/div/ul/li[3]/div[2]/div[2]/div[1]/a/span[2]")).click();
		 	Thread.sleep(2000);
		 	
		 	driver.findElement(By.xpath("//*[@id=\"boost-pfs-filter-tree-pf-c-collection\"]/div/ul/li[3]/div[2]/div[3]/div[1]/a/span[2]")).click();
		 	Thread.sleep(2000);
		 	
		 	driver.findElement(By.xpath("//*[@id=\"boost-pfs-filter-tree-pf-c-collection\"]/div/ul/li[3]/div[2]/div[4]/div[1]/a/span[2]")).click();
		 	Thread.sleep(2000);
	 	    	 	
			driver.findElement(By.xpath("//*[@id=\"boost-pfs-filter-tree-pf-c-collection\"]/div/ul/li[3]/div[2]/div[5]/div[1]/a/span[2]")).click();
		 	Thread.sleep(2000);
		 	
			driver.findElement(By.xpath("//*[@id=\"boost-pfs-filter-tree-pf-c-collection\"]/div/ul/li[3]/div[2]/div[6]/div[1]/a/span[2]")).click();
		 	Thread.sleep(2000);
		 	
		 	driver.findElement(By.xpath("//*[@id=\"boost-pfs-filter-tree-pf-c-collection\"]/div/ul/li[3]/div[2]/div[7]/div[1]/a/span[2]")).click();
		 	Thread.sleep(2000);
		 	
		 	driver.findElement(By.xpath("//*[@id=\"boost-pfs-filter-tree-pf-c-collection\"]/div/ul/li[3]/div[2]/div[8]/div[1]/a/span[2]")).click();
		 	Thread.sleep(2000);
		 	
		 	driver.findElement(By.xpath("//*[@id=\"boost-pfs-filter-tree-pf-c-collection\"]/div/ul/li[3]/div[2]/div[9]/div[1]/a/span[2]")).click();
		 	Thread.sleep(2000);
		 	
		 	driver.findElement(By.xpath("//*[@id=\"boost-pfs-filter-tree-pf-c-collection\"]/div/ul/li[3]/div[2]/div[10]/div[1]/a/span[2]")).click();
		 	Thread.sleep(2000);
		 	
		 	driver.findElement(By.xpath("//*[@id=\"boost-pfs-filter-tree-pf-c-collection\"]/div/ul/li[4]/div[1]/a/span")).click();
		 	Thread.sleep(2000);
		 	
		 	driver.findElement(By.xpath("//*[@id=\"boost-pfs-filter-tree-pf-c-collection\"]/div/ul/li[5]/div[1]/a/span")).click();
		 	Thread.sleep(2000);
		 	
		 	driver.findElement(By.xpath("//*[@id=\"boost-pfs-filter-tree-pf-c-collection\"]/div/ul/li[6]/div[1]/a/span")).click();
		 	Thread.sleep(2000);
		 	
		 	driver.findElement(By.xpath("//*[@id=\"boost-pfs-filter-tree-pf-c-collection\"]/div/ul/li[7]/div[1]/a/span")).click();
		 	Thread.sleep(2000);
		 	
		 	driver.findElement(By.xpath("//*[@id=\"boost-pfs-filter-tree-pf-c-collection\"]/div/ul/li[8]/div[1]/a/span")).click();
		 	Thread.sleep(2000);
		 	
		 	driver.findElement(By.xpath("//*[@id=\"boost-pfs-filter-tree-pf-c-collection\"]/div/ul/li[9]/div[1]/a/span")).click();
		 	Thread.sleep(2000);
		 	
		 	driver.findElement(By.xpath("//*[@id=\"boost-pfs-filter-tree-pf-c-collection\"]/div/ul/li[10]/div[1]/a/span")).click();
		 	Thread.sleep(2000);
		 	
		 	driver.findElement(By.xpath("//*[@id=\"boost-pfs-filter-tree-pf-c-collection\"]/div/ul/li[11]/div[1]/a/span")).click();
		 	Thread.sleep(2000);
	  }
	  
	  @Test(priority= 6)
	  public void smartHome() throws Exception 
	  {
		//Smart Home:-
		 	driver.findElement(By.xpath("//*[@id=\"shopify-section-header-template\"]/header/div[2]/div/div/div[2]/div/div/nav/ul/li[4]/a")).click();
		 	Thread.sleep(2000);
		 	
		 	driver.findElement(By.xpath("//*[@id=\"boost-pfs-filter-tree-pf-c-collection\"]/div/ul/li[1]/div[1]/a/span")).click();
		 	Thread.sleep(2000);
		 	
		 	driver.findElement(By.xpath("//*[@id=\"boost-pfs-filter-tree-pf-c-collection\"]/div/ul/li[2]/div[1]/a/span")).click();
		 	Thread.sleep(2000);
		 	
		 	driver.findElement(By.xpath("//*[@id=\"boost-pfs-filter-tree-pf-c-collection\"]/div/ul/li[3]/div[1]/a/span")).click();
		 	Thread.sleep(2000);
		 	
		 	driver.findElement(By.xpath("//*[@id=\"boost-pfs-filter-tree-pf-c-collection\"]/div/ul/li[4]/div[1]/a/span")).click();
		 	Thread.sleep(2000);
	  }
	  
	  @Test(priority= 7)
	  public void personalGrooming() throws Exception 
	  {
		  	driver.findElement(By.xpath("//*[@id=\"shopify-section-header-template\"]/header/div[2]/div/div/div[2]/div/div/nav/ul/li[5]/a")).click();
	 	    Thread.sleep(2000);
	 	}
	  
	  
	  @Test(priority= 8)
	  public void healthCare() throws Exception 
	  {
			//Health care:-
		 	driver.findElement(By.xpath("//*[@id=\"shopify-section-header-template\"]/header/div[2]/div/div/div[2]/div/div/nav/ul/li[7]/a")).click();
		 	Thread.sleep(2000);
		 	
		 	driver.findElement(By.xpath("//*[@id=\"boost-pfs-filter-tree-pf-c-collection\"]/div/ul/li[1]/div[1]/a/span")).click();
		 	Thread.sleep(2000);
		 	
		 	driver.findElement(By.xpath("//*[@id=\"boost-pfs-filter-tree-pf-c-collection\"]/div/ul/li[2]/div[1]/a/span")).click();
		 	Thread.sleep(2000);
		 	
		 	driver.findElement(By.xpath("//*[@id=\"boost-pfs-filter-tree-pf-c-collection\"]/div/ul/li[3]/div[1]/a/span")).click();
		 	Thread.sleep(2000);
		 	
		 	driver.findElement(By.xpath("//*[@id=\"boost-pfs-filter-tree-pf-c-collection\"]/div/ul/li[4]/div[1]/a/span")).click();
		 	Thread.sleep(2000);
		 	
		 	driver.findElement(By.xpath("//*[@id=\"boost-pfs-filter-tree-pf-c-collection\"]/div/ul/li[5]/div[1]/a/span")).click();
		 	Thread.sleep(2000);
		 	
			driver.findElement(By.xpath("//*[@id=\"boost-pfs-filter-tree-pf-c-collection\"]/div/ul/li[6]/div[1]/a/span")).click();
		 	Thread.sleep(2000);
		 	
			driver.findElement(By.xpath("//*[@id=\"boost-pfs-filter-tree-pf-c-collection\"]/div/ul/li[7]/div[1]/a/span")).click();
		 	Thread.sleep(2000);
	  }
	  
	  @Test(priority= 9)
	  public void support() throws Exception 
	  {
		 	driver.findElement(By.xpath("//*[@id=\"shopify-section-header-template\"]/header/div[2]/div/div/div[2]/div/div/nav/ul/li[8]/a/span")).click();
	 	    Thread.sleep(2000);
	  }
	  
	  @Test(priority= 10)
	  public void search() throws Exception 
	  {
		//Search Box:-
		  
		    driver.findElement(By.xpath("//*[@id=\"shopify-section-header-template\"]/header/div[2]/div/div/div[3]/div[1]/div/button")).sendKeys("Earphones");
		 	Thread.sleep(2000);
	  }
	  
	  @Test(priority= 11)
	  public void addtoCart() throws Exception 
	  {

		 	//Add to Cart-
		 	driver.findElement(By.xpath("//*[@id=\"shopify-section-header-template\"]/header/div[2]/div/div/div[3]/div[2]/div/button")).click();
		 	Thread.sleep(2000);
		 	
			
			//logout:-
			driver.findElement(By.xpath("/html/body/div[1]/header/div[2]/div/div/div[3]/div[3]/div/button")).click();		
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
