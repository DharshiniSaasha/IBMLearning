package seleniumIDE;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.Keys;
import org.openqa.selenium.chrome.ChromeDriver;

public class HRMLogin extends LoginlogoutTest {

	@Test
	public void login() throws Exception
	{
		
		 driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		    
		    Thread.sleep(4000);
		    //sync issue
		    driver.manage().window().setSize(new Dimension(987, 537));
		    driver.findElement(By.name("username")).click();
		    driver.findElement(By.name("username")).sendKeys("Admin");
		    driver.findElement(By.name("password")).click();
		    driver.findElement(By.name("password")).sendKeys(Keys.DOWN);
		    driver.findElement(By.name("password")).sendKeys("admin123");
		    driver.findElement(By.cssSelector(".oxd-button")).click();
		    
		    Thread.sleep(8000);
		    
		    driver.findElement(By.cssSelector(".oxd-userdropdown-tab")).click();
		    
		    Thread.sleep(4000);
		    
		    driver.findElement(By.linkText("Logout")).click();
		
	}

}
