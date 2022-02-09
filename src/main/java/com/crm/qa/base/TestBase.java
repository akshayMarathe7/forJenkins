package com.crm.qa.base;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TestBase {

	public static WebDriver driver;
	public static Properties prop;

	@SuppressWarnings("deprecation")

	public TestBase() {
		try {
			prop = new Properties();

			FileInputStream fl;

			fl = new FileInputStream(
					"C:\\Users\\Lenovo\\eclipse-workspace\\FreeCRMTest\\src\\main\\java\\com\\crm\\qa\\config\\config.properties");
			prop.load(fl);
		} catch (FileNotFoundException e) {

			e.printStackTrace();
		} catch (IOException e) {

			e.printStackTrace();
		}

	}

	@SuppressWarnings("deprecation")
	public void initialization() throws IOException {

		String browserName = prop.getProperty("browser");

		if (browserName.equals("chrome")) {

			System.setProperty("webdriver.chrome.driver", "E:\\E drive\\Selenium\\chromedriver.exe");

			driver = new ChromeDriver();

		} else {
			// code for other browser
		}

		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();

		driver.get(prop.getProperty("url"));
		


	}

}
