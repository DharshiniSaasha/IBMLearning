/**
 * 
 */
package com.mystore.testcases;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import com.mystore.base.BaseClass;
import com.mystore.dataprovider.DataProviders;
import com.mystore.pageobjects.HomePage;
import com.mystore.pageobjects.LoginPage;
import com.mystore.utility.Log;


public class LoginPageTest extends BaseClass {
	
	static LoginPage loginPage=new LoginPage();
	private HomePage homePage;
	
	@Parameters("browser")
	@BeforeMethod(groups = {"Smoke","Sanity","Regression"})
	public void setup(String browser) {
		launchApp(browser); 
	}
	
	@AfterMethod(groups = {"Smoke","Sanity","Regression"})
	public void tearDown() {
		driver.quit();
	}
	@Test(groups = {"Smoke","Sanity"})
	public void loginTest() throws Throwable {
		Log.startTestCase("loginTest");
		
		String actualTitle=driver.getTitle();
		String expectedTitle="Swag Labs";
		Assert.assertEquals(actualTitle, expectedTitle);
		Log.info("Title is matching: Actual title is " + actualTitle + " and Expected is " + expectedTitle);
		Log.info("Enter Username and Password");
		loginPage.loginTest();
		Log.info("Verifying if user is able to login");
		Log.info("Login is Sucess");
	    Log.endTestCase("loginTest");
	}

}
