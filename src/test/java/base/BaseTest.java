package base;
import org.openqa.selenium.WebDriver;

import org.testng.annotations.AfterTest;

import org.testng.annotations.BeforeTest;



import io.github.bonigarcia.wdm.WebDriverManager;

import utility.ReadConfig;



public class BaseTest {



   public WebDriver driver;

  public  ReadConfig conf;



    // ctrl+shoift+O ------ auto import



    // pre-condition ---- @BeforeSuite---

    // Test

    // post-condition



    @BeforeTest

    public void launchApp() throws Exception {



        System.out.println("launching app");



        driver = WebDriverManager.chromedriver().create();

        

        

        //create an object of configRead

        

        conf = new ReadConfig();

        System.out.println(conf.appURL());

        

        

        driver.get(conf.appURL());

        driver.manage().window().maximize();



    }



    @AfterTest

    public void closeApp() throws Exception {



        

        Thread.sleep(5000);

        driver.close();

        System.out.println("closing app");



    }



}

