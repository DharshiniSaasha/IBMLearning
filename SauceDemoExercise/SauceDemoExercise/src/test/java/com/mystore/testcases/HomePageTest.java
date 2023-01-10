/**
 * 
 */
package com.mystore.testcases;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import com.mystore.base.BaseClass;
import com.mystore.pageobjects.HomePage;
import com.mystore.pageobjects.LoginPage;
import com.mystore.utility.Log;

public class HomePageTest extends BaseClass {

	static LoginPage loginPage = new LoginPage();
	static HomePage homePage = new HomePage();

	@Parameters("browser")
	@BeforeMethod(groups = { "Smoke", "Sanity", "Regression" })
	public void setup(String browser) {
		launchApp(browser);
	}

	@AfterMethod(groups = { "Smoke", "Sanity", "Regression" })
	public void tearDown() {
		driver.quit();
	}

	@Test(priority = 1)

	public void HomePageValidations() throws Throwable {

		Log.startTestCase("Home page Login");

		loginPage.loginTest();

		Log.info("Login is successful");

		Log.endTestCase("Home Page Login");

		Log.startTestCase("CheckDefaultSort");
		homePage.CheckDefaultSort();
		Log.info("Default sort is checked");
		Log.endTestCase("CheckDefaultSort");

		Log.startTestCase("AddFirstProduct");
		homePage.AddFirstProduct();
		Log.info("First product is added to the cart");
		Log.endTestCase("AddFirstProduct");
		Thread.sleep(3000);

		Log.startTestCase("CheckCartBadge");
		homePage.CheckCartBadge();
		Log.info("cart badge has 1 product");
		Log.endTestCase("CheckCartBadge");
		Thread.sleep(3000);

		Log.startTestCase("AddLastProduct");
		homePage.AddLastProduct();
		Log.info("Last product is added to the cart");
		Log.endTestCase("AddLastProduct");
		Thread.sleep(2000);

		Log.startTestCase("CheckCartBadgevalueisincreased");
		homePage.CheckCartBadgevalueisincreased();
		Log.info("cart badge has 2 products");
		Log.endTestCase("CheckCartBadgevalueisincreased");
		Thread.sleep(2000);

		Log.startTestCase("RemoveFirstProduct");
		homePage.RemoveFirstProduct();
		Log.info("First product is removed from the cart");
		Log.endTestCase("RemoveFirstProduct");
		Thread.sleep(2000);

		Log.startTestCase("checkCartBadgevalueisdecreased");
		homePage.checkCartBadgevalueisdecreased();
		Log.info("cart badge value is decreased to 1 product");
		Log.endTestCase("checkCartBadgevalueisdecreased");

		Log.startTestCase("CartBadgeIconIsClicked");
		homePage.CartBadgeIconIsClicked();
		Log.info("cart badge icon is clicked");
		Log.endTestCase("CartBadgeIconIsClicked");

		Thread.sleep(3000);

		Log.startTestCase("CheckforLastProductinCartBadge");
		homePage.CheckforLastProductinCartBadge();
		Log.info("last product is present in the cart");
		Log.endTestCase("CheckforLastProductinCartBadge");

		Thread.sleep(2000);

		Log.startTestCase("ContinueShoppingisClicked");
		homePage.ContinueShoppingisClicked();
		Log.info("Continue shopping button is clicked");
		Log.endTestCase("ContinueShoppingisClicked");
		Thread.sleep(3000);

		Log.startTestCase("PriceFilterischanged");
		homePage.PriceFilterischanged();
		Log.info("Price filter is changed from default filter");
		Log.endTestCase("PriceFilterischanged");

		Log.startTestCase("PriceFiltercheck");
		homePage.PriceFiltercheck();
		Log.info("Price filter is sorted properly");
		Log.endTestCase("PriceFiltercheck");
		
		Thread.sleep(2000);

	}

}
