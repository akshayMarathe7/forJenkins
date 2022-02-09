package com.crm.qa.testcases;

import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.crm.qa.base.TestBase;
import com.crm.qa.pages.HomePage;
import com.crm.qa.pages.LoginPage;

public class Try extends TestBase {

	LoginPage logindriver;
	HomePage homePage;

	public Try() {
		super();
	}

	@Test
	public void setup() throws IOException {
		initialization();

	}
	@Test
	public void setup1() throws IOException {
		initialization();

	}
	@Test
	public void setup2() throws IOException {
		initialization();

	}

	


}
