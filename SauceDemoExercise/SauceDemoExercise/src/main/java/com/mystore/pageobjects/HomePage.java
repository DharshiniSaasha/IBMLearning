/**
 * 
 */
package com.mystore.pageobjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

import com.mystore.actiondriver.Action;
import com.mystore.base.BaseClass;

/**
 * @author Hitendra
 *
 */
public class HomePage extends BaseClass {

	Action action = new Action();

	By addfirstproduct = By.xpath("(//div[@class='inventory_item_price']/following-sibling::button)[1]");

	By cartbadgeicon = By.xpath("//span[@class='shopping_cart_badge']");

	By shoppingcartbadge = By.xpath("//span[@class='shopping_cart_badge']");

	By addlastproduct = By.xpath("(//div[@class='inventory_item_price']/following-sibling::button)[6]");

	By lastproductvalue = By.xpath("//a[@id='item_3_title_link']//div");

	By continueshoppingbutton = By.xpath("//button[text()='Continue Shopping']");

	By sortcontainer = By.xpath("//select[@class='product_sort_container']");

	By pricefilter = By.xpath("//span[@class='select_container']//select/option[text()='Price (low to high)']");

	By activesort = By.xpath("//span[@class='active_option']");

	public void CheckDefaultSort() throws Throwable {

		String actualvalue = driver.findElement(activesort).getText();
		String expectedvalue = "NAME (A TO Z)";
		Assert.assertEquals(actualvalue, expectedvalue);

	}

	public void AddFirstProduct() throws Throwable {

		action.click(driver, addfirstproduct);
	}

	public void CheckCartBadge() throws Throwable {
		String actualvalue = driver.findElement(shoppingcartbadge).getText();
		String expectedvalue = "1";
		Assert.assertEquals(actualvalue, expectedvalue);

	}

	public void AddLastProduct() throws Throwable {

		action.click(driver, addlastproduct);

	}

	public void CheckCartBadgevalueisincreased() throws Throwable {
		String actualvalue = driver.findElement(shoppingcartbadge).getText();
		String expectedvalue = "2";
		Assert.assertEquals(actualvalue, expectedvalue);

	}

	public void RemoveFirstProduct() throws Throwable {

		action.click(driver, addfirstproduct);

	}

	public void checkCartBadgevalueisdecreased() throws Throwable {

		String actualvalue = driver.findElement(shoppingcartbadge).getText();
		String expectedvalue = "1";
		Assert.assertEquals(actualvalue, expectedvalue);

	}

	public void CartBadgeIconIsClicked() throws Throwable {

		action.click(driver, cartbadgeicon);

	}

	public void CheckforLastProductinCartBadge() throws Throwable {

		String actualvalue = driver.findElement(lastproductvalue).getText();
		String expectedvalue = "Test.allTheThings() T-Shirt (Red)";
		Assert.assertEquals(actualvalue, expectedvalue);

	}

	public void ContinueShoppingisClicked() throws Throwable {

		action.click(driver, continueshoppingbutton);

	}

	public void PriceFilterischanged() throws Throwable {

		action.click(driver, sortcontainer);
		Thread.sleep(2000);
		action.click(driver, pricefilter);

	}

	public void PriceFiltercheck() throws Throwable {

		String actualvalue = driver.findElement(activesort).getText();
		String expectedvalue = "PRICE (LOW TO HIGH)";
		Assert.assertEquals(actualvalue, expectedvalue);

	}
}
