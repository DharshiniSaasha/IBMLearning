package seleniumIDE;
import org.junit.Test;
import org.junit.Before;
import org.junit.After;
import static org.junit.Assert.*;
import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.core.IsNot.not;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.WebDriverManager;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Alert;
import org.openqa.selenium.Keys;
import java.util.*;
import java.net.MalformedURLException;
import java.net.URL;
public class LoginlogoutTest {
  public WebDriver driver;
  private Map<String, Object> vars;
  JavascriptExecutor js;

  @Before
  public void setUp() {
	  
	//  WebDriverManager.chromedriver().setup();
	  WebDriverManager.chromedriver().setup();
	  
   driver = new ChromeDriver();
    js = (JavascriptExecutor) driver;
    vars = new HashMap<String, Object>();
  }
  @After
  public void tearDown() {
    driver.quit();
  }
 /* @Test
  public void loginlogout() throws InterruptedException {
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
 //   assertThat(driver.findElement(By.cssSelector(".orangehrm-login-forgot-header")).getText(), is("Forgot your password? "));
   // {
     // List<WebElement> elements = driver.findElements(By.cssSelector(".oxd-button"));
      //assert(elements.size() > 0);
    //}
  }*/
}
