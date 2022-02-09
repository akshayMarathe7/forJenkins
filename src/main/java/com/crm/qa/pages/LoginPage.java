package com.crm.qa.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.crm.qa.base.TestBase;

public class LoginPage extends TestBase {

	// Page Factory-- Object Repository--Page objects
//	@FindBy(xpath = "/html/body/div[1]/header/div/nav/div/div/a")
	@FindBy(xpath="//span[text()='Log In']")
	WebElement login;

	@FindBy(name = "email")
	WebElement emailAddress;

	@FindBy(name = "password")
	WebElement password;

	@FindBy(xpath = "//div[text()='Login']")
	WebElement loginButton;

	// Initialization the page object

	public LoginPage() {
		PageFactory.initElements(driver, this);
	}

	// Actions

	public String validateTitleOfHomePage() {
		return driver.getTitle();
	}
/*
	public WebElement loginButtonHome() {
		return login;
	}
*/
	public void login(String user, String pass) throws InterruptedException {
		login.click();
		Thread.sleep(4000);
		emailAddress.sendKeys(user);
		password.sendKeys(pass);
		loginButton.click();
		Thread.sleep(4000);
		
//		return new HomePage();

	}

}
