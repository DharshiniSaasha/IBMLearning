package locatorExample;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;
//NopCommerceAppLoginLogout
public class LocatorHRMLogin {
	
	@Test
	public void LoginLogout() throws Exception
	
	{
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		//driver.get("https://www.amazon.in/");
		driver.get("https://admin-demo.nopcommerce.com/login?ReturnUrl=%2Fadmin%2F");
		//driver.get("https://www.hyrtutorials.com/p/add-padding-to-containers.html");
		driver.manage().window().maximize();
		Thread.sleep(4000);
		//driver.findElement(By.xpath("//td[contains(text(),'Helen Bennett')]//preceding-sibling::td/input[@type='checkbox']")).click();
		//driver.quit();
		//driver.findElement(By.xpath("//h2[text()='Car & bike essentials | Up to 60% off']/parent::div/following-sibling::div[@class='a-cardui-footer']/a[text()='See more']")).click();
		
		//String title=driver.getTitle();
		//System.out.println(title);
		
		//h2[text()='Car & bike essentials | Up to 60% off']/parent::div/following-sibling::div[@class='a-cardui-footer']/a[text()='See more']
			driver.findElement(By.id("Email")).clear();
		driver.findElement(By.id("Email")).sendKeys("admin@yourstore.com");
		driver.findElement(By.id("Password")).clear();
		driver.findElement(By.id("Password")).sendKeys("admin");
		driver.findElement(By.id("RememberMe")).click();
        driver.findElement(By.tagName("button")).click();
        Thread.sleep(5000);
        driver.findElementByXPath("//a[contains(@href,\"/Admin/Customer/List\")]//child::p[contains(text(),'Cus')]").click();
        /*driver.findElement(By.xpath("(//p[text()[normalize-space()='Customers']])[1]")).click();
        Thread.sleep(2000);
        driver.findElement(By.xpath("(//p[text()[normalize-space()='Customers']])[2]")).click();
        driver.findElement(By.partialLinkText("Logout")).click();*/
      //  driver.quit();
		
	}

}
