

package actionExample;



import org.openqa.selenium.Alert;

import org.openqa.selenium.By;

import org.openqa.selenium.WebDriver;

import org.openqa.selenium.WebElement;

import org.openqa.selenium.chrome.ChromeDriver;

import org.openqa.selenium.interactions.Actions;

import org.testng.Assert;

import org.testng.annotations.AfterTest;

import org.testng.annotations.BeforeTest;

import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;



public class DragAndDropTest {



    WebDriver driver;



    @BeforeTest

    public void launchApp() throws Exception {



    	 driver = WebDriverManager.chromedriver().create();


        driver.get("https://www.globalsqa.com/demo-site/draganddrop/");

        driver.manage().window().maximize();



    }



    @AfterTest

    public void closeApp() throws Exception {



        Thread.sleep(5000);

        driver.close();



    }



    @Test

    public void verifyDragAndDrop() throws InterruptedException {

    	
    	WebElement myframe = driver.findElement(By.xpath("//iframe[contains(@data-src,'photo-manager')]"));

        driver.switchTo().frame(myframe);

        Actions act = new Actions(driver);



        WebElement img = driver.findElement(By.xpath("//img[@alt='The peaks of High Tatras']"));

        WebElement target = driver.findElement(By.id("trash"));

        

        act.dragAndDrop(img, target).perform();

     
        
        Thread.sleep(2000);
        
        WebElement img4 = driver.findElement(By.xpath("//img[contains(@src,'tatras4')]"));
        act.clickAndHold(img4).moveToElement(target).release().perform();
    }



    



}





