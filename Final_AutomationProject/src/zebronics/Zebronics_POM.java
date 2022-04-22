package zebronics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Zebronics_POM 

{
	public void maximizeBrowser(WebDriver driver)
{
	driver.manage().window().maximize();
}

public void url(WebDriver driver)
{
	driver.get("https://zebronics.com/account/login");		
}

public void userName(WebDriver driver, String usn)
{
	driver.findElement(By.xpath("//*[@id=\"loginInputName\"]")).sendKeys(usn);
}

public void passWord(WebDriver driver, String pwd)
{
	driver.findElement(By.xpath("//*[@id=\"loginInputEmail\"]")).sendKeys(pwd);
}

public void loginButton(WebDriver driver)
{
	driver.findElement(By.xpath("//*[@id=\"customer_login\"]/div[4]/div[1]/div/button")).click();
}
public void welcomeAdmin(WebDriver driver)
{
	driver.findElement(By.xpath("/html/body/div[1]/header/div[2]/div/div/div[3]/div[3]/div/button")).click();
}
public void logOut(WebDriver driver)
{
	driver.findElement(By.xpath("//*[@id=\"shopify-section-header-template\"]/header/div[2]/div/div/div[3]/div[3]/div/div/div[2]/ul/li[2]/a")).click();
}

public void closerowser(WebDriver driver)
{
	driver.close();
}

}
