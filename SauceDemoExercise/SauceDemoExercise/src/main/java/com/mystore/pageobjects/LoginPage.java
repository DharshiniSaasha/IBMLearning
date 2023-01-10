/**
 * 
 */
package com.mystore.pageobjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.mystore.actiondriver.Action;
import com.mystore.base.BaseClass;

public class LoginPage extends BaseClass {

	Action action = new Action();

	By txtPass = By.id("password");

	By userName = By.xpath("//input[@placeholder='Username']");

	By btnLogin = By.xpath("//input[@value='Login']");

	public void loginTest() throws Throwable {

		String uname = prop.getProperty("username");

		String pswd = prop.getProperty("password");
		action.type(userName, uname);
		action.type(txtPass, pswd);
		action.click(driver, btnLogin);

		Thread.sleep(2000);

	}

}
