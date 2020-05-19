package com.fruitkart;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class TestMethodKart {
	WebDriver driver;
	public void TestSelectItem1() {
		driver.findElement(By.xpath("//div[@class='products']//div[1]//div[2]//input[1]")).clear();
		driver.findElement(By.xpath("//div[@class='products']//div[1]//div[2]//input[1]")).sendKeys("2");
		driver.findElement(By.xpath("//*[@id=\"root\"]/div/div[1]/div/div[1]/div[2]/a[2]")).click();
		driver.findElement(By.xpath("//div[@class='products']//div[1]//div[3]//button[1]")).click();
	}
	public void TestSelectItem2() {
		driver.findElement(By.xpath("//body//div[2]//div[2]//input[1]")).clear();
		driver.findElement(By.xpath("//body//div[2]//div[2]//input[1]")).sendKeys("2");
		driver.findElement(By.xpath("//div[2]//div[3]//button[1]")).click();
	}
	public void TestSelectItem3() {
		driver.findElement(By.xpath(" //div[@class='products-wrapper']//div[3]//div[2]//input[1]")).clear();
		driver.findElement(By.xpath(" //div[@class='products-wrapper']//div[3]//div[2]//input[1]")).sendKeys("5");
		driver.findElement(By.xpath("//*[@id=\"root\"]/div/div[1]/div/div[3]/div[2]/a[1]")).click();
		driver.findElement(By.xpath("//*[@id=\"root\"]/div/div[1]/div/div[3]/div[3]/button")).click();
	}
	public void TestKartCheck() {
		driver.findElement(By.xpath("//a[@class='cart-icon']//img[contains(@class,'')]")).click();
	}
	public void TestProceedCheckOut() {
		driver.findElement(By.xpath(" //button[contains(text(),'PROCEED TO CHECKOUT')]")).click();
	}
	public void TestPlaceOrder() {
		driver.findElement(By.xpath("//button[contains(text(),'Place Order')]")).click();
	}
}
