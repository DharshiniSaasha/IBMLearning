package actionExample;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

public class RutoXpath_NopeCommerce {
	WebDriver driver;
	
	@Test
	public void loginlogout()
	{
		
		driver.findElement(By.id("Email")).sendKeys("values to send");
		
	}

}
