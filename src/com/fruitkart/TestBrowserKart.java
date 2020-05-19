package com.fruitkart;

import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class TestBrowserKart extends TestMethodKart {
	@BeforeMethod
	public void openBrowser(){
    System.setProperty("webdriver.chrome.driver", "C:\\Selenium\\chromedriver_win32\\chromedriver.exe");
    driver=new ChromeDriver();
	driver.get("https://rahulshettyacademy.com/seleniumPractise/#/");
	driver.manage().window().maximize();
	driver.manage().deleteAllCookies();
	}
	@Test(enabled=true)
	public void TestFruitKart() {
		TestSelectItem1();
		TestSelectItem2();
		TestSelectItem3() ;
		TestKartCheck() ;
		TestProceedCheckOut();
		TestPlaceOrder();
	}
	@AfterMethod
	public void closeBrowser() {
		
	}
}
