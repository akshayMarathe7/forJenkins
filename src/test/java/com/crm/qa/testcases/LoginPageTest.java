package com.crm.qa.testcases;

import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Optional;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import com.crm.qa.base.TestBase;
import com.crm.qa.pages.HomePage;
import com.crm.qa.pages.LoginPage;

public class LoginPageTest extends TestBase {

	LoginPage logindriver;
	HomePage homePage;

	public LoginPageTest() {
		super();
	}

	@BeforeMethod(groups= {"abc"})
	public void setup() throws IOException {
		initialization();

		logindriver = new LoginPage();

	}

	@Test(groups= {"abc"},enabled=true)

	public void validatePageTitle() {
		String TitleofPage = logindriver.validateTitleOfHomePage();
		Assert.assertEquals(TitleofPage, "#1 Free CRM customer relationship management software cloud");

		
		System.out.println("First LoginPageTest");

	}

	@Parameters({ "userName", "Password" })
	@Test(priority = 1, groups = { "test" })
	public void loginTest(String userName, String Password) throws InterruptedException {

//		logindriver.login(prop.getProperty("username"), prop.getProperty("password"));
		logindriver.login(userName, Password);

		System.out.println("Srcond LoginPageTest");

	}

	@AfterMethod(groups= {"abc"})
	public void teardown() {

		driver.quit();
	}

}
